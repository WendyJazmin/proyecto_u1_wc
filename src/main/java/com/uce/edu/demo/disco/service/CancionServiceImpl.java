package com.uce.edu.demo.disco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.disco.modelo.Cancion;
import com.uce.edu.demo.disco.repository.ICancionRepository;

@Service
public class CancionServiceImpl implements ICancionService{
	
	@Autowired
	private ICancionRepository iCancionRepository;
	
	@Autowired
	private Cancion cancion;

	@Override
	public void ingresarCancion(String nombre, String duracion) {
		// TODO Auto-generated method stub
		this.cancion.setNombre(nombre);
		this.cancion.setDuracion(duracion);
		this.iCancionRepository.insertar(this.cancion);
	}

	@Override
	public Cancion buscarCancion(String nombre) {
		// TODO Auto-generated method stub
		return this.iCancionRepository.buscar(nombre);
	}

	@Override
	public void actualizarCancion(Cancion c) {
		// TODO Auto-generated method stub
		this.iCancionRepository.actualizar(c);
	}

	@Override
	public void borrarCancion(String nombre) {
		// TODO Auto-generated method stub
		this.iCancionRepository.eliminar(nombre);
	}

}
