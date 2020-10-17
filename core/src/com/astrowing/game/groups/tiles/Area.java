package com.astrowing.game.groups.tiles;

import com.astrowing.game.groups.tiles.bodies.BlackHole;
import com.astrowing.game.groups.tiles.bodies.Satellite;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.astrowing.game.groups.World;
import com.astrowing.game.groups.Tile;
import com.astrowing.game.groups.tiles.bodies.Asteroid;

public class Area extends Tile
{
    // =====================================================
    // FIELDS
    // =====================================================

    public final World WORLD;
    public final int   COLUMN;
    public final int   ROW;

    // =====================================================
    // CONSTRUCTORS
    // =====================================================

    public Area(World world, int column, int row)
    {
        super(column, row, 0, 0);
        WORLD  = world;
        COLUMN = column;
        ROW    = row;
    }

    // =====================================================
    // METHODS
    // =====================================================

    public boolean isBlocked()
    {
        return hasAsteroid() || hasBlackHole();
    }

    public boolean hasAsteroid()
    {
        for (Actor actor : getChildren()) {
            if (actor instanceof Asteroid) {
                return true;
            }
        }
        return false;
    }

    public boolean hasBlackHole()
    {
        for (Actor actor : getChildren()) {
            if (actor instanceof BlackHole) {
                return true;
            }
        }
        return false;
    }

    public boolean hasSatellite()
    {
        // For-Each-Schleife
        for (Actor actor : getChildren()) {
            if (actor instanceof Satellite) {
                return true;
            }
        }
        return false;
    }
}
