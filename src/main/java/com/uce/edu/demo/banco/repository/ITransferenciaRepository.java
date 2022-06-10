package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepository {
	

	//C: crear/insertar
	public void insertar(Transferencia t);
	
	//R: Leer/buscar
	public Transferencia buscarTransferencia(String numeroCuenta);
	
	//U: actualizar
	public void actualizarTransferencia(Transferencia t);
	
	//D: eliminar
	public void eliminarTransferencia(String numeroCuenta);
	
	
	
}
