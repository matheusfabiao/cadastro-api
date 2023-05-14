package com.matheusfabiao.cadastroapi.controllers.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "pessoas")
public class Pessoa {

    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column
    private String nome;

    @Column
    private int idade;

}
