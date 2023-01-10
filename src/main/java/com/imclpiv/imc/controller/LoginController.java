package com.imclpiv.imc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imclpiv.imc.repository.LoginRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/login")
@RequiredArgsConstructor
public class LoginController {
    @Autowired
    private final LoginRepository loginRepository;
}
