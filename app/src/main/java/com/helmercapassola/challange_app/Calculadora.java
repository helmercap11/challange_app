package com.helmercapassola.challange_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Calculadora extends AppCompatActivity {

    EditText edit_num1, edit_num2;
    TextView text_resul;
    RadioButton btn_soma, btn_sub, btn_mult, btn_divisao;
    Button btn_calcular, btn_limpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        setTitle("Calculadora");

        edit_num1 = findViewById(R.id.edit_num1);
        edit_num2 = findViewById(R.id.edit_num2);
        btn_soma = findViewById(R.id.op_soma);
        btn_sub = findViewById(R.id.op_sub);
        btn_mult = findViewById(R.id.op_multi);
        btn_divisao = findViewById(R.id.op_divisao);
        btn_calcular = findViewById(R.id.btn_calcular);
        btn_limpar = findViewById(R.id.btn_limpar);
        text_resul = findViewById(R.id.text_resultado);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                somar();
            }
        });
    }

    private void somar() {
        double num1 = Double.parseDouble(edit_num1.getText().toString());
        double num2 = Double.parseDouble(edit_num2.getText().toString());

        if(btn_soma.isChecked()){
            double soma = num1 + num2;
            text_resul.setText(String.valueOf(soma));
        }else {
            Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_SHORT).show();
        }
    }

}