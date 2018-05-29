package com.rightside.doutorja.modelo;

import java.io.Serializable;

public class Usuario implements Serializable{


    private String nome;
    private String email;
    private String dataDeNascimento;
    private String senha;
    private String confirmaSenha;


    public Usuario() {

    }

    public Usuario(String nome, String email, String dataDeNascimento, String senha, String confirmaSenha) {
        this.nome = nome;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
        this.senha = senha;
        this.confirmaSenha = confirmaSenha;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) { this.dataDeNascimento = dataDeNascimento; }

    public String getSenha() { return senha; }

    public void setSenha(String senha) { this.senha = senha; }

    public String getConfirmaSenha() { return confirmaSenha; }

    public void setConfirmaSenha(String confirmaSenha) { this.confirmaSenha = confirmaSenha; }

}


