package com.example.projetgestiondestock.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "lignecommandeclient")
public class LigneCommandeClient extends AbstractEntity{
    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;
    @ManyToOne
    @JoinColumn(name = "commande_client_id")
    private CommandeClient commandeClient;
    @Column(name = "prixunitaire")
    private BigDecimal prixUnitaire;
    @Column(name = "quantite")
    private BigDecimal quantite;
}
