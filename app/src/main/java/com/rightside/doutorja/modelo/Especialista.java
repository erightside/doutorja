package com.rightside.doutorja.modelo;

public class Especialista {

    private String nome;



    private String enderecoEspecialista;

    private String anoDeFormacao;

    private String registroProfissional;

    private String telefone;

    private double valorDoAtendimento;

    private int imagemPerfil;


    public Especialista(String nome,String enderecoEspecialista, String anoDeFormacao, String registroProfissional,String telefone, double valorDoAtendimento, int imagemPerfil) {
        this.nome = nome;
        this.registroProfissional = registroProfissional;
        this.anoDeFormacao = anoDeFormacao;
        this.enderecoEspecialista = enderecoEspecialista;
        this.telefone = telefone;
        this.valorDoAtendimento = valorDoAtendimento;
        this.imagemPerfil = imagemPerfil;
    }
    public String getEnderecoEspecialista() {
        return enderecoEspecialista;
    }

    public void setEnderecoEspecialista(String enderecoEspecialista) {
        this.enderecoEspecialista = enderecoEspecialista;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public String getAnoDeFormacao() {
        return anoDeFormacao;
    }

    public void setAnoDeFormacao(String anoDeFormacao) {
        this.anoDeFormacao = anoDeFormacao;
    }

    public String getTelefone() { return telefone; }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getValorDoAtendimento() {
        return valorDoAtendimento;
    }

    public void setValorDoAtendimento(double valorDoAtendimento) {
        this.valorDoAtendimento = valorDoAtendimento;
    }

    public int getImagemPerfil() {
        return imagemPerfil;
    }

    public void setImagemPerfil(int imagemPerfil) {

        this.imagemPerfil = imagemPerfil;
    }
}




