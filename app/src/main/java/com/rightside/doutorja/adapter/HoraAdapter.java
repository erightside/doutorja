package com.rightside.doutorja.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.rightside.doutorja.R;
import com.rightside.doutorja.modelo.Hora;

import java.util.ArrayList;

public class HoraAdapter extends RecyclerView.Adapter<HoraAdapter.MyViewHolder>{

    private Context context;

    private ArrayList<Hora> listaDeHora;

    public HoraAdapter(Context context, ArrayList<Hora> listaDeHora) {
        this.context = context;
        this.listaDeHora = listaDeHora;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.cardview_item_hora,parent,false);

        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder,  int position) {
       final Hora hora =listaDeHora.get(position);
       holder.horaEscolhida.setText(listaDeHora.get(position).getTempo());

    }

    @Override
    public int getItemCount() {
        return listaDeHora.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView horaEscolhida;
        CardView cardViewHoraEscolhida;

        public MyViewHolder(View itemView){
            super(itemView);

            horaEscolhida = itemView.findViewById(R.id.hora_id);
            cardViewHoraEscolhida = itemView.findViewById(R.id.cardview_hora_id);



        }
    }




}
