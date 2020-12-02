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

public class MapS5 extends Map {

    public MapS5() {
        super("map_s5.txt", new CommonTileset(), new Point(1, 13));
    }

    @Override
    public ArrayList<Enemy> loadEnemies() {
        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(new HurtBox(getPositionByTileIndex(1, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(2, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(3, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(4, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(5, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(6, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(7, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(8, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(9, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(10, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(11, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(12, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(13, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(14, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(15, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(16, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(17, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(18, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(19, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(21, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(22, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(23, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(24, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(25, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(26, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(27, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(28, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(29, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(30, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(31, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(32, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(33, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(34, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(35, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(36, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(37, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(38, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(39, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(40, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(41, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(42, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(43, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(44, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(45, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(46, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(47, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(48, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(49, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(50, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(51, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(52, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(53, 18)));
        enemies.add(new HurtBox(getPositionByTileIndex(54, 18)));

        enemies.add(new HurtBox(getPositionByTileIndex(15, 13)));
        enemies.add(new HurtBox(getPositionByTileIndex(16, 13)));
        enemies.add(new HurtBox(getPositionByTileIndex(17, 13)));
        enemies.add(new HurtBox(getPositionByTileIndex(18, 13)));
        enemies.add(new HurtBox(getPositionByTileIndex(19, 13)));
        enemies.add(new HurtBox(getPositionByTileIndex(20, 13)));
        enemies.add(new HurtBox(getPositionByTileIndex(15, 14)));
        enemies.add(new HurtBox(getPositionByTileIndex(16, 14)));
        enemies.add(new HurtBox(getPositionByTileIndex(17, 14)));
        enemies.add(new HurtBox(getPositionByTileIndex(18, 14)));
        enemies.add(new HurtBox(getPositionByTileIndex(19, 14)));
        enemies.add(new HurtBox(getPositionByTileIndex(20, 14)));

        enemies.add(new HurtBox(getPositionByTileIndex(30, 12)));
        enemies.add(new HurtBox(getPositionByTileIndex(31, 12)));
        enemies.add(new HurtBox(getPositionByTileIndex(30, 13)));
        enemies.add(new HurtBox(getPositionByTileIndex(31, 13)));

        enemies.add(new HurtBox(getPositionByTileIndex(38, 12)));
        enemies.add(new HurtBox(getPositionByTileIndex(39, 12)));
        enemies.add(new HurtBox(getPositionByTileIndex(38, 13)));
        enemies.add(new HurtBox(getPositionByTileIndex(39, 13)));

        enemies.add(new BugEnemy(getPositionByTileIndex(25, 12), Direction.LEFT));

        enemies.add(new DinosaurEnemy(getPositionByTileIndex(32, 9).addY(2), getPositionByTileIndex(37, 9).addY(2), Direction.RIGHT));
        enemies.add(new DinosaurEnemy(getPositionByTileIndex(40, 11).addY(2), getPositionByTileIndex(44, 11).addY(2), Direction.RIGHT));
        return enemies;
    }

    @Override
    public ArrayList<EnhancedMapTile> loadEnhancedMapTiles() {
        ArrayList<EnhancedMapTile> enhancedMapTiles = new ArrayList<>();

        enhancedMapTiles.add(new HorizontalMovingPlatform(
                ImageLoader.load("GreenPlatform.png"),
                getPositionByTileIndex(13, 12),
                getPositionByTileIndex(23, 12),
                TileType.JUMP_THROUGH_PLATFORM,
                3,
                new Rectangle(0, 6,16,4),
                Direction.RIGHT
        ));

        enhancedMapTiles.add(new HorizontalMovingPlatform(
                ImageLoader.load("GreenPlatform.png"),
                getPositionByTileIndex(13, 16),
                getPositionByTileIndex(42, 16),
                TileType.JUMP_THROUGH_PLATFORM,
                3,
                new Rectangle(0, 6,16,4),
                Direction.RIGHT
        ));

        enhancedMapTiles.add(new EndLevelBox(
                getPositionByTileIndex(53, 14)
        ));

        return enhancedMapTiles;
    }
}
