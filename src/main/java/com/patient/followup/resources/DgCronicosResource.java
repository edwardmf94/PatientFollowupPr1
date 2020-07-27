package com.patient.followup.resources;

import java.util.Date;

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
			@RequestParam("apenom") String apenom, 
			@RequestParam("celular") String celular,
			@RequestParam("fecnac") Date fecnac,
			@RequestParam("sexo") String sexo,
			@RequestParam("id_departamento") String id_departamento,
			@RequestParam("id_provincia") String id_provincia,
			@RequestParam("id_distrito") String id_distrito,
			@RequestParam("direccion") String direccion,
			@RequestParam("cip") String cip,
			@AuthenticationPrincipal String username) {
		if(username.equals(cip)) {
			DgCronicos dgCronicos = dgCronicosService.findByUsuCip(username);
			dgCronicos.setCroDni(dni);
			dgCronicos.setCroApenom(apenom);
			dgCronicos.setCroTelefono(celular);
			dgCronicos.setCroFechnac(fecnac);
			dgCronicos.setCroSexo(sexo);
			dgCronicos.setIdDepartamento(id_departamento);
			dgCronicos.setIdProvincia(id_provincia);
			dgCronicos.setIdDistrito(id_distrito);
			dgCronicos.setCroDireccion(direccion);
			dgCronicos.setUsuCip(cip);
			dgCronicosService.create(dgCronicos);
			return dgCronicos;
		}else {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "El CIP no coincide con el token de seguridad");
		}
	}
	
	@GetMapping("dg_cronico")
	public DgCronicos getByUsuCip(@AuthenticationPrincipal String username) {
		DgCronicos dgCronicos = dgCronicosService.findByUsuCip(username);
		return dgCronicos;
	}
}
