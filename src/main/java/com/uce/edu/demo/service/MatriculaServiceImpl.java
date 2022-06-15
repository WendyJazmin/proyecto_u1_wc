package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.repository.IEstudianteRepository;
import com.uce.edu.demo.repository.IMatriculaRepository;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepository iMatriculaRepository;
	
	@Autowired
	private ProfesorGeneral profesorGeneral;
	
	@Autowired
	private ProfesorMateria profesorMateria;
	
	@Override
	public void ingresarMatricula(Matricula e) {
		// TODO Auto-generated method stub
		System.out.println("DI desde Service SINGLETON "+this.profesorGeneral);
		System.out.println("DI desde Service PROTOTYPE "+this.profesorMateria);
		
		this.iMatriculaRepository.insertar(e);
	}

	@Override
	public Matricula buscarPorMatricula(String numero) {
		// TODO Auto-generated method stub
		return this.iMatriculaRepository.buscar(numero);
	}

	@Override
	public void actualizarMatricula(Matricula e) {
		// TODO Auto-generated method stub
		  this.iMatriculaRepository.actualizar(e);
	}

	@Override
	public void borrarMatricula(String numero) {
		// TODO Auto-generated method stub
	
		this.iMatriculaRepository.eliminar(numero);
	}

}
