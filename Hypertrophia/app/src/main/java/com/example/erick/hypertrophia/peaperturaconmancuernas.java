package com.example.erick.hypertrophia;

import android.app.Activity;
import android.os.Bundle;
import android.view.SurfaceView;

import gif.decoder.GifRun;

/**
 * Created by Erick on 05-06-2015.
 */
public class peaperturaconmancuernas extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peaperturaconmancuernas);

        //Gif
        SurfaceView v = (SurfaceView)findViewById(R.id.sfv7);
        GifRun w = new GifRun();
        w.LoadGiff(v, this, R.drawable.aperturasconmancuerna);

    }

}
