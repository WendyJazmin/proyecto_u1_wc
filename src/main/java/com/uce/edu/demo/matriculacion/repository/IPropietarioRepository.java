package com.uce.edu.demo.matriculacion.repository;

import com.uce.edu.demo.matriculacion.modelo.Propietario;

public interface IPropietarioRepository {

	public void crear(Propietario propietario);
	
	public Propietario consultar(String cedula);
	
	public void eliminar(String cedula);
}
