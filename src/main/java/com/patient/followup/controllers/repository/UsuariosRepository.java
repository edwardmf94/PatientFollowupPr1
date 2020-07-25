package com.patient.followup.controllers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patient.followup.models.Usuarios;

public interface UsuariosRepository extends JpaRepository<Usuarios, String> {
	public Usuarios findByUsuCip(String usuCip);
}
