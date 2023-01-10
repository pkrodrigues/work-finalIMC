package com.imclpiv.imc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imclpiv.imc.model.Usuario;
import com.imclpiv.imc.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    @Autowired
    private final UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Usuario> list(){
        return usuarioRepository.findAll();
    }
}
