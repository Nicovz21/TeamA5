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

public class MapN6 extends Map {

    public MapN6() {
        super("map_n6.txt", new CommonTileset(), new Point(0, 15));
    }

    @Override
    public ArrayList<Enemy> loadEnemies() {
        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(new BugEnemy(getPositionByTileIndex(17, 3), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(4, 5), Direction.LEFT));
        enemies.add(new DinosaurEnemy(getPositionByTileIndex(14, 15).addY(2), getPositionByTileIndex(16, 15).addY(2), Direction.RIGHT));
        enemies.add(new SpikeBox(getPositionByTileIndex(48,5), getPositionByTileIndex(48,15), false));

        enemies.add(new HurtBox(getPositionByTileIndex(2,16)));
        enemies.add(new HurtBox(getPositionByTileIndex(3,16)));
        enemies.add(new HurtBox(getPositionByTileIndex(4,16)));
        enemies.add(new HurtBox(getPositionByTileIndex(5,16)));
        enemies.add(new HurtBox(getPositionByTileIndex(6,16)));
        enemies.add(new HurtBox(getPositionByTileIndex(7,16)));
        enemies.add(new HurtBox(getPositionByTileIndex(8,16)));
        enemies.add(new HurtBox(getPositionByTileIndex(9,16)));
        enemies.add(new HurtBox(getPositionByTileIndex(10,16)));
        enemies.add(new HurtBox(getPositionByTileIndex(11,16)));
        enemies.add(new HurtBox(getPositionByTileIndex(12,16)));
        enemies.add(new HurtBox(getPositionByTileIndex(17,11)));

        enemies.add(new HurtBox(getPositionByTileIndex(29,16)));
        enemies.add(new HurtBox(getPositionByTileIndex(30,16)));
        enemies.add(new HurtBox(getPositionByTileIndex(31,16)));

        enemies.add(new HurtBox(getPositionByTileIndex(41,16)));
        enemies.add(new HurtBox(getPositionByTileIndex(42,16)));
        enemies.add(new HurtBox(getPositionByTileIndex(43,16)));
        enemies.add(new HurtBox(getPositionByTileIndex(44,16)));
        enemies.add(new HurtBox(getPositionByTileIndex(45,16)));
        enemies.add(new HurtBox(getPositionByTileIndex(46,16)));
        enemies.add(new HurtBox(getPositionByTileIndex(47,16)));
        enemies.add(new HurtBox(getPositionByTileIndex(48,16)));
        enemies.add(new HurtBox(getPositionByTileIndex(49,16)));


        return enemies;
    }

    @Override
    public ArrayList<EnhancedMapTile> loadEnhancedMapTiles() {
        ArrayList<EnhancedMapTile> enhancedMapTiles = new ArrayList<>();

        enhancedMapTiles.add(new EndLevelBox(
                getPositionByTileIndex(48, 2)
        ));

        return enhancedMapTiles;
    }
}
