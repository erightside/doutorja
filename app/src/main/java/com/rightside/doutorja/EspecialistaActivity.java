package com.rightside.doutorja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.rightside.doutorja.adapter.EspecialistaAdapter;
import com.rightside.doutorja.modelo.Especialista;

import java.util.ArrayList;

public class EspecialistaActivity extends AppCompatActivity {


    private Integer especialidadeSelecionada;

    private ArrayList<Especialista> listaDeEspecialista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_especialista);



        especialidadeSelecionada = (Integer) getIntent().getSerializableExtra("Especialista");
        preencheLista();

    }

   private void preencheLista(){

        listaDeEspecialista = new ArrayList<>();

        Especialista clinicoGeral1 ;
        Especialista clinicoGeral2 ;
        Especialista clinicoGeral3 ;
        Especialista clinicoGeral4 ;
        Especialista clinicoGeral5;

        Especialista fisioterapeuta1;
        Especialista fisioterapeuta2;
        Especialista fisioterapeuta3;
        Especialista fisioterapeuta4;
        Especialista fisioterapeuta5;

        Especialista enfermeiro1;
        Especialista enfermeiro2;
        Especialista enfermeiro3;
        Especialista enfermeiro4;
        Especialista enfermeiro5;



       if (especialidadeSelecionada == 0){
           clinicoGeral1 = new Especialista("ANA DEODORA DA SILVA","Rua Itaperuna, 25","Formado em 2010","CRM 0000000000/RJ","(22) 3822-3562",200,R.mipmap.medica);
           listaDeEspecialista.add(clinicoGeral1);
           clinicoGeral2 = new Especialista("CESAR ALBERTO", "Rua Francisco, 255","Formado em 2010","CRM 0000000000/RJ","(22) 3822-3562",15,R.mipmap.medico1);
           listaDeEspecialista.add(clinicoGeral2);
           clinicoGeral3 = new Especialista("GABRIEL BORGES","Rua Joseph, 39","Formado em 2010","CRM 0000000000/RJ","(22) 3822-3562",250,R.mipmap.medico2);
           listaDeEspecialista.add(clinicoGeral3);
           clinicoGeral4 = new Especialista("LIDIA FERNANDES","Avenida Marechal, 12","Formado em 2010","CRM 0000000000/RJ","(22) 3822-3562",210,R.mipmap.medico3);
           listaDeEspecialista.add(clinicoGeral4);
           clinicoGeral5 = new Especialista("VAGNER NASCIMENTO","Rua Linha Amarela","Formado em 2010","CRM 0000000000/RJ","(22) 3822-3562",220,R.mipmap.medico4);
           listaDeEspecialista.add(clinicoGeral5);





       }

       else if(especialidadeSelecionada == 1){
           fisioterapeuta1 = new Especialista("Fisio 1","Crefito1 xxxxx","Formado em 2010","xxxxxx","22222222",200,R.mipmap.pessoa);
           listaDeEspecialista.add(fisioterapeuta1);

           fisioterapeuta2 = new Especialista("Fisio 2", "Crefito2 xxxxx","Formado em 2010","xxxxxx","22222222",200,R.mipmap.pessoa);
           listaDeEspecialista.add(fisioterapeuta2);

           fisioterapeuta3 = new Especialista("Fisio 3","Crefito3 xxxxx","Formado em 2010","xxxxxx","22222222",200,R.mipmap.pessoa);
           listaDeEspecialista.add(fisioterapeuta3);

           fisioterapeuta4 = new Especialista("Fisio 4","Crefito4 xxxxx","Formado em 2010","xxxxxx","22222222",200,R.mipmap.pessoa);
           listaDeEspecialista.add(fisioterapeuta4);

           fisioterapeuta5 = new Especialista("Fisio 4","Crefito4 xxxxx","Formado em 2010","xxxxxx","22222222",200,R.mipmap.pessoa);
           listaDeEspecialista.add(fisioterapeuta5);


       }
       else{
           enfermeiro1 = new Especialista("Enfermeiro 1","Coren1 xxxxx","Formado em 2010","xxxxxx","22222222",200,R.mipmap.pessoa);
           listaDeEspecialista.add(enfermeiro1);
           enfermeiro2 = new Especialista("Enfermeiro 2", "Coren2 xxxxx","Formado em 2010","xxxxxx","22222222",200,R.mipmap.pessoa);
           listaDeEspecialista.add(enfermeiro2);
           enfermeiro3 = new Especialista("Enfermeiro 3","Coren3 xxxxx","Formado em 2010","xxxxxx","22222222",200,R.mipmap.pessoa);
           listaDeEspecialista.add(enfermeiro3);
           enfermeiro4 = new Especialista("Enfermeiro 4","Coren4 xxxxx","Formado em 2010","xxxxxx","22222222",200,R.mipmap.pessoa);
           listaDeEspecialista.add(enfermeiro4);
           enfermeiro5 = new Especialista("Enfermeiro 4","Coren4 xxxxx","Formado em 2010","xxxxxx","22222222",200,R.mipmap.pessoa);
           listaDeEspecialista.add(enfermeiro5);

       }


       RecyclerView medicos = (RecyclerView)findViewById(R.id.recyclerview_especialista_id);


       EspecialistaAdapter especialistaAdapter = new EspecialistaAdapter(this, listaDeEspecialista);

       medicos.setLayoutManager(new LinearLayoutManager(this));

       medicos.setAdapter(especialistaAdapter);


   }



}
