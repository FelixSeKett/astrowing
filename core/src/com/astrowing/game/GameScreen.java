package com.astrowing.game;

import com.astrowing.game.games.Astrowing;
import com.astrowing.game.groups.World;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.astrowing.game.groups.Tile;

public class GameScreen implements Screen
{
    // =====================================================
    // FIELDS
    // =====================================================

    private static final int      WIDTH_IN_TILES   = 10;
    private static final int      HEIGHT_IN_TILES  = 9;
    public static final  int      WIDTH_IN_PIXELS  = WIDTH_IN_TILES * Tile.WIDTH_IN_PIXELS;
    public static final  int      HEIGHT_IN_PIXELS = HEIGHT_IN_TILES * Tile.HEIGHT_IN_PIXELS;
    private final        Stage    STAGE;
    private final        Viewport VIEWPORT;
    private final        World    WORLD;

    // =====================================================
    // CONSTRUCTORS
    // =====================================================

    public GameScreen(Map map)
    {
        VIEWPORT = new FitViewport(WIDTH_IN_PIXELS, HEIGHT_IN_PIXELS);
        STAGE    = new Stage();
        WORLD    = new World(this, map, STAGE);
        STAGE.addActor(WORLD);
    }

    // =====================================================
    // METHODS
    // =====================================================

    @Override public void show()
    {
        STAGE.setDebugAll(Astrowing.DEBUG);
        Gdx.input.setInputProcessor(STAGE);
        STAGE.setViewport(VIEWPORT);
        VIEWPORT.apply(true);
    }

    @Override public void render(float delta)
    {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        STAGE.act();
        STAGE.draw();
    }

    @Override public void resize(int width, int height)
    {
        VIEWPORT.update(width, height);
    }

    @Override public void pause()
    {
    }

    @Override public void resume()
    {
    }

    @Override public void hide()
    {
    }

    @Override public void dispose()
    {
        World.TEXTURE.dispose();
    }
}