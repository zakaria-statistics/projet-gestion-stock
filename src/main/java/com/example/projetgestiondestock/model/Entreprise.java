package com.example.projetgestiondestock.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "entreprise")
public class Entreprise extends AbstractEntity{
    @Column(name = "nom")
    private String nom;
    @Column(name = "description")
    private String description;
    @Embedded
    private Adresse adresse;
    @Column(name = "codefiscal")
    private String codeFiscal;
    @Column(name = "photo")
    private String photo;
    @Column(name = "eamil")
    private String email;
    @Column(name = "numtel")
    private String numTel;
    @Column(name = "siteWeb")
    private String siteWeb;
    @OneToMany(mappedBy = "entreprise")
    private List<Utilisateur> utilisateurs;
}
