package com.uce.edu.demo.disco.service;

import com.uce.edu.demo.disco.modelo.Cantante;

public interface ICantanteService {
	
	public void insertarCantante(String nombre, String edad);
	
	public Cantante buscarCantante(String nombre);
	
	public void actualizarCantante(Cantante c);
	
	public void eliminarCantante(String nombre);

}
