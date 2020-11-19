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
public class MapN5 extends Map {

    public MapN5() {
        super("map_n5.txt", new CommonTileset(), new Point(3, 3));
    }

    @Override
    public ArrayList<Enemy> loadEnemies() {
        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(new BugEnemy(getPositionByTileIndex(10, 12), Direction.LEFT));
        //enemies.add(new DinosaurEnemy(getPositionByTileIndex(19, 4).addY(2), getPositionByTileIndex(22, 4).addY(2), Direction.RIGHT));
        //enemies.add(new SpikeBox(getPositionByTileIndex(7,5), getPositionByTileIndex(7,10), false));

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
                getPositionByTileIndex(11, 3)
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
