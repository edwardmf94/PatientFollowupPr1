package com.patient.followup.controllers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patient.followup.models.DgCronicos;

public interface DgCronicosRepository extends JpaRepository<DgCronicos, String> {
	public DgCronicos findByUsuCip(String usuCip);
}
