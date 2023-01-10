package com.imclpiv.imc.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Imc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idImc;
    private float peso;
    private float altura;
    private Boolean sexo;
}
