package br.luizjur.springsample2.dao;

import org.springframework.data.repository.CrudRepository;

import br.luizjur.springsample2.model.Projeto;

public interface ProjetoDAO extends CrudRepository<Projeto, Integer> {
    
}