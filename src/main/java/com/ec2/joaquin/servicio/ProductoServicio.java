package com.ec2.joaquin.servicio;

import java.util.List;
import java.util.Optional;

import com.ec2.joaquin.dto.ProductoDTORequest;
import com.ec2.joaquin.dto.ProductoDTOResponse;
import com.ec2.joaquin.modelo.Productos;


public interface ProductoServicio {

	public void guardarProducto(ProductoDTORequest producto);
	public void editarProducto(ProductoDTORequest producto);
	public void eliminarProducto(Integer id);
	public List<ProductoDTOResponse> listarProductos();
	public ProductoDTOResponse obtenerProductoId (Integer id);
}
