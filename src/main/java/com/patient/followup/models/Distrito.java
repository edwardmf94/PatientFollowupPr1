package com.patient.followup.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TN_Distrito")
public class Distrito {
	@Id
	@Column(name="id_distrito")
	private String idDistrito;
	
	@Column(name="id_departament")
	private String idDepartament;
	
	@Column(name="id_provincia")
	private String idProvincia;
	
	@Column(name="descripcion_distrito")
	private String descripcionDistrito;

	public String getIdDistrito() {
		return idDistrito;
	}

	public void setIdDistrito(String idDistrito) {
		this.idDistrito = idDistrito;
	}

	public String getIdDepartament() {
		return idDepartament;
	}

	public void setIdDepartament(String idDepartament) {
		this.idDepartament = idDepartament;
	}

	public String getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(String idProvincia) {
		this.idProvincia = idProvincia;
	}

	public String getDescripcionDistrito() {
		return descripcionDistrito;
	}

	public void setDescripcionDistrito(String descripcionDistrito) {
		this.descripcionDistrito = descripcionDistrito;
	}
	
}
