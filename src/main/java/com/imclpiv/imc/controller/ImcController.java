package com.imclpiv.imc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    public void createImc(@RequestBody Imc imc){
        imcRepository.save(imc);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Imc> aletrar(@PathVariable("id") Long id, @RequestBody Imc imc) {
        return imcRepository.findById(id)
        .map(recordFound -> {
            recordFound.setAltura(imc.getAltura());
            recordFound.setPeso(imc.getPeso());
            recordFound.setSexo(imc.getSexo());
            recordFound.setResultCalculo(imc.getResultCalculo());
            recordFound.setClassificacao(imc.getClassificacao());
            recordFound.setUsuario(imc.getUsuario());
            Imc updated = imcRepository.save(recordFound);
            return ResponseEntity.ok().body(updated);
        })
        .orElse(ResponseEntity.notFound().build());
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        return imcRepository.findById(id)
            .map(recordFound -> {
                imcRepository.deleteById(id);
                return ResponseEntity.noContent().<Void>build();
            })  
            .orElse(ResponseEntity.notFound().build());
    }

    // public String calculaImc(float altura, float peso, float) {
    //     String resultado;
    //     double imc = p.getImc();
    //     if (p.getSexo()){
    //         if( imc < 20.7){
    //             resultado="abaixo do peso";
    //         }else if( imc < 26.4){
    //             resultado= "peso normal";
    //         }else if(imc <  27.8){
    //             resultado= "marginalmente acima do peso";
    //         }else if(imc < 31.1){
    //             resultado= "acima do peso ideal";
    //         }else{
    //             resultado= "Obeso";
    //         }
    //     }else{
    //         if( imc < 19.1){
    //             resultado= "abaixo do peso";
    //         }else if( imc < 25.8){
    //             resultado= "peso normal";
    //         }else if(imc < 27.3){
    //             resultado= "marginalmente acima do peso";
    //         }else if(imc < 32.3){
    //             resultado= "acima do peso ideal";
    //         }else{
    //             resultado="Obeso";
    //         }
    //     }
    //     return resultado;
    // }

}

