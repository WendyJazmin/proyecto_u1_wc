package com.example.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.consultorio.CitaMedica;

@SpringBootApplication
public class ProyectoU1WcApplication implements CommandLineRunner {
	
	//1) DI por atributo
	//@Autowired
	//private CitaMedica cita;
	
	@Autowired
	private CitaMedica cita2;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1WcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Mi primer proyecto con Spring Framework");
		
		String respuesta = cita2.agendar(LocalDateTime.now(), "Javier", "Teran", 32,"Quito","Pepito",19);
		
		
		System.out.println(respuesta);
	}

}
