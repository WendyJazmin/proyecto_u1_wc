package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.repository.IEstudianteRepository;
import com.uce.edu.demo.repository.IMateriaRepository;

@Service
public class MateriaServiceImpl implements IMateriaService {

	@Autowired
	private IMateriaRepository estuRepository;
	
	@Override
	public void ingresarMateria(Materia e) {
		// TODO Auto-generated method stub
		System.out.println();
		this.estuRepository.insertar(e);
	}

	@Override
	public Materia buscarPorMateria(String nombre) {
		// TODO Auto-generated method stub
		return this.estuRepository.buscar(nombre);
	}

	@Override
	public void actualizarMateria(Materia e) {
		// TODO Auto-generated method stub
		  this.estuRepository.actualizar(e);
	}

	@Override
	public void borrarMateria(String nombre) {
		// TODO Auto-generated method stub
	
		this.estuRepository.eliminar(nombre);
	}

}
