package dev.java10x.CadastroDeNinjas.Ninjass;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//TODO JPA = Java Persiste API

@Table(name = "tb_cadastro")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "idade")
    private int idade;

    // @ManyToOne  um ninja tem uma unica missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // foreina Key ou chave estrangeira
    private MissoesModel missoes;

    //private List<MissoesModel> missoes;


}
