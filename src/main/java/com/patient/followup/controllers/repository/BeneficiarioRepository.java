package com.patient.followup.controllers.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patient.followup.models.Beneficiario;

public interface BeneficiarioRepository extends JpaRepository<Beneficiario, String> {
	public List<Beneficiario> findByUsuCip(String usuCip);
}
