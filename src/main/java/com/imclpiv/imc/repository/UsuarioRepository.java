package com.imclpiv.imc.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.imclpiv.imc.model.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
    
}
