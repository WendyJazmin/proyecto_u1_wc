package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Transferencia;

public interface IDepositoRepository {	

	//C: crear/insertar
	public void insertarDeposito(Deposito d);
	
	public List<Deposito> consulta(String cuenta, LocalDateTime fechaInicio,LocalDateTime fechaFin);

	
	//R: Leer/buscar
	public Deposito buscarDeposito(String numeroCuenta);
	
	//U: actualizar
	public void actualizarDeposito(Deposito d);
	
	//D: eliminar
	public void eliminarDeposito(String numeroCuenta);
	
}
