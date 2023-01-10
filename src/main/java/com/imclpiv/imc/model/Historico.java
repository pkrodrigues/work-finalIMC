package com.imclpiv.imc.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Historico {
    private Imc imc;
}
