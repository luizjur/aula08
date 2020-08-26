package br.luizjur.springsample2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.luizjur.springsample2.dao.DepartamentoDAO;
import br.luizjur.springsample2.model.Departamento;
// import org.springframework.web.bind.annotation.RequestParam;

@RestController
@CrossOrigin("*")
public class DepartamentoController {

    @Autowired // este cara vai fazer o new tipo dao = new
    private DepartamentoDAO dao;

    // metodos que vão aceitar pedidos, cada pergunta que eu quiser responder

    @GetMapping("/departamentos")
    public List<Departamento> getDepartamentos() { // getDepartamentos poderia ser qualquer nome
        List<Departamento> lista = (List<Departamento>) dao.findAll(); // veja "casting"
        // List é tipo um arraylist , que eu vou carregar com todos os dados do
        // departamento.
        return lista;
    }

    @GetMapping("/departamento/{cod}")
    public ResponseEntity <Departamento> finDepartamento(@PathVariable int cod) {
        Departamento depto = dao.findById(cod).orElse(null);
        if (depto != null) {
            return ResponseEntity.ok(depto);
        }
        return ResponseEntity.status(404).build();
    }

}