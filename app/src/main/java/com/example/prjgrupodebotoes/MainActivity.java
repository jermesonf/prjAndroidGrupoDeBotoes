package com.example.prjgrupodebotoes;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton azul, amarelo, vermelho, verde;
    TextView txtE;
    RadioGroup grupo;
    View fundo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        azul=findViewById(R.id.azul);
        amarelo = findViewById(R.id.amarelo);
        vermelho = findViewById(R.id.vermelho);
        verde = findViewById(R.id.verde);
        grupo = findViewById(R.id.grupo1);
        txtE = findViewById(R.id.result);
        fundo = findViewById(R.id.fundo);
    }


    public void amar(View v){
        //txtE.setBackgroundColor(Color.parseColor("#ffff00"));
        txtE.setTextColor(Color.YELLOW);
        //txtE.setBackgroundColor(Color.YELLOW);
    }

    public void az(View v){
        //txtE.setBackgroundColor(Color.BLUE);
        txtE.setTextColor(Color.parseColor("#0000ff"));
        //txtE.setBackgroundColor(Color.BLUE);
    }

    public void Verde(View v){
        txtE.setTextColor(Color.GREEN);
        //txtE.setBackgroundColor(Color.GREEN);
    }

    public void Vermelho(View v){
        txtE.setTextColor(Color.RED);
        //txtE.setBackgroundColor(Color.RED);
    }

    public void fundo(View v){
        if(azul.isChecked()){
           fundo.setBackgroundResource(android.R.color.holo_blue_bright);
        }
        else if(amarelo.isChecked()){
            fundo.setBackgroundResource(android.R.color.holo_orange_light);
        }
        else if (verde.isChecked()){
            fundo.setBackgroundResource(android.R.color.holo_green_light);
        }
        else{
            fundo.setBackgroundResource(android.R.color.holo_red_dark);
        }
    }

}