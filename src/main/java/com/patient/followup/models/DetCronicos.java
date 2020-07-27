package com.patient.followup.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="det_cronicos")
public class DetCronicos {
	@Id
	@Column(name="dcro_id")
	private String dcroId;
	
	@Column(name="cro_id")
	private int croId;
	
	@Column(name="id_farmacia")
	private String idFarmacia;
	
	@Column(name="id_especialidad")
	private int idEspecialidad;
	
	@Column(name="diagnostico_principal")
	private String diagnosticoPrincipal;

	public String getDcroId() {
		return dcroId;
	}

	public void setDcroId(String dcroId) {
		this.dcroId = dcroId;
	}

	public int getCroId() {
		return croId;
	}

	public void setCroId(int croId) {
		this.croId = croId;
	}

	public String getIdFarmacia() {
		return idFarmacia;
	}

	public void setIdFarmacia(String idFarmacia) {
		this.idFarmacia = idFarmacia;
	}

	public int getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public String getDiagnosticoPrincipal() {
		return diagnosticoPrincipal;
	}

	public void setDiagnosticoPrincipal(String diagnosticoPrincipal) {
		this.diagnosticoPrincipal = diagnosticoPrincipal;
	}
	
	
}
