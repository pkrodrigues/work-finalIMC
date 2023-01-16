package com.imclpiv.imc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void create(@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);
        // return ResponseEntity.status(HttpStatus.CREATED)
        // .body(usuarioRepository.save(usuario));
    }
}
