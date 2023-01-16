package com.imclpiv.imc.model;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
// @AllArgsConstructor
// @NoArgsConstructor
@Entity
public class Imc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idImc;
    private float altura;
    private float peso;
    private String sexo;
    private float resultCalculo;
    private String classificacao;
    @ManyToOne
    @JoinColumn(name="id_usuario")
    private Usuario usuario;
}
