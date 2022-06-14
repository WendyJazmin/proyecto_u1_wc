package com.uce.edu.demo.bodega.repository;

import java.time.LocalDateTime;

import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;

public interface IInventarioRepository {

	public void insertar(Inventario inventario);
	
	//R: leer/buscar
	public Inventario buscar(LocalDateTime fecha);
	
	//U: actualizar
	public void actualizar(Inventario inventario);
	
	//D: eliminar
	public void eliminar(String producto);
	
}
