package com.helmercapassola.challange_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise3ctivity extends AppCompatActivity {

    private TextView text_infor;
    private EditText edit_name, edit_idade;
    private ListView lv_names;

    private ArrayList<String> names = new ArrayList<String>(Arrays.asList("Ana", "Pedro", "Jose","Luis"));
    private ArrayList<Integer> idades = new ArrayList<Integer>(Arrays.asList(32, 50, 20,19));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise3);

        text_infor = findViewById(R.id.text_informacao);
        lv_names = findViewById(R.id.lv_names);
      /*  edit_idade = findViewById(R.id.edit_idade);
        edit_name = findViewById(R.id.edit_name);*/

        updateListView();

        lv_names.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                text_infor.setText("A idade de " + names.get(position) + " é " + idades.get(position));
            }
        });

    }

    private  void updateListView() {
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_checked, names);
        lv_names.setAdapter(adapter);
    }

    public void InsertPeople(View view){
        String nome = edit_name.getText().toString();
        int idade = Integer.parseInt(edit_idade.getText().toString());
        names.add(nome);
        idades.add(idade);
        updateListView();
        Toast.makeText(this, "Pessoa inserida com sucesso",Toast.LENGTH_LONG).show();
    }
}