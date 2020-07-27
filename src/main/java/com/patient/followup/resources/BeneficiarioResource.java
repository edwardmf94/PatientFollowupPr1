package com.patient.followup.resources;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.patient.followup.controllers.services.BeneficiarioService;
import com.patient.followup.models.Beneficiario;

@RestController
public class BeneficiarioResource {
	private BeneficiarioService beneficiarioService;
	
	public BeneficiarioResource(BeneficiarioService beneficiarioService) {
		this.beneficiarioService = beneficiarioService;
	}
	
	@GetMapping("beneficiario")
	public List<Beneficiario> getAllByUsuCip(@AuthenticationPrincipal String username) {
		
		List<Beneficiario> beneficiarios = beneficiarioService.findByUsuCip(username);
		if(beneficiarios!=null) {
			return beneficiarios;
		}else {
			throw new ResponseStatusException(HttpStatus.NO_CONTENT, "No se han encontrado beneficiarios");
		}
		
	}
}
