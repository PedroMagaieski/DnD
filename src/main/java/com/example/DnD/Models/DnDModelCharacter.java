package com.example.DnD.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

@Entity
@Table(name="TB_CHARACTER")
public class DnDModelCharacter{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable=false, name="Name")
    @NotBlank
    private String Name;
    @Column(nullable=false, name="CharacterClass")
    @NotBlank
    private String CharacterClass;
    @Column(nullable=false, name="Race")
    @NotBlank
    private String Race;
    @Column(nullable=false, name="Alignment")
    @NotBlank
    private String Alignment;
    @Column(nullable=false, name="LifePoints")
    @NotNull
    private int LifePoints;


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCharacterClass() {
        return CharacterClass;
    }

    public void setCharacterClass(String characterClass) {
        CharacterClass = characterClass;
    }

    public String getRace() {
        return Race;
    }

    public void setRace(String race) {
        Race = race;
    }

    public String getAlignment() {
        return Alignment;
    }

    public void setAlignment(String alignment) {
        Alignment = alignment;
    }

    public int getLifePoints() {
        return LifePoints;
    }

    public void setLifePoints(int lifePoints) {
        LifePoints = lifePoints;
    }


}
