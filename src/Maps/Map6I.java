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

public class Map6I extends Map {

    public Map6I() {
        super("map_6I.txt", new CommonTileset(), new Point(1, 48));
    }

    @Override
    public ArrayList<Enemy> loadEnemies() {
        ArrayList<Enemy> enemies = new ArrayList<>();

        enemies.add(new SpikeBox(getPositionByTileIndex(8,37),getPositionByTileIndex(8,43), false));
        enemies.add(new SpikeBox(getPositionByTileIndex(1,24).addY(10),getPositionByTileIndex(15,24).addY(10), true));
        enemies.add(new SpikeBox(getPositionByTileIndex(6,6),getPositionByTileIndex(15,6), true));

        enemies.add(new HurtBox(getPositionByTileIndex(3,43)));
        enemies.add(new HurtBox(getPositionByTileIndex(4,43)));
        enemies.add(new HurtBox(getPositionByTileIndex(5,43)));
        enemies.add(new HurtBox(getPositionByTileIndex(7,43)));
        enemies.add(new HurtBox(getPositionByTileIndex(8,43)));
        enemies.add(new HurtBox(getPositionByTileIndex(9,43)));
        enemies.add(new HurtBox(getPositionByTileIndex(11,43)));
        enemies.add(new HurtBox(getPositionByTileIndex(12,43)));
        enemies.add(new HurtBox(getPositionByTileIndex(13,43)));
        enemies.add(new HurtBox(getPositionByTileIndex(1,18)));
        enemies.add(new HurtBox(getPositionByTileIndex(17,2)));
        enemies.add(new HurtBox(getPositionByTileIndex(14,1)));
        enemies.add(new HurtBox(getPositionByTileIndex(15,1)));
        enemies.add(new HurtBox(getPositionByTileIndex(3,1)));
        enemies.add(new HurtBox(getPositionByTileIndex(4,1)));
        enemies.add(new HurtBox(getPositionByTileIndex(5,1)));

        return enemies;
    }

    @Override
    public ArrayList<EnhancedMapTile> loadEnhancedMapTiles() {
        ArrayList<EnhancedMapTile> enhancedMapTiles = new ArrayList<>();

        enhancedMapTiles.add(new HorizontalMovingPlatform(
                ImageLoader.load("GreenPlatform.png"),
                getPositionByTileIndex(3, 35),
                getPositionByTileIndex(16, 35),
                TileType.JUMP_THROUGH_PLATFORM,
                3,
                new Rectangle(0, 6,16,4),
                Direction.RIGHT
        ));

        enhancedMapTiles.add(new EndLevelBox(
                getPositionByTileIndex(10, 0)
        ));

        return enhancedMapTiles;
    }
}
