package Maps;

import Enemies.BugEnemy;
import Enemies.DinosaurEnemy;
import Enemies.SpikeBox;
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

public class Map1A extends Map {

    public Map1A() {
        super("map_1A.txt", new CommonTileset(), new Point(1, 5));
    }

    @Override
    public ArrayList<Enemy> loadEnemies() {
        ArrayList<Enemy> enemies = new ArrayList<>();

        enemies.add(new BugEnemy(getPositionByTileIndex(11, 5), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(13, 3), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(21, 9), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(20, 9), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(15, 3), Direction.LEFT));
        return enemies;
    }

    @Override
    public ArrayList<EnhancedMapTile> loadEnhancedMapTiles() {
        ArrayList<EnhancedMapTile> enhancedMapTiles = new ArrayList<>();
        enhancedMapTiles.add(new EndLevelBox(
                getPositionByTileIndex(37, 5)
        ));
        return enhancedMapTiles;
    }
}
