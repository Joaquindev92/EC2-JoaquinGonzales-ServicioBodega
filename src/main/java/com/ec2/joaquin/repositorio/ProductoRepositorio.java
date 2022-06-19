package com.ec2.joaquin.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ec2.joaquin.modelo.Productos;

@Repository
public interface ProductoRepositorio extends JpaRepository<Productos, Integer> {
	
	

}
