package com.astrowing.game.groups.tables.huds;

import com.astrowing.game.gameScreens.AutoGameScreen;
import com.astrowing.game.groups.tables.Hud;
import com.astrowing.game.groups.tables.buttons.PlayImageButton;
import com.astrowing.game.groups.tables.buttons.StopImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;

public class AutoHud extends Hud
{
    // =====================================================
    // FIELDS
    // =====================================================

    // nothing

    // =====================================================
    // CONSTRUCTORS
    // =====================================================

    public AutoHud(AutoGameScreen autoGameScreen)
    {
        super(autoGameScreen);
        ImageButton playImageButton = new PlayImageButton(autoGameScreen);
        add(playImageButton);
        row();
        ImageButton stopImageButton = new StopImageButton(autoGameScreen);
        add(stopImageButton);
    }

    // =====================================================
    // METHODS
    // =====================================================

    // nothing
}
