package com.example.erick.hypertrophia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Erick on 02-06-2015.
 */
public class instructorZumba extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructorzumba);
        try {
            Personal p = (new HttpHandler().execute()).get();
           TextView text = (TextView)findViewById(R.id.r_instructor);
            text.setText(p.toString());
        }catch (Exception e)
        {

        }

    }
}
