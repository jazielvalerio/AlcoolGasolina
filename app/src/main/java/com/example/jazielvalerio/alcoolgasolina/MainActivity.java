package com.example.jazielvalerio.alcoolgasolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText PrecoGasolina;
    private EditText PrecoAlcool;
    private Button btnCalcular;
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Recuperação dos Itens
        PrecoAlcool = (EditText) findViewById(R.id.etPrecoAlcool);
        PrecoGasolina = (EditText) findViewById(R.id.etPrecoGasolina);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        resultado = (TextView) findViewById(R.id.tvResultado);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            //Recuperação dos Valores Digitados
            public void onClick(View v) {
                String txtPrecoGasolina = PrecoGasolina.getText (). toString();
                String txtPrecoAlcool = PrecoAlcool.getText (). toString();
                //Conversões para Numeros
                Double valorAlcool = Double.parseDouble(txtPrecoAlcool);
                Double valorGasolina = Double.parseDouble(txtPrecoGasolina);
                double res = valorAlcool / valorGasolina;
                //fazendo os Calculos
                if (res <=0.7) {
                    resultado.setText("É melhor utilizar o Álcool");

                } else {
                    resultado.setText("É melhor utilizar Gasolina");
                }


            }
        });



    }
}
