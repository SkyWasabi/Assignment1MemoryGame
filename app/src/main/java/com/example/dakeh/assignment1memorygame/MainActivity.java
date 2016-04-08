package com.example.dakeh.assignment1memorygame;


import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements gameinterface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int numtiles = 8;
        TypedArray imgar = getResources().obtainTypedArray(R.array.imgarr);


        GameModel gm = new GameModel(numtiles, imgar, this);
        //Log.d("Check data", gm.toString());

        Log.d("Display all identifier", gm.toString());



    }

    public void gameDidComplete(GameModel gameModel)
    {

    }

    public void didMatchTile(GameModel gameModel, int tileIndex, int previousTileIndex)
    {

    }

    public void didFailToMatch(GameModel gameModel, int tileIndex, int previousTileIndex)
    {

    }

    public void scoreDidUpdate(GameModel gameModel, int newScore)
    {

    }
}
