package com.example.dakeh.assignment1memorygame;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by dakeh on 4/6/2016.
 */

public class TileData extends Object{
    Drawable img;
    int imgidentifier;

    public TileData(Drawable image, int id) {
        img = image;
        imgidentifier = id;
    }


    public void setidentifier(int identifier) {
        imgidentifier = identifier;
    }

    public int getidentifier() {
        return imgidentifier;
    }
}
