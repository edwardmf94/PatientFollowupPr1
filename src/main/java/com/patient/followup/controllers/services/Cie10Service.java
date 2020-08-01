package com.patient.followup.controllers.services;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.patient.followup.controllers.repository.Cie10Repository;
import com.patient.followup.models.Cie10;

@Service
public class Cie10Service {
	private final Cie10Repository cie10Repository;
	
	public Cie10Service(Cie10Repository cie10Repository) {
		this.cie10Repository = cie10Repository;
	}
	
	public List<Cie10> findByDescripcionLike(String query){
		Pageable top = PageRequest.of(0, 20);
		return cie10Repository.findByDescripcionLike(query, top);
	}
}
