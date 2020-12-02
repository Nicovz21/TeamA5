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

public class MapN5 extends Map {

    public MapN5() {
        super("map_n5.txt", new CommonTileset(), new Point(3, 3));
    }

    @Override
    public ArrayList<Enemy> loadEnemies() {
        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(new BugEnemy(getPositionByTileIndex(10, 12), Direction.LEFT));

        enemies.add(new HurtBox(getPositionByTileIndex(22,7)));
        enemies.add(new HurtBox(getPositionByTileIndex(19,11)));
        enemies.add(new HurtBox(getPositionByTileIndex(20,11)));
        enemies.add(new HurtBox(getPositionByTileIndex(21,11)));
        enemies.add(new HurtBox(getPositionByTileIndex(24,19)));
        enemies.add(new HurtBox(getPositionByTileIndex(25,19)));
        enemies.add(new HurtBox(getPositionByTileIndex(28,11)));
        enemies.add(new HurtBox(getPositionByTileIndex(29,11)));
        enemies.add(new HurtBox(getPositionByTileIndex(30,11)));


        return enemies;
    }

    @Override
    public ArrayList<EnhancedMapTile> loadEnhancedMapTiles() {
        ArrayList<EnhancedMapTile> enhancedMapTiles = new ArrayList<>();

        enhancedMapTiles.add(new EndLevelBox(
                getPositionByTileIndex(11, 3)
        ));

        return enhancedMapTiles;
    }
}
