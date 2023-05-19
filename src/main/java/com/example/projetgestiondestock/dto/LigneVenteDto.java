package com.example.projetgestiondestock.dto;

import com.example.projetgestiondestock.model.Ventes;
import jakarta.persistence.Column;

import java.math.BigDecimal;

public class LigneVenteDto {
    private Integer id;
    private VentesDto ventesDto;
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;
}
