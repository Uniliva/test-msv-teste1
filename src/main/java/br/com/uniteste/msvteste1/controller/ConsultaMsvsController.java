package br.com.uniteste.msvteste1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.uniteste.msvteste1.mvs.MsvTeste2FeignConfig;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ConsultaMsvsController {

	@Autowired
	private final MsvTeste2FeignConfig msvTeste2;
	
	@GetMapping
	public ResponseEntity<String> cosulta(){
		return ResponseEntity.ok("O msv teste 2 diz:" + msvTeste2.dizOlla());
	}
}
