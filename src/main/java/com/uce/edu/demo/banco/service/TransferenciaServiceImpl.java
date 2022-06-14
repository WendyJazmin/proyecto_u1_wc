package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.repository.ITransferenciaRepository;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService{

	//como la logica de CuentaBancariaSevice no hace nada
	//si puedo inyectar el CuentaBancariaService
	@Autowired
	@Qualifier ("ahorros")
	private ICuentaBancariaService bancariaService;
	
	@Autowired
	private ITransferenciaRepository itransferenciaRepository;
	
	@Override
	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria cOrigen = this.bancariaService.buscar(ctaOrigen);
		BigDecimal saldoOrigen = cOrigen.getSaldo();
		BigDecimal nuevoSaldoOrigen = saldoOrigen.subtract(monto);
		cOrigen.setSaldo(nuevoSaldoOrigen);
		this.bancariaService.actualizar(cOrigen);
		
		CuentaBancaria cDestino = this.bancariaService.buscar(ctaDestino);
		BigDecimal saldoDestino = cDestino.getSaldo();
		BigDecimal nuevoSaldoDestino = saldoDestino.add(monto);
		cDestino.setSaldo(nuevoSaldoDestino);
		this.bancariaService.actualizar(cDestino);
		
		Transferencia t = new Transferencia();
		t.setNumeroCunetaOrigen(ctaOrigen);
		t.setNuemroCuentaDestino(ctaDestino);
		t.setMontoTransferir(monto);
		t.setFechaTransferencia(LocalDateTime.now());
		
		this.itransferenciaRepository.insertar(t);
	
	}

	@Override
	public void insertarTransferencia(Transferencia t) {
		// TODO Auto-generated method stub
		this.itransferenciaRepository.insertar(t);
	}

	@Override
	public Transferencia buscarTransferencia(String numeroCuenta) {
		// TODO Auto-generated method stub
		return this.itransferenciaRepository.buscarTransferencia(numeroCuenta);
	}

	@Override
	public void actualizarTransferencia(Transferencia t) {
		// TODO Auto-generated method stub
		this.itransferenciaRepository.actualizarTransferencia(t);
	}

	@Override
	public void eliminarTransferencia(String numeroCuenta) {
		// TODO Auto-generated method stub
		this.itransferenciaRepository.eliminarTransferencia(numeroCuenta);
	}

	@Override
	public List<Transferencia> consulta(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		//No hay ninguna logica de negocio
		return this.itransferenciaRepository.consulta(cuenta, fechaInicio, fechaFin);
	}

}
