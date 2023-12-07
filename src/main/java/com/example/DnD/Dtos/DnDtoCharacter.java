package com.example.DnD.Dtos;

        import com.example.DnD.Models.DnDModel;
        import jakarta.validation.constraints.NotBlank;
        import lombok.AllArgsConstructor;
        import lombok.Data;
        import org.jetbrains.annotations.NotNull;

//aqui implementar um dto para o model de personagem e ligar por chave primaria (nome) as duas tabelas(TB_STATS e TB_CHARACTER)
@AllArgsConstructor
@Data
public class DnDtoCharacter {
    @NotBlank
    private String Name;
    @NotBlank
    private String CharacterClass;
    @NotBlank
    private String Race;
    @NotBlank
    private String Alignment;
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
