package com.stylingandroid.animatedvectordrawable.isometric;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startAnimation();
    }

    private void startAnimation() {
        ImageView imageView = (ImageView) findViewById(R.id.animated_image);
        if (imageView != null) {
            startImageViewAnimation(imageView);
        }
    }

    private void startImageViewAnimation(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            startAnimatableAnimation((Animatable) drawable);
        }
    }

    private void startAnimatableAnimation(Animatable animatable) {
        animatable.start();
    }
}
