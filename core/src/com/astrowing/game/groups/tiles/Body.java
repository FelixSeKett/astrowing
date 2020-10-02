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

    //    public boolean moveToArea(Area areaToMoveTo)
    //    {
    //        if (areaToMoveTo != null) {
    //            if (!areaToMoveTo.isBlocked()) {
    //                takeArea(areaToMoveTo);
    //                return true;
    //            }
    //        }
    //        return false;
    //    }

    protected void takeArea(Area areaToTake)
    {
        areaToTake.addActor(this);
        area = areaToTake;
    }

    public Area giveArea()
    {
        return area;
    }
}
