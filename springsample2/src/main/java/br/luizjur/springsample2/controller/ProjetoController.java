package br.luizjur.springsample2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.luizjur.springsample2.dao.ProjetoDAO;
import br.luizjur.springsample2.model.Projeto;

@RestController
@CrossOrigin("*")
public class ProjetoController {

    @Autowired // este cara vai fazer o new tipo daop = new
    private ProjetoDAO daop;

    @GetMapping("/projetos")
    public List<Projeto> getProjetos() { // getProjetos poderia ser qualquer nome
        List<Projeto> listap = (List<Projeto>) daop.findAll(); // veja "casting"
        // List é tipo um arraylist , que eu vou carregar com todos os dados do
        // departamento.
        return listap;
    }

    @GetMapping("/projeto/{cod2}")
    public ResponseEntity <Projeto> finProjeto(@PathVariable int cod2) {
        Projeto proj = daop.findById(cod2).orElse(null);
        if (proj != null) {
            return ResponseEntity.ok(proj);
        }
        return ResponseEntity.status(404).build();
    }
    
}