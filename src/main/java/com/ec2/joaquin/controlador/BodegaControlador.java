package com.ec2.joaquin.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ec2.joaquin.dto.BodegaDTORequest;
import com.ec2.joaquin.dto.BodegaDTOResponse;
import com.ec2.joaquin.modelo.Bodega;
import com.ec2.joaquin.servicio.BodegaServicio;

@RestController
@RequestMapping("/bodega/v1")
public class BodegaControlador {

	@Autowired
	private BodegaServicio servicio;

	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<BodegaDTOResponse>> listarBodegas() {
		return new ResponseEntity<List<BodegaDTOResponse>>(servicio.listarBodegas(), HttpStatus.OK);
	}

	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody BodegaDTORequest bodega) {

		servicio.guardarBodega(bodega);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<BodegaDTOResponse> listarPorId(@PathVariable Integer id) {

		BodegaDTOResponse p = servicio.obtenerBodegaId(id);
		if (p != null)
			return new ResponseEntity<BodegaDTOResponse>(p, HttpStatus.OK);

		return new ResponseEntity<BodegaDTOResponse>(HttpStatus.NOT_FOUND);
	}

	@RequestMapping(path = "/editar", method = RequestMethod.PUT)
	public ResponseEntity<Void> editar(@RequestBody BodegaDTORequest bodega) {

		BodegaDTOResponse p = servicio.obtenerBodegaId(bodega.getIdBodegaDTO());

		if (p != null) {
			servicio.editarBodega(bodega);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}

	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id) {

		BodegaDTOResponse p = servicio.obtenerBodegaId(id);
		if (p != null) {
			servicio.eliminarBodega(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);

	}
}
