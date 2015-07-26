package com.example.erick.hypertrophia;

import android.os.AsyncTask;
import android.util.Log;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;

/**
 * Created by Marcelo on 04-06-2015.
 */
public class HttpHandler extends AsyncTask<String,JSONArray,Personal> {
    @Override
    protected Personal doInBackground(String... params) {
        HttpClient http = new DefaultHttpClient();
        HttpGet get = new HttpGet();
        BufferedReader in = null;
        try {
            get.setURI(new URI("http://146.83.198.35/~TISW_GRUPO4/API/personal/"));
            HttpResponse respuesta = http.execute(get);
            in = new BufferedReader(new InputStreamReader(respuesta.getEntity().getContent()));
            StringBuffer sb = new StringBuffer("");
            String line = "";
            String NL = System.getProperty("line.separator");
            while ((line = in.readLine()) != null)
            {
                sb.append(line + NL);
            }
            in.close();

            //Convertimos de JSON a Objeto Java
            //JSONObject jsonObj = new JSONObject(sb.toString());
            JSONArray jsonArray = new JSONArray(sb.toString());
            JSONObject jsonObj = jsonArray.getJSONObject(0);
            return new Personal(jsonObj.getString("Nombre"),jsonObj.getString("Apellido"),jsonObj.getString("Funcion"));
            //Log.e("Json Nombre:",jsonObj.getString("nombre"));
            //Log.e("Respuesta:", sb.toString());
        }catch(Exception e){
            Log.e("Error Http:", e.getMessage());
        }
        return null;
    }
}
