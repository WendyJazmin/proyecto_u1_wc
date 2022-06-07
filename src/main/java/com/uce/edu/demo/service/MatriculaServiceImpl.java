package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.repository.IEstudianteRepository;
import com.uce.edu.demo.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepository estuRepository;
	
	@Override
	public void ingresarMatricula(Matricula e) {
		// TODO Auto-generated method stub
		System.out.println();
		//this.estuRepository.i
	}

	@Override
	public Matricula buscarPorMatricula(String apellido) {
		// TODO Auto-generated method stub
		return this.estuRepository.buscar(apellido);
	}

	@Override
	public void actualizarMatricula(Matricula e) {
		// TODO Auto-generated method stub
		  this.estuRepository.actualizar(e);
	}

	@Override
	public void borrarMatricula(String cedula) {
		// TODO Auto-generated method stub
	
		this.estuRepository.eliminar(cedula);
	}

}
