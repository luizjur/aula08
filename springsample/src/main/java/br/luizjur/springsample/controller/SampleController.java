package br.luizjur.springsample.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// como o nome diz este arquivo é um controller
//localhost:8080/sample/hello

@RestController
@CrossOrigin("*") // aceita pedidos de qualquer origem
@RequestMapping("/sample")  // rota para esta classe
public class SampleController {

    //criar metodos que vão atender minhas requisições
    // o metodo precisa ser chamado para ser executado

    @GetMapping("hello") // rota para este metodo
    public ResponseEntity<String> ola(){  // <String> é porque abaixo eu estou mandando um texto.
    return ResponseEntity.ok("Hello! Meu primeiro Spring Boot");
    }


    
}