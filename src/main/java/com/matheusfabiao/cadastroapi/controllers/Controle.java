package com.matheusfabiao.cadastroapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controle {

    //rota inicial
    @GetMapping("/")
    public String mensagem(){
        return "Hello World!";
    }

    @GetMapping("/boasvindas/{nome}")
    public String boasVindas(@PathVariable String nome){
        return "Seja bem-vindo "+nome;
    }
}
