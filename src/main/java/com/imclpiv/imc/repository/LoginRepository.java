package com.imclpiv.imc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imclpiv.imc.model.Login;

public interface LoginRepository extends JpaRepository< Login, Long>{
    
}
