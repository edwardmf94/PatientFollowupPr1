package com.patient.followup.resources;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.patient.followup.controllers.services.EstadoPacienteService;
import com.patient.followup.models.EstadoPaciente;

@RestController
public class EstadoPacienteResource {
	private EstadoPacienteService estadoPacienteService;
	
	public EstadoPacienteResource(EstadoPacienteService estadoPacienteService) {
		this.estadoPacienteService = estadoPacienteService;
	}
	
	@GetMapping("estado_paciente")
	public EstadoPaciente getAllByUsuCipAndFarmacia(@RequestParam("id_farmacia") String id_farmacia, @AuthenticationPrincipal String username) {
		//username = "310137100";
		System.out.println(username);
		System.out.println(id_farmacia);
		EstadoPaciente estados = estadoPacienteService.findEstadoFarmacia(username, id_farmacia);
		System.out.println(estados);
		if(estados!=null) {
			return estados;
		}else {
			throw new ResponseStatusException(HttpStatus.NO_CONTENT, "No se han estados para esta farmacia");
		}
		
	}
}
