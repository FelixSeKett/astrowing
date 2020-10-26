package com.astrowing.game.groups.tiles.bodies;

import com.astrowing.game.groups.tiles.Area;
import com.astrowing.game.groups.tiles.Body;
import com.badlogic.gdx.scenes.scene2d.actions.RepeatAction;
import com.badlogic.gdx.scenes.scene2d.actions.RotateByAction;

public class BlackHole extends Body
{
    // =====================================================
    // FIELDS
    // =====================================================

    //nothing

    // =====================================================
    // CONSTRUCTORS
    // =====================================================

    public BlackHole(Area area)
    {
        super(4, 0, area);

        RotateByAction rotateByAction = new RotateByAction();
        rotateByAction.setAmount(286f);
        rotateByAction.setDuration(2f);

        RepeatAction repeatAction = new RepeatAction();
        repeatAction.setCount(-1);
        repeatAction.setAction(rotateByAction);

        addAction(repeatAction);

    }

    // =====================================================
    // METHODS
    // =====================================================

    // nothing
}
