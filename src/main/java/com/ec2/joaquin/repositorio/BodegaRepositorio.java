package com.ec2.joaquin.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ec2.joaquin.modelo.Bodega;

@Repository
public interface BodegaRepositorio extends JpaRepository<Bodega, Integer> {
	
}
