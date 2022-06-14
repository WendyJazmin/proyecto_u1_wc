package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroService {

	
	public void realizarRetiro(String numeroCtaRetiro, BigDecimal monto);
	
	public void insertarRetiro(Retiro r);

	public Retiro buscarRetiro(String numeroCuenta);
	
	public void actualizarRetiro(Retiro r);
	
	public void eliminarRetiro(String numeroCuenta);
}
