package com.rightside.doutorja.modelo;

import java.io.Serializable;

public class Especialidade implements Serializable {

    private String nome;

    private int imagem;

    private int idEspecialidade;

    public Especialidade(String nome, int imagem, int idEspecialidade) {
        this.nome = nome;
        this.imagem = imagem;
        this.idEspecialidade = idEspecialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public int getIdEspecialidade() {
        return idEspecialidade;
    }

    public void setIdEspecialidade(int idEspecialidade) {
        this.idEspecialidade = idEspecialidade;
    }
}
