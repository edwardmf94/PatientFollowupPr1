package com.patient.followup.controllers.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.patient.followup.models.Farmacia;

public interface FarmaciaRepository extends JpaRepository<Farmacia, String> {

}
