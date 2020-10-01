package com.astrowing.game.groups.tables.buttons;

import com.astrowing.game.gameScreens.AutoGameScreen;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.astrowing.game.groups.Tile;
import com.astrowing.game.groups.tables.Hud;

public class StopImageButton extends ImageButton
{
    // =====================================================
    // FIELDS
    // =====================================================

    // nothing

    // =====================================================
    // CONSTRUCTORS
    // =====================================================

    public StopImageButton(final AutoGameScreen AUTO_GAME_SCREEN)
    {
        super(new TextureRegionDrawable(new TextureRegion(Hud.TEXTURE,
                                                          Tile.WIDTH_IN_PIXELS,
                                                          0,
                                                          Tile.WIDTH_IN_PIXELS,
                                                          Tile.HEIGHT_IN_PIXELS)),
              new TextureRegionDrawable(new TextureRegion(Hud.TEXTURE,
                                                          Tile.WIDTH_IN_PIXELS,
                                                          Tile.HEIGHT_IN_PIXELS,
                                                          Tile.WIDTH_IN_PIXELS,
                                                          Tile.HEIGHT_IN_PIXELS)));
        addListener(new ClickListener()
        {
            @Override public void clicked(InputEvent event, float x, float y)
            {
                AUTO_GAME_SCREEN.stop();
            }
        });
    }

    // =====================================================
    // METHODS
    // =====================================================

    // nothing
}
