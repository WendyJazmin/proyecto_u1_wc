package com.example.demo.consultorio;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class CitaMedica2 {
	
	private LocalDateTime fechaCita;
	
	//DI por metodos set
	private Doctor doctor;// a su metodo SET le pongo @Autowired
	private Paciente paciente;// a su metodo SET le pongo @Autowired
	
	public String agendar(LocalDateTime fechaCita, String nombre, String apellido,
			int edad,String ciudad,String nombrePaciente, int edadPaciente) {
		
		this.doctor.setNombre(nombre);
		this.doctor.setApellido(apellido);
		this.doctor.setEdad(edad);
		this.doctor.setCiudad(ciudad);
		
		this.paciente.setEdad(edadPaciente);
		this.paciente.setNombre(nombrePaciente);
		
		//seteamos los atributos de la cita medica
		this.fechaCita = fechaCita;
		//se inserta la cita en la base de datos
		return "Cita agendada 2";
	}
	
	//set y get
	public Doctor getDoctor() {
		return doctor;
	}
	
	@Autowired
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	
	@Autowired
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	
}
