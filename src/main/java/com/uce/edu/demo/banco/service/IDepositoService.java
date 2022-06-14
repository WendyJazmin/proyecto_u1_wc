package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoService {

	
	public void realizarDeposito(String numeroCtaDestino, BigDecimal monto);
	
	public void insertarDeposito(Deposito d);

	public Deposito buscarDeposito(String numeroCuenta);
	
	public void actualizarDeposito(Deposito d);
	
	public void eliminarDeposito(String numeroCuenta);
}
