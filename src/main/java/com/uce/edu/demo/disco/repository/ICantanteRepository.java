package com.uce.edu.demo.disco.repository;

import com.uce.edu.demo.disco.modelo.Cantante;

public interface ICantanteRepository {
	
	//CRUD
	
		//C: crear/insertar
		public void insertar(Cantante c);
		
		//R: Leer/buscar
		public Cantante buscar(String nombre);
		
		//U: actualizar
		public void actualizar(Cantante c);
		
		//D: eliminar
		public void eliminar(String nombre);

}
