package com.example.dakeh.assignment1memorygame;


import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;


/**
 * Created by dakeh on 4/6/2016.
 */

public class TileData{
    Context context;
    Activity activity;
    int imgidentifier;
    Drawable img;


    public TileData(int imageid, int id) {

        img = Drawable.createFromPath("@drawable/baldhill");
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
