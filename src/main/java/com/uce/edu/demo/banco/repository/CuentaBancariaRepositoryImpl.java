package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

@Repository
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository {

	@Override
	public void actualizar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		
		//aqui se construye los SQL's
		System.out.println("Cuenta bancaria actualizada: "+c);
		
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se busca la cuenta bancaria: "+numero);
		CuentaBancaria cta = new CuentaBancaria();
		cta.setNumero(numero);
		cta.setSaldo(new BigDecimal(100));
		
		return cta;
	}

	@Override
	public void insertarCuentaBancaria(CuentaBancaria c) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base la Cuenta Bancaria: "+c);
		
	}

	@Override
	public void eliminarCuentaBancaria(String numeroCuenta) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base la Cuenta Bancaria: "+numeroCuenta);
	}

}