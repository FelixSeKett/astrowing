package com.astrowing.game.groups.tiles.bodies;

import com.astrowing.game.Direction;
import com.astrowing.game.groups.tiles.Area;
import com.astrowing.game.groups.tiles.Body;

public class Ship extends Body
{
    // =====================================================
    // FIELDS
    // =====================================================

    protected Direction sightDirection;

    // =====================================================
    // CONSTRUCTORS
    // =====================================================

    public Ship(Area area)
    {
        super(0, 1, area);
        takeSightDirection(Direction.UP);
    }

    // =====================================================
    // METHODS
    // =====================================================

    private void takeSightDirection(Direction sightDirectionToTake)
    {
        if (sightDirectionToTake != null) {
            sightDirection = sightDirectionToTake;
            setRotation(sightDirectionToTake.ROTATION);
        }
    }

    public void move()
    {
        Area newArea = area.WORLD.giveArea(area, sightDirection);
        moveToArea(newArea);
    }

    public void turnLeft()
    {
        Direction newSightDirection = sightDirection.giveNextDirectionClockwise();
        takeSightDirection(newSightDirection);
    }

    public void putProbe()
    {
        area.addProbe();
    }

    public void pickProbe()
    {
        area.removeProbe();
    }
}
