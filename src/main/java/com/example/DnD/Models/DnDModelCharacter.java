package com.example.DnD.Models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name="TB_CHARACTER")
public class DnDModelCharacter implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable=false)
    private String Name;
    @Column(nullable=false)
    private String Class;
    @Column(nullable=false)
    private String Race;
    @Column(nullable=false)
    private String Alignment;
    @Column(nullable=false)
    private int LifePoints;

}
