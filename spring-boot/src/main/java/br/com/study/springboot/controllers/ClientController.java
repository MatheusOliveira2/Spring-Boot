package br.com.study.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.study.springboot.models.Client;

@RestController
public class ClientController {
	
	@GetMapping(path = "/client")
	public Client getClient() {
		return new Client(28, "Matheus", "123.456.789-10");
	}
}
