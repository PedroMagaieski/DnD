package com.example.DnD.Models;

import com.example.DnD.Dtos.DnDtoCharacter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
//import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name ="TB_STATS")
public class DnDModel implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable=false)
    private int Strength;
    @Column(nullable=false)
    private int Dexterity;
    @Column(nullable=false)
    private int Constituition;
    @Column(nullable=false)
    private int Inteligence;
    @Column(nullable=false)
    private int Wisdom;
    @Column(nullable=false)
    private int Charisma;
    @Column(nullable=false)
    private int ModStrength;
    @Column(nullable=false)
    private int ModDexterity;
    @Column(nullable=false)
    private int ModConstituition;
    @Column(nullable=false)
    private int ModInteligence;
    @Column(nullable=false)
    private int ModWisdom;
    @Column(nullable=false)
    private int ModCharisma;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "character_id")
    private DnDModelCharacter Character;
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getStrength() {
        return Strength;
    }

    public void setStrength(int str) {
        Strength = str;
    }

    public int getDexterity() {
        return Dexterity;
    }

    public void setDexterity(int dex) {
        Dexterity = dex;
    }

    public int getConstituition() {
        return Constituition;
    }

    public void setConstituition(int con) {
        Constituition = con;
    }

    public int getInteligence() {
        return Inteligence;
    }

    public void setInteligence(int anInteligence) {
        Inteligence = anInteligence;
    }

    public int getWisdom() {
        return Wisdom;
    }

    public void setWisdom(int wis) {
        Wisdom = wis;
    }

    public int getCharisma() {
        return Charisma;
    }

    public void setCharisma(int aCharisma) {
        Charisma = aCharisma;
    }

    public int getModStrength() {
        return ModStrength;
    }

    public void setModStrength(int modStrength) {
        ModStrength = modStrength;
    }

    public int getModDexterity() {
        return ModDexterity;
    }

    public void setModDexterity(int modDexterity) {
        ModDexterity = modDexterity;
    }

    public int getModConstituition() {
        return ModConstituition;
    }

    public void setModConstituition(int modConstituition) {
        ModConstituition = modConstituition;
    }

    public int getModInteligence() {
        return ModInteligence;
    }

    public void setModInteligence(int modInteligence) {
        ModInteligence = modInteligence;
    }

    public int getModWisdom() {
        return ModWisdom;
    }

    public void setModWisdom(int modWisdom) {
        ModWisdom = modWisdom;
    }

    public int getModCharisma() {
        return ModCharisma;
    }

    public void setModCharisma(int modCharisma) {
        ModCharisma = modCharisma;
    }

    public DnDModelCharacter getCharacter() {
        return Character;
    }

    public void setCharacter(DnDModelCharacter character) {
        Character = character;
    }
}
