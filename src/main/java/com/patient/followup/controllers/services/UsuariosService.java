package com.patient.followup.controllers.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.patient.followup.controllers.repository.UsuariosRepository;
import com.patient.followup.models.Usuarios;

@Service
@Transactional(readOnly = true)
public class UsuariosService {
	private final UsuariosRepository usuariosRepository;

	public UsuariosService(UsuariosRepository usuariosRepository) {
		this.usuariosRepository = usuariosRepository;
	}
	
	@Transactional
	public Usuarios create(Usuarios usuario) {
		return this.usuariosRepository.save(usuario);
	}
	
	@Transactional
	public Usuarios update(Usuarios usuario) {
		return this.usuariosRepository.save(usuario);
	}
	
	@Transactional
	public void delete(Usuarios usuario) {
		this.usuariosRepository.delete(usuario);
	}
	
	public Usuarios findByUsuCip(String usuCip) {
		return this.usuariosRepository.findByUsuCip(usuCip);
	}
}
