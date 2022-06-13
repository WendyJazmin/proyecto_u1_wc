package com.uce.edu.demo.bodega.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;

public interface IInventarioService {
	
	public void insertarInventario(String p,BigDecimal precio, int cantidad,LocalDateTime fecha);
	
	
	public Inventario buscarInventario(LocalDateTime fecha);
	

	public void actualizarInventario(Inventario i);
	
	
	public void eliminarInventario(String producto);


}
