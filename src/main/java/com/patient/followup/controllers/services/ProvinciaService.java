package com.patient.followup.controllers.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.patient.followup.controllers.repository.ProvinciaRepository;
import com.patient.followup.models.Provincia;

@Service
public class ProvinciaService {
	public final ProvinciaRepository provinciaRepository;
	
	public ProvinciaService(ProvinciaRepository provinciaRepository) {
		this.provinciaRepository = provinciaRepository;
	}
	
	public List<Provincia> findByIdDepartament(String idDepartament) {
		return this.provinciaRepository.findByIdDepartament(idDepartament);
	}
	
	public Provincia getOne(String idProvincia) {
		return this.provinciaRepository.getOne(idProvincia);
	}
}
