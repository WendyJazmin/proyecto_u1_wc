package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.universidad.Matricula;

public interface IMatriculaRepository {

	//CRUD
	
	//C: crear/insertar
	public void insertar(Matricula e);
	
	//R: Leer/buscar
	public Matricula buscar(String numero);
	
	//U: actualizar
	public void actualizar(Matricula e);
	
	//D: eliminar
	public void eliminar(String nombre);
}
