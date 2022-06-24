package com.uce.edu.demo.matriculacion.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.matriculacion.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository {

	@Override
	public void crear(Propietario propietario) {
		// TODO Auto-generated method stub
		System.out.println("Se crea el propietario: "+propietario);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Se elimina el propietario de cecula: "+cedula);

	}

	@Override
	public Propietario consultar(String cedula) {
		// TODO Auto-generated method stub
		Propietario propietario = new Propietario();
		propietario.setApellido("Cayambe");
		propietario.setNombre("Edison");
		propietario.setFechaNacimiento(LocalDateTime.now());
		propietario.setCedula(cedula);
		return propietario;
	}

}
