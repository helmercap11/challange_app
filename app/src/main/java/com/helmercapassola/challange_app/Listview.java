package com.helmercapassola.challange_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class Listview extends AppCompatActivity {

    private ListView lv_name;
    private Button btMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        setTitle("ListView");

        lv_name = (ListView)findViewById(R.id.lv_name);
        btMostrar = (Button)findViewById(R.id.btn_mostrar);

        ArrayAdapter nomes = ArrayAdapter.createFromResource(this,R.array.fruit, android.R.layout.simple_list_item_activated_1);
        lv_name.setAdapter(nomes);
    }

    public  void result (View view) {

            int post = lv_name.getCheckedItemPosition();
            String name = lv_name.getItemAtPosition(post).toString();
        Toast.makeText(this, name + "_" + post, Toast.LENGTH_SHORT).show();
    }
}