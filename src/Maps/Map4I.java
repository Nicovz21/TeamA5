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
public class Map4I extends Map {

    public Map4I() {
        super("map_4I.txt", new CommonTileset(), new Point(7, 2));
    }

    @Override
    public ArrayList<Enemy> loadEnemies() {
        ArrayList<Enemy> enemies = new ArrayList<>();
        /*
        enemies.add(new BugEnemy(getPositionByTileIndex(15, 12), Direction.LEFT));
        enemies.add(new DinosaurEnemy(getPositionByTileIndex(19, 4).addY(2), getPositionByTileIndex(22, 3).addY(2), Direction.RIGHT));
        enemies.add(new BlackSpider(getPositionByTileIndex(10,6), getPositionByTileIndex(10,12)));
         */
        return enemies;
    }

    @Override
    public ArrayList<EnhancedMapTile> loadEnhancedMapTiles() {
        ArrayList<EnhancedMapTile> enhancedMapTiles = new ArrayList<>();
        /*
        enhancedMapTiles.add(new HorizontalMovingPlatform(
                ImageLoader.load("GreenPlatform.png"),
                getPositionByTileIndex(24, 9),
                getPositionByTileIndex(31, 9),
                TileType.JUMP_THROUGH_PLATFORM,
                3,
                new Rectangle(0, 6,16,4),
                Direction.RIGHT
        ));

        enhancedMapTiles.add(new EndLevelBox(
                getPositionByTileIndex(32, 10)
        ));
        */
        return enhancedMapTiles;
    }

    @Override
    public ArrayList<NPC> loadNPCs() {
        ArrayList<NPC> npcs = new ArrayList<>();

        //npcs.add(new Walrus(getPositionByTileIndex(30, 13).subtract(new Point(0, 13)), this));

        return npcs;
    }
}
