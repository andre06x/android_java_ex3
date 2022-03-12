package com.example.exercicio03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText n = (EditText) findViewById(R.id.usuario);

        Button buscar =  (Button) findViewById(R.id.acessar);
        buscar.setOnClickListener((new View.OnClickListener(){
            @Override

            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("usuario", n.getText().toString());

                startActivity(intent);
            }
        }));
    }
}