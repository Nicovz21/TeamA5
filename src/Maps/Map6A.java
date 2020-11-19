package Maps;

import Enemies.BugEnemy;
import Enemies.DinosaurEnemy;
import Enemies.HurtBox;
import Engine.ImageLoader;
import EnhancedMapTiles.EndLevelBox;
import EnhancedMapTiles.HorizontalMovingPlatform;
import GameObject.Rectangle;
import Level.*;
import Tilesets.CommonTileset;
import Utils.Direction;
import Utils.Point;

import java.util.ArrayList;

public class Map6A extends Map {
    public Map6A() {
        super("Map_6A.txt", new CommonTileset(), new Point(1, 5));
    }

    @Override
    public ArrayList<Enemy> loadEnemies() {
        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(new HurtBox(getPositionByTileIndex(10,7)));
        enemies.add(new HurtBox(getPositionByTileIndex(11,7)));
        enemies.add(new HurtBox(getPositionByTileIndex(27,11)));
        enemies.add(new HurtBox(getPositionByTileIndex(28,11)));
        enemies.add(new HurtBox(getPositionByTileIndex(29,11)));
        enemies.add(new HurtBox(getPositionByTileIndex(30,11)));
        enemies.add(new HurtBox(getPositionByTileIndex(31,11)));
        enemies.add(new HurtBox(getPositionByTileIndex(32,11)));
        enemies.add(new HurtBox(getPositionByTileIndex(33,11)));
        enemies.add(new HurtBox(getPositionByTileIndex(34,11)));
        enemies.add(new HurtBox(getPositionByTileIndex(35,11)));
        enemies.add(new HurtBox(getPositionByTileIndex(36,11)));
        enemies.add(new HurtBox(getPositionByTileIndex(37,11)));
        enemies.add(new HurtBox(getPositionByTileIndex(38,11)));
        enemies.add(new HurtBox(getPositionByTileIndex(39,11)));
        enemies.add(new HurtBox(getPositionByTileIndex(40,11)));
        enemies.add(new HurtBox(getPositionByTileIndex(41,11)));
        enemies.add(new HurtBox(getPositionByTileIndex(44,11)));
        enemies.add(new HurtBox(getPositionByTileIndex(45,11)));
        enemies.add(new HurtBox(getPositionByTileIndex(46,11)));
        enemies.add(new HurtBox(getPositionByTileIndex(47,11)));
        enemies.add(new HurtBox(getPositionByTileIndex(48,11)));
        enemies.add(new HurtBox(getPositionByTileIndex(24,21)));
        enemies.add(new HurtBox(getPositionByTileIndex(25,21)));
        enemies.add(new HurtBox(getPositionByTileIndex(26,21)));
        enemies.add(new HurtBox(getPositionByTileIndex(27,21)));
        enemies.add(new HurtBox(getPositionByTileIndex(28,21)));
        enemies.add(new HurtBox(getPositionByTileIndex(29,21)));
        enemies.add(new HurtBox(getPositionByTileIndex(1,36)));
        enemies.add(new HurtBox(getPositionByTileIndex(2,36)));
        enemies.add(new HurtBox(getPositionByTileIndex(3,36)));
        enemies.add(new HurtBox(getPositionByTileIndex(4,36)));
        enemies.add(new HurtBox(getPositionByTileIndex(5,36)));
        enemies.add(new HurtBox(getPositionByTileIndex(6,36)));
        enemies.add(new HurtBox(getPositionByTileIndex(7,36)));
        enemies.add(new HurtBox(getPositionByTileIndex(8,36)));
        enemies.add(new HurtBox(getPositionByTileIndex(9,36)));
        enemies.add(new HurtBox(getPositionByTileIndex(10,36)));
        enemies.add(new HurtBox(getPositionByTileIndex(11,36)));
        enemies.add(new HurtBox(getPositionByTileIndex(12,36)));
        enemies.add(new HurtBox(getPositionByTileIndex(13,36)));
        enemies.add(new HurtBox(getPositionByTileIndex(29,40)));
        enemies.add(new HurtBox(getPositionByTileIndex(30,40)));
        enemies.add(new HurtBox(getPositionByTileIndex(31,40)));
        enemies.add(new HurtBox(getPositionByTileIndex(32,40)));
        enemies.add(new HurtBox(getPositionByTileIndex(33,40)));
        enemies.add(new HurtBox(getPositionByTileIndex(34,40)));
        enemies.add(new HurtBox(getPositionByTileIndex(35,40)));
        enemies.add(new HurtBox(getPositionByTileIndex(36,40)));
        enemies.add(new HurtBox(getPositionByTileIndex(37,40)));
        enemies.add(new HurtBox(getPositionByTileIndex(38,40)));
        enemies.add(new HurtBox(getPositionByTileIndex(39,40)));
        enemies.add(new HurtBox(getPositionByTileIndex(40,40)));
        enemies.add(new HurtBox(getPositionByTileIndex(41,40)));
        enemies.add(new HurtBox(getPositionByTileIndex(42,40)));
        enemies.add(new HurtBox(getPositionByTileIndex(43,40)));
        enemies.add(new HurtBox(getPositionByTileIndex(44,40)));
        enemies.add(new HurtBox(getPositionByTileIndex(45,40)));
        enemies.add(new HurtBox(getPositionByTileIndex(47,49)));
        enemies.add(new HurtBox(getPositionByTileIndex(48,49)));
        enemies.add(new DinosaurEnemy(getPositionByTileIndex(33, 8).addY(2), getPositionByTileIndex(35, 8).addY(2), Direction.RIGHT));
        enemies.add(new DinosaurEnemy(getPositionByTileIndex(35, 18).addY(2), getPositionByTileIndex(39, 18).addY(2), Direction.RIGHT));

        return enemies;
    }

    @Override
    public ArrayList<EnhancedMapTile> loadEnhancedMapTiles() {
        ArrayList<EnhancedMapTile> enhancedMapTiles = new ArrayList<>();

        enhancedMapTiles.add(new EndLevelBox(
                getPositionByTileIndex(46, 37)
        ));

        return enhancedMapTiles;
    }
}
