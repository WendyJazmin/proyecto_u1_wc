package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.service.ICuentaBancariaService;
import com.uce.edu.demo.banco.service.IDepositoService;
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
	private IProductoService iProductoService;
	
	@Autowired
	private IInventarioService IInventarioService; 
	

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1WcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	
		System.out.println();
		this.iProductoService.insertarProducto("Aceite", new BigDecimal(1.40));
		this.iProductoService.insertarProducto("Atun", new BigDecimal(1.20));
		this.iProductoService.insertarProducto("Chocolate", new BigDecimal(1));
		this.iProductoService.insertarProducto("Queso",new BigDecimal(1.10));
		this.iProductoService.insertarProducto("Fideo",new BigDecimal(2));
		
		

		System.out.println("\n");
		this.IInventarioService.insertarInventario("Aceite",new BigDecimal(1.40), 2, LocalDateTime.of(2021, 2, 16, 13, 35));
		this.IInventarioService.insertarInventario("Atun", new BigDecimal(1.20), 4, LocalDateTime.of(2022, 8, 16, 16, 28));
		this.IInventarioService.insertarInventario("Chocolate", new BigDecimal(1), 10, LocalDateTime.of(2022, 8, 16, 16, 28));
		this.IInventarioService.insertarInventario("Queso",new BigDecimal(1.10), 6, LocalDateTime.of(2021, 2, 16, 13, 35));
		this.IInventarioService.insertarInventario("Fideo",new BigDecimal(2), 8, LocalDateTime.of(2021, 2, 20, 9, 35));
		
		this.IInventarioService.buscarInventario(LocalDateTime.of(2022, 8, 16, 16, 28));
	}
}
