package com.example.proyecto1_bounce_ramrez_pellecchia_gonzlez_camarena;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {


    private Button button1, button2;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.persona);
        button1 = (Button) findViewById(R.id.button);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.bounce_raul_1);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        imageView.setImageResource(R.drawable.bounce_raul_2);
                        Animation bounce_up = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce_up);
                        imageView.startAnimation(bounce_up);
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                imageView.setImageResource(R.drawable.bounce_raul_3);
                                Animation bounce_down = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce_down);
                                imageView.startAnimation(bounce_down);
                                Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    public void run() {
                                        Animation get_off_trampoline = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.get_off_trampoline);
                                        imageView.startAnimation(get_off_trampoline);
                                        imageView.setImageResource(R.drawable.bounce_raul_4);
                                    }
                                }, 1700);
                            }
                        }, 850);
                    }
                }, 700);
            }
        });

        button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.bounce_angela_1);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        imageView.setImageResource(R.drawable.bounce_angela_2);
                        Animation bounce_up = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce_up);
                        imageView.startAnimation(bounce_up);
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                imageView.setImageResource(R.drawable.bounce_angela_3);
                                Animation bounce_down = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce_down);
                                imageView.startAnimation(bounce_down);
                                Handler handler = new Handler();
                                handler.postDelayed(new Runnable() {
                                    public void run() {
                                        Animation get_off_trampoline = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.get_off_trampoline);
                                        imageView.startAnimation(get_off_trampoline);
                                        imageView.setImageResource(R.drawable.bounce_angela_4);
                                    }
                                }, 1700);
                            }
                        }, 850);
                    }
                }, 700);
            }
        });
    }
}