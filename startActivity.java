package com.example.kunalfarmah.realtimetictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.EditText;
import android.widget.ImageButton;

import java.io.Serializable;

public class startActivity extends AppCompatActivity implements Serializable {
    EditText e1;
    EditText e2;

     ImageButton i1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        i1 = (ImageButton) findViewById(R.id.gobuton);

        e1 = (EditText) findViewById(R.id.player1);
        e2 = (EditText) findViewById(R.id.player2);

        i1.setOnClickListener(new View.OnClickListener() {

            private AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.6F);    //fading effect on clicking go

            @Override
            public void onClick(View v) {
                v.startAnimation(buttonClick);
                Intent intent = new Intent(startActivity.this , com.example.kunalfarmah.realtimetictactoe.MainActivity_optimised.class);
                intent.putExtra("player1", e1.getText().toString());    // sending the edittext data to mainactivity
                intent.putExtra("player2", e2.getText().toString());
                startActivity(intent);

            }
        });
    }

}
