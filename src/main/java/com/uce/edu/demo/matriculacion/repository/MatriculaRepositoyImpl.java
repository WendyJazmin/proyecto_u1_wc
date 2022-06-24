package com.uce.edu.demo.matriculacion.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.matriculacion.modelo.Matricula;

@Repository
public class MatriculaRepositoyImpl implements IMatriculaRepository {

	@Override
	public void crear(Matricula matricula) {
		// TODO Auto-generated method stub
		System.out.println("Se crea la matricula: "+matricula);
	}

}
