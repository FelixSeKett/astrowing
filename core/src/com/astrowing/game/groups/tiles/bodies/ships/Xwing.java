package com.astrowing.game.groups.tiles.bodies.ships;

import com.astrowing.game.groups.tiles.Area;
import com.astrowing.game.groups.tiles.bodies.Ship;

public class Xwing extends Ship
{
    // =====================================================
    // FIELDS
    // =====================================================

    // nothing

    // =====================================================
    // CONSTRUCTORS
    // =====================================================

    public Xwing(Area area)
    {
        super(1, 1, area);
    }

    // =====================================================
    // METHODS
    // =====================================================

    @Override protected void didMove()
    {
        super.didMove(); // Wichtig!
        broadcast();
    }
}
