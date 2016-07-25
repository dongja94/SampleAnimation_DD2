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

        btn = (Button)findViewById(R.id.btn_slide_in);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils
                        .loadAnimation(ViewAnimationActivity.this, R.anim.slide_in);
                anim.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        animationView.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                animationView.startAnimation(anim);
            }
        });

        btn = (Button)findViewById(R.id.btn_slide_out);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils
                        .loadAnimation(ViewAnimationActivity.this, R.anim.slide_out);
                anim.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        animationView.setVisibility(View.GONE);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                animationView.startAnimation(anim);
            }
        });

        btn = (Button)findViewById(R.id.btn_slide_up_in);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils
                        .loadAnimation(ViewAnimationActivity.this, R.anim.slide_up_in);
                anim.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        animationView.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                animationView.startAnimation(anim);
            }
        });

        btn = (Button)findViewById(R.id.btn_slide_up_out);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = AnimationUtils
                        .loadAnimation(ViewAnimationActivity.this, R.anim.slide_up_out);
                anim.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        animationView.setVisibility(View.GONE);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                animationView.startAnimation(anim);
            }
        });

        btn = (Button)findViewById(R.id.btn_custom_anim);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation anim = new MyCustomAnimation();
                anim.setDuration(1000);
                animationView.startAnimation(anim);
            }
        });

    }
}
