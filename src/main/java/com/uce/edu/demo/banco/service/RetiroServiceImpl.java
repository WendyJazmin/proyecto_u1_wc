package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.repository.IRetiroRepository;

@Service
public class RetiroServiceImpl implements IRetiroService {

	@Autowired
	private IRetiroRepository retiroRepository;
	
	@Autowired
	private ICuentaBancariaService bancariaService;
	
	@Override
	public void realizarRetiro(String numeroCtaRetiro, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria ctaRetiro = this.bancariaService.buscar(numeroCtaRetiro);
		BigDecimal saldoCtRetiro = ctaRetiro.getSaldo();
		BigDecimal saldoFinal = saldoCtRetiro.subtract(monto);
		ctaRetiro.setSaldo(saldoFinal);
		
		this.bancariaService.actualizar(ctaRetiro);
		
		Retiro retiro = new Retiro();
		retiro.setFechaRetiro(LocalDateTime.now());
		retiro.setMonto(monto);
		retiro.setNumeroCuentaRetiro(numeroCtaRetiro);
		
		this.retiroRepository.insertarRetiro(retiro);
		
	}

	@Override
	public void insertarRetiro(Retiro r) {
		// TODO Auto-generated method stub
		this.retiroRepository.insertarRetiro(r);
	}

	@Override
	public Retiro buscarRetiro(String numeroCuenta) {
		// TODO Auto-generated method stub
		return this.retiroRepository.buscarRetiro(numeroCuenta);
	}

	@Override
	public void actualizarRetiro(Retiro r) {
		// TODO Auto-generated method stub
		this.retiroRepository.actualizarRetiro(r);
	}

	@Override
	public void eliminarRetiro(String numeroCuenta) {
		// TODO Auto-generated method stub
		this.retiroRepository.eliminarRetiro(numeroCuenta);
	}

}
