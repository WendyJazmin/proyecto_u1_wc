package com.uce.edu.demo.disco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.disco.modelo.Cantante;
import com.uce.edu.demo.disco.repository.ICantanteRepository;

@Service
public class CantanteServiceImpl implements ICantanteService{

	@Autowired
	private ICantanteRepository iCantanteRepository;
	
	@Autowired
	private Cantante cantante;
	
	@Override
	public void insertarCantante(String nombre, String edad) {
		// TODO Auto-generated method stub
		this.cantante.setNombre(nombre);
		this.cantante.setEdad(edad);
		this.iCantanteRepository.insertar(this.cantante);
	}

	@Override
	public Cantante buscarCantante(String nombre) {
		// TODO Auto-generated method stub
		return this.iCantanteRepository.buscar(nombre);
	}

	@Override
	public void actualizarCantante(Cantante c) {
		// TODO Auto-generated method stub
		this.iCantanteRepository.actualizar(c);
	}

	@Override
	public void eliminarCantante(String nombre) {
		// TODO Auto-generated method stub
		this.iCantanteRepository.eliminar(nombre);
	}

}
