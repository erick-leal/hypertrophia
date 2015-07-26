package com.example.erick.hypertrophia;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by Erick on 04-06-2015.
 */
public class triceps extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triceps);
        ImageView triceps = (ImageView)findViewById(R.id.iv_triceps);

    }
}
