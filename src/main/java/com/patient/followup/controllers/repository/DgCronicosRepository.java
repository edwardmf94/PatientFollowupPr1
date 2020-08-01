package com.patient.followup.controllers.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.patient.followup.models.DgCronicos;

public interface DgCronicosRepository extends JpaRepository<DgCronicos, String> {
	public DgCronicos findByCipPac(String usuCip);
	
	@Query(value = "SELECT TOP 1 * FROM tn_pacfichacron c ORDER BY id_unico DESC", nativeQuery = true)
	public DgCronicos findLastRecord();
}
