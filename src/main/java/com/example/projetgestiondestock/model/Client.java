package com.example.projetgestiondestock.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "client")
public class Client extends AbstractEntity{
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "nom")
    private String nom;
    @Embedded
    private Adresse adresse;
    @Column(name = "photo")
    private String photo;
    @Column(name = "email")
    private String email;
    @Column(name = "numtel")
    private String numTel;
    @OneToMany(mappedBy="client")
    private List<CommandeClient> commandeClients;
}
