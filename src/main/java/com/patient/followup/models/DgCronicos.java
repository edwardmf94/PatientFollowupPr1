package com.patient.followup.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="dg_cronicos")
public class DgCronicos {
	@Id
	@Column(name="cro_id")
	private int croId;
	
	@Column(name="usu_cip")
	private String usuCip;
	
	@Column(name="cro_apenom")
	private String croApenom;
	
	@Temporal(TemporalType.DATE)
	@Column(name="cro_fechnac")
	private Date croFechnac;
	
	@Column(name="cro_sexo")
	private String croSexo;
	
	@Column(name="cro_direccion")
	private String croDireccion;
	
	@Column(name="cro_telefono")
	private String croTelefono;
	
	@Temporal(TemporalType.DATE)
	@Column(name="cro_fechinsc")
	private Date croFechinsc;
	
	@Temporal(TemporalType.DATE)
	@Column(name="cro_cecultmod")
	private Date croFecultmod;
	
	@Column(name="id_departamento")
	private String idDepartamento;
	
	@Column(name="id_provincia")
	private String idProvincia;
	
	@Column(name="id_distrito")
	private String idDistrito;
	
	@Column(name="cro_unidad")
	private int croUnidad;
	
	@Column(name="id_grado")
	private int idGrado;
	
	@Column(name="cro_arma")
	private int croArma;
	
	@Column(name="cro_sitmil")
	private int croSitmil;
	
	@Column(name="cro_dni")
	private String croDni;

	public int getCroId() {
		return croId;
	}

	public void setCroId(int croId) {
		this.croId = croId;
	}

	public String getUsuCip() {
		return usuCip;
	}

	public void setUsuCip(String usuCip) {
		this.usuCip = usuCip;
	}

	public String getCroApenom() {
		return croApenom;
	}

	public void setCroApenom(String croApenom) {
		this.croApenom = croApenom;
	}

	public Date getCroFechnac() {
		return croFechnac;
	}

	public void setCroFechnac(Date croFechnac) {
		this.croFechnac = croFechnac;
	}

	public String getCroSexo() {
		return croSexo;
	}

	public void setCroSexo(String croSexo) {
		this.croSexo = croSexo;
	}

	public String getCroDireccion() {
		return croDireccion;
	}

	public void setCroDireccion(String croDireccion) {
		this.croDireccion = croDireccion;
	}

	public String getCroTelefono() {
		return croTelefono;
	}

	public void setCroTelefono(String croTelefono) {
		this.croTelefono = croTelefono;
	}

	public Date getCroFechinsc() {
		return croFechinsc;
	}

	public void setCroFechinsc(Date croFechinsc) {
		this.croFechinsc = croFechinsc;
	}

	public Date getCroFecultmod() {
		return croFecultmod;
	}

	public void setCroFecultmod(Date croFecultmod) {
		this.croFecultmod = croFecultmod;
	}

	public String getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(String idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(String idProvincia) {
		this.idProvincia = idProvincia;
	}

	public String getIdDistrito() {
		return idDistrito;
	}

	public void setIdDistrito(String idDistrito) {
		this.idDistrito = idDistrito;
	}

	public int getCroUnidad() {
		return croUnidad;
	}

	public void setCroUnidad(int croUnidad) {
		this.croUnidad = croUnidad;
	}

	public int getIdGrado() {
		return idGrado;
	}

	public void setIdGrado(int idGrado) {
		this.idGrado = idGrado;
	}

	public int getCroArma() {
		return croArma;
	}

	public void setCroArma(int croArma) {
		this.croArma = croArma;
	}

	public int getCroSitmil() {
		return croSitmil;
	}

	public void setCroSitmil(int croSitmil) {
		this.croSitmil = croSitmil;
	}

	public String getCroDni() {
		return croDni;
	}

	public void setCroDni(String croDni) {
		this.croDni = croDni;
	}
}
