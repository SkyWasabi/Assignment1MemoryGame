package com.example.dakeh.assignment1memorygame;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.Image;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by dakeh on 4/8/2016.
 */
public class TileView extends LinearLayout implements TileInterface {
    ImageView imageView;

    public TileView(Context context, AttributeSet attrs) {
        super(context, attrs);

        imageView = new ImageView(context);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 250));
        Resources res = getResources();
        imageView.setBackgroundColor(Color.GREEN);
        imageView.setImageDrawable(res.getDrawable(R.drawable.question));
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setClickable(true);

        addView(imageView);

    }


    public void revealimg(ImageView imgview) {
        Resources res = getResources();
        imgview.setImageDrawable(res.getDrawable(R.drawable.lake));
    }

    public void coverimg(ImageView imgview) {
        Resources res = getResources();
        imgview.setImageDrawable(res.getDrawable(R.drawable.question));
    }

    public void hideimg(ImageView imgview) {
        imgview.setImageAlpha(0);
    }


    public void didSelectTile(TileView tileView)
    {
        tileView.imageView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("Check", "Click");
            }
        });
    }
}
