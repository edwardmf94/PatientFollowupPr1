package com.patient.followup.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="TN_pacfichacron")
public class DgCronicos {
	@Id
	@Column(name="id_unico")
	private int idUnico;
	
	@Column(name="id_farmacia")
	private String idFarmacia;
	
	@Column(name="id_distrito")
	private String idDistrito;
	
	@Column(name="edad_pac")
	private int edadPac;
	
	@Column(name="apellidos_nombres")
	private String apellidosNombres;
	
	@Column(name="cip_pac")
	private String cipPac;
	
	@Column(name="dni_pac")
	private String dniPac;
	
	@Column(name="telefono_pac")
	private String telefonoPac;
	
	@Column(name="sexo_pac")
	private String sexoPac;
	
	@Column(name="direccion_pac")
	private String direccionPac;
	
	@Column(name="justificacion_medica")
	private String justificacionMedica;
	
	@Column(name="id_especialidad")
	private String idEspecialidad;
	
	@Column(name="descripcionEspe")
	private String descripcionEspe;
	
	@Column(name="cie10_pac")
	private String cie10Pac;
	
	@Temporal(TemporalType.DATE)
	@Column(name="fecha_ficha")
	private Date fechaFicha;
	
	@Temporal(TemporalType.DATE)
	@Column(name="fecha_modificacion")
	private Date fechaModificacion;
	
	@Column(name="usuario_registro")
	private String usuarioRegistro;
	
	@Transient
	private String distritoNombre;
	
	@Transient
	private String provinciaId;
	
	@Transient
	private String provinciaNombre;
	
	@Transient
	private String departamentoId;
	
	@Transient
	private String departamentoNombre;
	
	@Transient
	private String cie10PacDescripcion;

	public int getIdUnico() {
		return idUnico;
	}

	public void setIdUnico(int idUnico) {
		this.idUnico = idUnico;
	}

	public String getIdFarmacia() {
		return idFarmacia;
	}

	public void setIdFarmacia(String idFarmacia) {
		this.idFarmacia = idFarmacia;
	}

	public String getIdDistrito() {
		return idDistrito;
	}

	public void setIdDistrito(String idDistrito) {
		this.idDistrito = idDistrito;
	}

	public int getEdadPac() {
		return edadPac;
	}

	public void setEdadPac(int edadPac) {
		this.edadPac = edadPac;
	}

	public String getApellidosNombres() {
		return apellidosNombres;
	}

	public void setApellidosNombres(String apellidosNombres) {
		this.apellidosNombres = apellidosNombres;
	}

	public String getCipPac() {
		return cipPac;
	}

	public void setCipPac(String cipPac) {
		this.cipPac = cipPac;
	}

	public String getDniPac() {
		return dniPac;
	}

	public void setDniPac(String dniPac) {
		this.dniPac = dniPac;
	}

	public String getTelefonoPac() {
		return telefonoPac;
	}

	public void setTelefonoPac(String telefonoPac) {
		this.telefonoPac = telefonoPac;
	}

	public String getSexoPac() {
		return sexoPac;
	}

	public void setSexoPac(String sexoPac) {
		this.sexoPac = sexoPac;
	}

	public String getDireccionPac() {
		return direccionPac;
	}

	public void setDireccionPac(String direccionPac) {
		this.direccionPac = direccionPac;
	}

	public String getJustificacionMedica() {
		return justificacionMedica;
	}

	public void setJustificacionMedica(String justificacionMedica) {
		this.justificacionMedica = justificacionMedica;
	}

	public String getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(String idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}

	public String getDescripcionEspe() {
		return descripcionEspe;
	}

	public void setDescripcionEspe(String descripcionEspe) {
		this.descripcionEspe = descripcionEspe;
	}

	public String getCie10Pac() {
		return cie10Pac;
	}

	public void setCie10Pac(String cie10Pac) {
		this.cie10Pac = cie10Pac;
	}

	public Date getFechaFicha() {
		return fechaFicha;
	}

	public void setFechaFicha(Date fechaFicha) {
		this.fechaFicha = fechaFicha;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public String getUsuarioRegistro() {
		return usuarioRegistro;
	}

	public void setUsuarioRegistro(String usuarioRegistro) {
		this.usuarioRegistro = usuarioRegistro;
	}

	public String getDistritoNombre() {
		return distritoNombre;
	}

	public void setDistritoNombre(String distritoNombre) {
		this.distritoNombre = distritoNombre;
	}

	public String getProvinciaId() {
		return provinciaId;
	}

	public void setProvinciaId(String provinciaId) {
		this.provinciaId = provinciaId;
	}

	public String getProvinciaNombre() {
		return provinciaNombre;
	}

	public void setProvinciaNombre(String provinciaNombre) {
		this.provinciaNombre = provinciaNombre;
	}

	public String getDepartamentoId() {
		return departamentoId;
	}

	public void setDepartamentoId(String departamentoId) {
		this.departamentoId = departamentoId;
	}

	public String getDepartamentoNombre() {
		return departamentoNombre;
	}

	public void setDepartamentoNombre(String departamentoNombre) {
		this.departamentoNombre = departamentoNombre;
	}

	public String getCie10PacDescripcion() {
		return cie10PacDescripcion;
	}

	public void setCie10PacDescripcion(String cie10PacDescripcion) {
		this.cie10PacDescripcion = cie10PacDescripcion;
	}
	
}
