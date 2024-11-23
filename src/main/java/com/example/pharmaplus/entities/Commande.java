package com.example.pharmaplus.entities;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Commande {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomClient;
    private String nomMedicament; 
    private double montantTotal;
    private Date dateCommande;
    private int quantite;
    
    
	
	public Commande(String nomClient, String nomMedicament, double montantTotal, Date dateCommande, int quantite) {
		super();
		this.nomClient = nomClient;
		this.nomMedicament = nomMedicament;
		this.montantTotal = montantTotal;
		this.dateCommande = dateCommande;
		this.quantite = quantite;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getNomMedicament() {
		return nomMedicament;
	}
	public void setNomMedicament(String nomMedicament) {
		this.nomMedicament = nomMedicament;
	}
	public double getMontantTotal() {
		return montantTotal;
	}
	public void setMontantTotal(double montantTotal) {
		this.montantTotal = montantTotal;
	}
	public Date getDateCommande() {
		return dateCommande;
	}
	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	@Override
	public String toString() {
		return "Commande [id=" + id + ", nomClient=" + nomClient + ", nomMedicament=" + nomMedicament
				+ ", montantTotal=" + montantTotal + ", dateCommande=" + dateCommande + ", quantite=" + quantite + "]";
	}
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    

}