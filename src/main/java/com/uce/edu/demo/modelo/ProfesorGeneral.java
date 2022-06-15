package com.uce.edu.demo.modelo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)//con singleton es una unica instancia
public class ProfesorGeneral {

	private String nombre;
	private String apellido;
	
	
	
	@Override
	public String toString() {
		return "ProfesorGeneral [nombre = " + nombre + ", apellido = " + apellido + "]";
	}
	//set y get
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
}
