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

public class Map3I extends Map {

    public Map3I() {
        super("map_3I.txt", new CommonTileset(), new Point(1, 4));
    }

    @Override
    public ArrayList<Enemy> loadEnemies() {
        ArrayList<Enemy> enemies = new ArrayList<>();

        enemies.add(new FishEnemy(getPositionByTileIndex(8, 25), getPositionByTileIndex(14, 25), Direction.LEFT));
        enemies.add(new FishEnemy(getPositionByTileIndex(8, 26), getPositionByTileIndex(14, 26), Direction.RIGHT));
        enemies.add(new FishEnemy(getPositionByTileIndex(14, 12), getPositionByTileIndex(20, 12), Direction.LEFT));
        enemies.add(new FastFish(getPositionByTileIndex(26, 17), getPositionByTileIndex(31, 17), Direction.RIGHT));
        enemies.add(new FastFish(getPositionByTileIndex(20, 35), getPositionByTileIndex(26, 34), Direction.LEFT));
        enemies.add(new FastFish(getPositionByTileIndex(20, 34), getPositionByTileIndex(27, 34), Direction.LEFT));
        enemies.add(new BigFish(getPositionByTileIndex(33, 23), getPositionByTileIndex(37, 23), Direction.LEFT));
        enemies.add(new FishEnemy(getPositionByTileIndex(33, 10), getPositionByTileIndex(39, 10), Direction.RIGHT));
        enemies.add(new FishEnemy(getPositionByTileIndex(33, 11), getPositionByTileIndex(39, 11), Direction.LEFT));
        enemies.add(new FishEnemy(getPositionByTileIndex(33, 12), getPositionByTileIndex(39, 12), Direction.RIGHT));

        return enemies;
    }

    @Override
    public ArrayList<EnhancedMapTile> loadEnhancedMapTiles() {
        ArrayList<EnhancedMapTile> enhancedMapTiles = new ArrayList<>();

        enhancedMapTiles.add(new EndLevelBox(
                getPositionByTileIndex(38, 1)
        ));

        return enhancedMapTiles;
    }
}
