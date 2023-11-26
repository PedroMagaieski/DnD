package com.example.DnD.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.io.Serializable;
//import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name ="TB_FICHA")
public class DnDModel implements Serializable {
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


}
