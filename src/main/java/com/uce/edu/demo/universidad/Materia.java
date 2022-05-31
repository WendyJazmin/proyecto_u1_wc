package com.uce.edu.demo.universidad;

import org.springframework.stereotype.Component;

@Component
public class Materia {
	
	private String nombreMateria;
	private int horas;
	
	//set y get
	public String getNombreMateria() {
		return nombreMateria;
	}
	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	

}
