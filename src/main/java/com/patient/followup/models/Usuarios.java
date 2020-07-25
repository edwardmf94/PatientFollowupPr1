package com.patient.followup.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="usuarios")
public class Usuarios {
	@Id
	@Column(name="usu_cip")
	private String usuCip;
	
	@Column(name="usu_password")
	@JsonIgnore
	private String usuPassword;
	
	@Column(name="usu_estado")
	private int usuEstado;
	
	//@JsonInclude()
	@Transient
	private String token;
	
	public String getUsuCip() {
		return usuCip;
	}
	public void setUsuCip(String usuCip) {
		this.usuCip = usuCip;
	}
	public String getUsuPassword() {
		return usuPassword;
	}
	public void setUsuPassword(String usuPassword) {
		this.usuPassword = usuPassword;
	}
	public int getUsuEstado() {
		return usuEstado;
	}
	public void setUsuEstado(int usuEstado) {
		this.usuEstado = usuEstado;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	
}
