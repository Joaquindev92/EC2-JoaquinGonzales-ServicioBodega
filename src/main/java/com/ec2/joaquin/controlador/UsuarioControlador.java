package com.ec2.joaquin.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ec2.joaquin.dto.UsuarioDTORequest;
import com.ec2.joaquin.dto.UsuarioDTOResponse;
import com.ec2.joaquin.seguridad.JwtUtil;
import com.ec2.joaquin.seguridad.UserDetailService;

@RestController
public class UsuarioControlador {
	
	@Autowired
	private JwtUtil util;
	
	@Autowired
	private UserDetailService service;
	
	@RequestMapping(path = "/crearToken", method = RequestMethod.POST)
	public ResponseEntity<?> crearToken(@RequestBody UsuarioDTORequest dto){
		
		UserDetails detail = service.loadUserByUsername(dto.getUsuario());
		return ResponseEntity.ok(new UsuarioDTOResponse(util.generateToken(detail.getUsername())));
		
	}

}