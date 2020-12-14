package com.helmercapassola.challange_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_calculator, btn_listview, btn_spinner,
            btn_exercise1, btn_exercise2, btn_exercise3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_calculator = findViewById(R.id.btn_calc);
        btn_listview = findViewById(R.id.btn_listview);
        btn_spinner = findViewById(R.id.btn_spinner);
        btn_exercise1 = findViewById(R.id.btn_exerc1);
        btn_exercise2 = findViewById(R.id.btn_exerc2);
        btn_exercise3 = findViewById(R.id.btn_exerc3);

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
                Intent intent = new Intent(MainActivity.this, SpinnerActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Spinner", Toast.LENGTH_SHORT).show();

            }
        });

        btn_exercise1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Exercise1Activity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Compras", Toast.LENGTH_SHORT).show();

            }
        });

        btn_exercise2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Exercise2ctivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Salário", Toast.LENGTH_SHORT).show();

            }
        });

        btn_exercise3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Exercise3ctivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "List Names", Toast.LENGTH_SHORT).show();

            }
        });
    }
}