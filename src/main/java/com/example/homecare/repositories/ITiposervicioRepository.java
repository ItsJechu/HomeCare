package com.example.homecare.repositories;

import com.example.homecare.entities.Tiposervicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITiposervicioRepository extends JpaRepository<Tiposervicio, Integer>{
}
