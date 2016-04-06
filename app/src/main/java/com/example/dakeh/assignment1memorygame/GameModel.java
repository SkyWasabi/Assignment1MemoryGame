package com.example.dakeh.assignment1memorygame;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Log;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by dakeh on 4/6/2016.
 */
public class GameModel {

    int indexlasttap;
    int indexsecondlasttap;
    ArrayList<TileData> td = new ArrayList<TileData>();
    boolean firstorsecondturn;
    int matchedtiles;
    int matchscore;

    public GameModel(int numtiles, TypedArray imgarray) {
        reset(numtiles, imgarray);
    }

    public void reset(int numtiles, TypedArray imgarray) {
        indexlasttap = -1;
        indexsecondlasttap = -1;
        firstorsecondturn = false;
        matchedtiles = 0;
        matchscore = 0;

        int numberofpic = imgarray.length();
        int picindex = 0;
        int identifier = 0;

        String check = String.valueOf(numtiles);
        //Log.d("check: ", check);

        for (int i = 0; i < numtiles/2; i++) {

            if (picindex >= numberofpic)
            {
                picindex = 0;
            }

            identifier = imgarray.getResourceId(picindex, 0);

            //Log.d("check: ", String.valueOf(identifier));

            td.add(new TileData(identifier, picindex));
            td.add(new TileData(identifier, picindex));
            picindex++;

        }

        Collections.shuffle(td);
    }

    public String toString() {
        String id = " ";

        for (int i = 0; i < td.size(); i++)
        {
            id += td.get(i).imgidentifier + ", ";
        }

        return id;
    }

    public void pushTileIndex(int tileindex) {
        if (indexlasttap != -1)
        {
            indexsecondlasttap = indexlasttap;
        }

        indexlasttap = tileindex;


    }


}
