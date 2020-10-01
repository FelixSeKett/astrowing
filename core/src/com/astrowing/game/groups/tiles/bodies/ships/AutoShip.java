package com.astrowing.game.groups.tiles.bodies.ships;

import com.astrowing.game.Direction;
import com.astrowing.game.games.Astrowing;
import com.astrowing.game.groups.tiles.Area;
import com.astrowing.game.groups.tiles.bodies.Ship;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.actions.DelayAction;
import com.badlogic.gdx.scenes.scene2d.actions.RunnableAction;
import com.badlogic.gdx.scenes.scene2d.actions.SequenceAction;
import com.badlogic.gdx.utils.Array;

public abstract class AutoShip extends Ship
{
    // =====================================================
    // FIELDS
    // =====================================================

    private static final float          MOVEMENT_SPEED = 1f / Astrowing.SPEED_MULTIPLIER;
    private              SequenceAction sequenceAction;

    // =====================================================
    // CONSTRUCTORS
    // =====================================================

    public AutoShip(Area area)
    {
        super(area);
        sequenceAction = new SequenceAction();
        setCourse();
        removeSequenceAction();
    }

    // =====================================================
    // METHODS
    // =====================================================

    private void removeSequenceAction()
    {
        RunnableAction runnableAction = new RunnableAction()
        {
            @Override public void run()
            {
                sequenceAction = null;
            }
        };
        sequenceAction.addAction(runnableAction);
    }

    public void play()
    {
        if (sequenceAction != null) {
            Array<Action> actions = getActions();
            if (!actions.contains(sequenceAction, false)) {
                addAction(sequenceAction);
            }
        }
    }

    public void stop()
    {
        if (sequenceAction != null) {
            removeAction(sequenceAction);
        }
    }

    private void addDelayToSequenceAction()
    {
        DelayAction delayAction = new DelayAction(MOVEMENT_SPEED);
        sequenceAction.addAction(delayAction);
    }

    @Override public void move()
    {
        RunnableAction runnableAction = new RunnableAction()
        {
            @Override public void run()
            {
                AutoShip.super.move();
            }
        };
        sequenceAction.addAction(runnableAction);
        addDelayToSequenceAction();
    }

    @Override public void turnLeft()
    {
        RunnableAction runnableAction = new RunnableAction()
        {
            @Override public void run()
            {
                AutoShip.super.turnLeft();
            }
        };
        sequenceAction.addAction(runnableAction);
        addDelayToSequenceAction();
    }

    @Override public void putProbe()
    {
        RunnableAction runnableAction = new RunnableAction()
        {
            @Override public void run()
            {
                AutoShip.super.putProbe();
            }
        };
        sequenceAction.addAction(runnableAction);
        addDelayToSequenceAction();
    }

    @Override public void pickProbe()
    {
        RunnableAction runnableAction = new RunnableAction()
        {
            @Override public void run()
            {
                AutoShip.super.pickProbe();
            }
        };
        sequenceAction.addAction(runnableAction);
        addDelayToSequenceAction();
    }

    public abstract void setCourse();
}
