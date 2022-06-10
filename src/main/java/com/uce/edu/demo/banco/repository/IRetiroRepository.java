package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.banco.modelo.Retiro;


public interface IRetiroRepository {

		//C: crear/insertar
		public void insertarRetiro(Retiro r);
		
		//R: Leer/buscar
		public Retiro buscarRetiro(String numeroCuenta);
		
		//U: actualizar
		public void actualizarRetiro(Retiro r);
		
		//D: eliminar
		public void eliminarRetiro(String numeroCuenta);
}
