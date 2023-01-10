package com.imclpiv.imc.model;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long IdLogin;
    private String userName;
    private String senha;

}
