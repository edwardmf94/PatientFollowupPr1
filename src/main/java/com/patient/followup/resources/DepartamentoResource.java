package com.patient.followup.resources;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.patient.followup.controllers.services.DepartamentoService;
import com.patient.followup.models.Departamento;
import com.patient.followup.models.Usuarios;

@RestController
public class DepartamentoResource {
	private DepartamentoService departamentoService;
	
	public DepartamentoResource(DepartamentoService departamentoService) {
		this.departamentoService = departamentoService;
	}
	
	@GetMapping("departamento")
	public List<Departamento> getAll() {
		List<Departamento> departamentos = departamentoService.findAll();
		if(departamentos!=null) {
			return departamentos;
		}else {
			throw new ResponseStatusException(HttpStatus.NO_CONTENT, "No se han encontrado departamentos");
		}
		
	}
}
