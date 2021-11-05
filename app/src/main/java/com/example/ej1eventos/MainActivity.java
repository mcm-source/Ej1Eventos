package com.example.ej1eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private int contador;
    private TextView vista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       vista = findViewById(R.id.tv_respuesta);
       contador=0;
    }

    public void onClickBtn(View view) {
        contador++;


    }

    public void onClickBtnFinalizar(View view) {
        vista.setText(contador != 1 ? "Has pulsado: "
                + String.valueOf(contador) + " veces" : "Has pulsado: "
                + String.valueOf(contador) + " vez");

    }
}