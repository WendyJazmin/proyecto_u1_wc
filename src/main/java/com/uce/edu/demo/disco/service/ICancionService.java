package com.uce.edu.demo.disco.service;

import com.uce.edu.demo.disco.modelo.Cancion;

public interface ICancionService {
	
	public void ingresarCancion(String nombre, String duracion);
	
	public Cancion buscarCancion(String nombre);
	
	public void actualizarCancion(Cancion c);
	
	public void borrarCancion(String nombre);


}
