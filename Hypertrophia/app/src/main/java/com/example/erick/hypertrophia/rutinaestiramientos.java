package com.example.erick.hypertrophia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Erick on 09-06-2015.
 */
public class rutinaestiramientos extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rutinaestiramientos);
        Button trensu = (Button)findViewById(R.id.btn_trensuperior);
        trensu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent form = new Intent(rutinaestiramientos.this,trensuperior.class);
                startActivity(form);
            }
        });
        Button trenin = (Button)findViewById(R.id.btn_treninferior);
        trenin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent form = new Intent(rutinaestiramientos.this,treninferior.class);
                startActivity(form);
            }
        });

    }
}
