package com.example.dakeh.assignment1memorygame;

import android.content.res.Resources;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by dakeh on 4/6/2016.
 */

public class TileData extends Object{
    ImageView img;
    int imgidentifier;

    public TileData(int imageid, int id) {
        //img.setImageResource(imageid);
        imgidentifier = id;
    }

    public void setimg(int imageid) {
        //img.setImageResource(imageid);
    }
    public int getimageid() {
        return img.getId();
    }

    public void setidentifier(int identifier) {
        imgidentifier = identifier;
    }

    public int getidentifier() {
        return imgidentifier;
    }
}
