package com.example.demo.entities;


import com.example.demo.enums.Niveau;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Equipe")
public class Equipe implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEquipe")
    private Integer idEquipe;

    @Column(name = "nomEquipe")
    private String nomEquipe;

    private Niveau niveau;



    public Integer getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(Integer idEquipe) {
        this.idEquipe = idEquipe;
    }

    public String getNomEquipe() {
        return nomEquipe;
    }

    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }





}