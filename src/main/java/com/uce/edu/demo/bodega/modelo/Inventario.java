package com.uce.edu.demo.bodega.modelo;

import java.time.LocalDateTime;
import java.util.List;

public class Inventario {
	
	private List<Producto> producto;
	private LocalDateTime fechaIngreso;
	private int cantidadProductos;
	
	
	@Override
	public String toString() {
		return producto +", cantidadProductos = "
				+ cantidadProductos +", fechaIngreso = " + fechaIngreso; 
	}
	//set y get
	public List<Producto> getProducto() {
		return producto;
	}
	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}
	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public int getCantidadProductos() {
		return cantidadProductos;
	}
	public void setCantidadProductos(int cantidadProductos) {
		this.cantidadProductos = cantidadProductos;
	}
	
	
	
	
	
}
