package com.uce.edu.demo.disco.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.disco.modelo.Album;

@Repository
public class AlbumRepositoryImpl implements IAlbumRepository{

	@Override
	public void insertar(Album a) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base el album: "+a);

	}

	@Override
	public Album buscar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base el album: "+nombre);
		Album album = new Album();
		album.setNombre(nombre);

		return album;
	}

	@Override
	public void actualizar(Album a) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base el album:\n"+a);

	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base el album: "+nombre);

	}

}
