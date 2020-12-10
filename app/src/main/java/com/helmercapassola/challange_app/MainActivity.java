package com.helmercapassola.challange_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_calculator, btn_listview, btn_spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_calculator = findViewById(R.id.btn_calc);
        btn_listview = findViewById(R.id.btn_listview);
        btn_spinner = findViewById(R.id.btn_spinner);

        btn_calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Calculadora.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Calculadora", Toast.LENGTH_SHORT).show();
            }
        });

        btn_listview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Listview.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "ListView", Toast.LENGTH_SHORT).show();
            }
        });

        btn_spinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Spinner.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Spinner", Toast.LENGTH_SHORT).show();

            }
        });
    }
}