package com.example.projetgestiondestock.dto;

import com.example.projetgestiondestock.model.Adresse;
import lombok.Builder;
import lombok.Data;

import java.util.List;
@Data
@Builder
public class ClientDto {
    private Integer id;
    private String prenom;
    private String nom;
    private AdresseDto adresseDto;
    private String photo;
    private String email;
    private String numTel;
    private List<CommandeClientDto> commandeClientsDto;
}
