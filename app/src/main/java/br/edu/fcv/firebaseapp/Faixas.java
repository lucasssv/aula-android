package br.edu.fcv.firebaseapp;

/**
 * Created by Aluno on 19/10/2017.
 */

import com.google.firebase.database.IgnoreExtraProperties;

public class Faixas {
    private String id;
    private String nome;
    private String genero;

    public Faixas() {
    }

    public Faixas(String id, String nome, String genero) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }
}
