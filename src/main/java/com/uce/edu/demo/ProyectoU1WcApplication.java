package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.service.IDepositoService;
import com.uce.edu.demo.banco.service.ITransferenciaService;
import com.uce.edu.demo.consultorio.CitaMedica;
import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1WcApplication implements CommandLineRunner {
	
	@Autowired
	private ITransferenciaService iTransferenciaService;
	
	@Autowired
	private IDepositoService idepositoService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1WcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		iTransferenciaService.realizarTransferencia("12", "13", new BigDecimal(20));
		
		idepositoService.realizarDeposito("14", new BigDecimal(50));
		
	}
}
