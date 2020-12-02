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

public class MapN3 extends Map {

    public MapN3() {
        super("map_n3.txt", new CommonTileset(), new Point(0, 13));
    }

    @Override
    public ArrayList<Enemy> loadEnemies() {
        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(new BugEnemy(getPositionByTileIndex(10, 14), Direction.LEFT));
        enemies.add(new SpikeBox(getPositionByTileIndex(7,5), getPositionByTileIndex(16,5), true));
        enemies.add(new SpikeBox(getPositionByTileIndex(20,3), getPositionByTileIndex(24,3), true));
        return enemies;
    }

    @Override
    public ArrayList<EnhancedMapTile> loadEnhancedMapTiles() {
        ArrayList<EnhancedMapTile> enhancedMapTiles = new ArrayList<>();

        enhancedMapTiles.add(new EndLevelBox(
                getPositionByTileIndex(33, 9)
        ));

        return enhancedMapTiles;
    }
}
