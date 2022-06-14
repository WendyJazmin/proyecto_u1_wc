package com.uce.edu.demo.bodega.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.bodega.modelo.GestorInventario;
import com.uce.edu.demo.bodega.modelo.Inventario;
import com.uce.edu.demo.bodega.modelo.Producto;
import com.uce.edu.demo.bodega.repository.IInventarioRepository;

@Service
public class InventarioServiceImpl implements IInventarioService{

	@Autowired
	private IInventarioRepository iInvetarioRepository;
	
	@Autowired
	private IProductoService iProductoService;

	@Override
	public void insertarInventario(String p, BigDecimal precio, int cantidad, LocalDateTime fecha) {
		// TODO Auto-generated method stub
		Producto producto = this.iProductoService.buscar(p);
		BigDecimal nuevoPrecio = GestorInventario.calcularPrecio(precio);
		producto.setPrecio(nuevoPrecio.setScale(2, RoundingMode.UP));
		
		
		Inventario inventario = new Inventario();
		List <Producto> productos = new ArrayList<>();
		List <Inventario> inventarios = new ArrayList<>();
		productos.add(producto);
		
		inventario.setProducto(productos);
		inventario.setCantidadProductos(cantidad);
		inventario.setFechaIngreso(fecha);
		inventarios.add(inventario);
		
		this.iInvetarioRepository.insertar(inventario);
		
		
	}

	@Override
	public Inventario buscarInventario(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		return this.iInvetarioRepository.buscar(fecha);
	}

	@Override
	public void actualizarInventario(Inventario i) {
		// TODO Auto-generated method stub
		this.iInvetarioRepository.actualizar(i);
	}

	@Override
	public void eliminarInventario(String producto) {
		// TODO Auto-generated method stub
		this.iInvetarioRepository.eliminar(producto);
	}
	
	
}
