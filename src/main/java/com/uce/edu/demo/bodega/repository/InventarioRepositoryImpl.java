package com.uce.edu.demo.bodega.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.bodega.modelo.Inventario;

@Repository
public class InventarioRepositoryImpl implements IInventarioRepository{

	
	@Override
	public void insertar(Inventario inventario) {
		// TODO Auto-generated method stub
		//System.out.println("Se ha insertado en la base el inventario:"+inventario);
		System.out.println(inventario);
	}

	@Override
	public Inventario buscar(LocalDateTime fecha) {
		// TODO Auto-generated method stub
		System.out.println("Se busca en la base el inventario: "+fecha);
		Inventario inventario = new Inventario();
		inventario.setFechaIngreso(fecha);
		return inventario;
	}

	@Override
	public void actualizar(Inventario inventario) {
		// TODO Auto-generated method stub
		System.out.println("Producto Actualizado: "+inventario);
	}

	@Override
	public void eliminar(String producto) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base el inventario: "+producto);
	}

}
