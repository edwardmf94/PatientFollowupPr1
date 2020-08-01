package com.patient.followup.resources;

import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.patient.followup.controllers.services.DgCronicosService;
import com.patient.followup.models.DgCronicos;

@RestController
public class DgCronicosResource {
	private DgCronicosService dgCronicosService;
	
	public DgCronicosResource(DgCronicosService dgCronicosService) {
		this.dgCronicosService = dgCronicosService;
	}
	
	@PostMapping("dg_cronico")
	public DgCronicos save(@RequestParam("dni") String dni,
			@RequestParam("cip") String cip,
			@RequestParam("apenom") String apenom, 
			@RequestParam("celular") String celular,
			@RequestParam("edad") String edad,
			@RequestParam("sexo") String sexo,
			@RequestParam("id_farmacia") String id_faracia,
			@RequestParam("id_distrito") String id_distrito,
			@RequestParam("direccion") String direccion,
			@RequestParam("justificacion_medica") String justificacion_medica,
			@RequestParam("id_especialidad") String id_especialidad,
			@RequestParam("descripcion_espe") String descripcion_espe,
			@RequestParam("cie10") String cie10,
			@AuthenticationPrincipal String username) {
		System.out.println("cip "+ cip);
		System.out.println("token "+ username);
		if(username.equals(cip.trim())) {
			DgCronicos dgCronicos = dgCronicosService.findByCipPac(username);
			if(dgCronicos==null) {
				dgCronicos = new DgCronicos();
				DgCronicos last_register = dgCronicosService.findLastRecord();
				System.out.println(last_register.getIdUnico());
				dgCronicos.setIdUnico(last_register.getIdUnico()+1);
				dgCronicos.setFechaFicha(new Date());
				dgCronicos.setUsuarioRegistro("VISITANTE");
			}
			
			dgCronicos.setDniPac(dni);
			dgCronicos.setCipPac(cip);
			dgCronicos.setApellidosNombres(apenom);
			dgCronicos.setTelefonoPac(celular);
			if(edad!=null) {
				dgCronicos.setEdadPac(Integer.valueOf(edad));
			}
			dgCronicos.setSexoPac(sexo);
			dgCronicos.setIdFarmacia(id_faracia);
			dgCronicos.setIdDistrito(id_distrito);
			dgCronicos.setDireccionPac(direccion);
			dgCronicos.setJustificacionMedica(justificacion_medica);
			dgCronicos.setIdEspecialidad(id_especialidad);
			dgCronicos.setDescripcionEspe(descripcion_espe);
			dgCronicos.setCie10Pac(cie10);
			dgCronicos.setFechaModificacion(new Date());
			System.out.println("se ejecuta creacion "+ dgCronicos.getIdUnico());
			dgCronicosService.create(dgCronicos);
			
			return dgCronicos;
		}else {
			throw new ResponseStatusException(HttpStatus.NON_AUTHORITATIVE_INFORMATION, "El CIP no coincide con el token de seguridad");
		}
	}
	
	@GetMapping("dg_cronico")
	public DgCronicos getByUsuCip(@AuthenticationPrincipal String username) {
		DgCronicos dgCronicos = dgCronicosService.findByCipPac(username);
		return dgCronicos;
	}
}
