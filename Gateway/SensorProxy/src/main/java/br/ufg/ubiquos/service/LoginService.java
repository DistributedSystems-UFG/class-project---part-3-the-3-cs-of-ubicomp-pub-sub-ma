package br.ufg.ubiquos.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import br.ufg.ubiquos.ma.dtos.DTOAuth;
import br.ufg.ubiquos.ma.dtos.DTOUsuario;
import br.ufg.ubiquos.ma.exceptions.AutorizacaoInvalidaException;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.examples.iotservice.ParamLogin;
import io.grpc.examples.iotservice.SensorServiceGrpc;
import io.grpc.examples.iotservice.SensorServiceGrpc.SensorServiceBlockingStub;
import io.grpc.examples.iotservice.Sessao;

@Service
public class LoginService {
	
	@Value("${base.url}")
	private String urlBase;
	
	public DTOAuth realizarLogin(DTOUsuario usuario) {
		ManagedChannel channel = ManagedChannelBuilder.forAddress(this.urlBase, 50051)
		          .usePlaintext()
		          .build();
		
		SensorServiceBlockingStub stub = SensorServiceGrpc.newBlockingStub(channel);
		try {		
			Sessao sessao = stub.autenticarUsuario(ParamLogin.newBuilder().setUsuario(usuario.getUsuario()).setSenha(usuario.getSenha()).build());
			return DTOAuth.from(sessao);
		} catch(StatusRuntimeException e) {
			if(e.getStatus().getCode().equals(Status.UNAUTHENTICATED.getCode())) {
				throw new AutorizacaoInvalidaException("Login ou senha inválidos");
			}
		} finally {
			channel.shutdown();
		}
		
		return null;
	}
	
	public DTOAuth consultarSessao(String token) {
		ManagedChannel channel = ManagedChannelBuilder.forAddress(this.urlBase, 50051)
		          .usePlaintext()
		          .build();
		
		SensorServiceBlockingStub stub = SensorServiceGrpc.newBlockingStub(channel);
		try {		
			Sessao sessao = stub.consultarFuncionalidade(Sessao.newBuilder().setToken(token).build());
			return DTOAuth.from(sessao);
		} catch(StatusRuntimeException e) {
			if(e.getStatus().getCode().equals(Status.UNAUTHENTICATED.getCode())) {
				throw new AutorizacaoInvalidaException("Token inválido");
			}
		} finally {
			channel.shutdown();
		}
		
		return null;
	}
}
