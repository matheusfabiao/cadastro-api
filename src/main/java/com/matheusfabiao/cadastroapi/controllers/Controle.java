package com.matheusfabiao.cadastroapi.controllers;

import com.matheusfabiao.cadastroapi.controllers.models.Pessoa;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/pessoa")
    @ResponseStatus(HttpStatus.CREATED)
    public Pessoa pessoa(@RequestBody Pessoa pessoa){
        return pessoa;
    }
}
