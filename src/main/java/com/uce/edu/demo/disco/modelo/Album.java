package com.uce.edu.demo.disco.modelo;

import java.util.List;

public class Album {
	
	private String nombre;
	private String codigo;
	private Cantante cantante;
	private List<Cancion> canciones;
	
	 
	
	@Override
	public String toString() {
		return "\nAlbum [nombre = " + nombre + ", codigo = " + codigo + "\nCantante: " + cantante + "\nCanciones: " + canciones
				+ "]";
	}
	//get y set
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Cantante getCantante() {
		return cantante;
	}
	public void setCantante(Cantante cantante) {
		this.cantante = cantante;
	}
	public List<Cancion> getCanciones() {
		return canciones;
	}
	public void setCanciones(List<Cancion> canciones) {
		this.canciones = canciones;
	}
	
	

}
