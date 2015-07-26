package com.example.erick.hypertrophia;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Erick on 30-05-2015.
 */
public class rutina extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutina);
        ImageButton abdominalesm = (ImageButton)findViewById(R.id.btn_abdm);
        abdominalesm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent form = new Intent(rutina.this,rutinaabdominales.class);
                startActivity(form);

            }
        });

        ImageButton abdominalesh = (ImageButton)findViewById(R.id.btn_abdh);
        abdominalesh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent form = new Intent(rutina.this,rutinaabdominales.class);
                startActivity(form);
            }
        });

        ImageButton estiramientosm = (ImageButton)findViewById(R.id.btn_estm);
        estiramientosm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent form = new Intent(rutina.this,rutinaestiramientos.class);
                startActivity(form);
            }
        });

        ImageButton estiramientosh = (ImageButton)findViewById(R.id.btn_esth);
        estiramientosh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent form = new Intent(rutina.this,rutinaestiramientos.class);
                startActivity(form);
            }
        });



        ImageButton principiantem = (ImageButton)findViewById(R.id.btn_prim);
        principiantem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent form = new Intent(rutina.this,rutinaprincipiante.class);
                startActivity(form);
            }
        });

        ImageButton principianteh = (ImageButton)findViewById(R.id.btn_prih);
        principianteh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent form = new Intent(rutina.this,rutinaprincipiante.class);
                startActivity(form);
            }
        });

    }
}
