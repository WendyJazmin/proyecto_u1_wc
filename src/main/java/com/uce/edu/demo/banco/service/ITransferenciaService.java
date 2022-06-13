package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaService {
	
	public void realizarTransferencia(String ctaOrigen, String ctaDestino,BigDecimal monto);
	
	public List<Transferencia> consulta(String cuenta, LocalDateTime fechaInicio,LocalDateTime fechaFin);

	
	public void insertarTransferencia(Transferencia t);

	public Transferencia buscarTransferencia(String numeroCuenta);
	
	public void actualizarTransferencia(Transferencia t);
	
	public void eliminarTransferencia(String numeroCuenta);
}
