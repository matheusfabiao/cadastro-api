package com.matheusfabiao.cadastroapi.repositories;

import com.matheusfabiao.cadastroapi.controllers.models.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repositorio extends CrudRepository<Pessoa,Integer> {

    List<Pessoa> findAll();

    Pessoa findByCodigo(int codigo);
}
