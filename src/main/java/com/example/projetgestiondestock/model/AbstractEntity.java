package com.example.projetgestiondestock.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.Instant;

@Data
@MappedSuperclass()
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    @CreatedDate
    @JsonIgnore
    @Column(name = "creationDate", nullable = false)
    private Instant creationDate;
    @LastModifiedDate
    @JsonIgnore
    @Column(name = "lastModifiedDate", nullable = false)
    private Instant lastModifiedDate;
}
