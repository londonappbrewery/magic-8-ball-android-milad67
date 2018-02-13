package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView eightBallImageView = (ImageView) findViewById(R.id.eightBallImageView);
        Button askButoon = (Button) findViewById(R.id.askButton);

        final int [] imageId =
                {
                        R.drawable.ball1_2x,
                        R.drawable.ball2_2x,
                        R.drawable.ball3_2x,
                        R.drawable.ball4_2x,
                        R.drawable.ball5_2x,
                };

        askButoon.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                eightBallImageView.setImageResource(imageId[new Random().nextInt(5)]);

            }
        });

    }
}
