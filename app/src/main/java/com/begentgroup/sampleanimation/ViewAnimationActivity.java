package com.begentgroup.sampleanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class ViewAnimationActivity extends AppCompatActivity {

    ImageView animationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_animation);
        animationView = (ImageView)findViewById(R.id.image_animation);
        animationView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ViewAnimationActivity.this, "image click", Toast.LENGTH_SHORT).show();
            }
        });
        Button btn = (Button)findViewById(R.id.btn_translate);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils.loadAnimation(ViewAnimationActivity.this, R.anim.translate);
                animationView.startAnimation(anim);
            }
        });

        btn = (Button)findViewById(R.id.btn_rotate);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils
                        .loadAnimation(ViewAnimationActivity.this, R.anim.rotate);
                animationView.startAnimation(anim);
            }
        });

        btn = (Button)findViewById(R.id.btn_scale);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils
                        .loadAnimation(ViewAnimationActivity.this, R.anim.scale);
                animationView.startAnimation(anim);
            }
        });

        btn = (Button)findViewById(R.id.btn_alpha);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils
                        .loadAnimation(ViewAnimationActivity.this, R.anim.alpha);
                animationView.startAnimation(anim);
            }
        });

        btn = (Button)findViewById(R.id.btn_set1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils
                        .loadAnimation(ViewAnimationActivity.this, R.anim.set1);
                animationView.startAnimation(anim);
            }
        });

        btn = (Button)findViewById(R.id.btn_set2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils
                        .loadAnimation(ViewAnimationActivity.this, R.anim.set2);
                animationView.startAnimation(anim);
            }
        });

    }
}
