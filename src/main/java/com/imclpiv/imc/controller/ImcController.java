package com.imclpiv.imc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imclpiv.imc.model.Imc;
import com.imclpiv.imc.repository.ImcRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/imc")
@RequiredArgsConstructor
public class ImcController {
    @Autowired
    private final ImcRepository imcRepository;
    @GetMapping
    public List<Imc> listImc(){
        return imcRepository.findAll();
    }
}
