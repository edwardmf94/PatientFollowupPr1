package com.patient.followup.controllers.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.patient.followup.models.Cie10;

public interface Cie10Repository extends JpaRepository<Cie10, String> {
	public List<Cie10> findByDescripcionLike(String query, Pageable pageable);
}
