package com.ec2.joaquin.dto;

public class ClienteDTOResponse {
	
	private Integer idClienteDTO;
	private String nombreDTO;
	private String direccionDTO;
	private Integer dniDTO;
	
	public ClienteDTOResponse() {
		super();
	}

	public Integer getIdClienteDTO() {
		return idClienteDTO;
	}

	public void setIdClienteDTO(Integer idClienteDTO) {
		this.idClienteDTO = idClienteDTO;
	}

	public String getNombreDTO() {
		return nombreDTO;
	}

	public void setNombreDTO(String nombreDTO) {
		this.nombreDTO = nombreDTO;
	}

	public String getDireccionDTO() {
		return direccionDTO;
	}

	public void setDireccionDTO(String direccionDTO) {
		this.direccionDTO = direccionDTO;
	}

	public Integer getDniDTO() {
		return dniDTO;
	}

	public void setDniDTO(Integer dniDTO) {
		this.dniDTO = dniDTO;
	}
	
	
	

}
