package com.uce.edu.demo.bodega.repository;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.bodega.modelo.Producto;

public interface IProductoRepository {
	
		//C: crear
		public Producto insertarProducto(Producto p);
		
		//R: leer/buscar
		public Producto buscar(String producto);
		
		//U: actualizar
		public void actualizar(Producto p);
		
		//D: eliminar
		public void eliminarProducto(String producto);

}
