package com.globosoft.putitourcr.putitour;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Desarrollo Trabajo on 25/07/2014.
 */
public class TermActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.terminos);

        Button btnIngresar = (Button) findViewById(R.id.btnIngresar);
        btnIngresar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent Main = new Intent(TermActivity.this,MainActivity.class);
                startActivity(Main);
            }
        });


        Button btnSalir = (Button) findViewById(R.id.btnSalir);
        btnSalir.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });




    }

}



