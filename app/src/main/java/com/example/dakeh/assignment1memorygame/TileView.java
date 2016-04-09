package com.example.dakeh.assignment1memorygame;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
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
public class TileView extends LinearLayout implements View.OnClickListener {
    Drawable image;
    ImageView imageView;
    int tileindex;
    public TileInterface mTileInterface;

    public TileView(Context context, AttributeSet attrs) {
        super(context, attrs);

        imageView = new ImageView(context);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 250));
        Resources res = getResources();
        imageView.setBackgroundColor(Color.WHITE);
        imageView.setImageDrawable(res.getDrawable(R.drawable.question));
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setClickable(true);

        imageView.setOnClickListener(this);




        addView(imageView);

    }

    public TileView(Context context) {
        super(context);
    }

    public void revealimg(ImageView imgview) {
        imgview.setImageDrawable(image);

    }

    public void coverimg(ImageView imgview) {
        Resources res = getResources();
        imgview.setImageDrawable(res.getDrawable(R.drawable.question));
    }

    public void hideimg(ImageView imgview) {
        imgview.setImageAlpha(0);
    }

    @Override
    public void onClick(View v) {

        mTileInterface.didSelectTile(this);
    }
}
