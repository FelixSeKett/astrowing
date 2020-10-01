package com.astrowing.game.groups.worlds;

import com.astrowing.game.GameScreen;
import com.astrowing.game.Map;
import com.astrowing.game.groups.World;
import com.astrowing.game.groups.tiles.bodies.ships.AutoShip;
import com.astrowing.game.groups.tiles.bodies.ships.autoShips.Arwing;

public class AutoWorld extends World<AutoShip>
{
    // =====================================================
    // FIELDS
    // =====================================================

    // nothing

    // =====================================================
    // CONSTRUCTORS
    // =====================================================

    public AutoWorld(GameScreen<?, ?> gameScreen, Map map)
    {
        super(gameScreen, map);
    }

    // =====================================================
    // METHODS
    // =====================================================

    @Override protected AutoShip createShip()
    {
        return new Arwing(AREAS[3][3]);
    }

    public void play()
    {
        SHIP.play();
    }

    public void stop()
    {
        SHIP.stop();
    }
}
