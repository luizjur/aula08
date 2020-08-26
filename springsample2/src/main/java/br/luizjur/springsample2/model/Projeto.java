package br.luizjur.springsample2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "projeto")

public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "idproj")
    private int idp;

    @Column(name = "descrp", length = 50)
    private String descricao;

    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }

    public String getNome() {
        return descricao;
    }

    public void setNome(String descricao) {
        this.descricao = descricao;
    }

}