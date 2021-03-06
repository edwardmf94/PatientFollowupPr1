package com.patient.followup.controllers.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patient.followup.models.Distrito;
import com.patient.followup.models.Provincia;

public interface DistritoRepository extends JpaRepository<Distrito, String> {
	public List<Distrito> findByIdProvincia(String idProvincia);
}
