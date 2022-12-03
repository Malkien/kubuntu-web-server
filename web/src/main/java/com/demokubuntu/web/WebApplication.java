package com.demokubuntu.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebApplication {
	@RequestMapping("/")
	public String home(){
		return "ESTA HACIENDO SU FUNCION";
	}
	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

}
