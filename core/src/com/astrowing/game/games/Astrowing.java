package com.astrowing.game.games;

import com.astrowing.game.GameScreen;
import com.astrowing.game.Map;
import com.astrowing.game.gameScreens.AutoGameScreen;
import com.badlogic.gdx.Application;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

public class Astrowing extends Game
{
    // =====================================================
    // FIELDS
    // =====================================================

    public static final boolean DEBUG            = true;
    public static final int     SPEED_MULTIPLIER = 3;

    // =====================================================
    // METHODS
    // =====================================================

    @Override public void create()
    {
        GameScreen<?, ?> gameScreen = new AutoGameScreen(Map.ASTEROID_FIELD);
        setScreen(gameScreen);
        Gdx.app.setLogLevel(Application.LOG_DEBUG);
    }
}