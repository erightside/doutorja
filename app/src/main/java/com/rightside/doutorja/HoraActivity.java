package com.rightside.doutorja;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toast;

import com.rightside.doutorja.adapter.HoraAdapter;
import com.rightside.doutorja.modelo.Hora;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

public class HoraActivity extends AppCompatActivity {

    private ArrayList<Hora> listaDeHora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hora);

        listaDeHora = new ArrayList<>();

        listaDeHora.add(new Hora(false,"8:00hs",0));
        listaDeHora.add(new Hora(false,"9:00hs",1));
        listaDeHora.add(new Hora(false,"10:00hs",2));
        listaDeHora.add(new Hora(false,"11:00hs",3));
        listaDeHora.add(new Hora(false,"13:00hs",4));
        listaDeHora.add(new Hora(false,"14:00hs",5));
        listaDeHora.add(new Hora(false,"15:00hs",6));
        listaDeHora.add(new Hora(false,"16:00hs",7));
        listaDeHora.add(new Hora(false,"17:00hs",8));
        listaDeHora.add(new Hora(false,"18:00hs",9));



        RecyclerView horas = (RecyclerView) findViewById(R.id.recyclerview_hora_id);

        HoraAdapter horaAdapter = new HoraAdapter(this,listaDeHora);

        horas.setLayoutManager(new LinearLayoutManager(this));

        horas.setAdapter(horaAdapter);



    }

}
