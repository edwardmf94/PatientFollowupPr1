package com.patient.followup.resources;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import com.patient.followup.controllers.services.UsuariosService;
import com.patient.followup.models.Usuarios;

@RestController
public class UsuariosResource {
	private UsuariosService usuariosService;
	
	public UsuariosResource(UsuariosService usuariosService) {
		this.usuariosService = usuariosService;
	}
	
	@PostMapping("login")
	public Usuarios login(@RequestParam("username") String username, @RequestParam("password") String pwd) {
		
		String token = getJWTToken(username);
		//SE DEBE ENCRIPTAR LAS CONTRASEÑAS
		Usuarios user = usuariosService.findByUsuCip(username);
		System.out.println(user);
		if(user!=null) {
			System.out.println(pwd);
			System.out.println(user.getUsuPassword());
			System.out.println(user.getToken());
			if(user.getUsuPassword().trim().equals(pwd)) {
				user.setToken(token);
				return user;
			}else {
				throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Clave invalida");
			}
		}else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario no encontrado");
		}
		
	}
	
	@PostMapping("signup")
	public Usuarios signup(@RequestParam("username") String username, @RequestParam("password") String pwd) {
		Usuarios user = new Usuarios();
		user.setUsuCip(username);
		user.setUsuPassword(pwd);
		user.setUsuEstado(1);
		String token = getJWTToken(username);
		user.setToken(token);
		usuariosService.create(user);
		return user;
	}
	
	private String getJWTToken(String username) {
		String secretKey = "CLAVE_SECRETA_IAFAS";
		List<GrantedAuthority> grantedAuthorities = AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER");
		
		String token = Jwts
				.builder()
				.setId("softtekJWT")
				.setSubject(username)
				.claim("authorities",
						grantedAuthorities.stream()
								.map(GrantedAuthority::getAuthority)
								.collect(Collectors.toList()))
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 600000))
				.signWith(SignatureAlgorithm.HS512,
						secretKey.getBytes()).compact();

		return token;
	}
}
