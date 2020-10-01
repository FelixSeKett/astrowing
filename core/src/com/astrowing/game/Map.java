package com.astrowing.game;

import com.astrowing.game.groups.tiles.Area;
import com.astrowing.game.groups.tiles.bodies.Asteroid;

public enum Map
{
    // =====================================================
    // NESTED CLASSES
    // =====================================================

    SPACE,
    ASTEROID_FIELD {
        @Override public void createAsteroids(Area[][] areas)
        {
            new Asteroid(areas[1][1]);
            new Asteroid(areas[2][6]);
            new Asteroid(areas[5][5]);
            new Asteroid(areas[6][2]);
        }
    },
    ASTEROID_BELT {
        @Override public void createAsteroids(Area[][] areas)
        {
            new Asteroid(areas[1][0]);
            new Asteroid(areas[1][1]);
            new Asteroid(areas[1][2]);
            new Asteroid(areas[1][3]);
            new Asteroid(areas[2][0]);
            new Asteroid(areas[3][0]);
            new Asteroid(areas[3][1]);
            new Asteroid(areas[3][2]);
            new Asteroid(areas[4][0]);
            new Asteroid(areas[4][1]);
            new Asteroid(areas[4][2]);
            new Asteroid(areas[4][3]);
            new Asteroid(areas[4][4]);
            new Asteroid(areas[5][0]);
            new Asteroid(areas[6][0]);
            new Asteroid(areas[6][1]);
            new Asteroid(areas[6][2]);
            new Asteroid(areas[6][3]);
            new Asteroid(areas[6][4]);
            new Asteroid(areas[6][5]);
            new Asteroid(areas[7][0]);
            new Asteroid(areas[7][1]);
        }
    };

    // =====================================================
    // FIELDS
    // =====================================================

    // nothing

    // =====================================================
    // CONSTRUCTORS
    // =====================================================

    // nothing

    // =====================================================
    // METHODS
    // =====================================================

    public void createAsteroids(Area[][] areas)
    {
    }
}
