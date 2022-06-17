package com.uce.edu.demo.disco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.disco.modelo.Cantante;

@Repository
public class CantanteRepositoryImpl implements ICantanteRepository{

	@Override
	public void insertar(Cantante c) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base el cantante: "+c);
	}

	@Override
	public Cantante buscar(String nombre) {
		// TODO Auto-generated method stub
		
		Cantante cantante = new Cantante();
		cantante.setNombre(nombre);
		cantante.setEdad("0");
		return cantante;
	}

	@Override
	public void actualizar(Cantante c) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base el cantante: "+c);

	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base el cantante: "+nombre);

	}
	
	

}
