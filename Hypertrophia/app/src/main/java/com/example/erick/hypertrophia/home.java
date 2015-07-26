package com.example.erick.hypertrophia;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;


public class home extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        final ImageButton tuprogreso = (ImageButton)findViewById(R.id.btn_login);
        tuprogreso.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent form = new Intent(home.this, tuprogreso.class);
                startActivity(form);
            }
        });
        final ImageButton disciplina = (ImageButton)findViewById(R.id.btn_disciplina);
        disciplina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent form = new Intent(home.this,disciplina.class);
                startActivity(form);
            }
        });
        ImageButton rutina =(ImageButton)findViewById(R.id.btn_rutina);
        rutina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent form= new Intent(home.this,rutina.class);
                startActivity(form);
            }
        });
        final ImageButton nutricion =(ImageButton)findViewById(R.id.btn_nutricion);
        nutricion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent form = new Intent(home.this,nutricion.class);
                startActivity(form);
            }
        });
        ImageButton ejercicio =(ImageButton)findViewById(R.id.btn_ejercicios);
        ejercicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent form= new Intent(home.this,ejercicio.class);
                startActivity(form);
            }
        });
        ImageButton salir =(ImageButton)findViewById(R.id.btn_salir);
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent form= new Intent();
                finish();
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
