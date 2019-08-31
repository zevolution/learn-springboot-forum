package br.com.alura.forum.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.config.security.AutenticacaoForm;

@RestController
@RequestMapping("/auth")
public class AutenticacaoController {

	@PostMapping
	public ResponseEntity<?> autenticar(@RequestBody @Valid AutenticacaoForm autenticacao) {
		
		System.out.println(autenticacao.getUsuario());
		System.out.println(autenticacao.getSenha());
		
		return ResponseEntity.ok().build();
	}
	
}