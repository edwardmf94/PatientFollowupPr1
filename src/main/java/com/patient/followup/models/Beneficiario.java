package com.patient.followup.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="beneficiarios")
public class Beneficiario {
	@Id
	@Column(name="bene_if")
	private int beneId;
	
	@Column(name="usu_cip")
	private String usuCip;
	
	@Column(name="bene_cip")
	private String beneCip;
	
	@Column(name="bene_cat")
	private String beneCat;
	
	@Column(name="bene_apenom")
	private String beneApenom;

	public int getBeneId() {
		return beneId;
	}

	public void setBeneId(int beneId) {
		this.beneId = beneId;
	}

	public String getUsuCip() {
		return usuCip;
	}

	public void setUsuCip(String usuCip) {
		this.usuCip = usuCip;
	}

	public String getBeneCip() {
		return beneCip;
	}

	public void setBeneCip(String beneCip) {
		this.beneCip = beneCip;
	}

	public String getBeneCat() {
		return beneCat;
	}

	public void setBeneCat(String beneCat) {
		this.beneCat = beneCat;
	}

	public String getBeneApenom() {
		return beneApenom;
	}

	public void setBeneApenom(String beneApenom) {
		this.beneApenom = beneApenom;
	}
}
