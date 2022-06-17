package com.uce.edu.demo.disco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.disco.modelo.Album;
import com.uce.edu.demo.disco.modelo.Cancion;
import com.uce.edu.demo.disco.modelo.Cantante;
import com.uce.edu.demo.disco.repository.IAlbumRepository;

@Service
public class AlbumServiceImpl implements IAlbumService{
	
	@Autowired
	private IAlbumRepository iAlbumRepository;
	
	@Autowired
	private Cantante cantante;
	
	@Autowired
	private Cancion cancion1;
	

	@Override
	public void ingresarAlbum(String nombre, String codigo, Cantante c, List<Cancion> canciones) {
		// TODO Auto-generated method stub
		Album album = new Album();
		album.setNombre(nombre);
		album.setCodigo(codigo);
		
		album.setCantante(c);
		album.setCanciones(canciones);
		System.out.println("DI de cantante desde AlbumServiceImpl SINGLETON: "+this.cantante);
		System.out.println("DI de cancion desde AlbumServiceImpl PROTOTYPE: "+this.cancion1+"\n");
		this.iAlbumRepository.insertar(album);
	}

	@Override
	public Album buscarAlbum(String nombre) {
		// TODO Auto-generated method stub
		return this.iAlbumRepository.buscar(nombre);
	}

	@Override
	public void actualizarAlbum(Album a) {
		// TODO Auto-generated method stub
		this.iAlbumRepository.actualizar(a);
	}

	@Override
	public void borrarAlbum(String nombre) {
		// TODO Auto-generated method stub
		this.iAlbumRepository.eliminar(nombre);
	}

}
