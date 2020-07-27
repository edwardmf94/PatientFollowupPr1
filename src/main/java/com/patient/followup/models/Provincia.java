package com.patient.followup.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TN_Provincia")
public class Provincia {
	@Id
	@Column(name="id_provincia")
	private String idProvincia;
	
	@Column(name="id_departament")
	private String idDepartament;
	
	@Column(name="descripcion_provincia")
	private String descripcionProvincia;

	public String getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(String idProvincia) {
		this.idProvincia = idProvincia;
	}

	public String getIdDepartament() {
		return idDepartament;
	}

	public void setIdDepartament(String idDepartament) {
		this.idDepartament = idDepartament;
	}

	public String getDescripcionProvincia() {
		return descripcionProvincia;
	}

	public void setDescripcionProvincia(String descripcionProvincia) {
		this.descripcionProvincia = descripcionProvincia;
	}
}
