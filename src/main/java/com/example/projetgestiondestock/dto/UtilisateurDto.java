package com.example.projetgestiondestock.dto;

import com.example.projetgestiondestock.model.Adresse;
import com.example.projetgestiondestock.model.Entreprise;
import com.example.projetgestiondestock.model.Roles;
import jakarta.persistence.*;

import java.time.Instant;
import java.util.List;

public class UtilisateurDto {
    private Integer id;
    private String nom;
    private String prenom;
    private String email;
    private Instant dateDeNaissance;
    private String motDePasse;
    private AdresseDto adresseDto;
    private String photo;
    private EntrepriseDto entrepriseDto;
    private List<RolesDto> rolesDto;
}
