package com.example.erick.hypertrophia;

import android.app.Activity;
import android.os.Bundle;
import android.view.SurfaceView;

import gif.decoder.GifRun;

/**
 * Created by Erick on 05-06-2015.
 */
public class espoleaalpecho extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espoleaalpecho);

        //Gif
        SurfaceView v = (SurfaceView)findViewById(R.id.sfv1);
        GifRun w = new GifRun();
        w.LoadGiff(v, this, R.drawable.poleaalpecho);

    }
}
