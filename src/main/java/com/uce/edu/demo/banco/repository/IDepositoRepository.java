package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoRepository {	

	//C: crear/insertar
	public void insertarDeposito(Deposito d);
	
	//R: Leer/buscar
	public Deposito buscarDeposito(String numeroCuenta);
	
	//U: actualizar
	public void actualizarDeposito(Deposito d);
	
	//D: eliminar
	public void eliminarDeposito(String numeroCuenta);
	
}
