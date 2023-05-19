package com.example.projetgestiondestock.dto;

import com.example.projetgestiondestock.model.Article;
import com.example.projetgestiondestock.model.CommandeFournisseur;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.math.BigDecimal;

public class LigneCommandeFournisseurDto {
    private Integer id;
    private ArticleDto articleDto;
    private CommandeFournisseurDto commandeFournisseurDto;
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;
}
