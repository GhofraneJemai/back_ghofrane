package com.example.pharmaplus.restconrollers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pharmaplus.entities.Commande;
import com.example.pharmaplus.service.CommandeService;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200") // Permet la communication avec l'application front-end Angular

public class CommandeRestController {
    
    @Autowired
    CommandeService commandeService;
    
    // Récupère toutes les commandes
    @RequestMapping(method=RequestMethod.GET)
    public List<Commande> getAllCommandes() {
        return commandeService.getAllCommandes();
    }
    
    // Récupère une commande par son ID
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Commande getCommandeById(@PathVariable("id") Long id) {
        return commandeService.getCommande(id);
    }
    
    // Met à jour une commande existante
    @RequestMapping(value="/{id}", method = RequestMethod.PUT)
    public Commande updateCommande(@PathVariable("id") Long id, @RequestBody Commande commande) {
        commande.setId(id); // S'assurer que l'ID de la commande soit bien celui passé dans l'URL
        return commandeService.updateCommande(commande);
    }
    
    // Crée une nouvelle commande
    @RequestMapping(method = RequestMethod.POST)
    public Commande createCommande(@RequestBody Commande commande) {
        return commandeService.saveCommande(commande);
    }
    
    // Supprime une commande par son ID
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public void deleteCommande(@PathVariable("id") Long id) {
        commandeService.deleteCommandeById(id);
    }
}
