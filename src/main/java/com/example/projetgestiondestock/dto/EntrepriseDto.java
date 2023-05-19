package com.example.projetgestiondestock.dto;

import com.example.projetgestiondestock.model.Adresse;
import com.example.projetgestiondestock.model.Utilisateur;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class EntrepriseDto {
    private Integer id;
    private String nom;
    private String description;
    private AdresseDto adresseDto;
    private String codeFiscal;
    private String photo;
    private String email;
    private String numTel;
    private String siteWeb;
    private List<UtilisateurDto> utilisateursDto;
}
