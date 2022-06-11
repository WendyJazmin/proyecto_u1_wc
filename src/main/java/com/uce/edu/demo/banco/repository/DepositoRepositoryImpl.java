package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepositoryImpl implements IDepositoRepository{

	 
	@Override
	public void insertarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se creo el deposito: "+d);
	}

	@Override
	public Deposito buscarDeposito(String numeroCuenta) {
		// TODO Auto-generated method stub
		System.out.println("Se busca el deposito con n° Cuenta: "+numeroCuenta);
		
		Deposito deposito = new Deposito();
		deposito.setNumeroCuentaDestino(numeroCuenta);
		return deposito;
	}

	@Override
	public void actualizarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base el deposito: "+d);
	}

	@Override
	public void eliminarDeposito(String numeroCuenta) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base el deposito de la cuenta: "+numeroCuenta);
	}

	@Override
	public List<Deposito> consulta(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Deposito> listaDepositos = new ArrayList<>();
		Deposito depo1 = new Deposito();
		depo1.setFechaDeposito(LocalDateTime.of(20221, 2,10,8,50,2));
		depo1.setMonto(new BigDecimal(20));
		depo1.setNumeroCuentaDestino("22337");
		listaDepositos.add(depo1);
		
		Deposito depo2 = new Deposito();
		depo2.setFechaDeposito(LocalDateTime.of(20221, 3,15,9,53,2));
		depo2.setMonto(new BigDecimal(50));
		depo2.setNumeroCuentaDestino("1234");
		listaDepositos.add(depo2);
		
		return listaDepositos;
	}

}
