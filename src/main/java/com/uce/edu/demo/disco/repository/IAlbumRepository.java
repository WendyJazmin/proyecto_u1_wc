package com.uce.edu.demo.disco.repository;

import com.uce.edu.demo.disco.modelo.Album;

public interface IAlbumRepository {
	
	//CRUD
	//C: crear/insertar
	public void insertar(Album a);
	
	//R: Leer/buscar
	public Album buscar(String nombre);
	
	//U: actualizar
	public void actualizar(Album a);
	
	//D: eliminar
	public void eliminar(String nombre);


}
