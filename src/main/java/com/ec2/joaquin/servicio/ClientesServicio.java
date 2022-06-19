package com.ec2.joaquin.servicio;

import java.util.List;
import java.util.Optional;

import com.ec2.joaquin.dto.ClienteDTORequest;
import com.ec2.joaquin.dto.ClienteDTOResponse;
import com.ec2.joaquin.modelo.Cliente;

public interface ClientesServicio {

	public void guardarCliente(ClienteDTORequest cliente);

	public void editarCliente(ClienteDTORequest cliente);

	public void eliminarCliente(Integer id);

	public List<ClienteDTOResponse> listarClientes();

	public ClienteDTOResponse obtenerClienteId(Integer id);
}
