package com.astrowing.game.groups.tiles.bodies;

import com.astrowing.game.groups.tiles.Area;
import com.astrowing.game.groups.tiles.Body;

public class Probe extends Body
{
    // =====================================================
    // FIELDS
    // =====================================================

    //nothing

    // =====================================================
    // CONSTRUCTORS
    // =====================================================

    public Probe(Area area)
    {
        super(3, 0, area);
    }

    // =====================================================
    // METHODS
    // =====================================================

    @Override public void moveToArea(Area areaToMoveTo)
    {
        area = areaToMoveTo;
        areaToMoveTo.addActorAt(0, this);
    }
}
