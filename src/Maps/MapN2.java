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
public class MapN2 extends Map {

    public MapN2() {
        super("map_n2.txt", new CommonTileset(), new Point(0, 14));
    }

    @Override
    public ArrayList<Enemy> loadEnemies() {
        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(new BugEnemy(getPositionByTileIndex(41, 27), Direction.LEFT));
        //enemies.add(new DinosaurEnemy(getPositionByTileIndex(19, 4).addY(2), getPositionByTileIndex(22, 4).addY(2), Direction.RIGHT));
        enemies.add(new SpikeBox(getPositionByTileIndex(11,18), getPositionByTileIndex(11,21), false));

        enemies.add(new HurtBox(getPositionByTileIndex(7,23)));
        enemies.add(new HurtBox(getPositionByTileIndex(8,23)));
        enemies.add(new HurtBox(getPositionByTileIndex(26,14)));
        enemies.add(new HurtBox(getPositionByTileIndex(27,14)));
        enemies.add(new HurtBox(getPositionByTileIndex(28,14)));
        enemies.add(new HurtBox(getPositionByTileIndex(29,14)));
        enemies.add(new HurtBox(getPositionByTileIndex(31,14)));
        enemies.add(new HurtBox(getPositionByTileIndex(32,14)));
        enemies.add(new HurtBox(getPositionByTileIndex(33,14)));
        enemies.add(new HurtBox(getPositionByTileIndex(34,14)));
        enemies.add(new HurtBox(getPositionByTileIndex(35,14)));
        enemies.add(new HurtBox(getPositionByTileIndex(36,14)));
        enemies.add(new HurtBox(getPositionByTileIndex(37,14)));
        enemies.add(new HurtBox(getPositionByTileIndex(36,29)));
        enemies.add(new HurtBox(getPositionByTileIndex(35,29)));
        enemies.add(new HurtBox(getPositionByTileIndex(34,29)));
        enemies.add(new HurtBox(getPositionByTileIndex(33,29)));
        enemies.add(new HurtBox(getPositionByTileIndex(32,29)));
        enemies.add(new HurtBox(getPositionByTileIndex(31,29)));
        enemies.add(new HurtBox(getPositionByTileIndex(30,29)));
        enemies.add(new HurtBox(getPositionByTileIndex(29,29)));
        enemies.add(new HurtBox(getPositionByTileIndex(28,29)));
        enemies.add(new HurtBox(getPositionByTileIndex(27,29)));
        enemies.add(new HurtBox(getPositionByTileIndex(26,29)));
        enemies.add(new HurtBox(getPositionByTileIndex(25,29)));
        enemies.add(new HurtBox(getPositionByTileIndex(24,29)));
        enemies.add(new HurtBox(getPositionByTileIndex(23,29)));
        enemies.add(new HurtBox(getPositionByTileIndex(22,29)));
        enemies.add(new HurtBox(getPositionByTileIndex(21,29)));
        enemies.add(new HurtBox(getPositionByTileIndex(20,29)));
        enemies.add(new HurtBox(getPositionByTileIndex(19,29)));
        enemies.add(new HurtBox(getPositionByTileIndex(18,29)));

        enemies.add(new HurtBox(getPositionByTileIndex(37,18)));
        enemies.add(new HurtBox(getPositionByTileIndex(36,18)));
        enemies.add(new HurtBox(getPositionByTileIndex(35,18)));
        enemies.add(new HurtBox(getPositionByTileIndex(34,18)));
        enemies.add(new HurtBox(getPositionByTileIndex(33,18)));
        enemies.add(new HurtBox(getPositionByTileIndex(32,18)));
        enemies.add(new HurtBox(getPositionByTileIndex(31,18)));

        enemies.add(new HurtBox(getPositionByTileIndex(29,18)));
        enemies.add(new HurtBox(getPositionByTileIndex(28,18)));
        enemies.add(new HurtBox(getPositionByTileIndex(27,18)));
        enemies.add(new HurtBox(getPositionByTileIndex(26,18)));

        enemies.add(new HurtBox(getPositionByTileIndex(0,29)));
        enemies.add(new HurtBox(getPositionByTileIndex(1,29)));


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
                getPositionByTileIndex(42, 11)
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
