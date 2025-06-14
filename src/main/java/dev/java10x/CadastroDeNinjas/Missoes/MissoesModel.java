package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjass.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "tb_missões")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class MissoesModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private String dificuldade;

    // @OneToMany uma missão pode ter varios ninjas
    @OneToMany(mappedBy = "missoes")
    private NinjaModel ninja;

    public MissoesModel() {
    }


}
