package com.matheusfabiao.cadastroapi.controllers.models;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Pessoa {

    //atributos
    private String nome;
    private int idade;

}
