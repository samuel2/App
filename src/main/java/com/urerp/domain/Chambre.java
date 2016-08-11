package com.urerp.domain;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by samuel on 07/08/16.
 */
@Entity
public class Chambre implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Cette valeur est obligatoire")
    private String libelle;
    private String type;
    private String position;
    private Double prix;

    public Chambre() {
    }

    public Chambre(String libelle, String type, String position, Double prix) {
        this.libelle = libelle;
        this.type = type;
        this.position = position;
        this.prix = prix;
    }

    public Chambre(Long id, String libelle, String type, String position, Double prix) {
        this.id = id;
        this.libelle = libelle;
        this.type = type;
        this.position = position;
        this.prix = prix;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }
}
