package com.patient.followup.controllers.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.patient.followup.models.Beneficiario;
import com.patient.followup.models.DgCronicos;

public interface BeneficiarioRepository extends JpaRepository<Beneficiario, String> {
	//public List<Beneficiario> findByUsuCip(String usuCip);
	
	@Query(value = "SELECT * FROM TN_pacientecg where cip_pac like :cip_pac%", nativeQuery = true)
	public List<Beneficiario> findBeneficiariosTitular(String cip_pac);
}
