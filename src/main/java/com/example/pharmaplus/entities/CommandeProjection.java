package com.example.pharmaplus.entities;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "commandeProjection", types = { Commande.class })
public interface CommandeProjection {
	public String getNomClient(); // Nom du client
    public Double getMontantTotal(); // Montant total de la commande
    public String getNomMedicament(); // Nom du médicament
    public Integer getQuantite(); // Quantité de médicaments commandée
    public String getDateCommande();

}
