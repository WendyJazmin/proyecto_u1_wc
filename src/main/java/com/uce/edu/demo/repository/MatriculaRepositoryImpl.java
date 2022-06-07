package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository{

	@Override
	public void insertar(Matricula e) {
		// TODO Auto-generated method stub
		
		//Aqui se realiza la insercion en la base de datos
		System.out.println("Se ha insertado en la base el estudiante "+e);
	}

	@Override
	public Matricula buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base la materia "+numero);
		Matricula e = new Matricula();
		e.setNumero(numero);
		return e;
		
	}

	@Override
	public void actualizar(Matricula e) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base la amtricula "+e);

	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base el estudiante "+cedula);

	}

}
