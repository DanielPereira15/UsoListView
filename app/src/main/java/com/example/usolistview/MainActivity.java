package com.example.usolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView tvSeleccionado;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSeleccionado=findViewById(R.id.tvSeleccionado);
        lv=findViewById(R.id.lv);

        /*
        ArrayList<String> paises = new ArrayList<String>();
        paises.add("España");
        paises.add("Francia");
        paises.add("Alemania");
        paises.add("Rusia");
        paises.add("Ucrania");
        Collections.shuffle(paises); //esto es para desordenar el array

        ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1,paises);

        //llenamos el listView con los datos del adaptador
        lv.setAdapter(adaptador);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {//hace referencia al parent. a la vista, la posicion seleccionada y la id
                Toast.makeText(adapterView.getContext(),"Elemento " + adapterView.getItemAtPosition(i).toString(),Toast.LENGTH_LONG).show();
                tvSeleccionado.setText("Elemento " + adapterView.getItemAtPosition(i).toString());
            }
        });

         */

        ArrayAdapter adaptador = ArrayAdapter.createFromResource(this, R.array.naciones, android.R.layout.simple_list_item_activated_1);

        lv.setAdapter(adaptador);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {//hace referencia al parent. a la vista, la posicion seleccionada y la id
                Toast.makeText(adapterView.getContext(),"Elemento " + adapterView.getItemAtPosition(i).toString(),Toast.LENGTH_LONG).show();
                tvSeleccionado.setText("Elemento " + adapterView.getItemAtPosition(i).toString());
            }
        });


    }
}