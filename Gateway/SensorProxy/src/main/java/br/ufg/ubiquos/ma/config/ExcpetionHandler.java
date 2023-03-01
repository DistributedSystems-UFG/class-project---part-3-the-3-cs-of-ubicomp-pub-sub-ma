package br.ufg.ubiquos.ma.config;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.ufg.ubiquos.ma.dtos.DTOErro;
import br.ufg.ubiquos.ma.exceptions.AutorizacaoInvalidaException;

@ControllerAdvice
public class ExcpetionHandler extends ResponseEntityExceptionHandler {
	


	@ExceptionHandler(AutorizacaoInvalidaException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
	protected ResponseEntity<Object> handleAuthInvalida(AutorizacaoInvalidaException ex, WebRequest request) {
		return handleExceptionInternal(ex, new DTOErro(ex.getMessage()), new HttpHeaders(), HttpStatus.UNAUTHORIZED, request);
	}
	
	
}
