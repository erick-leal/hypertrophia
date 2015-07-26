package com.example.erick.hypertrophia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Erick on 30-05-2015.
 */
public class disciplina extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disciplina);
        Button horarioM = (Button) findViewById(R.id.btn_horarioM);
        horarioM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent form1 = new Intent(disciplina.this,horarioM.class);
                startActivity(form1);
            }
        });
        final Button horarioZ =(Button)findViewById(R.id.btn_horarioZ);
        horarioZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent form1 = new Intent(disciplina.this,horarioZ.class);
                startActivity(form1);
            }
        });
        final Button horarioBE = (Button) findViewById(R.id.btn_horarioBE);
        horarioBE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent form1 = new Intent(disciplina.this,horarioBE.class);
                startActivity(form1);
            }
        });
        final Button horarioBC = (Button)findViewById(R.id.btn_horarioBC);
        horarioBC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent form1 = new Intent(disciplina.this,horarioBC.class);
                startActivity(form1);
            }
        });

    }
}
