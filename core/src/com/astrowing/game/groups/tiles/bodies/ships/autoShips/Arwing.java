package com.astrowing.game.groups.tiles.bodies.ships.autoShips;

import com.astrowing.game.gameScreens.AutoGameScreen;
import com.astrowing.game.groups.tiles.Area;
import com.astrowing.game.groups.tiles.bodies.ships.AutoShip;

public class Arwing extends AutoShip
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
        super(area);
    }

    // =====================================================
    // METHODS
    // =====================================================

    /**
     * Diese Methode beinhaltet alle Anweisungen für den Autopiloten. Beim {@link AutoGameScreen#play() Spielstart}
     * werden diese in der Reihenfolge abgearbeitet, in der sie eingetragen wurden. Folgende Anweisungen stehen zur
     * Verfügung:
     * move() - Bewegt den Arwing ein Feld in Flugrichtung nach vorn
     * turnLeft() - Dreht den Arwing um 90° nach links
     * putProbe() - Platziert eine Sonde auf dem gegenwärtigen Feld
     * pickProbe() - Sammelt eine Sonde auf dem gegenwärtigen Feld ein
     */
    @Override public void setCourse()
    {
        for (int i = 0; i < 3; i++) {
            move();
        }
        turnLeft();
        move();
    }
}
