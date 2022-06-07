package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;

public interface IMateriaService {
	
	//metodos de logica de negocio
	public void ingresarMateria(Materia e);
	
	public Materia buscarPorMateria(String nombre);
	
	public void actualizarMateria(Materia e);
	
	public void borrarMateria(String nombre);

}
