package br.ufg.ubiquos.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import br.ufg.ubiquos.ma.dtos.DTOAuth;
import br.ufg.ubiquos.ma.dtos.DTODado;
import br.ufg.ubiquos.ma.dtos.DTODispositivo;
import br.ufg.ubiquos.ma.dtos.DTOLocalizacao;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;
import io.grpc.examples.iotservice.Dado;
import io.grpc.examples.iotservice.EmptyMessage;
import io.grpc.examples.iotservice.LedStatus;
import io.grpc.examples.iotservice.ListaDados;
import io.grpc.examples.iotservice.ListaDispositivos;
import io.grpc.examples.iotservice.ListaLedStatus;
import io.grpc.examples.iotservice.Parametros;
import io.grpc.examples.iotservice.SensorServiceGrpc;
import io.grpc.examples.iotservice.SensorServiceGrpc.SensorServiceBlockingStub;
import io.grpc.stub.MetadataUtils;

@Service
@SuppressWarnings("deprecation")
public class DispositivosService {
	@Value("${base.url}")
	private String urlBase;
	
	public List<DTOLocalizacao> listarTodosDispositivosLocalizacao(DTOAuth auth) {
		ManagedChannel channel = ManagedChannelBuilder.forAddress(this.urlBase, 50051).usePlaintext().build();

		SensorServiceBlockingStub stub = SensorServiceGrpc.newBlockingStub(channel);

		Metadata metadata = new Metadata();
		Metadata.Key<String> tokenKey = Metadata.Key.of("token", Metadata.ASCII_STRING_MARSHALLER);
		metadata.put(tokenKey, auth.getToken());
		Metadata.Key<String> funcionalidadeKey = Metadata.Key.of("funcionalidade", Metadata.ASCII_STRING_MARSHALLER);
		metadata.put(funcionalidadeKey, auth.getFuncionalidade());

		stub = MetadataUtils.attachHeaders(stub, metadata);

		ListaDispositivos listaDispositivos = stub.listarDispositivos(EmptyMessage.newBuilder().build());
		List<DTOLocalizacao> dispLoc = this.listaDispositivosParaListaLocalizacao(listaDispositivos, auth);

		channel.shutdown();
		return dispLoc;
	}

	private List<DTOLocalizacao> listaDispositivosParaListaLocalizacao(ListaDispositivos dispositivos, DTOAuth auth) {
		List<DTOLocalizacao> dispLoc = new ArrayList<>();

		dispositivos.getDispositivosList().stream().forEach(d -> {
			DTOLocalizacao loc = null;
			List<DTODispositivo> disps = null;
			if (dispLoc.isEmpty() || dispLoc.stream().noneMatch(dl -> dl.getLocalizacao().equals(d.getLocalizacao()))) {
				loc = new DTOLocalizacao();
				loc.setLocalizacao(d.getLocalizacao());
				disps = new ArrayList<>();
				loc.setDispositivos(disps);
				dispLoc.add(loc);
			} else {
				loc = dispLoc.stream().filter(dl -> dl.getLocalizacao().equals(d.getLocalizacao())).toList().get(0);
				disps = loc.getDispositivos();
			}

			disps.add(this.consultarDispositivo(d.getNomeDispositivo(), d.getLocalizacao(), d.getTipoDispositivo(),
					auth));
		});

		return dispLoc;
	}

	public DTODispositivo consultarDispositivo(String nomeDispositivo, String localizacao, Integer tipoDispositivo,
			DTOAuth auth) {
		DTODispositivo dispositivo = null;
		Dado dado = null;
		if (tipoDispositivo != 1)
			dado = this.getUltimaLeitura(nomeDispositivo, localizacao, auth);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy, HH:mm:ss", Locale.getDefault());

		dispositivo = new DTODispositivo(nomeDispositivo, tipoDispositivo, localizacao,
				tipoDispositivo == 1 ? null : dado.getValor(),
				tipoDispositivo == 1 ? null : LocalDateTime.parse(dado.getData(), formatter),
				tipoDispositivo == 1 ? this.getStatusLed(nomeDispositivo, localizacao, auth).getEstado() == 1 : null);

		return dispositivo;
	}

	public DTODispositivo acionarLed(DTODispositivo ledAcionar, DTOAuth auth) {
		ManagedChannel channel = ManagedChannelBuilder.forAddress(this.urlBase, 50051).usePlaintext().build();

		SensorServiceBlockingStub stub = SensorServiceGrpc.newBlockingStub(channel);

		Metadata metadata = new Metadata();
		Metadata.Key<String> tokenKey = Metadata.Key.of("token", Metadata.ASCII_STRING_MARSHALLER);
		metadata.put(tokenKey, auth.getToken());
		Metadata.Key<String> funcionalidadeKey = Metadata.Key.of("funcionalidade", Metadata.ASCII_STRING_MARSHALLER);
		metadata.put(funcionalidadeKey, auth.getFuncionalidade());

		stub = MetadataUtils.attachHeaders(stub, metadata);

		LedStatus status = stub.acionarLed(LedStatus.newBuilder().setEstado(ledAcionar.getEstado() ? 1 : 0)
				.setLocalizacao(ledAcionar.getLocalizacao()).setNomeDispositivo(ledAcionar.getNomeDispositivo())
				.build());
		
		channel.shutdown();
		return new DTODispositivo(status.getNomeDispositivo(), 1, status.getLocalizacao(), null, null,
				status.getEstado() == 1);
	}

	public List<DTODado> listarLeituras(String nomeDispositivo, String localizacao, String dataFiltro, DTOAuth auth) {
		ManagedChannel channel = ManagedChannelBuilder.forAddress(this.urlBase, 50051).usePlaintext().build();

		SensorServiceBlockingStub stub = SensorServiceGrpc.newBlockingStub(channel);

		Metadata metadata = new Metadata();
		Metadata.Key<String> tokenKey = Metadata.Key.of("token", Metadata.ASCII_STRING_MARSHALLER);
		metadata.put(tokenKey, auth.getToken());
		Metadata.Key<String> funcionalidadeKey = Metadata.Key.of("funcionalidade", Metadata.ASCII_STRING_MARSHALLER);
		metadata.put(funcionalidadeKey, auth.getFuncionalidade());

		stub = MetadataUtils.attachHeaders(stub, metadata);

		Parametros param = null;
		if (dataFiltro != null) {
			param = Parametros.newBuilder().setLocalizacao(localizacao).setNomeDispositivo(nomeDispositivo)
					.setData(dataFiltro).build();

		} else {
			param = Parametros.newBuilder().setLocalizacao(localizacao).setNomeDispositivo(nomeDispositivo).build();

		}

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy, HH:mm:ss", Locale.getDefault());
		ListaDados dados = stub.listarLeiturasSensores(param);
		channel.shutdown();
		return dados.getDadosList().stream().map(d -> DTODado.builder().valor(d.getValor())
				.dataHoraLeitura(LocalDateTime.parse(d.getData(), formatter)).build()).sorted((d1, d2) -> d1.getDataHoraLeitura().isBefore(d2.getDataHoraLeitura()) ? 1 : -1).toList();
	}

	private LedStatus getStatusLed(String nomeDispositivo, String localizacao, DTOAuth auth) {
		ManagedChannel channel = ManagedChannelBuilder.forAddress(this.urlBase, 50051).usePlaintext().build();

		SensorServiceBlockingStub stub = SensorServiceGrpc.newBlockingStub(channel);

		Metadata metadata = new Metadata();
		Metadata.Key<String> tokenKey = Metadata.Key.of("token", Metadata.ASCII_STRING_MARSHALLER);
		metadata.put(tokenKey, auth.getToken());
		Metadata.Key<String> funcionalidadeKey = Metadata.Key.of("funcionalidade", Metadata.ASCII_STRING_MARSHALLER);
		metadata.put(funcionalidadeKey, auth.getFuncionalidade());

		stub = MetadataUtils.attachHeaders(stub, metadata);

		ListaLedStatus listaStatus = stub.listarLeds(
				LedStatus.newBuilder().setLocalizacao(localizacao).setNomeDispositivo(nomeDispositivo).build());

		channel.shutdown();
		return listaStatus.getStatusList().get(0);
	}

	private Dado getUltimaLeitura(String nomeDispositivo, String localizacao, DTOAuth auth) {
		ManagedChannel channel = ManagedChannelBuilder.forAddress(this.urlBase, 50051).usePlaintext().build();

		SensorServiceBlockingStub stub = SensorServiceGrpc.newBlockingStub(channel);

		Metadata metadata = new Metadata();
		Metadata.Key<String> tokenKey = Metadata.Key.of("token", Metadata.ASCII_STRING_MARSHALLER);
		metadata.put(tokenKey, auth.getToken());
		Metadata.Key<String> funcionalidadeKey = Metadata.Key.of("funcionalidade", Metadata.ASCII_STRING_MARSHALLER);
		metadata.put(funcionalidadeKey, auth.getFuncionalidade());

		stub = MetadataUtils.attachHeaders(stub, metadata);

		Dado dado = stub.consultarUltimaLeituraSensor(
				Parametros.newBuilder().setLocalizacao(localizacao).setNomeDispositivo(nomeDispositivo).build());

		channel.shutdown();
		return dado;
	}
}
