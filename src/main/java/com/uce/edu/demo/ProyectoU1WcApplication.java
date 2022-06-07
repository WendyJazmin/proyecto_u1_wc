package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.consultorio.CitaMedica;
import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoU1WcApplication implements CommandLineRunner {
	
	@Autowired
	private IEstudianteService estudianteService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1WcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Estudiante e = new Estudiante();
		e.setNombre("Edison");
		e.setApellido("Cayambe");
		e.setCedula("12244555");
		
		this.estudianteService.ingresarEstudiante(e);
		
		Estudiante e1 = new Estudiante();
		e1.setNombre("Pepito");
		e1.setApellido("Perez");
		e1.setCedula("02394944");
		
		this.estudianteService.ingresarEstudiante(e1);
		
		
		//usar los 3 metodos rstantes
		e.setCedula("1294848499");
		this.estudianteService.actualizarEstudiante(e);
		
		this.estudianteService.buscarPorApellido("Cayambe");
		
		this.estudianteService.borrarEstudiante("1294848499");
	}
}
