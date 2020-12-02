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

public class MapS4 extends Map {

    public MapS4() {
        super("map_s4.txt", new CommonTileset(), new Point(1, 17));
    }

    @Override
    public ArrayList<Enemy> loadEnemies() {
        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(new HurtBox(getPositionByTileIndex(10, 17)));
        enemies.add(new HurtBox(getPositionByTileIndex(11, 17)));
        enemies.add(new HurtBox(getPositionByTileIndex(12, 17)));
        enemies.add(new HurtBox(getPositionByTileIndex(13, 17)));
        enemies.add(new HurtBox(getPositionByTileIndex(14, 17)));
        enemies.add(new HurtBox(getPositionByTileIndex(15, 17)));
        enemies.add(new HurtBox(getPositionByTileIndex(16, 17)));
        enemies.add(new HurtBox(getPositionByTileIndex(17, 17)));
        enemies.add(new HurtBox(getPositionByTileIndex(18, 17)));
        enemies.add(new HurtBox(getPositionByTileIndex(19, 17)));
        enemies.add(new HurtBox(getPositionByTileIndex(26, 16)));
        enemies.add(new HurtBox(getPositionByTileIndex(27, 16)));
        enemies.add(new HurtBox(getPositionByTileIndex(28, 16)));
        enemies.add(new HurtBox(getPositionByTileIndex(36, 7)));
        enemies.add(new HurtBox(getPositionByTileIndex(38, 9)));
        enemies.add(new HurtBox(getPositionByTileIndex(35, 11)));
        enemies.add(new HurtBox(getPositionByTileIndex(35, 17)));
        enemies.add(new HurtBox(getPositionByTileIndex(36, 17)));
        enemies.add(new HurtBox(getPositionByTileIndex(37, 17)));
        enemies.add(new HurtBox(getPositionByTileIndex(38, 17)));
        enemies.add(new HurtBox(getPositionByTileIndex(39, 17)));
        enemies.add(new HurtBox(getPositionByTileIndex(40, 17)));
        enemies.add(new HurtBox(getPositionByTileIndex(41, 17)));
        enemies.add(new HurtBox(getPositionByTileIndex(42, 17)));
        enemies.add(new HurtBox(getPositionByTileIndex(43, 17)));
        enemies.add(new HurtBox(getPositionByTileIndex(44, 17)));
        enemies.add(new HurtBox(getPositionByTileIndex(45, 17)));
        enemies.add(new HurtBox(getPositionByTileIndex(46, 17)));
        enemies.add(new HurtBox(getPositionByTileIndex(47, 17)));
        enemies.add(new HurtBox(getPositionByTileIndex(48, 17)));
        enemies.add(new HurtBox(getPositionByTileIndex(49, 17)));
        enemies.add(new HurtBox(getPositionByTileIndex(42, 13)));
        enemies.add(new HurtBox(getPositionByTileIndex(45, 13)));

        enemies.add(new BugEnemy(getPositionByTileIndex(18, 13), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(15, 13), Direction.LEFT));

        enemies.add(new DinosaurEnemy(getPositionByTileIndex(28, 4).addY(2), getPositionByTileIndex(35, 4).addY(2), Direction.RIGHT));

        return enemies;
    }

    @Override
    public ArrayList<EnhancedMapTile> loadEnhancedMapTiles() {
        ArrayList<EnhancedMapTile> enhancedMapTiles = new ArrayList<>();

        enhancedMapTiles.add(new HorizontalMovingPlatform(
                ImageLoader.load("GreenPlatform.png"),
                getPositionByTileIndex(10, 16),
                getPositionByTileIndex(19, 16),
                TileType.JUMP_THROUGH_PLATFORM,
                3,
                new Rectangle(0, 6,16,4),
                Direction.RIGHT
        ));

        enhancedMapTiles.add(new HorizontalMovingPlatform(
                ImageLoader.load("GreenPlatform.png"),
                getPositionByTileIndex(39, 14),
                getPositionByTileIndex(49, 14),
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
