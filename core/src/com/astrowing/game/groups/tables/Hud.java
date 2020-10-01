package com.astrowing.game.groups.tables;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.astrowing.game.GameScreen;
import com.astrowing.game.groups.Tile;

public class Hud extends Table
{
    // =====================================================
    // FIELDS
    // =====================================================

    public static final Texture          TEXTURE = new Texture("core/assets/hud.png");
    public final        GameScreen<?, ?> GAME_SCREEN;

    // =====================================================
    // CONSTRUCTORS
    // =====================================================

    public Hud(GameScreen<?, ?> gameScreen)
    {
        GAME_SCREEN = gameScreen;
        setBounds(9f * Tile.WIDTH_IN_PIXELS, 0f, Tile.WIDTH_IN_PIXELS, 9f * Tile.HEIGHT_IN_PIXELS);
    }

    // =====================================================
    // METHODS
    // =====================================================

    // nothing
}
