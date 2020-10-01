package com.astrowing.game.desktop;

import com.astrowing.game.GameScreen;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.astrowing.game.games.Astrowing;

public class DesktopLauncher
{
    public static void main(String[] arg)
    {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        int                           scale  = 4;
        config.width  = GameScreen.WIDTH_IN_PIXELS * scale;
        config.height = GameScreen.HEIGHT_IN_PIXELS * scale;
        new LwjglApplication(new Astrowing(), config);
    }
}
