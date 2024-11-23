package com.example.pharmaplus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pharmaplus.entities.Commande;
import com.example.pharmaplus.repos.CommandeRepository;

@Service
public class CommandeServiceImpl implements CommandeService {

    @Autowired
    private CommandeRepository commandeRepository;

    @Override
    public Commande saveCommande(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public Commande updateCommande(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public void deleteCommande(Commande commande) {
        commandeRepository.delete(commande);
    }

    @Override
    public void deleteCommandeById(Long id) {
        commandeRepository.deleteById(id);
    }

    @Override
    public List<Commande> getAllCommandes() {
        return commandeRepository.findAll();
    }

    @Override
    public Commande getCommande(Long id) {
        return commandeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Commande> findByClientNom(String nom) {
        return commandeRepository.findByNomClient(nom);
    }

    @Override
    public List<Commande> trierCommandesParDate() {
        return commandeRepository.trierCommandesParDateDesc();
    }

    @Override
    public List<Commande> findByOrderByDateCommandeAsc() {
        return commandeRepository.findByOrderByDateCommandeAsc();
    }
}