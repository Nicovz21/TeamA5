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

// Represents a test map to be used in a level
public class MapS2 extends Map {

    public MapS2() {
        super("map_s2.txt", new CommonTileset(), new Point(1, 11));
    }

    @Override
    public ArrayList<Enemy> loadEnemies() {
        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(new HurtBox(getPositionByTileIndex(1, 15)));
        enemies.add(new HurtBox(getPositionByTileIndex(2, 15)));
        enemies.add(new HurtBox(getPositionByTileIndex(3, 15)));
        enemies.add(new HurtBox(getPositionByTileIndex(4, 15)));
        enemies.add(new HurtBox(getPositionByTileIndex(5, 15)));
        enemies.add(new HurtBox(getPositionByTileIndex(6, 15)));
        enemies.add(new HurtBox(getPositionByTileIndex(7, 15)));
        enemies.add(new HurtBox(getPositionByTileIndex(8, 15)));
        enemies.add(new HurtBox(getPositionByTileIndex(10, 15)));
        enemies.add(new HurtBox(getPositionByTileIndex(11, 15)));
        enemies.add(new HurtBox(getPositionByTileIndex(12, 15)));
        enemies.add(new HurtBox(getPositionByTileIndex(13, 15)));
        enemies.add(new HurtBox(getPositionByTileIndex(14, 15)));
        enemies.add(new HurtBox(getPositionByTileIndex(15, 15)));
        enemies.add(new HurtBox(getPositionByTileIndex(16, 15)));
        enemies.add(new HurtBox(getPositionByTileIndex(17, 15)));
        enemies.add(new HurtBox(getPositionByTileIndex(18, 15)));
        enemies.add(new HurtBox(getPositionByTileIndex(21, 15)));
        enemies.add(new HurtBox(getPositionByTileIndex(22, 15)));
        enemies.add(new HurtBox(getPositionByTileIndex(23, 15)));
        enemies.add(new HurtBox(getPositionByTileIndex(24, 15)));
        enemies.add(new HurtBox(getPositionByTileIndex(25, 15)));
        enemies.add(new HurtBox(getPositionByTileIndex(26, 15)));
        enemies.add(new HurtBox(getPositionByTileIndex(29, 15)));
        enemies.add(new HurtBox(getPositionByTileIndex(30, 15)));
        enemies.add(new HurtBox(getPositionByTileIndex(31, 15)));
        enemies.add(new HurtBox(getPositionByTileIndex(32, 15)));
        enemies.add(new HurtBox(getPositionByTileIndex(33, 15)));
        enemies.add(new HurtBox(getPositionByTileIndex(38, 15)));
        enemies.add(new HurtBox(getPositionByTileIndex(39, 15)));
        enemies.add(new HurtBox(getPositionByTileIndex(47, 15)));
        enemies.add(new HurtBox(getPositionByTileIndex(48, 15)));
        enemies.add(new HurtBox(getPositionByTileIndex(49, 15)));
        enemies.add(new BugEnemy(getPositionByTileIndex(43, 15), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(21, 4), Direction.LEFT));
        enemies.add(new DinosaurEnemy(getPositionByTileIndex(7, 4).addY(2), getPositionByTileIndex(12, 4).addY(2), Direction.RIGHT));
        enemies.add(new DinosaurEnemy(getPositionByTileIndex(28, 8).addY(2), getPositionByTileIndex(31, 8).addY(2), Direction.RIGHT));
        enemies.add(new DinosaurEnemy(getPositionByTileIndex(42, 10).addY(2), getPositionByTileIndex(44, 10).addY(2), Direction.RIGHT));
        return enemies;
    }


    @Override
    public ArrayList<EnhancedMapTile> loadEnhancedMapTiles() {
        ArrayList<EnhancedMapTile> enhancedMapTiles = new ArrayList<>();

        enhancedMapTiles.add(new HorizontalMovingPlatform(
                ImageLoader.load("GreenPlatform.png"),
                getPositionByTileIndex(12, 13),
                getPositionByTileIndex(16, 13),
                TileType.JUMP_THROUGH_PLATFORM,
                3,
                new Rectangle(0, 6,16,4),
                Direction.RIGHT
        ));

        enhancedMapTiles.add(new EndLevelBox(
                getPositionByTileIndex(52, 10)
        ));

        return enhancedMapTiles;
    }


}
