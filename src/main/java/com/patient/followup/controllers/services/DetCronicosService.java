package com.patient.followup.controllers.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.patient.followup.controllers.repository.DetCronicosRepository;
import com.patient.followup.models.DetCronicos;
import com.patient.followup.models.Usuarios;

@Service
@Transactional(readOnly = true)
public class DetCronicosService {
	private final DetCronicosRepository detCronicosRepository;
	
	public DetCronicosService(DetCronicosRepository detCronicosRepository) {
		this.detCronicosRepository = detCronicosRepository;
	}
	
	@Transactional
	public DetCronicos create(DetCronicos detCronicos) {
		return this.detCronicosRepository.save(detCronicos);
	}
	
	@Transactional
	public DetCronicos update(DetCronicos detCronicos) {
		return this.detCronicosRepository.save(detCronicos);
	}
	
	@Transactional
	public void delete(DetCronicos detCronicos) {
		this.detCronicosRepository.delete(detCronicos);
	}
	
	public void findByDcroId(DetCronicos dcroId) {
		this.detCronicosRepository.delete(dcroId);
	}
}
