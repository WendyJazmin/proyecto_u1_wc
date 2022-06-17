package com.uce.edu.demo.disco.service;

import java.util.List;

import com.uce.edu.demo.disco.modelo.Album;
import com.uce.edu.demo.disco.modelo.Cancion;
import com.uce.edu.demo.disco.modelo.Cantante;

public interface IAlbumService {
	
	public void ingresarAlbum(String nombre, String codigo,Cantante c, List<Cancion> canciones);
	
	public Album buscarAlbum(String nombre);
	
	public void actualizarAlbum(Album a);
	
	public void borrarAlbum(String nombre);

}
