package com.example.erick.hypertrophia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Erick on 30-05-2015.
 */
public class tuprogreso extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progreso);
        Button  ingresar = (Button)findViewById(R.id.btn_ingresar);
        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario=((EditText)findViewById(R.id.txtusuario)).getText().toString();
                String password =((EditText)findViewById(R.id.txtpassword)).getText().toString();
                if(usuario.equals("admin")&& password.equals("admin")){
                    Intent form5 =new Intent(tuprogreso.this,usuario.class);
                    startActivity(form5);
                }
                else {
                    Toast.makeText(getApplicationContext(),"Usuario Incorrecto",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
