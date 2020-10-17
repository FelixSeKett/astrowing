package com.astrowing.game.groups;

import com.astrowing.game.Map;
import com.astrowing.game.groups.tiles.bodies.Satellite;
import com.astrowing.game.groups.tiles.bodies.ships.Arwing;
import com.astrowing.game.groups.tiles.bodies.ships.Xwing;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.astrowing.game.Direction;
import com.astrowing.game.GameScreen;
import com.astrowing.game.groups.tiles.Area;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class World extends Group
{
    // =====================================================
    // FIELDS
    // =====================================================

    public static final  Texture    TEXTURE         = new Texture("core/assets/map.png");
    private static final int        WIDTH_IN_TILES  = 8;
    private static final int        HEIGHT_IN_TILES = 8;
    private final        GameScreen GAME_SCREEN;
    private final        Area[][]   AREAS;
    private final        Arwing     ARWING;

    // =====================================================
    // CONSTRUCTORS
    // =====================================================

    public World(GameScreen gameScreen, Map map, Stage stage)
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
        ARWING = new Arwing(AREAS[3][3]);
        new Satellite(AREAS[2][4]);
        map.createAsteroids(AREAS);
        stage.setKeyboardFocus(ARWING);
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
}
