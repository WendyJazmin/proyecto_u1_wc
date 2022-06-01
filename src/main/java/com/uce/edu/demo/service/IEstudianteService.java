package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Estudiante;

public interface IEstudianteService {
	
	//metodos de logica de negocio
	public void ingresarEstudiante(Estudiante e);
	
	public Estudiante buscarPorApellido(String apellido);
	
	public void actualizarEstudiante(Estudiante e);
	
	public void borrarEstudiante(String cedula);

}
