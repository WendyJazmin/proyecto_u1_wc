package com.uce.edu.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
	private IEstudianteService estudianteService;
	
	@Autowired
	private IMateriaService materiaService;
	
	@Autowired
	private IMatriculaService matriculaService;
	
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
		
		
		//usar los 3 metodos restantes
		e.setCedula("1294848499");
		this.estudianteService.actualizarEstudiante(e);
		
		this.estudianteService.buscarPorApellido("Cayambe");
		
		this.estudianteService.borrarEstudiante("1294848499");
		
		System.out.println();
		
		Estudiante e3 = new Estudiante();
		e3.setNombre("Jeff");
		e3.setApellido("Satur");
		e3.setCedula("033042199");
		
		this.estudianteService.ingresarEstudiante(e3);
		this.estudianteService.buscarPorApellido("Satur");
		this.estudianteService.actualizarEstudiante(e3);
		//this.estudianteService.borrarEstudiante("033042199");
		
		
		//Materias
		
		//materia 1
		Materia materia = new Materia();
		materia.setNombre("Estadistica");
		materia.setSemestre("4");
		
		this.materiaService.ingresarMateria(materia);
		
		this.materiaService.buscarPorMateria("Estadistica");
		
		materia.setNombre("Probabilidad y estadistica");
		this.materiaService.actualizarMateria(materia);
		
		
		//materia 2
		Materia materia2 = new Materia();
		materia2.setNombre("Calculo");
		materia2.setSemestre("2");
		
		this.materiaService.ingresarMateria(materia2);
		this.materiaService.buscarPorMateria("Calculo");
		this.materiaService.actualizarMateria(materia2);
		
		
		//materia 3
		Materia materia3 = new Materia();
		materia3.setNombre("Ecuaciones Diferenciales");
		materia3.setSemestre("3");
		
		this.materiaService.ingresarMateria(materia3);
		this.materiaService.buscarPorMateria("Ecuaciones Diferenciales");
		this.materiaService.actualizarMateria(materia3);
		
		
		//materia 4
		Materia materia4 = new Materia();
		materia4.setNombre("Base de datos");
		materia4.setSemestre("4");
		
		this.materiaService.ingresarMateria(materia4);
		this.materiaService.borrarMateria("Base de datos");
		
		
		//Matriculas
		
		List<Materia> materias = new ArrayList<>();
		materias.add(materia);
		materias.add(materia2);
		
		List<Materia> materias2 = new ArrayList<>();
		materias2.add(materia2);
		materias2.add(materia3);
		
		
		//matricula 1
		Matricula matricula1 = new Matricula();
		matricula1.setNumero("000011");
		matricula1.setEstudiante(e1);
		matricula1.setMateria(materias);
		
		this.matriculaService.ingresarMatricula(matricula1);
		this.matriculaService.buscarPorMatricula("000011");
		this.matriculaService.actualizarMatricula(matricula1);
		this.matriculaService.borrarMatricula("000011");
		
		
		//matricula 2
		Matricula matricula2 = new Matricula();
		matricula2.setNumero("00024");
		matricula2.setEstudiante(e3);
		matricula2.setMateria(materias2);
		
		this.matriculaService.ingresarMatricula(matricula2);
		
		this.matriculaService.buscarPorMatricula("00024");
		
		matricula2.setNumero("000020");
		this.matriculaService.actualizarMatricula(matricula2);
		
		
	}
}
