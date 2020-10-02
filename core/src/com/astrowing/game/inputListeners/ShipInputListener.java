package com.astrowing.game.inputListeners;

import com.astrowing.game.Direction;
import com.astrowing.game.groups.tiles.Area;
import com.astrowing.game.groups.tiles.bodies.Ship;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class ShipInputListener extends InputListener
{
    // =====================================================
    // FIELDS
    // =====================================================

    private final Ship SHIP;

    // =====================================================
    // CONSTRUCTORS
    // =====================================================

    public ShipInputListener(Ship ship)
    {
        SHIP = ship;
    }

    // =====================================================
    // METHODS
    // =====================================================

    @Override public boolean keyDown(InputEvent event, int keycode)
    {
        Direction direction = Direction.giveDirection(keycode);
        if (direction != null) {
            Area area         = SHIP.giveArea();
            Area areaToMoveTo = area.WORLD.giveArea(area, direction);
            if (areaToMoveTo != null) {
                SHIP.moveToArea(areaToMoveTo, direction);
            }
        } else if (keycode == Input.Keys.SPACE) {
            SHIP.putProbe();
        } else if (keycode == Input.Keys.BACKSPACE) {
            SHIP.pickProbe();
        } else if (keycode == Input.Keys.B) {
            SHIP.broadcast();
        }
        return true;
    }
}
