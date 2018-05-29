package com.rightside.doutorja.modelo;

import java.util.Calendar;

public class Hora {



    private Integer id;

    private boolean marcado;

    private String tempo;

    public Hora(boolean marcado, String tempo,Integer id) {
        this.marcado = marcado;
        this.tempo = tempo;
        this.id = id;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public boolean isMarcado() {
        return marcado;
    }

    public void setMarcado(boolean marcado) {
        this.marcado = marcado;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public void exibeHora(){
        Calendar calendar =  Calendar.getInstance();

    }
}
