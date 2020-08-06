package com.patient.followup.controllers.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.patient.followup.controllers.repository.DepartamentoRepository;
import com.patient.followup.models.Departamento;

@Service
public class DepartamentoService {
	private final DepartamentoRepository departamentoRepository;
	
	public DepartamentoService(DepartamentoRepository departamentoRepository) {
		this.departamentoRepository = departamentoRepository;
	}
	
	public List<Departamento> findAll() {
		return this.departamentoRepository.findAll();
	}

	public Departamento getOne(String idDepartament) {
		return this.departamentoRepository.getOne(idDepartament);
	}
}
