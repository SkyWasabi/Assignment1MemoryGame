package com.example.dakeh.assignment1memorygame;

/**
 * Created by dakeh on 4/6/2016.
 */
public interface gameinterface {
    void gameDidComplete(GameModel gameModel, int score);
    void didMatchTile(GameModel gameModel,int tileIndex, int previousTileIndex);
    void didFailToMatch(int tileIndex, int previousTileIndex);
    void scoreDidUpdate(int newScore);
}
