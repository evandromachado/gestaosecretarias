package com.qintess.academia.microservissos.gestaomunicipal.gestaosecretarias.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.qintess.academia.microservissos.gestaomunicipal.gestaosecretarias.enums.Folder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Secretaria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Folder folder;
    
    private String secretary;

    private Double populationGrade;
    private boolean underInvestigation;
    
}
