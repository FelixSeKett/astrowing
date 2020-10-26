package com.astrowing.game.groups.tiles.bodies.ships;

import com.astrowing.game.FuelTank;
import com.astrowing.game.Pilot;
import com.astrowing.game.groups.tiles.Area;
import com.astrowing.game.groups.tiles.bodies.Ship;

public class Arwing extends Ship
{
    // =====================================================
    // FIELDS
    // =====================================================

    private final FuelTank FUEL_TANK;
    private       Pilot[]  pilots; // Array (Liste)

    // =====================================================
    // CONSTRUCTORS
    // =====================================================

    public Arwing(Area area)
    {
        super(0, 1, area);
        FUEL_TANK = new FuelTank(this); // Aufruf des Konstruktors
        pilots    = new Pilot[4]; // Initialisierung eines Arrays vom Datentyp Pilot
        pilots[0] = new Pilot("Fox", "McCloud"); // Initialisierung eines Pilots und Zuweisung zu einem Array-Slot
        pilots[1] = new Pilot("Peppy", "Hare");
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
        if (FUEL_TANK.giveFuel() > 0) {
            return super.canMoveToArea(areaToMoveTo);
        } else {
            return false;
        }
    }

    /**
     * Wird aufgerufen, nachdem das Gefährt bewegt wurde.
     */
    @Override protected void didMove()
    {
        super.didMove();
        FUEL_TANK.decreaseFuel();
        if (area.hasSatellite()) {
            FUEL_TANK.refill();
        }
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
     *
     * @param object Das Objekt, das ausgestrahlt wurde.
     */
    @Override protected void didBroadcast(Object object)
    {
        super.didBroadcast(object);

    }
}
