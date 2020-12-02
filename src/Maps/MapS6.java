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

public class MapS6 extends Map {

    public MapS6() {
        super("map_s6.txt", new CommonTileset(), new Point(1, 15));
    }

    @Override
    public ArrayList<Enemy> loadEnemies() {
        ArrayList<Enemy> enemies = new ArrayList<>();

        enemies.add(new HurtBox(getPositionByTileIndex(3, 16)));
        enemies.add(new HurtBox(getPositionByTileIndex(4, 16)));
        enemies.add(new HurtBox(getPositionByTileIndex(6, 16)));
        enemies.add(new HurtBox(getPositionByTileIndex(7, 16)));
        enemies.add(new HurtBox(getPositionByTileIndex(12, 16)));
        enemies.add(new HurtBox(getPositionByTileIndex(13, 16)));
        enemies.add(new HurtBox(getPositionByTileIndex(14, 16)));
        enemies.add(new HurtBox(getPositionByTileIndex(16, 16)));
        enemies.add(new HurtBox(getPositionByTileIndex(17, 16)));
        enemies.add(new HurtBox(getPositionByTileIndex(18, 16)));
        enemies.add(new HurtBox(getPositionByTileIndex(20, 16)));
        enemies.add(new HurtBox(getPositionByTileIndex(21, 16)));
        enemies.add(new HurtBox(getPositionByTileIndex(23, 16)));
        enemies.add(new HurtBox(getPositionByTileIndex(24, 16)));
        enemies.add(new HurtBox(getPositionByTileIndex(25, 16)));
        enemies.add(new HurtBox(getPositionByTileIndex(26, 16)));
        enemies.add(new HurtBox(getPositionByTileIndex(27, 16)));


        enemies.add(new ArmorBug(getPositionByTileIndex(4, 7), Direction.LEFT));

        enemies.add(new DinosaurEnemy(getPositionByTileIndex(26, 11).addY(2), getPositionByTileIndex(30, 11).addY(2), Direction.RIGHT));

        enemies.add(new SpikeBox(getPositionByTileIndex(15, 10),getPositionByTileIndex(22, 15),true));
        enemies.add(new SpikeBox(getPositionByTileIndex(2, 10),getPositionByTileIndex(8, 10),true));
        return enemies;
    }

    @Override
    public ArrayList<EnhancedMapTile> loadEnhancedMapTiles() {
        ArrayList<EnhancedMapTile> enhancedMapTiles = new ArrayList<>();


        enhancedMapTiles.add(new EndLevelBox(
                getPositionByTileIndex(32, 13)
        ));

        return enhancedMapTiles;
    }
}
