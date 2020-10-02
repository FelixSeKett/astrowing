package com.astrowing.game.groups.tiles.bodies;

import com.astrowing.game.Direction;
import com.astrowing.game.groups.tiles.Area;
import com.astrowing.game.groups.tiles.Body;
import com.astrowing.game.inputListeners.ShipInputListener;
import com.badlogic.gdx.Gdx;

public class Ship extends Body
{
    // =====================================================
    // FIELDS
    // =====================================================

    private Direction sightDirection;

    // =====================================================
    // CONSTRUCTORS
    // =====================================================

    public Ship(int textureRegionColumn, int textureRegionRow, Area area)
    {
        super(textureRegionColumn, textureRegionRow, area);
        takeSightDirection(Direction.UP);
        ShipInputListener shipInputListener = new ShipInputListener(this);
        addListener(shipInputListener);
    }

    // =====================================================
    // METHODS
    // =====================================================

    public void moveInDirection(Direction directionToMoveIn)
    {
        takeSightDirection(directionToMoveIn);
        move();
    }

    public void takeSightDirection(Direction sightDirectionToTake)
    {
        if (sightDirectionToTake != null) {
            sightDirection = sightDirectionToTake;
            setRotation(sightDirectionToTake.ROTATION);
        }
    }

    public void move()
    {
        Area areaToMoveTo = area.WORLD.giveArea(area, sightDirection);
        if (canMoveToArea(areaToMoveTo)) {
            takeArea(areaToMoveTo);
            didMove();
        }
    }

    protected boolean canMoveToArea(Area areaToMoveTo)
    {
        return areaToMoveTo != null && !areaToMoveTo.isBlocked();
    }

    public void broadcast()
    {
        broadcast("");
    }

    public void broadcast(Object object)
    {
        String name     = toString();
        String message  = object.toString();
        String position = area.COLUMN + "-" + area.ROW;
        Gdx.app.log(name + " at " + position, message);
        didBroadcast(object);
    }

    protected boolean canBroadcast(Object object)
    {
        return true;
    }

    protected void didMove()
    {
    }

    protected void didBroadcast(Object object)
    {

    }
}
