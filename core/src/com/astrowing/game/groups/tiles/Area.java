package com.astrowing.game.groups.tiles;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.astrowing.game.groups.World;
import com.astrowing.game.groups.Tile;
import com.astrowing.game.groups.tiles.bodies.Asteroid;
import com.astrowing.game.groups.tiles.bodies.Probe;

public class Area extends Tile
{
    // =====================================================
    // FIELDS
    // =====================================================

    public final World<?> WORLD;
    public final int      COLUMN;
    public final int      ROW;

    // =====================================================
    // CONSTRUCTORS
    // =====================================================

    public Area(World<?> world, int column, int row)
    {
        super(column, row, 0, 0);
        WORLD  = world;
        COLUMN = column;
        ROW    = row;
    }

    // =====================================================
    // METHODS
    // =====================================================

    public boolean hasProbe()
    {
        for (Actor actor : getChildren()) {
            if (actor instanceof Probe) {
                return true;
            }
        }
        return false;
    }

    public boolean isBlocked()
    {
        for (Actor actor : getChildren()) {
            if (actor instanceof Asteroid) {
                return true;
            }
        }
        return false;
    }

    public void addProbe()
    {
        new Probe(this);
    }

    public void removeProbe()
    {
        for (Actor actor : getChildren()) {
            if (actor instanceof Probe) {
                actor.remove();
                return;
            }
        }
    }
}
