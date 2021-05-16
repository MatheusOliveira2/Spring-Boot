package br.com.study.springboot.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@RequestMapping(method = RequestMethod.GET, path = "/hello")
	public String hello() {
		return "Hello Spring boot";
	}
}
