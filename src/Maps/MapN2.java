package Maps;

import Enemies.*;
import Engine.ImageLoader;
import EnhancedMapTiles.EndLevelBox;
import EnhancedMapTiles.HorizontalMovingPlatform;
import GameObject.Rectangle;
import Level.*;
import NPCs.Walrus;
import Tilesets.CommonTileset;
import Utils.Direction;
import Utils.Point;

import java.util.ArrayList;

public class MapN2 extends Map {

    public MapN2() {
        super("map_n2.txt", new CommonTileset(), new Point(0, 1));
    }

    @Override
    public ArrayList<Enemy> loadEnemies() {
        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(new DinosaurEnemy(getPositionByTileIndex(20, 21).addY(2), getPositionByTileIndex(24, 21).addY(2), Direction.RIGHT));
        enemies.add(new SpikeBox(getPositionByTileIndex(16,16), getPositionByTileIndex(16,20), false));

        enemies.add(new HurtBox(getPositionByTileIndex(2,25)));
        enemies.add(new HurtBox(getPositionByTileIndex(3,25)));
        enemies.add(new HurtBox(getPositionByTileIndex(6,25)));
        enemies.add(new HurtBox(getPositionByTileIndex(7,25)));
        enemies.add(new HurtBox(getPositionByTileIndex(8,25)));
        enemies.add(new HurtBox(getPositionByTileIndex(9,25)));
        enemies.add(new HurtBox(getPositionByTileIndex(10,25)));
        enemies.add(new HurtBox(getPositionByTileIndex(13,25)));
        enemies.add(new HurtBox(getPositionByTileIndex(14,25)));
        enemies.add(new HurtBox(getPositionByTileIndex(16,25)));
        enemies.add(new HurtBox(getPositionByTileIndex(17,25)));
        enemies.add(new HurtBox(getPositionByTileIndex(19,25)));
        enemies.add(new HurtBox(getPositionByTileIndex(25,25)));
        enemies.add(new HurtBox(getPositionByTileIndex(26,25)));
        enemies.add(new HurtBox(getPositionByTileIndex(27,25)));
        enemies.add(new HurtBox(getPositionByTileIndex(30,25)));
        enemies.add(new HurtBox(getPositionByTileIndex(31,25)));
        enemies.add(new HurtBox(getPositionByTileIndex(32,25)));
        enemies.add(new HurtBox(getPositionByTileIndex(33,25)));
        return enemies;
    }

    @Override
    public ArrayList<EnhancedMapTile> loadEnhancedMapTiles() {
        ArrayList<EnhancedMapTile> enhancedMapTiles = new ArrayList<>();

        enhancedMapTiles.add(new HorizontalMovingPlatform(
                ImageLoader.load("GreenPlatform.png"),
                getPositionByTileIndex(24, 9),
                getPositionByTileIndex(31, 9),
                TileType.JUMP_THROUGH_PLATFORM,
                3,
                new Rectangle(0, 6,16,4),
                Direction.RIGHT
        ));

        enhancedMapTiles.add(new EndLevelBox(
                getPositionByTileIndex(32, 19)
        ));

        return enhancedMapTiles;
    }
}
