package com.patient.followup.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TN_Departamento")
public class Departamento {
	@Id
	@Column(name="id_departament")
	private String idDepartamento;
	
	@Column(name="descripcion_depart")
	private String descripcionDepart;

	public String getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(String idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getDescripcionDepart() {
		return descripcionDepart;
	}

	public void setDescripcionDepart(String descripcionDepart) {
		this.descripcionDepart = descripcionDepart;
	}
	
	
}
