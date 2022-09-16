package com.ibm.myfisrtapp;

import static com.ibm.myfisrtapp.R.id.text_tela_cadastro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

public class FormLogin<msg> extends AppCompatActivity {


    private TextView text_tela_cadastro;
    private AppCompatButton bt_entrar;
    private String msg = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        EditText email, senha;

        email = findViewById(R.id.email);
        senha = findViewById(R.id.senha);

        getSupportActionBar().hide();
        IniciarComponentes();
        Teste();

        text_tela_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormLogin.this,FormCadastro.class);
                startActivity(intent);
            }
        });

        bt_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String emailfile = email.getText().toString();
                String password = senha.getText().toString();

                if(emailfile.equals ("natanael.batista@ibm.com") && password.equals("213015")){
                    msg = "Usuário e senha corretos!";

                    Intent intent = new Intent(FormLogin.this,TelaPrincipal.class);
                    startActivity(intent);
                }else{
                    msg = "Usuário ou senha incorretos!";
                }

                Mensagem();

            }
        });
    }

    private void IniciarComponentes(){
        text_tela_cadastro = findViewById(R.id.text_tela_cadastro);
    }

    private  void Teste(){
        bt_entrar = findViewById(R.id.bt_entrar);
    }

    private void Mensagem(){
        Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_LONG).show();
    }

}