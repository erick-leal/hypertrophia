package com.example.erick.hypertrophia;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import gif.decoder.GifRun;

/**
 * Created by Erick on 04-06-2015.
 */
public class pectorales extends Activity {
    String[] ejerciciospectorales = {"Press de banco plano",
    "Press de banco inclinado",
    "Press de banco declinado",
    "Flexiones de brazos",
    "Press con mancuernas","Aperturas con mancuernas",
    "Apertura inclinado con mancuernas"};
    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pectorales);
        ImageView pectorales = (ImageView)findViewById(R.id.iv_pectorales);
        lista = (ListView)findViewById(R.id.listViewPectorales);
        String datos[]= getResources().getStringArray(R.array.ejercicios_pectorales);
        ArrayAdapter<String> adaptador =new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,datos);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent a = new Intent();
                        a.setClass(getApplicationContext(), pepressdebancoplano.class);
                        startActivity(a);
                        break;
                    case 1:
                        Intent b = new Intent();
                        b.setClass(getApplicationContext(), pepressdebancoinclinado.class);
                        startActivity(b);
                        break;
                    case 2:
                        Intent c = new Intent();
                        c.setClass(getApplicationContext(), pepressdebancodeclinado.class);
                        startActivity(c);
                        break;
                    case 3:
                        Intent d = new Intent();
                        d.setClass(getApplicationContext(), peflexionesdebrazos.class);
                        startActivity(d);
                        break;
                    case 4:
                        Intent e = new Intent();
                        e.setClass(getApplicationContext(), pepressconmancuernas.class);
                        startActivity(e);
                        break;
                    case 5:
                        Intent f = new Intent();
                        f.setClass(getApplicationContext(), peaperturaconmancuernas.class);
                        startActivity(f);
                        break;
                    case 6:
                        Intent g = new Intent();
                        g.setClass(getApplicationContext(), peaperturainclinadoconmancuernas.class);
                        startActivity(g);
                        break;
                }

            }
        });





    }


}
