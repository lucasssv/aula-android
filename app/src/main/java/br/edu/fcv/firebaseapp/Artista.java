package br.edu.fcv.firebaseapp;

/**
 * Created by Aluno on 19/10/2017.
 */

public class Artista {
    private String id;
    private String nome;
    private String genero;

    public Artista(String id, String nome, String genero) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }
}
