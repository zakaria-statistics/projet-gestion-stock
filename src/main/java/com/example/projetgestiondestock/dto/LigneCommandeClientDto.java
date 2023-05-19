package com.example.projetgestiondestock.dto;

import com.example.projetgestiondestock.model.Article;
import com.example.projetgestiondestock.model.CommandeClient;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.math.BigDecimal;

public class LigneCommandeClientDto {
    private Integer id;
    private ArticleDto articleDto;
    private CommandeClientDto commandeClientDto;
    private BigDecimal prixUnitaire;
    private BigDecimal quantite;
}
