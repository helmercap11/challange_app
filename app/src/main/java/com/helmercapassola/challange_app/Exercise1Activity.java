package com.helmercapassola.challange_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Exercise1Activity extends AppCompatActivity {

    private CheckBox arroz, leite, carne, feijao;
    private Button btn_mostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1);

        arroz = findViewById(R.id.ch_arroz);
        leite = findViewById(R.id.ch_leite);
        carne = findViewById(R.id.ch_carne);
        feijao = findViewById(R.id.ch_feijao);
        btn_mostrar = findViewById(R.id.btn_mostrar);

        btn_mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double total = 0;

                if(arroz.isChecked())
                    total += 200;
                if(leite.isChecked())
                    total  += 500;
                if(carne.isChecked())
                    total +=1500;
                if (feijao.isChecked())
                    total += 300;

                Toast.makeText(Exercise1Activity.this, "Valor de compra é: " + total, Toast.LENGTH_SHORT).show();
            }
        });



    }
}