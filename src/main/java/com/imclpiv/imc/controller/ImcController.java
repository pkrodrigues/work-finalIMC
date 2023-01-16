package com.imclpiv.imc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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

    @GetMapping("/{id}")
    public ResponseEntity<Imc> findByImcId(@PathVariable Long id) {
        return imcRepository.findById(id)
        .map(record -> ResponseEntity.ok().body(record))
        .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    // @ApiOperation("Salva um novo cargo")
    // @ApiResponses({
    //         @ApiResponse(code = 201, message = "Imc salvo com sucesso"),
    //         @ApiResponse(code = 400, message = "Erro ao salvar o imc")
    // })
    public void createImc(@RequestBody Imc imc){
        imcRepository.save(imc);
    }

    
    // @PutMapping
    // public void updateImc(@ResquestBody Imc imc){
    //     imcRepository.save(imc);
    // }


}

