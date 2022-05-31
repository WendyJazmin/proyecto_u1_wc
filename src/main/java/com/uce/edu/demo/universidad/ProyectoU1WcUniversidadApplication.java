package com.uce.edu.demo.universidad;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ProyectoU1WcUniversidadApplication implements CommandLineRunner{

	
	//MATRICULA
	//1)(DI) por atributo, inyeccion de dependencia por atributos
	@Autowired
	private Matricula matricula1;
	
	//2) DI por constructor
	@Autowired
	private Matricula2 matricula2;
	
	//3) DI por metodos set
	@Autowired
	private Matricula3 matricula3;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1WcUniversidadApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//MATRICULA
		//System.out.println();
		
		String respuesta4 = matricula1.matricular(LocalDateTime.now(), "Marco", 14245657, 20, "Economia", 50);
		System.out.println(respuesta4);
		
		String respuesta5 = matricula2.matricular(LocalDateTime.now(), "Andrea", 14088757, 19, "Fisica", 12);
		System.out.println(respuesta5);
		
		String respuesta6 = matricula3.matricular(LocalDateTime.now(), "Daniel", 13238857, 22, "Ecuaciones Diferenciales", 44);
		System.out.println(respuesta6);
	}

}
