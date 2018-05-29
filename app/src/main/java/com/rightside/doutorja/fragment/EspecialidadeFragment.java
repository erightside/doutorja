package com.rightside.doutorja.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rightside.doutorja.R;
import com.rightside.doutorja.adapter.EspecialidadeAdapter;
import com.rightside.doutorja.modelo.Especialidade;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EspecialidadeFragment extends Fragment {

    ArrayList<Especialidade> especialidadeList;


    public EspecialidadeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = LayoutInflater.from(getActivity()).inflate(R.layout.fragment_especialidade, container, false);

        especialidadeList = new ArrayList<>();

        especialidadeList.add(new Especialidade("CLÍNICO GERAL",R.mipmap.clinicogeral,1));

        especialidadeList.add(new Especialidade("FISIOTERAPEUTA",R.mipmap.fisio,2));

        especialidadeList.add(new Especialidade("ENFERMAGEM",R.mipmap.enfermeiro,3));


         RecyclerView especialidades = (RecyclerView) view.findViewById(R.id.recyclerview_especialidade_id);

         EspecialidadeAdapter especialidadeAdapter = new EspecialidadeAdapter(getActivity(),especialidadeList);

         especialidades.setLayoutManager(new LinearLayoutManager(getActivity()));

         especialidades.setAdapter(especialidadeAdapter);

         return view;

    }

}
