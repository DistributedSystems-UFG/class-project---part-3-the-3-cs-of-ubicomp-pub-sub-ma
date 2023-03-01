package br.ufg.ubiquos.ma.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.ufg.ubiquos.ma.dtos.DTOAuth;
import br.ufg.ubiquos.ma.dtos.DTOUsuario;
import br.ufg.ubiquos.service.LoginService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("login")
@CrossOrigin("*")
public class CLogin {

	@Autowired
	private LoginService loginService;
	
	@PostMapping
	public ResponseEntity<DTOAuth> login(@RequestBody @Valid DTOUsuario usuario){
		DTOAuth auth = this.loginService.realizarLogin(usuario);
		return ResponseEntity.ok(auth);
	}
	
	@GetMapping("/sessao")
	public ResponseEntity<DTOAuth> consultarSessao(@RequestHeader String token){
		DTOAuth auth = this.loginService.consultarSessao(token);
		return ResponseEntity.ok(auth);
	}
	
}
