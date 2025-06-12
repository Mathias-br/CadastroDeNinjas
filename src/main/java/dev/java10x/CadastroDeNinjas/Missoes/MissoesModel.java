package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjass.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table (name = "tb_missões")
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

    public MissoesModel(long id, String nome, String dificuldade, NinjaModel ninja) {
        this.id = id;
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.ninja = ninja;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public NinjaModel getNinja() {
        return ninja;
    }

    public void setNinja(NinjaModel ninja) {
        this.ninja = ninja;
    }
}
