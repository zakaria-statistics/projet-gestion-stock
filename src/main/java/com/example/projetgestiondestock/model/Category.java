package com.example.projetgestiondestock.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@Entity
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "category")
public class Category extends AbstractEntity {
    @Column(name = "code")
    private String code;
    @Column(name = "designation")
    private String designation;
    @OneToMany(mappedBy = "category")
    private List<Article> articles;
}
