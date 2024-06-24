package br.com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoApp {

	@GetMapping
	public String ola(@RequestParam(value = "name", defaultValue = "Mundo") String name) {
		return String.format("Olá %s!", name);
	}
}
