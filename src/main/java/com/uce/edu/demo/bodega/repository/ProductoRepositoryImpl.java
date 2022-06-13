package com.uce.edu.demo.bodega.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.bodega.modelo.Producto;


@Repository
public class ProductoRepositoryImpl implements IProductoRepository{
	
	@Override
	public Producto insertarProducto(Producto p) {
		// TODO Auto-generated method stub
		//System.out.println("Se ha insertado en la base el producto: "+p);
		System.out.println(p);
	    return p;
	}

	@Override
	public Producto buscar(String p) {
		// TODO Auto-generated method stub
		
		//System.out.println("Se busca el producto: "+p);
		Producto producto = new Producto();
		producto.setNombre(p);
		producto.setPrecio(new BigDecimal(0));
		
		return producto;
		}
		
		
		

	@Override
	public void actualizar(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Producto Actualizado: "+p);
		
	}

	@Override
	public void eliminarProducto(String producto) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base el producto: "+producto);
	}

}
