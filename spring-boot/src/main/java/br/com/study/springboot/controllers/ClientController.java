package br.com.study.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.study.springboot.model.entities.Client;

@RestController
@RequestMapping("clients")
public class ClientController {
	
	@GetMapping(path = "/any")
	public Client getClient() {
		return new Client(28, "Matheus", "123.456.789-10");
	}
	
	@GetMapping(path = "/{id}")
	public Client getClient(@PathVariable int id) {
		return new Client(id, "Matheus", "123.456.789-10");
	}
	
	@GetMapping
	public Client getClient2(@RequestParam(name = "id") int id) {
		return new Client(id, "Matheus", "123.456.789-10");
	}
}
