package com.patient.followup.resources;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.patient.followup.controllers.services.DetCronicosService;
import com.patient.followup.controllers.services.DgCronicosService;
import com.patient.followup.models.DetCronicos;

@RestController
public class DetCronicosResource {
	private DetCronicosService detCronicosService;
	//private DgCronicosService dgCronicosService;
	
	public DetCronicosResource(DetCronicosService detCronicosService, DgCronicosService dgCronicosService) {
		this.detCronicosService = detCronicosService;
		//this.dgCronicosService = dgCronicosService;
	}
	
	@PostMapping("det_cronico")
	public DetCronicos save(@RequestParam("id_farmacia") String idFarmacia, 
			@RequestParam("id_especialidad") int idEspecialidad,
			@RequestParam("diagnostico_principal") String diagnosticoPrincipal, 
			@RequestParam("usu_cip") String usu_cip,
			@AuthenticationPrincipal String username) {
		if(username.equals(usu_cip)) {
			//DgCronicos dgCronicos = dgCronicosService.findByUsuCip(username);
			DetCronicos detCronicos = new DetCronicos();
			detCronicos.setIdFarmacia(idFarmacia);
			detCronicos.setIdEspecialidad(idEspecialidad);
			detCronicos.setDiagnosticoPrincipal(diagnosticoPrincipal);
			//detCronicos.setCroId(dgCronicos.getCroId());
			detCronicosService.create(detCronicos);
			return detCronicos;
		}else{
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "El CIP no coincide con el token de seguridad");
		}
	}
	
	@PostMapping("det_cronico_eliminar")
	public boolean delete(@RequestParam("dcro_id") String dcroId) {
		DetCronicos detCronicos = new DetCronicos();
		detCronicos.setDcroId(dcroId);
		detCronicosService.delete(detCronicos);
		return true;
	}
}
