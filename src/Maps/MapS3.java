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

public class MapS3 extends Map {

    public MapS3() {
        super("map_s3.txt", new CommonTileset(), new Point(1, 7));
    }

    @Override
    public ArrayList<Enemy> loadEnemies() {
        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(new FishEnemy(getPositionByTileIndex(21, 10),getPositionByTileIndex(24, 10), Direction.RIGHT));
        enemies.add(new FishEnemy(getPositionByTileIndex(20, 13),getPositionByTileIndex(24, 13), Direction.RIGHT));
        enemies.add(new FastFish(getPositionByTileIndex(27, 13),getPositionByTileIndex(41, 13), Direction.RIGHT));
        enemies.add(new FastFish(getPositionByTileIndex(26, 14),getPositionByTileIndex(41, 14), Direction.RIGHT));
        enemies.add(new FastFish(getPositionByTileIndex(22, 15),getPositionByTileIndex(33, 14), Direction.RIGHT));
        enemies.add(new BigFish(getPositionByTileIndex(1, 17),getPositionByTileIndex(15, 17), Direction.LEFT));
        enemies.add(new BigFish(getPositionByTileIndex(42, 8),getPositionByTileIndex(49, 8), Direction.LEFT));
        enemies.add(new DinosaurEnemy(getPositionByTileIndex(17, 7).addY(2), getPositionByTileIndex(21, 7).addY(2), Direction.RIGHT));
        return enemies;
    }


    @Override
    public ArrayList<EnhancedMapTile> loadEnhancedMapTiles() {
        ArrayList<EnhancedMapTile> enhancedMapTiles = new ArrayList<>();

        enhancedMapTiles.add(new HorizontalMovingPlatform(
                ImageLoader.load("GreenPlatform.png"),
                getPositionByTileIndex(43, 6),
                getPositionByTileIndex(47, 6),
                TileType.JUMP_THROUGH_PLATFORM,
                3,
                new Rectangle(0, 6,16,4),
                Direction.RIGHT
        ));

        enhancedMapTiles.add(new EndLevelBox(
                getPositionByTileIndex(52, 5)
        ));

        return enhancedMapTiles;
    }
}
