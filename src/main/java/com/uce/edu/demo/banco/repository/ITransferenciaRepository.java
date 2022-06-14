package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepository {
	

	//C: crear/insertar
	public void insertar(Transferencia t);
	
	public List<Transferencia> consulta(String cuenta, LocalDateTime fechaInicio,LocalDateTime fechaFin);
	
	//R: Leer/buscar
	public Transferencia buscarTransferencia(String numeroCuenta);
	
	//U: actualizar
	public void actualizarTransferencia(Transferencia t);
	
	//D: eliminar
	public void eliminarTransferencia(String numeroCuenta);
	
	
	
}
