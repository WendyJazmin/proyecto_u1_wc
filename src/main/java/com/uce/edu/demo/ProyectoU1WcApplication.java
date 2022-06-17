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
import com.uce.edu.demo.disco.modelo.Cancion;
import com.uce.edu.demo.disco.modelo.Cantante;
import com.uce.edu.demo.disco.service.IAlbumService;
import com.uce.edu.demo.disco.service.ICancionService;
import com.uce.edu.demo.disco.service.ICantanteService;
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
	private IAlbumService iAlbumService;
	
	@Autowired
	private Cantante cantante;//singleton
	
	@Autowired
	private Cantante cantante2;
	
	@Autowired
	private Cancion cancion;//prototype
	
	@Autowired
	private Cancion cancion2;
	
	@Autowired
	private ICancionService iCancion;
	
	@Autowired
	private ICantanteService icantante;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1WcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	System.out.println();
	System.out.println("EJEMPLO SINGLETON");
	
		//cantantes
		this.cantante.setNombre("Jeff Satur");
		this.cantante.setEdad("27");
		System.out.println(cantante);

		System.out.println(cantante2);
		
		this.cantante2.setEdad("26");
		
		System.out.println("---------------------------------------");
		System.out.println(cantante);
		System.out.println(cantante2);
		
		System.out.println();
		this.icantante.insertarCantante("Troye Sivan", "29");
		
		System.out.println("---------------------------------------");
		System.out.println(this.cantante);
		System.out.println(this.cantante2);
		
		System.out.println("\n**********************************************************");
		
		
		System.out.println("\nEJEMPLO PROTOTYPE");
		
		//canciones
		this.cancion.setNombre("Complicated");
		this.cancion.setDuracion("3:10");	
		System.out.println(cancion);
		
		this.cancion2.setNombre("Highway");
		this.cancion2.setDuracion("2:51");
		System.out.println(cancion2);
		
		this.cancion.setNombre("Savage Garden");
		System.out.println(cancion);
		
		System.out.println();
		
		this.iCancion.ingresarCancion("Tears of Pears", "3:20");
		
		System.out.println();

		
		//ALBUM
		List<Cancion> canciones = new ArrayList<>();
		
		canciones.add(cancion);
		canciones.add(cancion2);
		
		this.iAlbumService.ingresarAlbum("Moon", "123e", this.cantante,canciones);
		
	}
}
