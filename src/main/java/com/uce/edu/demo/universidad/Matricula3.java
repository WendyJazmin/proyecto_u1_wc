package com.uce.edu.demo.universidad;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Matricula3 {
	
	private LocalDateTime hora;
	
	//3) DI por metodos set
	private Materia materia;
	private Estudiante estudiante;
	
	public String matricular(LocalDateTime hora, String nombre, int cedula, int edad, String materia, int horas) {
	
		this.materia.setNombreMateria(materia);
		this.materia.setHoras(horas);
		
		this.estudiante.setNombre(nombre);
		this.estudiante.setCedula(cedula);
		this.estudiante.setEdad(edad);
		
		this.hora = hora;
		
		return "Matricula Estudiante: "+nombre+" con ID por metodos set";
		
		
	}

	public Materia getMateria() {
		return materia;
	}

	@Autowired
	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	@Autowired
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	
	

}
