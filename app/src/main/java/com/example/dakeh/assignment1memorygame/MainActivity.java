package com.example.dakeh.assignment1memorygame;


import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int numtiles = 12;
        TypedArray imgar = getResources().obtainTypedArray(R.array.imgarr);


        GameModel gm = new GameModel(numtiles, imgar, this);
        //Log.d("Check data", gm.toString());

        //Log.d("Display all identifier", gm.toString());

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
