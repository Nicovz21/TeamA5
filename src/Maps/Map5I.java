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
public class Map5I extends Map {

    public Map5I() {
        super("map_5I.txt", new CommonTileset(), new Point(16, 8));
    }

    @Override
    public ArrayList<Enemy> loadEnemies() {
        ArrayList<Enemy> enemies = new ArrayList<>();

        enemies.add(new DarkBug(getPositionByTileIndex(9, 9), Direction.RIGHT));
        enemies.add(new ArmorBug(getPositionByTileIndex(48, 32), Direction.LEFT));
        enemies.add(new DinosaurEnemy(getPositionByTileIndex(19, 23).addY(2), getPositionByTileIndex(21, 23).addY(2), Direction.LEFT));
        enemies.add(new DinosaurEnemy(getPositionByTileIndex(41, 22).addY(2), getPositionByTileIndex(44, 22).addY(2), Direction.LEFT));
        enemies.add(new BlackSpider(getPositionByTileIndex(3,7), getPositionByTileIndex(3,17)));
        enemies.add(new BlackSpider(getPositionByTileIndex(32,25), getPositionByTileIndex(32,33)));
        enemies.add(new BlackSpider(getPositionByTileIndex(35,0), getPositionByTileIndex(35,7)));

        enemies.add(new HurtBox(getPositionByTileIndex(5,20)));
        enemies.add(new HurtBox(getPositionByTileIndex(6,20)));
        enemies.add(new HurtBox(getPositionByTileIndex(7,20)));
        enemies.add(new HurtBox(getPositionByTileIndex(14,16)));
        enemies.add(new HurtBox(getPositionByTileIndex(15,16)));
        enemies.add(new HurtBox(getPositionByTileIndex(16,16)));
        enemies.add(new HurtBox(getPositionByTileIndex(21,25)));
        enemies.add(new HurtBox(getPositionByTileIndex(29,33)));
        enemies.add(new HurtBox(getPositionByTileIndex(30,33)));
        enemies.add(new HurtBox(getPositionByTileIndex(31,33)));
        enemies.add(new HurtBox(getPositionByTileIndex(34,33)));
        enemies.add(new HurtBox(getPositionByTileIndex(35,33)));
        enemies.add(new HurtBox(getPositionByTileIndex(36,33)));
        enemies.add(new HurtBox(getPositionByTileIndex(38,33)));
        enemies.add(new HurtBox(getPositionByTileIndex(39,33)));
        enemies.add(new HurtBox(getPositionByTileIndex(33,17)));

        return enemies;
    }

    @Override
    public ArrayList<EnhancedMapTile> loadEnhancedMapTiles() {
        ArrayList<EnhancedMapTile> enhancedMapTiles = new ArrayList<>();

        enhancedMapTiles.add(new EndLevelBox(
                getPositionByTileIndex(45, 4)
        ));

        return enhancedMapTiles;
    }

    @Override
    public ArrayList<NPC> loadNPCs() {
        ArrayList<NPC> npcs = new ArrayList<>();

        //npcs.add(new Walrus(getPositionByTileIndex(30, 13).subtract(new Point(0, 13)), this));

        return npcs;
    }
}
