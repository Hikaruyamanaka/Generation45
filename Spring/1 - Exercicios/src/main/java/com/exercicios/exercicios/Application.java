package com.exercicios.exercicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class Application 
{
	
	@GetMapping("/Atividade1")
	public String Atividade()
	{ 
		return "Foi utilizado nessa atividade as habilidades técnicas e comportamentais" 
				+ "\n" + 
				"E as mentalidades de crescimento, atenção aos detalhes e orientação futura!";
	}
	
	
	@GetMapping("/Atividade2")
	public String Atividade2()
	{
		return "Meus objetivos de aprendizagem é: " +
			   "\n" +
			   "Ampliar meus conhecimentos técnicos, aprender coisas novas e desenvolver o projeto integrador com o meu grupo";
	}
	
	public static void main(String[] args) 
	{
		SpringApplication.run(Application.class, args);
	}

}
