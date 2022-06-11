package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Retiro;

@Repository
public class RetiroRepositoryImpl implements IRetiroRepository{

	@Override
	public void insertarRetiro(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se creo el retiro: "+r);
	}

	@Override
	public Retiro buscarRetiro(String numeroCuenta) {
		// TODO Auto-generated method stub
		System.out.println("Se busca el retiro de la cuenta: "+numeroCuenta);
		
		Retiro retiro = new Retiro();
		retiro.setNumeroCuentaRetiro(numeroCuenta);
		return retiro;
	}

	@Override
	public void actualizarRetiro(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base el retiro: "+r);
	}

	@Override
	public void eliminarRetiro(String numeroCuenta) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base el retiro de la cuenta: "+numeroCuenta);
	}

	@Override
	public List<Retiro> consulta(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Retiro> listaRetiros = new ArrayList<>();
		Retiro reti1 = new Retiro();
		reti1.setFechaRetiro(LocalDateTime.of(2022, 12,20,13,34,10));
		reti1.setMonto(new BigDecimal(25));
		reti1.setNumeroCuentaRetiro("1239");
		
		listaRetiros.add(reti1);
		return listaRetiros;
	}

	
}
