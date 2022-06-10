package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.repository.IDepositoRepository;

@Service
public class DepositoServiceImpl implements IDepositoService {

	@Autowired
	private ICuentaBancariaService bancariaService;
	
	@Autowired
	private IDepositoRepository depositoRepository;
	
	
	@Override
	public void realizarDeposito(String numeroCtaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria ctaDestino = this.bancariaService.buscar(numeroCtaDestino);
		BigDecimal saldoCtaDestino = ctaDestino.getSaldo();
		BigDecimal saldoFinal = saldoCtaDestino.add(monto);
		ctaDestino.setSaldo(saldoFinal);
		this.bancariaService.actualizar(ctaDestino);
	
		Deposito deposito = new Deposito();
		deposito.setFechaDeposito(LocalDateTime.now());
		deposito.setMonto(monto);
		deposito.setNumeroCuentaDestino(numeroCtaDestino);
	
		this.depositoRepository.insertarDeposito(deposito);
	}


	@Override
	public void insertarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		this.depositoRepository.insertarDeposito(d);
	}


	@Override
	public Deposito buscarDeposito(String numeroCuenta) {
		// TODO Auto-generated method stub
		return this.depositoRepository.buscarDeposito(numeroCuenta);
	}


	@Override
	public void actualizarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		this.depositoRepository.actualizarDeposito(d);
	}


	@Override
	public void eliminarDeposito(String numeroCuenta) {
		// TODO Auto-generated method stub
		this.depositoRepository.eliminarDeposito(numeroCuenta);
	}

}