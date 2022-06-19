package com.ec2.joaquin.dto;

public class UsuarioDTORequest {
	
	private Integer idUsuario;
	private String usuario;
	private String password;
	private String rol;
	
	
	
	public UsuarioDTORequest(Integer idUsuario, String usuario, String password, String rol) {
		super();
		this.idUsuario = idUsuario;
		this.usuario = usuario;
		this.password = password;
		this.rol = rol;
	}

	public UsuarioDTORequest() {
		super();
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	

	
	

}
