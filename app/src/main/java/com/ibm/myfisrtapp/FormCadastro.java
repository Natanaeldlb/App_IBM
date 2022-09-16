package com.ibm.myfisrtapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FormCadastro extends AppCompatActivity {

    private AppCompatButton bt_cadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro);

        getSupportActionBar().hide();
        retornar();


        bt_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormCadastro.this,FormLogin.class);
                startActivity(intent);
            }
        });

    }

    private void retornar(){
        bt_cadastrar = findViewById(R.id.bt_cadastrar);
    }

}