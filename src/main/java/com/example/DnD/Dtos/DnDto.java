package com.example.DnD.Dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@AllArgsConstructor
@Data
public class DnDto {
    @NotBlank
    private String Name;
    @NotNull
    private int Strength;
    @NotNull
    private int Dexterity;
    @NotNull
    private int Constituition;
    @NotNull
    private int Inteligence;
    @NotNull
    private int Wisdom;
    @NotNull
    private int Charisma;
    @NotNull
    private int ModStrength;
    @NotNull
    private int ModDexterity;
    @NotNull
    private int ModConstituition;
    @NotNull
    private int ModInteligence;
    @NotNull
    private int ModWisdom;
    @NotNull
    private int ModCharisma;



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
