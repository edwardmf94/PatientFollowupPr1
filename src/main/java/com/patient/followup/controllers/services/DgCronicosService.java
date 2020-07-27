package com.patient.followup.controllers.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.patient.followup.controllers.repository.DgCronicosRepository;
import com.patient.followup.models.DgCronicos;

@Service
@Transactional(readOnly = true)
public class DgCronicosService {
	private final DgCronicosRepository dgCronicosRepository;
	
	public DgCronicosService(DgCronicosRepository dgCronicosRepository) {
		this.dgCronicosRepository = dgCronicosRepository;
	}
	
	@Transactional
	public DgCronicos create(DgCronicos dgCronicos) {
		return this.dgCronicosRepository.save(dgCronicos);
	}
	
	@Transactional
	public DgCronicos update(DgCronicos dgCronicos) {
		return this.dgCronicosRepository.save(dgCronicos);
	}
	
	public DgCronicos findByUsuCip(String usuCip) {
		return this.dgCronicosRepository.findByUsuCip(usuCip);
	}
}
