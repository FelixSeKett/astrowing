package com.astrowing.game.groups.tiles.bodies;

import com.astrowing.game.Direction;
import com.astrowing.game.groups.tiles.Area;
import com.astrowing.game.groups.tiles.Body;
import com.astrowing.game.inputListeners.ShipInputListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.actions.RunnableAction;

public class Ship extends Body
{
    // =====================================================
    // FIELDS
    // =====================================================

    private Direction sightDirection;

    // =====================================================
    // CONSTRUCTORS
    // =====================================================

    public Ship(Area area)
    {
        super(0, 1, area);
        takeSightDirection(Direction.UP);
        ShipInputListener shipInputListener = new ShipInputListener(this);
        addListener(shipInputListener);
    }

    // =====================================================
    // METHODS
    // =====================================================

    public void moveToArea(Area areaToMoveTo, Direction sightDirectionToTake)
    {
        takeSightDirection(sightDirectionToTake);
        moveToArea(areaToMoveTo);
    }

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

    public void broadcast()
    {
        broadcast("");
    }

    public void broadcast(final String STRING)
    {
        String name     = toString();
        String position = area.COLUMN + "-" + area.ROW;
        Gdx.app.log(name + " at " + position, STRING);
    }

    public void putProbe()
    {
        area.addProbe();
    }

    public void pickProbe()
    {
        area.removeProbe();
    }

    public boolean canMove()
    {
        Area newFloor = area.WORLD.giveArea(area, sightDirection);
        return newFloor != null;
    }

    public boolean passesProbe()
    {
        return area.hasProbe();
    }

    public boolean detectsAsteroid()
    {
        Area frontArea = area.WORLD.giveArea(area, sightDirection);
        return frontArea.isBlocked();
    }
}
