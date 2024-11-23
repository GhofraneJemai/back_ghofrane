package com.example.pharmaplus.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pharmaplus.entities.Commande;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "commandes") // Expose l'API à l'URL '/commandes'
public interface CommandeRepository extends JpaRepository<Commande, Long> {

    // Recherche de commandes par le nom du client
	List<Commande> findByNomClient(String nomClient);

    // Recherche de commandes dont le nom du client contient un certain texte
    List<Commande> findByNomClientContains(String nomClient);

    // Recherche de commandes triées par date de commande croissante
    List<Commande> findByOrderByDateCommandeAsc();

    // Requête personnalisée pour trier les commandes par montant total
    @Query("select c from Commande c order by c.montantTotal ASC")
    List<Commande> trierCommandesParMontant();

    // Requête personnalisée pour trier les commandes par date de commande décroissante
    @Query("select c from Commande c order by c.dateCommande DESC")
    List<Commande> trierCommandesParDateDesc();
}