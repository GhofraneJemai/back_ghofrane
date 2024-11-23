package com.example.pharmaplus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.example.pharmaplus.entities.Commande;

@SpringBootApplication
public class PharmaplusApplication implements CommandLineRunner {

    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(PharmaplusApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Expose the ID for the Commande entity
        repositoryRestConfiguration.exposeIdsFor(Commande.class);
    }
}
