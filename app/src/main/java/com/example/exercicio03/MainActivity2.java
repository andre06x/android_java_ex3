package com.example.exercicio03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final TextView mensagem = (TextView) findViewById(R.id.teste);

        Bundle bundle = getIntent().getExtras();
        String data = bundle.getString("usuario");
        mensagem.setText("Olá " + data + " Seja bem vindo ao Formulário!");
    }
}