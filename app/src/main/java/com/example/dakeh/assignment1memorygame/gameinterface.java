package com.example.dakeh.assignment1memorygame;

/**
 * Created by dakeh on 4/6/2016.
 */
public interface gameinterface {
    void gameDidComplete(GameModel gameModel);
    void didMatchTile(GameModel gameModel, int tileIndex, int previousTileIndex);
    void didFailToMatch(GameModel gameModel, int tileIndex, int previousTileIndex);
    void scoreDidUpdate(GameModel gameModel, int newScore);
}
