package br.luizjur.springsample2.dao;

import org.springframework.data.repository.CrudRepository;

import br.luizjur.springsample2.model.Departamento;

// uma clsse interface é parecida com uma clsse abstrata
// CrudRepository já vem pronto

public interface DepartamentoDAO extends CrudRepository<Departamento, Integer> {  
    
}