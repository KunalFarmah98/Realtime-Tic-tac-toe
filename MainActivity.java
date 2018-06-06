package com.example.kunalfarmah.realtimetictactoe;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int turns =-1;


    ImageView i1= (ImageView) findViewById(R.id.imageView1);
    ImageView i2= (ImageView) findViewById(R.id.imageView2);
    ImageView i3= (ImageView) findViewById(R.id.imageView3);
    ImageView i4= (ImageView) findViewById(R.id.imageView4);
    ImageView i5= (ImageView) findViewById(R.id.imageView5);
    ImageView i6= (ImageView) findViewById(R.id.imageView6);
    ImageView i7= (ImageView) findViewById(R.id.imageView7);
    ImageView i8= (ImageView) findViewById(R.id.imageView8);
    ImageView i9= (ImageView) findViewById(R.id.imageView9);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(),"Player 1 Goes first", Toast.LENGTH_SHORT).show();

        if (turns >= 4)
            winner();

        i1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ++turns;
                if (turns % 2 == 0)
                    i1.setImageResource(R.drawable.o);
                else
                    i1.setImageResource(R.drawable.x);
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ++turns;
                if (turns % 2 == 0)
                    i2.setImageResource(R.drawable.o);
                else
                    i2.setImageResource(R.drawable.x);
            }
        });


        i3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ++turns;
                if (turns % 2 == 0)
                    i3.setImageResource(R.drawable.o);
                else
                    i3.setImageResource(R.drawable.x);
            }
        });

        i4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ++turns;
                if (turns % 2 == 0)
                    i4.setImageResource(R.drawable.o);
                else
                    i4.setImageResource(R.drawable.x);
            }
        });

        i5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ++turns;
                if (turns % 2 == 0)
                    i5.setImageResource(R.drawable.o);
                else
                    i5.setImageResource(R.drawable.x);
            }
        });

        i6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ++turns;
                if (turns % 2 == 0)
                    i6.setImageResource(R.drawable.o);
                else
                    i6.setImageResource(R.drawable.x);
            }
        });

        i7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ++turns;
                if (turns % 2 == 0)
                    i7.setImageResource(R.drawable.o);
                else
                    i7.setImageResource(R.drawable.x);
            }
        });

        i8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ++turns;
                if (turns % 2 == 0)
                    i8.setImageResource(R.drawable.o);
                else
                    i8.setImageResource(R.drawable.x);
            }


        });

        i9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ++turns;
                if (turns % 2 == 0)
                    i9.setImageResource(R.drawable.o);
                else
                    i9.setImageResource(R.drawable.x);
            }
        });
    }



        private void winner(){

            Drawable a = i1.getDrawable();
            Drawable b = i2.getDrawable();
            Drawable c = i3.getDrawable();
            Drawable d = i4.getDrawable();
            Drawable e = i5.getDrawable();
            Drawable f = i6.getDrawable();
            Drawable g = i7.getDrawable();
            Drawable h = i8.getDrawable();
            Drawable i = i9.getDrawable();


            //cases for winning

            // horizontal line
            if (a.equals(b) && b.equals(c)) {
                if (a.toString().equals("o"))
                    Toast.makeText(getApplicationContext(), "Player 1 Wins", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(), "Player 2 Wins", Toast.LENGTH_LONG).show();
            }

            if (d.equals(e) && e.equals(f)) {
                if (d.toString().equals("o"))
                    Toast.makeText(getApplicationContext(), "Player 1 Wins", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(), "Player 2 Wins", Toast.LENGTH_LONG).show();
            }

            if (g.equals(h) && h.equals(i)) {
                if (g.toString().equals("o"))
                    Toast.makeText(getApplicationContext(), "Player 1 Wins", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(), "Player 2 Wins", Toast.LENGTH_LONG).show();
            }


            // vertical line

            if (a.equals(d) && d.equals(g)) {
                if (a.toString().equals("o"))
                    Toast.makeText(getApplicationContext(), "Player 1 Wins", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(), "Player 2 Wins", Toast.LENGTH_LONG).show();
            }

            if (b.equals(e) && e.equals(h)) {
                if (b.toString().equals("o"))
                    Toast.makeText(getApplicationContext(), "Player 1 Wins", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(), "Player 2 Wins", Toast.LENGTH_LONG).show();
            }

            if (c.equals(f) && f.equals(i)) {
                if (c.toString().equals("o"))
                    Toast.makeText(getApplicationContext(), "Player 1 Wins", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(), "Player 2 Wins", Toast.LENGTH_LONG).show();
            }

            // diagonal 1

            if (a.equals(e) && e.equals(i)) {
                if (a.toString().equals("o"))
                    Toast.makeText(getApplicationContext(), "Player 1 Wins", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(), "Player 2 Wins", Toast.LENGTH_LONG).show();
            }

            //diagonal 2
            if (c.equals(e) && e.equals(g)) {
                if (c.toString().equals("o"))
                    Toast.makeText(getApplicationContext(), "Player 1 Wins", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(), "Player 2 Wins", Toast.LENGTH_LONG).show();
            }

        }


   }