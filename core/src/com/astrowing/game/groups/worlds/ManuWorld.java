package com.astrowing.game.groups.worlds;

import com.astrowing.game.GameScreen;
import com.astrowing.game.Map;
import com.astrowing.game.groups.World;
import com.astrowing.game.groups.tiles.bodies.Ship;

public class ManuWorld extends World<Ship>
{
    // =====================================================
    // FIELDS
    // =====================================================

    // nothing

    // =====================================================
    // CONSTRUCTORS
    // =====================================================

    public ManuWorld(GameScreen<?, ?> gameScreen, Map map)
    {
        super(gameScreen, map);
    }

    // =====================================================
    // METHODS
    // =====================================================

    @Override protected Ship createShip()
    {
        return new Ship(AREAS[3][3]);
    }
}
