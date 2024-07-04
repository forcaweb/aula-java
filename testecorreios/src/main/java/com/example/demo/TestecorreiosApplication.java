package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import entities.Correios;

@SpringBootApplication
public class TestecorreiosApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestecorreiosApplication.class, args);
		
		Correios calcularPrazo = new Correios("12345678", "87654321");
	    String result = calcularPrazo.calcularFrete();
	    System.out.println(result);
	}

}
