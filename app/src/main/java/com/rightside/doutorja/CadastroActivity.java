package com.rightside.doutorja;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.rightside.doutorja.modelo.Usuario;


public class CadastroActivity extends AppCompatActivity {

    private EditText editTextNome;
    private EditText editTextEmail;
    private EditText editTextDataDeNascimento;
    private EditText editTextSenha;
    private EditText editTextConfirmaSenha;
    private Button buttonCadastrar;
    Usuario usuario;




    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        editTextNome = findViewById(R.id.EditTextNome);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextDataDeNascimento = findViewById(R.id.editTextDataDeNascimento);
        editTextSenha = findViewById(R.id.editTextSenha);
        editTextConfirmaSenha = findViewById(R.id.editTextConfirmaSenha);



        buttonCadastrar = findViewById(R.id.buttonCadastrar);

        if(usuario != null){
            editTextNome.setText(usuario.getNome());
        }

        buttonCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(capturaDados()){
                    final FirebaseDatabase database = FirebaseDatabase.getInstance();

                    DatabaseReference myRef = database.getReference().child("usuarios");
                    String id = myRef.push().getKey();

                    //Salvar esse id no banco local.
                    myRef.child(id).setValue(usuario).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {

                            AlertDialog.Builder alerta = new AlertDialog.Builder(CadastroActivity.this);
                            alerta.setTitle("Novo Cadastro");
                            alerta.setMessage("Cadastro realizado com sucesso!");
                            alerta.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    finish();
                                }
                            });
                            alerta.show();
                        }
                    });


                }
            }
        });
    }
    public boolean capturaDados(){
        String nome = editTextNome.getText().toString();
        String email = editTextEmail.getText().toString();
        String dataNascimento = editTextDataDeNascimento.getText().toString();
        String senha = editTextSenha.getText().toString();
        String confirmaSenha = editTextConfirmaSenha.getText().toString();

        if(nome.isEmpty()){
            editTextNome.setError("Campo em branco!");
            return false;
        }

        usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setEmail(email);
        usuario.setDataDeNascimento(dataNascimento);
        usuario.setSenha(senha);
        usuario.setConfirmaSenha(confirmaSenha);



        return true;
    }
}



