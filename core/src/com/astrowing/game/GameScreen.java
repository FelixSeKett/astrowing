package com.astrowing.game;

import com.astrowing.game.games.Astrowing;
import com.astrowing.game.groups.World;
import com.astrowing.game.groups.tiles.bodies.Ship;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.astrowing.game.groups.tables.Hud;
import com.astrowing.game.groups.Tile;

public abstract class GameScreen<W extends World, H extends Hud> implements Screen
{
    // =====================================================
    // FIELDS
    // =====================================================

    public static final int      WIDTH_IN_TILES   = 10;
    public static final int      HEIGHT_IN_TILES  = 9;
    public static final int      WIDTH_IN_PIXELS  = WIDTH_IN_TILES * Tile.WIDTH_IN_PIXELS;
    public static final int      HEIGHT_IN_PIXELS = HEIGHT_IN_TILES * Tile.HEIGHT_IN_PIXELS;
    protected final     Stage    STAGE;
    protected final     W        WORLD;
    protected final     H        HUD;
    private final       Viewport VIEWPORT;

    // =====================================================
    // CONSTRUCTORS
    // =====================================================

    public GameScreen(Map map)
    {
        VIEWPORT = new FitViewport(WIDTH_IN_PIXELS, HEIGHT_IN_PIXELS);
        STAGE    = new Stage();
        WORLD    = createWorld(map);
        HUD      = createHud();
        STAGE.addActor(WORLD);
        STAGE.addActor(HUD);
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
    }

    protected W createWorld(Map map)
    {
        return new World(this, map);
    }

    protected abstract H createHud();
}