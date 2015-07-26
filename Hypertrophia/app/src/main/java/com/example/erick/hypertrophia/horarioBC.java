package com.example.erick.hypertrophia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Erick on 02-06-2015.
 */
public class horarioBC extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horariobc);
        Button intructorBC = (Button)findViewById(R.id.btn_intructorBC);
        intructorBC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent form = new Intent(horarioBC.this,instructorBC.class);
                startActivity(form);
            }
        });

    }
}
