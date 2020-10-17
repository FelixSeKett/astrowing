package com.astrowing.game;

import com.astrowing.game.groups.tiles.bodies.ships.Arwing;

public class FuelTank
{
    // =====================================================
    // FIELDS
    // =====================================================

    private final Arwing ARWING;
    private final int    DEFAULT_FUEL;
    private       int    fuel;

    // =====================================================
    // CONSTRUCTORS
    // =====================================================

    /*
    Access Modifier regeln den Zugriff auf Variablen, Konstruktoren und Methoden
    - public: alle
    - protected: wie package-private + alle Kinderklassen
    - package-private (ohne Schlagwort): nur Dokumente innerhalb des gleichen Ordners
    - private: nur dieses Dokument
     */

    public FuelTank(Arwing arwing)
    {
        this.ARWING       = arwing;
        this.DEFAULT_FUEL = 20;
        this.fuel         = DEFAULT_FUEL;
    }

    // =====================================================
    // METHODS
    // =====================================================

    // Getter
    public int giveFuel()
    {
        return fuel;
    }

    public void decreaseFuel()
    {
        fuel--;
        // fuel = fuel - 1;
        // fuel -= 1;

        ARWING.broadcast("Gegenwärtiger Treibstoff: " + fuel);
    }

    public void refill()
    {
        fuel = DEFAULT_FUEL;
        ARWING.broadcast("Gegenwärtiger Treibstoff: " + fuel);
    }
}
