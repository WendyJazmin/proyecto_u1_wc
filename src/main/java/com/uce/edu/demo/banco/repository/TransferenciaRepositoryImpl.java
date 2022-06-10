package com.uce.edu.demo.banco.repository;

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

}
