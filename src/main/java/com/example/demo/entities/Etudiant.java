package com.example.demo.entities;



import com.example.demo.enums.Option;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;




@Entity
@Table(name = "Etudiant")

public class Etudiant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEtudiant")
    private Integer idEtudiant ;
    @Column(name = "prenomE")
    private String prenomE;
    @Column(name = "NomE")
    private String NomE;
    @Column(name = "datedebut")
    private Date datedebut;



    public Integer getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(Integer idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public String getPrenomE() {
        return prenomE;
    }

    public void setPrenomE(String prenomE) {
        this.prenomE = prenomE;
    }

    public String getNomE() {
        return NomE;
    }

    public void setNomE(String nomE) {
        this.NomE = NomE;
    }

    public Date getDateDebut() {
        return datedebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.datedebut = dateDebut;
    }

    private Option options;





}