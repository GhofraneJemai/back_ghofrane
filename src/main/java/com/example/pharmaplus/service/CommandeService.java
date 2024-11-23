package com.example.pharmaplus.service;

import java.util.List;

import com.example.pharmaplus.entities.Commande;

public interface CommandeService {
	 Commande saveCommande(Commande commande);

	    // Méthode pour mettre à jour une commande
	    Commande updateCommande(Commande commande);

	    // Méthode pour supprimer une commande
	    void deleteCommande(Commande commande);

	    // Méthode pour supprimer une commande par ID
	    void deleteCommandeById(Long id);

	    // Méthode pour récupérer toutes les commandes
	    List<Commande> getAllCommandes();

	    // Méthode pour trouver une commande par son ID
	    Commande getCommande(Long id);

	    // Méthode pour trouver les commandes par un critère, ici par exemple un nom de client (ou tout autre critère spécifique)
	    List<Commande> findByClientNom(String nom);

	    // Méthode pour trier les commandes par date (ou tout autre critère)
	    List<Commande> trierCommandesParDate();

	    // Méthode pour récupérer une liste de commandes triées par un autre critère (ex : montant total)
	    List<Commande> findByOrderByDateCommandeAsc();

}
