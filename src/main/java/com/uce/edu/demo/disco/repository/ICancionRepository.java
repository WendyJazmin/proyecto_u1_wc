package com.uce.edu.demo.disco.repository;

import com.uce.edu.demo.disco.modelo.Cancion;

public interface ICancionRepository {
	
	//CRUD
		//C: crear/insertar
		public void insertar(Cancion c);
		
		//R: Leer/buscar
		public Cancion buscar(String nombre);
		
		//U: actualizar
		public void actualizar(Cancion c);
		
		//D: eliminar
		public void eliminar(String nombre);

}
