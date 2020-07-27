package com.patient.followup.resources;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.patient.followup.controllers.services.ProvinciaService;
import com.patient.followup.models.Provincia;

@RestController
public class ProvinciaResource {
	private ProvinciaService provinciaService;
	
	public ProvinciaResource(ProvinciaService provinciaService) {
		this.provinciaService = provinciaService;
	}
	
	@GetMapping("provincia")
	public List<Provincia> getAllByDepartament(@RequestParam("id_departament") String idDepartament) {
		List<Provincia> provincias = provinciaService.findByIdDepartament(idDepartament);
		if(provincias!=null) {
			return provincias;
		}else {
			throw new ResponseStatusException(HttpStatus.NO_CONTENT, "No se han encontrado provincias");
		}
		
	}
}
