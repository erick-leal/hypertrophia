package com.example.erick.hypertrophia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Erick on 03-06-2015.
 */
public class ejercicio extends Activity{
    String[] ejercicios = {"Pectorales","Espalda","Biceps","Triceps","Hombros","Piernas","Antebrazos","Abdominales"};
    private ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio);
        lista = (ListView)findViewById(R.id.listViewEjercicios);
        String datos[] = getResources().getStringArray(R.array.ejercicios);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,datos);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               switch (position){
                   case 0:
                       Intent a = new Intent();
                       a.setClass(getApplicationContext(), pectorales.class);
                       startActivity(a);
                       break;
                   case 1:
                       Intent b = new Intent();
                       b.setClass(getApplicationContext(), espalda.class);
                       startActivity(b);
                       break;
                   case 2:
                       Intent c = new Intent();
                       c.setClass(getApplicationContext(), biceps.class);
                       startActivity(c);
                       break;
                   case 3:
                       Intent d = new Intent();
                       d.setClass(getApplicationContext(), triceps.class);
                       startActivity(d);
                       break;
                   case 4:
                       Intent e = new Intent();
                       e.setClass(getApplicationContext(), hombros.class);
                       startActivity(e);
                       break;
                   case 5:
                   Intent f = new Intent();
                   f.setClass(getApplicationContext(), piernas.class);
                   startActivity(f);
                       break;
                   case 6:
                       Intent g = new Intent();
                       g.setClass(getApplicationContext(), antebrazos.class);
                       startActivity(g);
                       break;
                   case 7:
                       Intent h = new Intent();
                       h.setClass(getApplicationContext(),abdominales.class);
                       startActivity(h);
                       break;

               }

            }
        });



    }
}


