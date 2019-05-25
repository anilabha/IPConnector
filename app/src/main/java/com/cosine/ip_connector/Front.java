package com.cosine.ip_connector;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
/*

made by Anilabha Baral
 */
public class Front extends AppCompatActivity {

    private Button btn;
    private Button btnTP;
    private Button btnIball;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);
        btn=(Button)findViewById(R.id.button);
        btnTP=(Button)findViewById(R.id.button_Tp);
        btnIball=(Button)findViewById(R.id.button_iball);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Front.this, MainActivity.class);

                Front.this.startActivity(myIntent);
            }
        });
        btnTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Front.this, Tplink.class);

                Front.this.startActivity(myIntent);

            }
        });

        btnIball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(Front.this, iball.class);

                Front.this.startActivity(myIntent);

            }
        });
    }
}
