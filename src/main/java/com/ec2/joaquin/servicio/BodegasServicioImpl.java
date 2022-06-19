package com.ec2.joaquin.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ec2.joaquin.dto.BodegaDTORequest;
import com.ec2.joaquin.dto.BodegaDTOResponse;
import com.ec2.joaquin.modelo.Bodega;
import com.ec2.joaquin.repositorio.BodegaRepositorio;

@Service
public class BodegasServicioImpl implements BodegaServicio {

	@Autowired
	public BodegaRepositorio repositorio;

	@Override
	public void guardarBodega(BodegaDTORequest bodega) {
		Bodega b = new Bodega();
		b.setDireccion(bodega.getDireccionDTO());
		b.setIdBodega(bodega.getIdBodegaDTO());
		b.setNombre(bodega.getNombreDTO());
		repositorio.save(b);

	}

	@Override
	public void editarBodega(BodegaDTORequest bodega) {
		Bodega b = new Bodega();
		b.setDireccion(bodega.getDireccionDTO());
		b.setIdBodega(bodega.getIdBodegaDTO());
		b.setNombre(bodega.getNombreDTO());
		repositorio.saveAndFlush(b);

	}

	@Override
	public void eliminarBodega(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<BodegaDTOResponse> listarBodegas() {
		List<BodegaDTOResponse> lista = new ArrayList<BodegaDTOResponse>();
		BodegaDTOResponse b = null;

		for (Bodega bodega : repositorio.findAll()) {

			b = new BodegaDTOResponse();

			b.setDireccionDTO(bodega.getDireccion());
			b.setIdBodegaDTO(bodega.getIdBodega());
			b.setNombreDTO(bodega.getNombre());

			lista.add(b);

		}
		return null;
	}

	@Override
	public BodegaDTOResponse obtenerBodegaId(Integer id) {
		Bodega bodega = repositorio.findById(id).orElse(null);
		
		BodegaDTOResponse b = new BodegaDTOResponse();

		b.setDireccionDTO(bodega.getDireccion());
		b.setIdBodegaDTO(bodega.getIdBodega());
		b.setNombreDTO(bodega.getNombre());
		
		return b;

}

}
