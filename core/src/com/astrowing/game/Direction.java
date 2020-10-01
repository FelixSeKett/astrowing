package com.astrowing.game;

import com.badlogic.gdx.Input;

public enum Direction
{
    // =====================================================
    // NESTED CLASSES
    // =====================================================

    UP(Input.Keys.UP, 0, 1),
    RIGHT(Input.Keys.RIGHT, 1, 0),
    DOWN(Input.Keys.DOWN, 0, -1),
    LEFT(Input.Keys.LEFT, -1, 0);

    // =====================================================
    // FIELDS
    // =====================================================

    private final int   KEYCODE;
    public final  int   COLUMN;
    public final  int   ROW;
    public final  float ROTATION;

    // =====================================================
    // CONSTRUCTORS
    // =====================================================

    Direction(int keycode, int column, int row)
    {
        KEYCODE  = keycode;
        COLUMN   = column;
        ROW      = row;
        ROTATION = -90 * ordinal();
    }

    // =====================================================
    // METHODS
    // =====================================================

    public static Direction giveDirection(int keycode)
    {
        for (Direction direction : values()) {
            if (direction.KEYCODE == keycode) {
                return direction;
            }
        }
        return null;
    }

    public Direction giveNextDirectionClockwise()
    {
        int index = ordinal() - 1;
        if (index < 0) {
            index += 4;
        }
        return values()[index];
    }

    public Direction giveOppositeDirection()
    {
        Direction nextDirectionClockwise = giveNextDirectionClockwise();
        return nextDirectionClockwise.giveNextDirectionClockwise();
    }

    public Direction giveNextDirectionCounterClockwise()
    {
        Direction oppositeDirection = giveOppositeDirection();
        return oppositeDirection.giveNextDirectionClockwise();
    }
}
