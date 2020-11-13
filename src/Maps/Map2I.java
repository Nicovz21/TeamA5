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
public class Map2I extends Map {

    public Map2I() {
        super("map_2I.txt", new CommonTileset(), new Point(1, 29));
    }

    @Override
    public ArrayList<Enemy> loadEnemies() {
        ArrayList<Enemy> enemies = new ArrayList<>();

        enemies.add(new BugEnemy(getPositionByTileIndex(12, 27), Direction.LEFT));
        enemies.add(new DinosaurEnemy(getPositionByTileIndex(22, 4).addY(2), getPositionByTileIndex(28, 4).addY(2), Direction.LEFT));
        enemies.add(new DinosaurEnemy(getPositionByTileIndex(52, 10).addY(2), getPositionByTileIndex(58, 10).addY(2), Direction.LEFT));
        enemies.add(new BrownSpider(getPositionByTileIndex(31,5), getPositionByTileIndex(31,13)));

        enemies.add(new HurtBox(getPositionByTileIndex(5,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(6,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(7,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(8,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(9,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(12,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(13,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(14,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(15,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(16,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(17,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(18,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(19,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(20,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(21,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(27,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(28,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(29,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(30,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(31,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(33,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(34,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(35,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(36,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(37,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(38,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(39,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(43,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(44,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(45,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(46,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(47,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(48,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(49,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(50,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(51,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(52,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(53,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(54,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(55,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(56,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(57,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(58,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(59,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(60,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(61,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(62,30)));
        enemies.add(new HurtBox(getPositionByTileIndex(63,30)));
        return enemies;
    }

    @Override
    public ArrayList<EnhancedMapTile> loadEnhancedMapTiles() {
        ArrayList<EnhancedMapTile> enhancedMapTiles = new ArrayList<>();

        enhancedMapTiles.add(new EndLevelBox(
                getPositionByTileIndex(68, 14)
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
