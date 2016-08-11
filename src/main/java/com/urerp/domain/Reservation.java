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
public class Reservation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String numero;
    private Date dateReservation;
    private Date dateConfirmation;
    private Date dateOccupation;
    private Date dateDepart;
    private Double montant;

    public Reservation() {
    }

    public Reservation(String numero, Date dateReservation, Date dateConfirmation, Date dateOccupation, Date dateDepart, Double montant) {
        this.numero = numero;
        this.dateReservation = dateReservation;
        this.dateConfirmation = dateConfirmation;
        this.dateOccupation = dateOccupation;
        this.dateDepart = dateDepart;
        this.montant = montant;
    }

    public Reservation(Long id, String numero, Date dateReservation, Date dateConfirmation, Date dateOccupation, Date dateDepart, Double montant) {
        this.id = id;
        this.numero = numero;
        this.dateReservation = dateReservation;
        this.dateConfirmation = dateConfirmation;
        this.dateOccupation = dateOccupation;
        this.dateDepart = dateDepart;
        this.montant = montant;
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

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public Date getDateConfirmation() {
        return dateConfirmation;
    }

    public void setDateConfirmation(Date dateConfirmation) {
        this.dateConfirmation = dateConfirmation;
    }

    public Date getDateOccupation() {
        return dateOccupation;
    }

    public void setDateOccupation(Date dateOccupation) {
        this.dateOccupation = dateOccupation;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }
}
