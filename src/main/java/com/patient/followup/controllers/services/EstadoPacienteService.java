package com.patient.followup.controllers.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.patient.followup.controllers.repository.EstadoPacienteRepository;
import com.patient.followup.models.EstadoPaciente;

@Service
@Transactional(readOnly = true)
public class EstadoPacienteService {
	private EstadoPacienteRepository estadoPacienteRepository;
	
	public EstadoPacienteService(EstadoPacienteRepository estadoPacienteRepository) {
		this.estadoPacienteRepository = estadoPacienteRepository;
	}
	
	public EstadoPaciente findEstadoFarmacia(String cip_pac, String id_farmacia) {
		return this.estadoPacienteRepository.findEstadoFarmacia(cip_pac, id_farmacia);
	}
}
