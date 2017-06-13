package com.example.uberv.animateddrawables;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onStartAnimation(View view) {
        ImageView squareImage = (ImageView) findViewById(R.id.imageView);
        squareImage.setBackgroundResource(R.drawable.square_loading);
        AnimationDrawable squareAnimation = (AnimationDrawable) squareImage.getBackground();
        squareAnimation.start();
    }
}
