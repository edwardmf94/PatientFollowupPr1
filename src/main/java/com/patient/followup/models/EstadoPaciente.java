package com.patient.followup.models;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TN_Distrito")
public class EstadoPaciente {
	@Id
	@Column(name="id_estadopac")
	private int id;
	
	@Column(name="cip_pac")
	private String cipPac;
	
	@Column(name="id_farmacia")
	private String idFarmacia;
	
	@Column(name="estado_1")
	private String estado1;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_1")
	private Date fecha1;
	
	@Column(name="estado_2")
	private String estado2;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_2")
	private Date fecha2;
	
	@Column(name="estado_3")
	private String estado3;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_3")
	private Date fecha3;
	
	@Column(name="estado_4")
	private String estado4;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_4")
	private Date fecha4;
	
	@Column(name="estado_5")
	private String estado5;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_5")
	private Date fecha5;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCipPac() {
		return cipPac;
	}

	public void setCipPac(String cipPac) {
		this.cipPac = cipPac;
	}

	public String getIdFarmacia() {
		return idFarmacia;
	}

	public void setIdFarmacia(String idFarmacia) {
		this.idFarmacia = idFarmacia;
	}

	public String getEstado1() {
		return estado1;
	}

	public void setEstado1(String estado1) {
		this.estado1 = estado1;
	}

	public Date getFecha1() {
		return fecha1;
	}

	public void setFecha1(Date fecha1) {
		this.fecha1 = fecha1;
	}

	public String getEstado2() {
		return estado2;
	}

	public void setEstado2(String estado2) {
		this.estado2 = estado2;
	}

	public Date getFecha2() {
		return fecha2;
	}

	public void setFecha2(Date fecha2) {
		this.fecha2 = fecha2;
	}

	public String getEstado3() {
		return estado3;
	}

	public void setEstado3(String estado3) {
		this.estado3 = estado3;
	}

	public Date getFecha3() {
		return fecha3;
	}

	public void setFecha3(Date fecha3) {
		this.fecha3 = fecha3;
	}

	public String getEstado4() {
		return estado4;
	}

	public void setEstado4(String estado4) {
		this.estado4 = estado4;
	}

	public Date getFecha4() {
		return fecha4;
	}

	public void setFecha4(Date fecha4) {
		this.fecha4 = fecha4;
	}

	public String getEstado5() {
		return estado5;
	}

	public void setEstado5(String estado5) {
		this.estado5 = estado5;
	}

	public Date getFecha5() {
		return fecha5;
	}

	public void setFecha5(Date fecha5) {
		this.fecha5 = fecha5;
	}
	
}
