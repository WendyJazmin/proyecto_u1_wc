package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.service.ICuentaBancariaService;
import com.uce.edu.demo.banco.service.IDepositoService;
import com.uce.edu.demo.banco.service.IFachadaCuentaBancaria;
import com.uce.edu.demo.banco.service.IRetiroService;
import com.uce.edu.demo.banco.service.ITransferenciaService;
import com.uce.edu.demo.bodega.service.IProductoService;
import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMatriculaService;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

import com.uce.edu.demo.bodega.modelo.GestorInventario;
import com.uce.edu.demo.bodega.service.IInventarioService;


@SpringBootApplication
public class ProyectoU1WcApplication implements CommandLineRunner {
	
	@Autowired
	private ProfesorGeneral general;
	
	@Autowired
	private ProfesorGeneral general1;
	
	
	@Autowired
	private ProfesorMateria  materia;
	
	
	@Autowired
	private ProfesorMateria  materia1;
	
	@Autowired
	private IMatriculaService iIMatriculaService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1WcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	System.out.println();
	System.out.println("ejemplo Singleton");
		this.general.setNombre("Jeff");
		this.general.setApellido("Satur");
	
		System.out.println(this.general);
		
		System.out.println("------------------------------------------");
		System.out.println(this.general1);
		this.general1.setNombre("Daniel");
		System.out.println("------------------------------------------");
		System.out.println(this.general);
		
		System.out.println("\nejemplo Prototype");
		
		this.materia.setNombre("Alex");
		this.materia.setApellido("Alvear");
		System.out.println(this.materia);
		System.out.println(this.materia1);
		
		
		Matricula matricula1 = new Matricula();
		matricula1.setEstudiante(new Estudiante());
		matricula1.setMateria(new ArrayList<>());
		matricula1.setNumero("12123");
		
		System.out.println();
		this.iIMatriculaService.ingresarMatricula(matricula1);
	}
}
