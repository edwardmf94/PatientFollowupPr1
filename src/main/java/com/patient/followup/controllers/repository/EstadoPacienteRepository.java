package com.patient.followup.controllers.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.patient.followup.models.EstadoPaciente;

public interface EstadoPacienteRepository extends JpaRepository<EstadoPaciente, String>  {
	@Query(value = "SELECT TOP 1 * FROM TN_estadopaciente where cip_pac=:cip_pac AND id_farmacia=:id_farmacia", nativeQuery = true)
	public EstadoPaciente findEstadoFarmacia(String cip_pac, String id_farmacia);
}
