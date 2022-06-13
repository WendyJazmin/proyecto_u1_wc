package com.uce.edu.demo.bodega.service;

import java.math.BigDecimal;

import com.uce.edu.demo.bodega.modelo.Producto;

public interface IProductoService {
	
	public void insertarProducto(String producto, BigDecimal precio);
	
	public Producto buscar(String producto);
	
	public void actualizar(Producto p);
	
	public void eliminarProducto(String producto);

}
