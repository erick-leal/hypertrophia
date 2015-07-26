package com.example.erick.hypertrophia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by Erick on 04-06-2015.
 */
public class biceps extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biceps);
        ImageView biceps = (ImageView)findViewById(R.id.iv_biceps);

    }
}
