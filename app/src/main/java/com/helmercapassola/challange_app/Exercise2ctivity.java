package com.helmercapassola.challange_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Exercise2ctivity extends AppCompatActivity {

    EditText edit_salario;
    RadioGroup rg_op;
    Button btn_salario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise2);

        edit_salario = findViewById(R.id.edit_salario);
        rg_op = findViewById(R.id.rg_opcoes);
        btn_salario = findViewById(R.id.btn_calcular);

        btn_salario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double salario = Double.parseDouble(edit_salario.getText().toString());
                int op = rg_op.getCheckedRadioButtonId();

                double new_salario = 0;

                if(op == R.id.rb_40)
                    new_salario = salario + (salario * 0.4);
                else if (op == R.id.rb_45)
                    new_salario = salario + (salario * 0.45);
                else
                    new_salario = salario + (salario * 0.5);

                Toast.makeText(Exercise2ctivity.this, "Seu novo Salário é: " + new_salario , Toast.LENGTH_SHORT).show();

            }
        });
    }
}