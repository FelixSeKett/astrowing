package com.astrowing.game.gameScreens;

import com.astrowing.game.GameScreen;
import com.astrowing.game.Map;
import com.astrowing.game.groups.World;
import com.astrowing.game.groups.tables.Hud;
import com.astrowing.game.groups.worlds.ManuWorld;

public class ManuGameScreen extends GameScreen<World<?>, Hud>
{
    // =====================================================
    // FIELDS
    // =====================================================

    // nothing

    // =====================================================
    // CONSTRUCTORS
    // =====================================================

    public ManuGameScreen(Map map)
    {
        super(map);
    }

    // =====================================================
    // METHODS
    // =====================================================

    @Override protected ManuWorld createWorld(Map map)
    {
        return new ManuWorld(this, map);
    }

    @Override protected Hud createHud()
    {
        return new Hud(this);
    }
}
