package com.astrowing.game.groups.tiles;

import com.astrowing.game.groups.Tile;

public class Body extends Tile
{
    // =====================================================
    // FIELDS
    // =====================================================

    protected Area area;

    // =====================================================
    // CONSTRUCTORS
    // =====================================================

    public Body(int textureRegionColumn, int textureRegionRow, Area area)
    {
        super(textureRegionColumn, textureRegionRow);
        takeArea(area);
    }

    // =====================================================
    // METHODS
    // =====================================================

    public void moveToArea(Area areaToMoveTo)
    {
        if (areaToMoveTo != null) {
            if (!areaToMoveTo.isBlocked()) {
                takeArea(areaToMoveTo);
            }
        }
    }

    private void takeArea(Area areaToTake)
    {
        areaToTake.addActor(this);
        area = areaToTake;
    }
}
