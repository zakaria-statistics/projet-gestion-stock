package com.example.projetgestiondestock.dto;

import com.example.projetgestiondestock.model.Client;
import com.example.projetgestiondestock.model.LigneCommandeClient;
import lombok.Builder;
import lombok.Data;


import java.time.Instant;
import java.util.List;
@Data
@Builder
public class CommandeClientDto {
    private Integer id;
    private String code;
    private Instant dateCommande;
    private ClientDto clientDto;
    private List<LigneCommandeClientDto> lignCommandeClientsDto;
}
