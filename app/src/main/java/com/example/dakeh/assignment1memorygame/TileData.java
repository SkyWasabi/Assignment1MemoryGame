package com.example.dakeh.assignment1memorygame;


import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.widget.ImageView;
import android.widget.LinearLayout;


/**
 * Created by dakeh on 4/6/2016.
 */

public class TileData{

    Context context;
    ImageView img = new ImageView(context);
    int imgidentifier;

    public TileData(int imageid, int id, Context context) {
        this.context = context;
        img.setImageResource(imageid);
        imgidentifier = id;
    }

    public void setimg(int imageid) {
        //img.setImageResource(imageid);
    }


    public void setidentifier(int identifier) {
        imgidentifier = identifier;
    }

    public int getidentifier() {
        return imgidentifier;
    }
}
