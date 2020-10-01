package com.astrowing.game.gameScreens;

import com.astrowing.game.GameScreen;
import com.astrowing.game.Map;
import com.astrowing.game.groups.tables.huds.AutoHud;
import com.astrowing.game.groups.worlds.AutoWorld;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.ui.Label;

public class AutoGameScreen extends GameScreen<AutoWorld, AutoHud>
{
    // =====================================================
    // FIELDS
    // =====================================================

    private boolean run;

    // =====================================================
    // CONSTRUCTORS
    // =====================================================

    public AutoGameScreen(Map map)
    {
        super(map);
        run = true;
    }

    // =====================================================
    // METHODS
    // =====================================================

    @Override protected AutoWorld createWorld(Map map)
    {
        return new AutoWorld(this, map);
    }

    @Override protected AutoHud createHud()
    {
        return new AutoHud(this);
    }

    public void play()
    {
        if (run) {
            WORLD.play();
        }
    }

    public void stop()
    {
        if (run) {
            WORLD.stop();
        }
    }

    public void cancel(String string)
    {
        Gdx.app.log("ERROR", string);
        stop();
        run = false;
        createLabel();
    }

    private void createLabel()
    {
        Label.LabelStyle labelStyle = new Label.LabelStyle();
        labelStyle.font      = new BitmapFont();
        labelStyle.fontColor = Color.WHITE;
        Label label = new Label("ERROR", labelStyle);
        float x     = STAGE.getWidth() / 2f - label.getWidth() / 2f;
        float y     = STAGE.getHeight() / 2f - label.getHeight() / 2f;
        label.setPosition(x, y);
        STAGE.addActor(label);
    }
}
