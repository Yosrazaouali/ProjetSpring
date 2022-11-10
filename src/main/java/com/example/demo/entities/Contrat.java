package com.example.demo.entities;


import com.example.demo.enums.Specialite;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name="Contrat")
@Entity
public class Contrat implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idContrat")
    private Integer idContrat;


    @Column(name="datedebutcontrat")
    private Date dateDebutContrat;

    @Column(name="datefincontrat")
    private Date dateFinContrat;

    @Column(name="archive")
    private boolean archive;

    @Column(name="montantContrat")
    private Integer montantContrat;

    private Specialite specialitee ;



    public Integer getIdContrat() {
        return idContrat;
    }

    public void setIdContrat(Integer idContrat) {
        this.idContrat = idContrat;
    }

    public Date getDateDebutContrat() {
        return dateDebutContrat;
    }

    public void setDateDebutContrat(Date dateDebutContrat) {
        this.dateDebutContrat = dateDebutContrat;
    }

    public Date getDateFinContrat() {
        return dateFinContrat;
    }

    public void setDateFinContrat(Date dateFinContrat) {
        this.dateFinContrat = dateFinContrat;
    }

    public boolean isArchive() {
        return archive;
    }

    public void setArchive(boolean archive) {
        this.archive = archive;
    }



}



