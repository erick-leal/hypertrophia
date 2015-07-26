package com.example.erick.hypertrophia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

/**
 * Created by Erick on 04-06-2015.
 */
public class espalda extends Activity {
    String [] ejerciciosespalda = {"Polea al pecho","Remo en polea baja","Remo horizontal con barra","Remo horizontal con mancuerna"};
    private ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espalda);
        ImageView espalda = (ImageView)findViewById(R.id.iv_espalda);
        lista = (ListView)findViewById(R.id.listViewEspalda);
        String datos[]= getResources().getStringArray(R.array.ejercicios_espalda);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,datos);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent a = new Intent();
                        a.setClass(getApplicationContext(), espoleaalpecho.class);
                        startActivity(a);
                        break;
                    case 1:
                        Intent b = new Intent();
                        b.setClass(getApplicationContext(), esremoenpoleabaja.class);
                        startActivity(b);
                        break;
                    case 2:
                        Intent c = new Intent();
                        c.setClass(getApplicationContext(), esremohorizontalconbarra.class);
                        startActivity(c);
                        break;
                    case 3:
                        Intent d = new Intent();
                        d.setClass(getApplicationContext(), esremohorizontalconmancuernas.class);
                        startActivity(d);
                        break;
                }

            }
        });

    }
}
