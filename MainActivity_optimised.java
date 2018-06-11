package com.example.kunalfarmah.realtimetictactoe;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity_optimised extends AppCompatActivity implements View.OnClickListener {

    int turns = -1;
    boolean win = false;


    ImageView i1;
    ImageView i2;
    ImageView i3;
    ImageView i4;
    ImageView i5;
    ImageView i6;
    ImageView i7;
    ImageView i8;
    ImageView i9;
    ImageView o;
    ImageView x;
    TextView t1;
    TextView t2;

    String pl1;
    String pl2;

   int moves[][] = new int[3][3];

   for(int i=0; i<3; i++){
       for(int j=0; j<3; j++)
           moves[i][j]=-1;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();   //receiving the extras supplied to MainActivity

        pl1 = (String) intent.getSerializableExtra("player1");
        pl2 = (String) intent.getSerializableExtra("player2");


        t1 = (TextView) findViewById(R.id.textView);
        t2 = (TextView) findViewById(R.id.textView2);

        if (!pl1.equals("") && !pl2.equals("")) {
            t1.setText(pl1 + ": O");
            t2.setText(pl2 + ": X");
        } else if (pl1.equals("") && pl2.equals("")) {
            pl1 = "Player 1";
            pl2 = "Player 2";
        }

        i1 = (ImageView) findViewById(R.id.imageView1);
        i2 = (ImageView) findViewById(R.id.imageView2);
        i3 = (ImageView) findViewById(R.id.imageView3);
        i4 = (ImageView) findViewById(R.id.imageView4);
        i5 = (ImageView) findViewById(R.id.imageView5);
        i6 = (ImageView) findViewById(R.id.imageView6);
        i7 = (ImageView) findViewById(R.id.imageView7);
        i8 = (ImageView) findViewById(R.id.imageView8);
        i9 = (ImageView) findViewById(R.id.imageView9);
        o = (ImageView) findViewById(R.id.checko);
        x = (ImageView) findViewById(R.id.checkx);

        Toast.makeText(getApplicationContext(), pl1 + " Goes first", Toast.LENGTH_SHORT).show();


        i1.setOnClickListener(this);
        i2.setOnClickListener(this);
        i3.setOnClickListener(this);
        i4.setOnClickListener(this);
        i5.setOnClickListener(this);
        i6.setOnClickListener(this);
        i7.setOnClickListener(this);
        i8.setOnClickListener(this);
        i9.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {              //implementing onClick only once for all buttons by using their IDs

        switch (view.getId()) {

            case R.id.imageView1:

                ++turns;
                if (turns % 2 == 0)
                    i1.setImageResource(R.drawable.o);
                else
                    i1.setImageResource(R.drawable.x);

                i1.setEnabled(false);   // disabling the onClickListener after first click

                break;

            case R.id.imageView2:

                ++turns;
                if (turns % 2 == 0)
                    i2.setImageResource(R.drawable.o);
                else
                    i2.setImageResource(R.drawable.x);

                i2.setEnabled(false);

            case R.id.imageView3:
                ++turns;
                if (turns % 2 == 0)
                    i3.setImageResource(R.drawable.o);
                else
                    i3.setImageResource(R.drawable.x);

                i3.setEnabled(false);

                break;

            case R.id.imageView4:
                ++turns;
                if (turns % 2 == 0)
                    i4.setImageResource(R.drawable.o);
                else
                    i4.setImageResource(R.drawable.x);

                i4.setEnabled(false);
                break;

            case R.id.imageView5:
                ++turns;
                if (turns % 2 == 0)
                    i5.setImageResource(R.drawable.o);
                else
                    i5.setImageResource(R.drawable.x);

                i5.setEnabled(false);
                break;

            case R.id.imageView6:
                ++turns;
                if (turns % 2 == 0)
                    i6.setImageResource(R.drawable.o);
                else
                    i6.setImageResource(R.drawable.x);

                i6.setEnabled(false);
                break;

            case R.id.imageView7:
                ++turns;
                if (turns % 2 == 0)
                    i7.setImageResource(R.drawable.o);
                else
                    i7.setImageResource(R.drawable.x);

                i7.setEnabled(false);
                break;

            case R.id.imageView8:
                ++turns;
                if (turns % 2 == 0)
                    i8.setImageResource(R.drawable.o);
                else
                    i8.setImageResource(R.drawable.x);

                i8.setEnabled(false);
                break;

            case R.id.imageView9:
                ++turns;
                if (turns % 2 == 0)
                    i9.setImageResource(R.drawable.o);
                else
                    i9.setImageResource(R.drawable.x);

                i9.setEnabled(false);
                break;

        }


        if (turns >= 4 && turns < 8)
            win = winner(pl1, pl2);

        // if a player wins, start gameover activity with a delay of 1.4 seconds

        if (win) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    Intent gameover = new Intent(MainActivity_optimised.this, com.example.kunalfarmah.realtimetictactoe.gameover.class);
                    startActivity(gameover);
                }
            }, 1400);
        }

        if (turns == 8 && !win) {
            Toast.makeText(getApplicationContext(), "Drawn!!", Toast.LENGTH_LONG).show();

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    Intent gameover = new Intent(MainActivity_optimised.this, com.example.kunalfarmah.realtimetictactoe.gameover.class);
                    startActivity(gameover);
                }
            }, 1400);
        }
    }


    private boolean winner(String pl1, String pl2) {

        Drawable a = i1.getDrawable();
        Drawable b = i2.getDrawable();
        Drawable c = i3.getDrawable();
        Drawable d = i4.getDrawable();
        Drawable e = i5.getDrawable();
        Drawable f = i6.getDrawable();
        Drawable g = i7.getDrawable();
        Drawable h = i8.getDrawable();
        Drawable i = i9.getDrawable();
        Drawable p1 = o.getDrawable();
        Drawable p2 = x.getDrawable();


        //cases for winning

        // horizontal line
        if (a.getConstantState() != null && a.getConstantState().equals(b.getConstantState()) && b.getConstantState().equals(c.getConstantState())) {
            if (a.getConstantState() != null && a.getConstantState().equals(p1.getConstantState())) {
                Toast.makeText(getApplicationContext(), pl1 + " Wins", Toast.LENGTH_LONG).show();
                return true;
            } else if (a.getConstantState().equals(p2.getConstantState())) {
                Toast.makeText(getApplicationContext(), pl2 + " Wins", Toast.LENGTH_LONG).show();
                return true;
            }
        }
        if (d.getConstantState() != null && d.getConstantState() != null && d.getConstantState().equals(e.getConstantState()) && e.getConstantState().equals(f.getConstantState())) {
            if (d.getConstantState().equals(p1.getConstantState())) {
                Toast.makeText(getApplicationContext(), pl1 + " Wins", Toast.LENGTH_LONG).show();
                return true;
            } else if (d.getConstantState().equals(p2.getConstantState())) {
                Toast.makeText(getApplicationContext(), pl2 + " Wins", Toast.LENGTH_LONG).show();
                return true;
            }
        }
        if (g.getConstantState() != null && g.getConstantState() != null && g.getConstantState().equals(h.getConstantState()) && h.getConstantState().equals(i.getConstantState())) {
            if (g.getConstantState().equals(p1.getConstantState())) {
                Toast.makeText(getApplicationContext(), pl1 + " Wins", Toast.LENGTH_LONG).show();
                return true;
            } else if (g.getConstantState().equals(p2.getConstantState())) {
                Toast.makeText(getApplicationContext(), pl2 + " Wins", Toast.LENGTH_LONG).show();
                return true;
            }
        }


        // vertical line

        if (a.getConstantState() != null && a.getConstantState().equals(d.getConstantState()) && d.getConstantState().equals(g.getConstantState())) {
            if (a.getConstantState().equals(p1.getConstantState())) {
                Toast.makeText(getApplicationContext(), pl1 + " Wins", Toast.LENGTH_LONG).show();
                return true;
            } else if (a.getConstantState().equals(p2.getConstantState())) {
                Toast.makeText(getApplicationContext(), pl2 + " Wins", Toast.LENGTH_LONG).show();
                return true;
            }
        }
        if (b.getConstantState() != null && b.getConstantState().equals(e.getConstantState()) && e.getConstantState().equals(h.getConstantState())) {
            if (b.getConstantState().equals(p1.getConstantState())) {
                Toast.makeText(getApplicationContext(), pl1 + " Wins", Toast.LENGTH_LONG).show();
                return true;
            } else if (b.getConstantState().equals(p2.getConstantState())) {
                Toast.makeText(getApplicationContext(), pl2 + " Wins", Toast.LENGTH_LONG).show();

                return true;
            }
        }
        if (c.getConstantState() != null && c.getConstantState().equals(f.getConstantState()) && f.getConstantState().equals(i.getConstantState())) {
            if (c.getConstantState().equals(p1.getConstantState())) {
                Toast.makeText(getApplicationContext(), pl1 + " Wins", Toast.LENGTH_LONG).show();
                return true;
            } else if (c.getConstantState().equals(p2.getConstantState())) {
                Toast.makeText(getApplicationContext(), pl2 + " Wins", Toast.LENGTH_LONG).show();
                return true;
            }
        }

        // diagonal 1

        if (a.getConstantState() != null && a.getConstantState().equals(e.getConstantState()) && e.getConstantState().equals(i.getConstantState())) {
            if (a.getConstantState().equals(p1.getConstantState())) {
                Toast.makeText(getApplicationContext(), pl1 + " Wins", Toast.LENGTH_LONG).show();
                return true;
            } else if (a.getConstantState().equals(p2.getConstantState())) {
                Toast.makeText(getApplicationContext(), pl2 + " Wins", Toast.LENGTH_LONG).show();
                return true;
            }
        }

        //diagonal 2
        if (c.getConstantState() != null && c.getConstantState().equals(e.getConstantState()) && e.getConstantState().equals(g.getConstantState())) {
            if (c.getConstantState().equals(p1.getConstantState())) {
                Toast.makeText(getApplicationContext(), pl1 + " Wins", Toast.LENGTH_LONG).show();
                return true;
            } else if (c.getConstantState().equals(p2.getConstantState())) {
                Toast.makeText(getApplicationContext(), pl2 + " Wins", Toast.LENGTH_LONG).show();
                return true;
            }
        }

        return false;

    }


}