package com.patient.followup.controllers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patient.followup.models.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, String> {
}
