package com.urerp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by samuel on 07/08/16.
 */
@Entity
public class Reglement implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String numero;
    private Double montant;
    private Date dateReglement;

    public Reglement() {
    }

    public Reglement(String numero, Double montant, Date dateReglement) {
        this.numero = numero;
        this.montant = montant;
        this.dateReglement = dateReglement;
    }

    public Reglement(Long id, String numero, Double montant, Date dateReglement) {
        this.id = id;
        this.numero = numero;
        this.montant = montant;
        this.dateReglement = dateReglement;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public Date getDateReglement() {
        return dateReglement;
    }

    public void setDateReglement(Date dateReglement) {
        this.dateReglement = dateReglement;
    }
}
