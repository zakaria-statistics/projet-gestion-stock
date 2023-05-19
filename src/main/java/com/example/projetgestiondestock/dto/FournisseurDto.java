package com.example.projetgestiondestock.dto;

import com.example.projetgestiondestock.model.Adresse;
import com.example.projetgestiondestock.model.CommandeFournisseur;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.OneToMany;

import java.util.List;

public class FournisseurDto {
    private Integer id;
    private String prenom;
    private String nom;
    private AdresseDto adresseDto;
    private String photo;
    private String email;
    private String numTel;
    private List<CommandeFournisseurDto> commandeFournisseursDto;
}
