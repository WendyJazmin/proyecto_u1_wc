package com.uce.edu.demo.bodega.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.modelo.GestorInventario;
import com.uce.edu.demo.bodega.modelo.Producto;
import com.uce.edu.demo.bodega.repository.IProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoRepository iProductoRepository;
	Producto prod;
	
	@Override
	public void insertarProducto(String producto, BigDecimal precio) {
		// TODO Auto-generated method stub
		Producto prod = new Producto();
		prod.setNombre(producto);
		BigDecimal a = GestorInventario.calcularPrecio(precio);
		prod.setPrecio(a.setScale(2, RoundingMode.UP));
		
		this.iProductoRepository.insertarProducto(prod);
	}

	@Override
	public Producto buscar(String producto) {
		// TODO Auto-generated method stub
		return this.iProductoRepository.buscar(producto);
	}

	@Override
	public void actualizar(Producto p) {
		// TODO Auto-generated method stub
		this.iProductoRepository.actualizar(p);
	}

	@Override
	public void eliminarProducto(String producto) {
		// TODO Auto-generated method stub
		this.iProductoRepository.eliminarProducto(producto);
	}

}
