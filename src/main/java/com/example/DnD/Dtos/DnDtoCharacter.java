package com.example.DnD.Dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

//aqui implementar um dto para o model de personagem e ligar por chave primaria (nome) as duas tabelas(TB_STATS e TB_CHARACTER)
public class DnDtoCharacter {
    @NotBlank
    private String Name;
    @NotBlank
    private String Class;
    @NotBlank
    private String Race;
    @NotBlank
    private String Alignment;
    @NotNull
    private int LifePoints;
}
