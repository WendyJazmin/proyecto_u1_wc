package com.uce.edu.demo.universidad;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Matricula2 {
	
	private LocalDateTime hora;
	
	private Materia materia;
	private Estudiante estudiante;
	
	//2) DI por constructor
	public Matricula2(Estudiante estudiante, Materia materia) {
		this.estudiante = estudiante;
		this.materia = materia;
	}
	
	public String matricular(LocalDateTime hora, String nombre, int cedula, int edad, String materia, int horas) {
	
		this.materia.setNombreMateria(materia);
		this.materia.setHoras(horas);
		
		this.estudiante.setNombre(nombre);
		this.estudiante.setCedula(cedula);
		this.estudiante.setEdad(edad);
		
		this.hora = hora;
		
		return "Matricula Estudiante: "+nombre+" con ID por constructor";
		
		
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	
	

}
