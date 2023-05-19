package com.example.projetgestiondestock.dto;

import com.example.projetgestiondestock.model.Article;
import com.example.projetgestiondestock.model.TypeMvtStk;
import jakarta.persistence.Column;

import java.math.BigDecimal;
import java.time.Instant;

public class MvtStkDto {
    private Integer id;
    private ArticleDto articleDto;
    private Instant dateMvt;
    private BigDecimal quantite;
    private TypeMvtStk typeMvtStk;
}
