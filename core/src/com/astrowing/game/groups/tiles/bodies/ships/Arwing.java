package com.astrowing.game.groups.tiles.bodies.ships;

import com.astrowing.game.groups.tiles.Area;
import com.astrowing.game.groups.tiles.bodies.Ship;

public class Arwing extends Ship
{
    // =====================================================
    // FIELDS
    // =====================================================

    // nothing

    // =====================================================
    // CONSTRUCTORS
    // =====================================================

    public Arwing(Area area)
    {
        super(0, 1, area);
    }

    // =====================================================
    // METHODS
    // =====================================================

    /**
     * @param areaToMoveTo Die Area, auf die das Gefährt bewegt werden soll.
     * @return Gibt wahr zurück, wenn sich das Gefährt bewegen darf.
     */
    @Override public boolean canMoveToArea(Area areaToMoveTo)
    {
        return super.canMoveToArea(areaToMoveTo);
    }

    /**
     * Wird aufgerufen, nachdem das Gefährt bewegt wurde.
     */
    @Override protected void didMove()
    {
        super.didMove();

    }

    /**
     * @param object Das Objekt, das ausgestrahlt werden soll.
     * @return Gibt wahr zurück, wenn das Gefährt ausstrahlen darf.
     */
    @Override protected boolean canBroadcast(Object object)
    {
        return super.canBroadcast(object);
    }

    /**
     * Wird aufgerufen, nachdem das Gefährt ausgestrahlt hat.
     * @param object Das Objekt, das ausgestrahlt wurde.
     */
    @Override protected void didBroadcast(Object object)
    {
        super.didBroadcast(object);

    }
}
