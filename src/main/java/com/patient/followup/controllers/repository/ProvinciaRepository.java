package com.patient.followup.controllers.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patient.followup.models.Provincia;

public interface ProvinciaRepository extends JpaRepository<Provincia, String> {
	public List<Provincia> findByIdDepartament(String idDepartament);
}
