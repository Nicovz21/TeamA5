package Maps;

import Enemies.*;
import EnhancedMapTiles.EndLevelBox;
import Level.Enemy;
import Level.EnhancedMapTile;
import Level.Map;
import Level.NPC;
import Tilesets.CommonTileset;
import Utils.Direction;
import Utils.Point;

import java.util.ArrayList;

public class Map2A extends Map {

    public Map2A() {
        super("map_2A.txt", new CommonTileset(), new Point(1, 5));
    }

    @Override
    public ArrayList<Enemy> loadEnemies() {
        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(new DinosaurEnemy(getPositionByTileIndex(23, 3).addY(2), getPositionByTileIndex(25, 3).addY(2), Direction.RIGHT));
        enemies.add(new DinosaurEnemy(getPositionByTileIndex(37, 4).addY(2), getPositionByTileIndex(39, 4).addY(2), Direction.RIGHT));

        return enemies;
    }

    @Override
    public ArrayList<EnhancedMapTile> loadEnhancedMapTiles() {
        ArrayList<EnhancedMapTile> enhancedMapTiles = new ArrayList<>();

        enhancedMapTiles.add(new EndLevelBox(
                getPositionByTileIndex(48, 3)
        ));

        return enhancedMapTiles;
    }
}
