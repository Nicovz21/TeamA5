package Maps;

import Enemies.BigFish;
import Enemies.FastFish;
import Enemies.FishEnemy;
import EnhancedMapTiles.EndLevelBox;
import Level.Enemy;
import Level.EnhancedMapTile;
import Level.Map;
import Level.NPC;
import Tilesets.CommonTileset;
import Utils.Direction;
import Utils.Point;

import java.util.ArrayList;

public class Map3A extends Map {
    public Map3A() {
        super("map_3A.txt", new CommonTileset(), new Point(1, 5));
    }

    @Override
    public ArrayList<Enemy> loadEnemies() {
        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(new FishEnemy(getPositionByTileIndex(4,11), getPositionByTileIndex(7, 11), Direction.RIGHT));
        enemies.add(new FastFish(getPositionByTileIndex(3,18), getPositionByTileIndex(7,18), Direction.RIGHT));
        enemies.add(new FishEnemy(getPositionByTileIndex(5, 32), getPositionByTileIndex(10,32), Direction.RIGHT));
        enemies.add(new FastFish(getPositionByTileIndex(15,31), getPositionByTileIndex(19,31), Direction.RIGHT));
        enemies.add(new FishEnemy(getPositionByTileIndex(17,26), getPositionByTileIndex(22,26), Direction.RIGHT));
        enemies.add(new FastFish(getPositionByTileIndex(18,15), getPositionByTileIndex(26,15), Direction.RIGHT));
        enemies.add(new BigFish(getPositionByTileIndex(12,12), getPositionByTileIndex(20,12), Direction.RIGHT));
        enemies.add(new FastFish(getPositionByTileIndex(12, 11), getPositionByTileIndex(20, 11), Direction.RIGHT));
        enemies.add(new FastFish(getPositionByTileIndex(12, 13), getPositionByTileIndex(20,13), Direction.RIGHT));
        return enemies;
    }

    @Override
    public ArrayList<EnhancedMapTile> loadEnhancedMapTiles() {
        ArrayList<EnhancedMapTile> enhancedMapTiles = new ArrayList<>();

        enhancedMapTiles.add(new EndLevelBox(
                getPositionByTileIndex(27, 3)
        ));

        return enhancedMapTiles;
    }
}
