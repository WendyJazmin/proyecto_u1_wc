package com.uce.edu.demo.disco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.disco.modelo.Cancion;

@Repository
public class CancionRepositoryImpl implements ICancionRepository{

	@Override
	public void insertar(Cancion c) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base la cancion: "+c);

	}

	@Override
	public Cancion buscar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base la cancion: "+nombre);
		Cancion c = new Cancion();
		c.setNombre(nombre);

		return c;
	}

	@Override
	public void actualizar(Cancion c) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base la cancion: "+c);

	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base la cancion: "+nombre);

	}

}
