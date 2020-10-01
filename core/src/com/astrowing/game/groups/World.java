package com.astrowing.game.groups;

import com.astrowing.game.Map;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.astrowing.game.Direction;
import com.astrowing.game.GameScreen;
import com.astrowing.game.groups.tiles.Area;
import com.astrowing.game.groups.tiles.bodies.Ship;

public class World<S extends Ship> extends Group
{
    // =====================================================
    // FIELDS
    // =====================================================

    public static final  Texture          TEXTURE         = new Texture("core/assets/map.png");
    private static final int              WIDTH_IN_TILES  = 8;
    private static final int              HEIGHT_IN_TILES = 8;
    public final         GameScreen<?, ?> GAME_SCREEN;
    protected final      Area[][]         AREAS;
    protected final      S                SHIP;

    // =====================================================
    // CONSTRUCTORS
    // =====================================================

    public World(GameScreen<?, ?> gameScreen, Map map)
    {
        GAME_SCREEN = gameScreen;
        AREAS       = new Area[WIDTH_IN_TILES][HEIGHT_IN_TILES];
        for (int i = 0; i < WIDTH_IN_TILES; i++) {
            for (int j = 0; j < HEIGHT_IN_TILES; j++) {
                Area area = new Area(this, i, j);
                AREAS[i][j] = area;
                addActor(area);
            }
        }
        SHIP = createShip();
        map.createAsteroids(AREAS);
        setPosition(Tile.WIDTH_IN_PIXELS / 2f, Tile.HEIGHT_IN_PIXELS / 2f);
    }

    // =====================================================
    // METHODS
    // =====================================================

    public Area giveArea(Area referenceArea, Direction direction)
    {
        int column = referenceArea.COLUMN + direction.COLUMN;
        int row    = referenceArea.ROW + direction.ROW;
        return giveArea(column, row);
    }

    private Area giveArea(int column, int row)
    {
        if (column >= 0 && column < AREAS.length && row >= 0 && row < AREAS[column].length) {
            return AREAS[column][row];
        }
        return null;
    }

    protected abstract S createShip();
}
