package com.ec2.joaquin.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ec2.joaquin.dto.ClienteDTORequest;
import com.ec2.joaquin.dto.ClienteDTOResponse;
import com.ec2.joaquin.modelo.Cliente;
import com.ec2.joaquin.modelo.Productos;
import com.ec2.joaquin.repositorio.ClienteRepositorio;

@Service
public class ClientesServicioImpl implements ClientesServicio{

	@Autowired
	public ClienteRepositorio repositorio;
	
	@Override
	public void guardarCliente(ClienteDTORequest cliente) {
		Cliente c = new Cliente();
		c.setDireccion(cliente.getDireccionDTO());
		c.setDni(cliente.getDniDTO());
		c.setIdCliente(cliente.getIdClienteDTO());
		c.setNombre(cliente.getNombreDTO());
				repositorio.save(c);
	}

	@Override
	public void editarCliente(ClienteDTORequest cliente) {
		Cliente c = new Cliente();
		c.setDireccion(cliente.getDireccionDTO());
		c.setDni(cliente.getDniDTO());
		c.setIdCliente(cliente.getIdClienteDTO());
		c.setNombre(cliente.getNombreDTO());
		repositorio.saveAndFlush(c);
	}

	@Override
	public void eliminarCliente(Integer id) {
		repositorio.deleteById(id);
	}

	@Override
	public List<ClienteDTOResponse> listarClientes() {
		
		List<ClienteDTOResponse> lista = new ArrayList<ClienteDTOResponse>();
		ClienteDTOResponse c = null;
		
		for (Cliente cliente : repositorio.findAll()) {
			
		c = new ClienteDTOResponse();
		
		c.setDireccionDTO(cliente.getDireccion());
		c.setDniDTO(cliente.getDni());
		c.setIdClienteDTO(cliente.getIdCliente());
		c.setNombreDTO(cliente.getNombre());
		
		lista.add(c);
		
		}
		return null;
	}

	@Override
	public ClienteDTOResponse obtenerClienteId(Integer id) {
		Cliente cliente = repositorio.findById(id).orElse(null);
		
		ClienteDTOResponse c = new ClienteDTOResponse();

		c.setDireccionDTO(cliente.getDireccion());
		c.setDniDTO(cliente.getDni());
		c.setIdClienteDTO(cliente.getIdCliente());
		c.setNombreDTO(cliente.getNombre());
		
		
		return c;
	}

}
