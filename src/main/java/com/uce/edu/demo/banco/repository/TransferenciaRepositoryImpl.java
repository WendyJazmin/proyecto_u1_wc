package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository{

	@Override
	public void insertar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se inserta la transferencia en la base de datos: "+t);
	}

	@Override
	public Transferencia buscarTransferencia(String numeroCuenta) {
		// TODO Auto-generated method stub
		System.out.println("Se busca la transferencia a la cuenta: "+numeroCuenta);
		
		Transferencia transferencia = new Transferencia();
		transferencia.setNuemroCuentaDestino(numeroCuenta);
		return transferencia;
	}

	@Override
	public void actualizarTransferencia(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base la transferencia: "+t);
	}

	@Override
	public void eliminarTransferencia(String numeroCuenta) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base la transferencia de la cuenta: "+numeroCuenta);
	}

	@Override
	public List<Transferencia> consulta(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Transferencia> listaConsulta = new ArrayList<>();
		Transferencia trans1 = new Transferencia();
		trans1.setFechaTransferencia(LocalDateTime.now());
		trans1.setMontoTransferir(new BigDecimal(100));
		trans1.setNuemroCuentaDestino("1234");
		trans1.setNumeroCunetaOrigen("12567");
		
		listaConsulta.add(trans1);
		return listaConsulta;
	}

}
