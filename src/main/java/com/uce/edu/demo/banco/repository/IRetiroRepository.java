package com.uce.edu.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.modelo.Transferencia;


public interface IRetiroRepository {

		//C: crear/insertar
		public void insertarRetiro(Retiro r);
		
		public List<Retiro> consulta(String cuenta, LocalDateTime fechaInicio,LocalDateTime fechaFin);

		
		//R: Leer/buscar
		public Retiro buscarRetiro(String numeroCuenta);
		
		//U: actualizar
		public void actualizarRetiro(Retiro r);
		
		//D: eliminar
		public void eliminarRetiro(String numeroCuenta);
}
