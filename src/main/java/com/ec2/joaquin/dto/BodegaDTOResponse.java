package com.ec2.joaquin.dto;

public class BodegaDTOResponse {

	private Integer idBodegaDTO;
	private String nombreDTO;
	private String direccionDTO;

	public BodegaDTOResponse() {
		super();
	}

	public Integer getIdBodegaDTO() {
		return idBodegaDTO;
	}

	public void setIdBodegaDTO(Integer idBodegaDTO) {
		this.idBodegaDTO = idBodegaDTO;
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

}
