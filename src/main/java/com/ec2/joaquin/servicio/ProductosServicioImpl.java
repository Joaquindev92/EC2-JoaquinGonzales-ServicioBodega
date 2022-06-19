package com.ec2.joaquin.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ec2.joaquin.dto.ProductoDTORequest;
import com.ec2.joaquin.dto.ProductoDTOResponse;
import com.ec2.joaquin.modelo.Productos;
import com.ec2.joaquin.repositorio.ProductoRepositorio;

@Service
public class ProductosServicioImpl implements ProductoServicio {
	
	@Autowired
	public ProductoRepositorio repositorio;

	@Override
	public void guardarProducto(ProductoDTORequest producto) {
		Productos p = new Productos();
		p.setDescripcion(producto.getDescripcionDTO());
		p.setIdProducto(producto.getIdProductoDTO());
		p.setNombreProducto(producto.getNombreProductoDTO());
		p.setPrecio(producto.getPrecioDTO());
		p.setStock(producto.getStockDTO());
				repositorio.save(p);
	}

	@Override
	public void editarProducto(ProductoDTORequest producto) {
		Productos p = new Productos();
		p.setDescripcion(producto.getDescripcionDTO());
		p.setIdProducto(producto.getIdProductoDTO());
		p.setNombreProducto(producto.getNombreProductoDTO());
		p.setPrecio(producto.getPrecioDTO());
		p.setStock(producto.getStockDTO());
		repositorio.saveAndFlush(p);
	}

	@Override
	public void eliminarProducto(Integer id) {
		repositorio.deleteById(id);
	}

	@Override
	public List<ProductoDTOResponse> listarProductos() {
		
		List<ProductoDTOResponse> lista = new ArrayList<ProductoDTOResponse>();
		ProductoDTOResponse p = null;
		
		
		for (Productos producto : repositorio.findAll()) {
			
			p = new ProductoDTOResponse();
			
			p.setDescripcionDTO(producto.getDescripcion());
			p.setIdProductoDTO(producto.getIdProducto());
			p.setNombreProductoDTO(producto.getNombreProducto());
			p.setPrecioDTO(producto.getPrecio());
			p.setStockDTO(producto.getStock());
			
			lista.add(p);
		}
		
		return lista ;
	}

	@Override
	public ProductoDTOResponse obtenerProductoId(Integer id) {
		Productos producto = repositorio.findById(id).orElse(null);
		
		ProductoDTOResponse p = new ProductoDTOResponse();
		
		p.setDescripcionDTO(producto.getDescripcion());
		p.setIdProductoDTO(producto.getIdProducto());
		p.setNombreProductoDTO(producto.getNombreProducto());
		p.setPrecioDTO(producto.getPrecio());
		p.setStockDTO(producto.getStock());
		
		return p;
	}

}