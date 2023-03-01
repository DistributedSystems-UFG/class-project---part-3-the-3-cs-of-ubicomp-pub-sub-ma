package br.ufg.ubiquos.ma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.ufg.ubiquos.ma.dtos.DTOAuth;
import br.ufg.ubiquos.ma.dtos.DTODado;
import br.ufg.ubiquos.ma.dtos.DTODispositivo;
import br.ufg.ubiquos.ma.dtos.DTOLocalizacao;
import br.ufg.ubiquos.service.DispositivosService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("dispositivos")
@CrossOrigin("*")
public class CDispositivos {

	@Autowired
	private DispositivosService dispositivosService;

	@GetMapping
	public ResponseEntity<List<DTOLocalizacao>> listarLocalizacoes(@RequestHeader String token,
			@RequestHeader String funcionalidade) {
		DTOAuth dtoAuth = new DTOAuth(token, funcionalidade);
		List<DTOLocalizacao> locais = this.dispositivosService.listarTodosDispositivosLocalizacao(dtoAuth);
		return ResponseEntity.ok(locais);
	}

	@GetMapping("/{localizacao}/{nomeDispositivo}/{tipoDispositivo}")
	public ResponseEntity<DTODispositivo> consultarUltimoEstado(@RequestHeader String token,
			@RequestHeader String funcionalidade, @PathVariable("localizacao") String localizacao,
			@PathVariable("nomeDispositivo") String nomeDispositivo, @PathVariable("tipoDispositivo") Integer tipoDispositivo) {
		DTOAuth dtoAuth = new DTOAuth(token, funcionalidade);
		DTODispositivo dispositivo = this.dispositivosService.consultarDispositivo(nomeDispositivo, localizacao, tipoDispositivo, dtoAuth);
		return ResponseEntity.ok(dispositivo);
	}
	
	@GetMapping("/{localizacao}/{nomeDispositivo}/leituras")
	public ResponseEntity<List<DTODado>> listarUltimasLeituras(@RequestHeader String token,
			@RequestHeader String funcionalidade, @PathVariable("localizacao") String localizacao,
			@PathVariable("nomeDispositivo") String nomeDispositivo, @RequestParam(value = "data", name = "data", required = false) String data){
		DTOAuth dtoAuth = new DTOAuth(token, funcionalidade);
		List<DTODado> dados = this.dispositivosService.listarLeituras(nomeDispositivo, localizacao, data, dtoAuth);
		return ResponseEntity.ok(dados);
	}
	
	@PostMapping
	public ResponseEntity<DTODispositivo> acionarLed(@RequestHeader String token,
			@RequestHeader String funcionalidade, @RequestBody @Valid DTODispositivo dispositivo){
		DTOAuth dtoAuth = new DTOAuth(token, funcionalidade);
		DTODispositivo retorno = this.dispositivosService.acionarLed(dispositivo, dtoAuth);
		return ResponseEntity.ok(retorno);
	}
}
