package com.patient.followup.controllers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patient.followup.models.DetCronicos;

public interface DetCronicosRepository extends JpaRepository<DetCronicos, String> {
	public DetCronicos findByDcroId(int dcroId);
}
