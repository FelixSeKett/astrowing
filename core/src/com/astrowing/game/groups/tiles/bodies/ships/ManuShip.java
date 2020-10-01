package com.astrowing.game.groups.tiles.bodies.ships;

import com.astrowing.game.groups.tiles.Area;
import com.astrowing.game.groups.tiles.bodies.Ship;

public class ManuShip extends Ship
{
    // =====================================================
    // FIELDS
    // =====================================================

    // nothing

    // =====================================================
    // CONSTRUCTORS
    // =====================================================

    public ManuShip(Area area)
    {
        super(area);
    }

    // =====================================================
    // METHODS
    // =====================================================

    public boolean canMove()
    {
        Area newFloor = area.WORLD.giveArea(area, sightDirection);
        return newFloor != null;
    }

    public boolean passesProbe()
    {
        return area.hasProbe();
    }

    public boolean detectsAsteroid()
    {
        Area frontArea = area.WORLD.giveArea(area, sightDirection);
        return frontArea.isBlocked();
    }
}
