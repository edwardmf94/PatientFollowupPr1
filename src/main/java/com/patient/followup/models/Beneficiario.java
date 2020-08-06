package com.patient.followup.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TN_pacientecg")
public class Beneficiario {
	@Id
	@Column(name="id_paciente_cg")
	private String beneId;
	
	@Column(name="cip_pac")
	private String beneCip;
	
	@Column(name="apellidos_nombres_pac")
	private String beneApenom;
	
	@Column(name="parentesco_pac")
	private String parentescoPac;
	

	public String getParentescoPac() {
		return parentescoPac;
	}

	public void setParentescoPac(String parentescoPac) {
		this.parentescoPac = parentescoPac;
	}

	public String getBeneId() {
		return beneId;
	}

	public void setBeneId(String beneId) {
		this.beneId = beneId;
	}

	public String getBeneCip() {
		return beneCip;
	}

	public void setBeneCip(String beneCip) {
		this.beneCip = beneCip;
	}

	public String getBeneApenom() {
		return beneApenom;
	}

	public void setBeneApenom(String beneApenom) {
		this.beneApenom = beneApenom;
	}
}
