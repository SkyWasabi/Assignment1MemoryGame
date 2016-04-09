package com.example.dakeh.assignment1memorygame;


import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements gameinterface, TileInterface{

    GameModel gm;
    TileView[] tva;
    int numtiles = 12;
    TypedArray imgar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();



        tva = new TileView[] {
                (TileView) findViewById(R.id.grid11),
                (TileView) findViewById(R.id.grid12),
                (TileView) findViewById(R.id.grid13),
                (TileView) findViewById(R.id.grid14),
                (TileView) findViewById(R.id.grid21),
                (TileView) findViewById(R.id.grid22),
                (TileView) findViewById(R.id.grid23),
                (TileView) findViewById(R.id.grid24),
                (TileView) findViewById(R.id.grid31),
                (TileView) findViewById(R.id.grid32),
                (TileView) findViewById(R.id.grid33),
                (TileView) findViewById(R.id.grid34)
        };



        imgar = getResources().obtainTypedArray(R.array.imgarr);
        gm = new GameModel(numtiles, imgar, this);
        gm.mgameinterface = this;

        for (int i = 0; i < numtiles; i++) {
            tva[i].image = gm.tda.get(i).img;
            tva[i].tileindex = i;
            tva[i].mTileInterface = this;
            tva[i].coverimg(tva[i].imageView);
        }



    }

    public void gameDidComplete(GameModel gameModel, int score)
    {
        if (gameModel.matchedtiles == numtiles)
        {
            gameModel.reset(numtiles,imgar);
            Intent myIntent = new Intent(MainActivity.this, CompleteActivity.class);
            Log.d("Check score", String.valueOf(score));
            myIntent.putExtra("score", String.valueOf(score));
            MainActivity.this.startActivity(myIntent);
        }
    }

    public void didMatchTile(GameModel gameModel, final int tileIndex, final int previousTileIndex)
    {
        gameModel.matchedtiles++;
        new CountDownTimer(6000, 1000) {
            public  void onTick(long millisUntilFinished) {

            }

            public void onFinish() {
                tva[tileIndex].hideimg(tva[tileIndex].imageView);
                tva[previousTileIndex].hideimg(tva[previousTileIndex].imageView);
            }
        }.start();

    }

    public void didFailToMatch(final int tileIndex, final int previousTileIndex)
    {
        new CountDownTimer(6000, 1000) {
            public  void onTick(long millisUntilFinished) {

            }

            public void onFinish() {
                tva[tileIndex].coverimg(tva[tileIndex].imageView);
                tva[previousTileIndex].coverimg(tva[previousTileIndex].imageView);
            }
        }.start();

    }

    public void scoreDidUpdate(int newScore)
    {
        TextView gamescore = (TextView) findViewById(R.id.score);
        gamescore.setText(String.valueOf(newScore) + " points");
    }

    @Override
    public void didSelectTile(TileView tileView) {
            tileView.revealimg(tileView.imageView);
            gm.pushTileIndex(tileView.tileindex);

    }
}
