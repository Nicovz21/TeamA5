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
public class MapS1 extends Map {

    public MapS1() {
        super("map_s1.txt", new CommonTileset(), new Point(1, 10));
    }

    @Override
    public ArrayList<Enemy> loadEnemies() {
        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(new BugEnemy(getPositionByTileIndex(21, 14), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(10, 14), Direction.RIGHT));
        enemies.add(new BugEnemy(getPositionByTileIndex(44, 14), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(36, 14), Direction.RIGHT));
        enemies.add(new DinosaurEnemy(getPositionByTileIndex(38, 6).addY(2), getPositionByTileIndex(41, 6).addY(2), Direction.RIGHT));
        return enemies;
    }

    @Override
    public ArrayList<EnhancedMapTile> loadEnhancedMapTiles() {
        ArrayList<EnhancedMapTile> enhancedMapTiles = new ArrayList<>();
        enhancedMapTiles.add(new EndLevelBox(
                getPositionByTileIndex(49, 9)
        ));
        return enhancedMapTiles;
    }


}