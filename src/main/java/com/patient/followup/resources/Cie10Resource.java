package com.patient.followup.resources;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.patient.followup.controllers.services.Cie10Service;
import com.patient.followup.models.Cie10;

@RestController
public class Cie10Resource {
	private Cie10Service cie10Service;
	
	public Cie10Resource(Cie10Service cie10Service) {
		this.cie10Service = cie10Service;
	}
	
	@GetMapping("cie10")
	public List<Cie10> getAllByUsuCip(@RequestParam("query") String query) {
		
		List<Cie10> cie10_list = cie10Service.findByDescripcionLike("%"+query+"%");
		if(cie10_list!=null) {
			return cie10_list;
		}else {
			throw new ResponseStatusException(HttpStatus.NO_CONTENT, "No se han encontrado beneficiarios");
		}
		
	}
}
