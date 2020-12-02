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

public class Map4I extends Map {

    public Map4I() {
        super("map_4I.txt", new CommonTileset(), new Point(12, 1));
    }

    @Override
    public ArrayList<Enemy> loadEnemies() {
        ArrayList<Enemy> enemies = new ArrayList<>();

        enemies.add(new BugEnemy(getPositionByTileIndex(11, 40), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(13, 40), Direction.RIGHT));
        enemies.add(new DarkBug(getPositionByTileIndex(28, 54), Direction.LEFT));
        enemies.add(new DarkBug(getPositionByTileIndex(31, 12), Direction.LEFT));
        enemies.add(new BlackSpider(getPositionByTileIndex(10,27), getPositionByTileIndex(10,37)));
        enemies.add(new BlackSpider(getPositionByTileIndex(15,27), getPositionByTileIndex(15,37)));
        enemies.add(new BrownSpider(getPositionByTileIndex(30,23), getPositionByTileIndex(30,32)));
        enemies.add(new BrownSpider(getPositionByTileIndex(37,3), getPositionByTileIndex(37,9)));
        enemies.add(new BlackSpider(getPositionByTileIndex(43,2), getPositionByTileIndex(43,8)));
        enemies.add(new BigFish(getPositionByTileIndex(46, 46), getPositionByTileIndex(49, 46).addX(50), Direction.LEFT));
        enemies.add(new FishEnemy(getPositionByTileIndex(36, 47), getPositionByTileIndex(49, 47), Direction.LEFT));
        enemies.add(new FastFish(getPositionByTileIndex(36, 48), getPositionByTileIndex(49, 48), Direction.LEFT));
        enemies.add(new FishEnemy(getPositionByTileIndex(36, 49), getPositionByTileIndex(49, 49), Direction.LEFT));
        enemies.add(new FastFish(getPositionByTileIndex(36, 50), getPositionByTileIndex(49, 50), Direction.LEFT));
        enemies.add(new DinosaurEnemy(getPositionByTileIndex(36, 34).addY(2), getPositionByTileIndex(42, 34).addY(2), Direction.RIGHT));

        enemies.add(new HurtBox(getPositionByTileIndex(37,25)));
        enemies.add(new HurtBox(getPositionByTileIndex(38,25)));
        enemies.add(new HurtBox(getPositionByTileIndex(40,25)));
        enemies.add(new HurtBox(getPositionByTileIndex(41,25)));
        enemies.add(new HurtBox(getPositionByTileIndex(38,11)));
        enemies.add(new HurtBox(getPositionByTileIndex(39,11)));

        return enemies;
    }

    @Override
    public ArrayList<EnhancedMapTile> loadEnhancedMapTiles() {
        ArrayList<EnhancedMapTile> enhancedMapTiles = new ArrayList<>();

        enhancedMapTiles.add(new EndLevelBox(
                getPositionByTileIndex(47, 3)
        ));

        return enhancedMapTiles;
    }
}
