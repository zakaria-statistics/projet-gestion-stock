package com.example.projetgestiondestock.dto;

import jakarta.persistence.Column;

import java.time.Instant;

public class VentesDto {
    private Integer id;
    private String code;
    private Instant dateVente;
    private String commentaire;
}
