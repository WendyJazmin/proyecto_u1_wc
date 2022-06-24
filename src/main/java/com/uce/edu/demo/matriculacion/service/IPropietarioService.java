package com.uce.edu.demo.matriculacion.service;

import com.uce.edu.demo.matriculacion.modelo.Propietario;

public interface IPropietarioService {

	
	void crearPropietario(Propietario propietario);
	
	public void eliminarPropietario(String cedula);
}
