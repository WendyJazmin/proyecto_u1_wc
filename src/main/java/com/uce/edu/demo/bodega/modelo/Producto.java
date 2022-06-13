package com.uce.edu.demo.bodega.modelo;

import java.math.BigDecimal;

public class Producto {

	private String nombre;
	private BigDecimal precio;
	
	
	
	@Override
	public String toString() {
		return "nombre = " + nombre + ", precio = " + precio;
	}
	
	//set y get
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	
	
}
