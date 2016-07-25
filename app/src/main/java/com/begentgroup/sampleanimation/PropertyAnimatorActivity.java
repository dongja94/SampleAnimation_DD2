package com.begentgroup.sampleanimation;

import android.animation.AnimatorInflater;
import android.animation.ArgbEvaluator;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PropertyAnimatorActivity extends AppCompatActivity {

    TextView animatorView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_animator);
        animatorView = (TextView)findViewById(R.id.text_animator);

        animatorView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PropertyAnimatorActivity.this, "text click", Toast.LENGTH_SHORT).show();
            }
        });
        Button btn = (Button)findViewById(R.id.btn_color);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueAnimator animator = ValueAnimator.ofInt(Color.RED, Color.BLUE);
                animator.setEvaluator(new ArgbEvaluator());
                animator.setDuration(1000);
                animator.setInterpolator(new AccelerateInterpolator());
                animator.setRepeatCount(ValueAnimator.INFINITE);
                animator.setRepeatMode(ValueAnimator.REVERSE);
                animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int color = (Integer)valueAnimator.getAnimatedValue();
                        animatorView.setTextColor(color);
                    }
                });
                animator.start();
            }
        });

        btn = (Button)findViewById(R.id.btn_size);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float min = getResources().getDimension(R.dimen.min_text_size);
                float max = getResources().getDimension(R.dimen.max_text_size);
                ValueAnimator animator = ValueAnimator.ofFloat(min, max);
                animator.setEvaluator(new FloatEvaluator());
                animator.setDuration(1000);
                animator.setRepeatCount(ValueAnimator.INFINITE);
                animator.setRepeatMode(ValueAnimator.REVERSE);
                animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float size = (Float)valueAnimator.getAnimatedValue();
                        animatorView.setTextSize(size);
                    }
                });
                animator.start();
            }
        });

        btn = (Button)findViewById(R.id.btn_translate);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float startX = getResources().getDimension(R.dimen.start_x);
                float endX = getResources().getDimension(R.dimen.end_x);
                ValueAnimator animator = ValueAnimator.ofFloat(startX, endX);
                animator.setEvaluator(new FloatEvaluator());
                animator.setDuration(1000);
                animator.setRepeatCount(ValueAnimator.INFINITE);
                animator.setRepeatMode(ValueAnimator.REVERSE);
                animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float x = (Float)valueAnimator.getAnimatedValue();
                        animatorView.setX(x);
                    }
                });
                animator.start();
            }
        });

        btn = (Button)findViewById(R.id.btn_xml);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ValueAnimator animator = (ValueAnimator)AnimatorInflater.loadAnimator(PropertyAnimatorActivity.this, R.animator.text_color);
                animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        animatorView.setTextColor((Integer)valueAnimator.getAnimatedValue());
                    }
                });
                animator.start();
            }
        });

        btn = (Button)findViewById(R.id.btn_object_color);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ObjectAnimator animator = ObjectAnimator.ofInt(animatorView, "textColor", Color.RED, Color.BLUE);
                animator.setEvaluator(new ArgbEvaluator());
                animator.setDuration(1000);
                animator.setInterpolator(new AccelerateInterpolator());
                animator.setRepeatCount(ValueAnimator.INFINITE);
                animator.setRepeatMode(ValueAnimator.REVERSE);
                animator.start();
            }
        });

        btn = (Button)findViewById(R.id.btn_object_xml);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ObjectAnimator animator = (ObjectAnimator)AnimatorInflater.loadAnimator(PropertyAnimatorActivity.this, R.animator.object_text_color);
                animator.setTarget(animatorView);
                animator.start();
            }
        });

    }
}
