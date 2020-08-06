package com.patient.followup.controllers.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.patient.followup.controllers.repository.BeneficiarioRepository;
import com.patient.followup.models.Beneficiario;

@Service
@Transactional(readOnly = true)
public class BeneficiarioService {
	private final BeneficiarioRepository benficiarioRepository;
	
	public BeneficiarioService(BeneficiarioRepository benficiarioRepository) {
		this.benficiarioRepository = benficiarioRepository;
	}
	
	/*public List<Beneficiario> findByUsuCip(String usuCip) {
		return this.benficiarioRepository.findByUsuCip(usuCip);
	}*/
	
	public List<Beneficiario> findBeneficiariosTitular(String cip_pac){
		return this.benficiarioRepository.findBeneficiariosTitular(cip_pac);
	}
}
