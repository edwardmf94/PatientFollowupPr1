package com.patient.followup.controllers.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.patient.followup.controllers.repository.DistritoRepository;
import com.patient.followup.models.Distrito;

@Service
public class DistritoService {
	public final DistritoRepository distritoRepository;
	
	public DistritoService(DistritoRepository distritoRepository) {
		this.distritoRepository = distritoRepository;
	}
	
	public List<Distrito> findByIdProvincia(String idProvincia){
		return this.distritoRepository.findByIdProvincia(idProvincia);
	}
	
	public Distrito getOne(String idDistrito) {
		return this.distritoRepository.getOne(idDistrito);
	}
}
