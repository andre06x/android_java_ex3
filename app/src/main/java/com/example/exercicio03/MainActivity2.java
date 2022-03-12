package com.example.exercicio03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

        Button buscar =  (Button) findViewById(R.id.voltar);
        buscar.setOnClickListener((new View.OnClickListener(){
            @Override

            public void onClick(View view){
                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        }));
    }
}