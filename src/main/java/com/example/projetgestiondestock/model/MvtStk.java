package com.example.projetgestiondestock.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "mvtstk")
public class MvtStk extends AbstractEntity{
    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;
    @Column(name = "datemvt")
    private Instant dateMvt;
    @Column(name = "quantite")
    private BigDecimal quantite;
    @Column(name = "typemvtstk")
    private TypeMvtStk typeMvtStk;
}
