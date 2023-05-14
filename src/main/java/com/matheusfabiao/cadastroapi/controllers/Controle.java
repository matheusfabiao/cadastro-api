package com.matheusfabiao.cadastroapi.controllers;

import com.matheusfabiao.cadastroapi.controllers.models.Pessoa;
import com.matheusfabiao.cadastroapi.repositories.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controle {

    @Autowired
    private Repositorio acao;

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

    @PostMapping("/cadastro")
    @ResponseStatus(HttpStatus.CREATED)
    public Pessoa cadastrar(@RequestBody Pessoa pessoa){
        return acao.save(pessoa);
    }

    @GetMapping("/listar")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Pessoa> selecionar(){
        return acao.findAll();
    }

    @GetMapping("/listar/{codigo}")
    @ResponseStatus(HttpStatus.FOUND)
    public Pessoa selecionarPeloCodigo(@PathVariable Integer codigo){
        return acao.findByCodigo(codigo);
    }
}
