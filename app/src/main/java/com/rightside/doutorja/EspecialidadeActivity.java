package com.rightside.doutorja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.rightside.doutorja.adapter.EspecialidadeAdapter;
import com.rightside.doutorja.modelo.Especialidade;

import java.util.ArrayList;


public class EspecialidadeActivity extends AppCompatActivity {

    ArrayList<Especialidade> especialidadeList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_especialidade);

        especialidadeList = new ArrayList<>();

        especialidadeList.add(new Especialidade("CLÍNICO GERAL",R.mipmap.clinicogeral,1));

        especialidadeList.add(new Especialidade("FISIOTERAPEUTA",R.mipmap.fisio,2));

        especialidadeList.add(new Especialidade("ENFERMAGEM",R.mipmap.enfermeiro,3));


        RecyclerView especialidades = (RecyclerView) findViewById(R.id.recyclerview_especialidade_id);

        EspecialidadeAdapter especialidadeAdapter = new EspecialidadeAdapter(this,especialidadeList);

        especialidades.setLayoutManager(new LinearLayoutManager(this));

        especialidades.setAdapter(especialidadeAdapter);



    }



}
