package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaService {
	
	//metodos de logica de negocio
	public void ingresarMatricula(Matricula e);
	
	public Matricula buscarPorMatricula(String apellido);
	
	public void actualizarMatricula(Matricula e);
	
	public void borrarMatricula(String cedula);

}
