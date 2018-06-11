package com.example.kunalfarmah.realtimetictactoe;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class gameover extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameover);

        ImageButton replay = (ImageButton) findViewById(R.id.repeat);
        replay.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();  // ending the gameover activity and going back to the first game activity
                System.exit(0);
            }
        });

        ImageButton close = findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityCompat.finishAffinity(gameover.this);  // will close current activity along with all parent activities
                System.exit(0);
            }
        });

        }

}
