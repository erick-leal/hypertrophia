package com.example.erick.hypertrophia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Erick on 02-06-2015.
 */
public class horarioBE extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horariobe);
        final Button instructorBE = (Button) findViewById(R.id.btn_instructorBE);
        instructorBE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent form = new Intent(horarioBE.this,instructorBE.class);
                startActivity(form);
            }
        });

    }
}
