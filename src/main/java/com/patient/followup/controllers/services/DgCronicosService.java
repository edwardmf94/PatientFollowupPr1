package com.patient.followup.controllers.services;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
	
	public DgCronicos findByCipPac(String usuCip) {
		return this.dgCronicosRepository.findByCipPac(usuCip);
	}
	
	public DgCronicos findLastRecord() {
		//Pageable top = PageRequest.of(0, 1);
		return this.dgCronicosRepository.findLastRecord();
	}
}
