package com.example.animation1;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    AnimationDrawable bettteryAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.image);
        imageView.setBackgroundResource(R.drawable.betttery_animation);
        bettteryAnimation = (AnimationDrawable) imageView.getBackground();
    }


//    Below method will change the image.
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        bettteryAnimation.start();
    }

    public void next_Activity_button(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);


    }
}
