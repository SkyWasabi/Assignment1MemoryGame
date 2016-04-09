package com.example.dakeh.assignment1memorygame;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.provider.ContactsContract;
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

    public class TileData {
        Drawable img;
        int imgidentifier;

        public TileData(Drawable d, int id) {
            img = d;
            imgidentifier = id;
        }
    }

    int indexlasttap;
    int indexsecondlasttap;
    ArrayList<TileData> tda = new ArrayList<TileData>();
    boolean firstorsecondturn;
    int matchedtiles;
    int matchscore;
    Activity activity;
    public gameinterface mgameinterface;




    public GameModel(int numtiles, TypedArray imgarray, Activity activity) {
        reset(numtiles, imgarray);
        this.activity = activity;

    }

    public void reset(int numtiles, TypedArray imgarray) {
        indexlasttap = -1;
        indexsecondlasttap = -1;
        firstorsecondturn = false;
        matchedtiles = 0;
        matchscore = 0;

        int numberofpic = imgarray.length();
        Log.d("Check array length", String .valueOf(numberofpic));
        int picindex = 0;
        Drawable draw;

        String check = String.valueOf(numtiles);
        //Log.d("check: ", check);

        for (int i = 0; i < numtiles; i++) {

            if (picindex == numberofpic)
            {
                picindex = 0;
            }

            draw = imgarray.getDrawable(picindex);

            tda.add(new TileData(draw, picindex));
            picindex++;

        }

        Collections.shuffle(tda);

        for (int i = 0; i < numtiles; i++)
        {
            Log.d("Check pic index", String.valueOf(tda.get(i).imgidentifier));
        }
    }

    public String toString() {
        String id = " ";

        for (int i = 0; i < tda.size(); i++)
        {
            id += tda.get(i).imgidentifier + ", ";
        }

        return id;
    }

    public void pushTileIndex(int tileindex) {

        if (firstorsecondturn == true)
        {
            indexsecondlasttap = indexlasttap;

        }


        indexlasttap = tileindex;

        if (firstorsecondturn == true)
        {
            if (tda.get(indexlasttap).imgidentifier == tda.get(indexsecondlasttap).imgidentifier)
            {
                matchedtiles++;
                matchscore = matchscore + 200;
                mgameinterface.didMatchTile(this, indexlasttap, indexsecondlasttap);
                mgameinterface.scoreDidUpdate(matchscore);
            }
            else
            {
                matchscore = matchscore - 100;
                mgameinterface.didFailToMatch(indexlasttap, indexsecondlasttap);
                mgameinterface.scoreDidUpdate(matchscore);
            }
            firstorsecondturn = false;
            indexlasttap = -1;
            indexsecondlasttap = -1;
            mgameinterface.gameDidComplete(this, matchscore);

        }

        else
        {
            firstorsecondturn = true;
        }

    }

    public int getscore() {
        return matchscore;
    }


}
