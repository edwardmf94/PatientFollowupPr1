package com.patient.followup.resources;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.patient.followup.controllers.services.DistritoService;
import com.patient.followup.models.Distrito;

@RestController
public class DistritoResource {
	private DistritoService distritoService;
	
	public DistritoResource(DistritoService distritoService) {
		this.distritoService = distritoService;
	}
	
	@GetMapping("distrito")
	public List<Distrito> getAllByDepartament(@RequestParam("id_provincia") String idProvincia) {
		List<Distrito> provincias = distritoService.findByIdProvincia(idProvincia);
		if(provincias!=null) {
			return provincias;
		}else {
			throw new ResponseStatusException(HttpStatus.NO_CONTENT, "No se han encontrado distritos");
		}
		
	}
}
