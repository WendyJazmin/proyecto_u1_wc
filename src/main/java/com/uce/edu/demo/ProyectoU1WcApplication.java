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
import com.uce.edu.demo.matriculacion.modelo.Propietario;
import com.uce.edu.demo.matriculacion.modelo.Vehiculo;
import com.uce.edu.demo.matriculacion.service.IMatriculaGestorService;
import com.uce.edu.demo.matriculacion.service.IPropietarioService;
import com.uce.edu.demo.matriculacion.service.IVehiculoService;
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
	private IVehiculoService iVehiculoService;
	
	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
	private IMatriculaGestorService gestorService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1WcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//1
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setMarca("Toyota");
		vehiculo.setPlaca("PCT348");
		vehiculo.setPrecio(new BigDecimal(50000));
		vehiculo.setTipo("pesado");
		this.iVehiculoService.insertarVehiculo(vehiculo);
		
		//2
		vehiculo.setMarca("Chevrolet");
		vehiculo.setPrecio(new BigDecimal(40000));
		this.iVehiculoService.actualizarVehiculo(vehiculo);
		
		//3
		Propietario pro = new Propietario();
		pro.setApellido("Cayambe");
		pro.setNombre("Edison");
		pro.setCedula("128333489");
		pro.setFechaNacimiento(LocalDateTime.now());
		this.iPropietarioService.crearPropietario(pro);
		
		//4
		this.gestorService.generarMatricula(pro.getCedula(), vehiculo.getPlaca());

	}
}
