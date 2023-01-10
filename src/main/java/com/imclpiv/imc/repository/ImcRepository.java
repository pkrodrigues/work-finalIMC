package com.imclpiv.imc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imclpiv.imc.model.Imc;
public interface ImcRepository extends JpaRepository<Imc, Long>{
    
}
