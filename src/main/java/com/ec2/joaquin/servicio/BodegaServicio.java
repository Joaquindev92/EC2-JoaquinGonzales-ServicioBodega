package com.ec2.joaquin.servicio;

import java.util.List;
import java.util.Optional;

import com.ec2.joaquin.dto.BodegaDTORequest;
import com.ec2.joaquin.dto.BodegaDTOResponse;
import com.ec2.joaquin.modelo.Bodega;

public interface BodegaServicio {

	public void guardarBodega(BodegaDTORequest bodega);
	public void editarBodega(BodegaDTORequest bodega);
	public void eliminarBodega(Integer id);
	public List<BodegaDTOResponse> listarBodegas();
	public BodegaDTOResponse obtenerBodegaId(Integer id);
}
