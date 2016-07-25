package com.begentgroup.sampleanimation;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/**
 * Created by Administrator on 2016-07-25.
 */
public class MyCustomAnimation extends Animation {

    int totalDeltaX, totalDeltaY;

    @Override
    public void initialize(int width, int height, int parentWidth, int parentHeight) {
        super.initialize(width, height, parentWidth, parentHeight);
        totalDeltaX = parentWidth - width;
        totalDeltaY = parentHeight - height;
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        super.applyTransformation(interpolatedTime, t);
        float dx = interpolatedTime * totalDeltaX;
        float dy = interpolatedTime * interpolatedTime * totalDeltaY;

        t.getMatrix().setTranslate(dx, dy);
    }
}
