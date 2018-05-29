package com.rightside.doutorja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import org.w3c.dom.Text;

public class EspecialistaEscolhidoActivity extends AppCompatActivity {

    private TextView nomeEspecialistaEscolhido;

    private TextView regitroEspecialistaEscolhido;

    private TextView enderecoEspecialistaEscolhido;

    private TextView anoFormacaoEspecialistaEscolhido;

    private TextView telefoneEspecialistaEscolhido;

    private ImageView imagemEspecialistaEscolhido;

    private TextView valorAtendimento;

    private Button buttonMarqueAqui;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_especialista_escolhido);

        nomeEspecialistaEscolhido = findViewById(R.id.especialista_nome_id);
        regitroEspecialistaEscolhido = findViewById(R.id.especialista_registro_profissional_id);
        enderecoEspecialistaEscolhido = findViewById(R.id.especialista_endereco_id);
        anoFormacaoEspecialistaEscolhido = findViewById(R.id.especialista_ano_formacao_id);
        telefoneEspecialistaEscolhido = findViewById(R.id.especialista_telefone_id);
        imagemEspecialistaEscolhido =(ImageView) findViewById(R.id.especialista_imagem_id);
        valorAtendimento = (TextView) findViewById(R.id.especialista_valor_atendimento_id);
        buttonMarqueAqui = findViewById(R.id.buton_marcar_atendimento_id);

        buttonMarqueAqui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(EspecialistaEscolhidoActivity.this, LoginActivity.class));
            }
        });


        Intent intencao = getIntent();

        String nome = intencao.getExtras().getString("Nome");
        String registroProfissional = intencao.getExtras().getString("Registro");
        String endereco = intencao.getExtras().getString("Endereço");
        String anoFormacao = intencao.getExtras().getString("Ano de Formação");
        String telefone = intencao.getExtras().getString("Telefone");


        int imagem = intencao.getExtras().getInt("Imagem");

        double valor = intencao.getExtras().getDouble("Valor");


        String valorConvertido = String.valueOf(valor);


        nomeEspecialistaEscolhido.setText(nome);
        regitroEspecialistaEscolhido.setText(registroProfissional);
        enderecoEspecialistaEscolhido.setText(endereco);
        anoFormacaoEspecialistaEscolhido.setText(anoFormacao);
        telefoneEspecialistaEscolhido.setText(telefone);
        imagemEspecialistaEscolhido.setImageResource(imagem);
        valorAtendimento.setText("Valor do Atendimento "+valorConvertido);






    }
}
