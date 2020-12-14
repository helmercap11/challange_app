package com.helmercapassola.challange_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerActivity extends AppCompatActivity {

    private Spinner spNames;
    private Button btn_mostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        setTitle("Spinner");

        spNames = findViewById(R.id.sp_names);
        btn_mostrar = findViewById(R.id.btn_mostrar);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.fruit, R.layout.spinner_layout);
        spNames.setAdapter(adapter);

        btn_mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectName();
            }
        });

    }

    private void selectName() {
        String name = spNames.getSelectedItem().toString();
        int position = spNames.getSelectedItemPosition();
        Toast.makeText(this, name + "_" + position, Toast.LENGTH_SHORT).show();
    }
}