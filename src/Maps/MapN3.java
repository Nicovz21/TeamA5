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
public class MapN3 extends Map {

    public MapN3() {
        super("map_n3.txt", new CommonTileset(), new Point(0, 13));
    }

    @Override
    public ArrayList<Enemy> loadEnemies() {
        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(new BugEnemy(getPositionByTileIndex(10, 14), Direction.LEFT));
        //enemies.add(new DinosaurEnemy(getPositionByTileIndex(19, 4).addY(2), getPositionByTileIndex(22, 4).addY(2), Direction.RIGHT));
        enemies.add(new SpikeBox(getPositionByTileIndex(7,5), getPositionByTileIndex(16,5), true));
        enemies.add(new SpikeBox(getPositionByTileIndex(20,3), getPositionByTileIndex(24,3), true));
        return enemies;
    }

    @Override
    public ArrayList<EnhancedMapTile> loadEnhancedMapTiles() {
        ArrayList<EnhancedMapTile> enhancedMapTiles = new ArrayList<>();

//        enhancedMapTiles.add(new HorizontalMovingPlatform(
//                ImageLoader.load("GreenPlatform.png"),
//                getPositionByTileIndex(24, 9),
//                getPositionByTileIndex(31, 9),
//                TileType.JUMP_THROUGH_PLATFORM,
//                3,
//                new Rectangle(0, 6,16,4),
//                Direction.RIGHT
//        ));

        enhancedMapTiles.add(new EndLevelBox(
                getPositionByTileIndex(33, 9)
        ));

        return enhancedMapTiles;
    }

//    @Override
//    public ArrayList<NPC> loadNPCs() {
//        ArrayList<NPC> npcs = new ArrayList<>();
//
//        npcs.add(new Walrus(getPositionByTileIndex(30, 13).subtract(new Point(0, 13)), this));
//
//        return npcs;
//    }
}
