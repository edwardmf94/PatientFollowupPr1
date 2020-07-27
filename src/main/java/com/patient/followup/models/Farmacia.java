package com.patient.followup.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TN_Farmacia")
public class Farmacia {
	@Id
	@Column(name="id_farmacia")
	private String idFarmacia;
	
	@Column(name="descripcion_local")
	private String descripcionLocal;

	public String getIdFarmacia() {
		return idFarmacia;
	}

	public void setIdFarmacia(String idFarmacia) {
		this.idFarmacia = idFarmacia;
	}

	public String getDescripcionLocal() {
		return descripcionLocal;
	}

	public void setDescripcionLocal(String descripcionLocal) {
		this.descripcionLocal = descripcionLocal;
	}
	
	
}
