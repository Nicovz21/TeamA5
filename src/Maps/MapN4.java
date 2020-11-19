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
public class MapN4 extends Map {

    public MapN4() {
        super("map_n4.txt", new CommonTileset(), new Point(1, 13));
    }

    @Override
    public ArrayList<Enemy> loadEnemies() {
        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(new BugEnemy(getPositionByTileIndex(10, 23), Direction.LEFT));
        enemies.add(new DinosaurEnemy(getPositionByTileIndex(22, 23).addY(2), getPositionByTileIndex(25, 23).addY(2), Direction.RIGHT));
        enemies.add(new SpikeBox(getPositionByTileIndex(12,5), getPositionByTileIndex(12,12), false));

        enemies.add(new HurtBox(getPositionByTileIndex(8,15)));
        enemies.add(new HurtBox(getPositionByTileIndex(9,15)));
        enemies.add(new HurtBox(getPositionByTileIndex(10,15)));
        enemies.add(new HurtBox(getPositionByTileIndex(14,12)));
        enemies.add(new HurtBox(getPositionByTileIndex(15,12)));
        enemies.add(new HurtBox(getPositionByTileIndex(16,12)));
        enemies.add(new HurtBox(getPositionByTileIndex(15,18)));
        enemies.add(new HurtBox(getPositionByTileIndex(16,18)));
        enemies.add(new HurtBox(getPositionByTileIndex(15,24)));
        enemies.add(new HurtBox(getPositionByTileIndex(16,24)));
        enemies.add(new HurtBox(getPositionByTileIndex(18,24)));
        enemies.add(new HurtBox(getPositionByTileIndex(19,24)));
        enemies.add(new HurtBox(getPositionByTileIndex(21,24)));
        enemies.add(new HurtBox(getPositionByTileIndex(28,24)));
        enemies.add(new HurtBox(getPositionByTileIndex(29,24)));
        enemies.add(new HurtBox(getPositionByTileIndex(30,24)));
        enemies.add(new HurtBox(getPositionByTileIndex(31,24)));
        enemies.add(new HurtBox(getPositionByTileIndex(32,24)));
        enemies.add(new HurtBox(getPositionByTileIndex(26,21)));
        enemies.add(new HurtBox(getPositionByTileIndex(20,13)));
        enemies.add(new HurtBox(getPositionByTileIndex(21,13)));
        enemies.add(new HurtBox(getPositionByTileIndex(22,13)));
        enemies.add(new HurtBox(getPositionByTileIndex(23,13)));
        enemies.add(new HurtBox(getPositionByTileIndex(24,13)));
        enemies.add(new HurtBox(getPositionByTileIndex(25,13)));
        enemies.add(new HurtBox(getPositionByTileIndex(26,13)));
        enemies.add(new HurtBox(getPositionByTileIndex(27,13)));
        enemies.add(new HurtBox(getPositionByTileIndex(28,13)));
        enemies.add(new HurtBox(getPositionByTileIndex(22,6)));
        enemies.add(new HurtBox(getPositionByTileIndex(21,6)));
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
                getPositionByTileIndex(2, 0)
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
