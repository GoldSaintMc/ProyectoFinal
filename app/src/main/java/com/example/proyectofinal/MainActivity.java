package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonGenerar = findViewById(R.id.btnGenerar);
        buttonGenerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GenerarCodigo.class );
                startActivity(intent);
            }
        });

        Button buttonCifrar = findViewById(R.id.btnCifrar);
        buttonCifrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CifrarDescifrar.class );
                startActivity(intent);
            }
        });
    }
}