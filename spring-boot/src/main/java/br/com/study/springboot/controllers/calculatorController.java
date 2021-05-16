package br.com.study.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculator")
public class calculatorController {

	@GetMapping(path = "/sum/{a}/{b}")
	public double sum(@PathVariable int a,@PathVariable int b) {
		return a + b;
	}
	
	@GetMapping(path = "/sub")
	public double sub(@RequestParam(name = "a") int a,@RequestParam(name = "b") int b) {
		return a + b;
	}
}
