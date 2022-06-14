package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.bodega.modelo.GestorInventario;
import com.uce.edu.demo.bodega.service.IInventarioService;


@SpringBootApplication
public class ProyectoU1WcApplication implements CommandLineRunner {
	
	@Autowired
	private IFachadaCuentaBancaria bancaria;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1WcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	System.out.println();	
		
	BigDecimal interes = this.bancaria.calcularInteres("1213");
	
	System.out.println("interes: "+interes);
	}
}
