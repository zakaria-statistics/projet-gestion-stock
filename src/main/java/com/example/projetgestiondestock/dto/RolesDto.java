package com.example.projetgestiondestock.dto;

import com.example.projetgestiondestock.model.Utilisateur;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class RolesDto {
    private Integer id;
    private String roleName;
    private UtilisateurDto utilisateurDto;
}
