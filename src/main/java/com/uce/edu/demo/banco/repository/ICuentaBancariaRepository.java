package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;


public interface ICuentaBancariaRepository {
	
	//C: crear
	public void insertarCuentaBancaria(CuentaBancaria c);
	
	//R: leer/buscar
	public CuentaBancaria buscar(String numeroCuenta);
	
	//U: actualizar
	public void actualizar(CuentaBancaria c);
	
	//D: eliminar
	public void eliminarCuentaBancaria(String numeroCuenta);
	
}
