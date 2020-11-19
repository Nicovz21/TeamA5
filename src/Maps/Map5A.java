package Maps;

import Enemies.BugEnemy;
import Enemies.HurtBox;
import EnhancedMapTiles.EndLevelBox;
import Level.Enemy;
import Level.EnhancedMapTile;
import Level.Map;
import Level.NPC;
import Tilesets.CommonTileset;
import Utils.Direction;
import Utils.Point;

import java.util.ArrayList;

public class Map5A extends Map {
    public Map5A() {
        super("Map_5A.txt", new CommonTileset(), new Point(1, 5));
    }

    @Override
    public ArrayList<Enemy> loadEnemies() {
        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(new HurtBox(getPositionByTileIndex(25,42)));
        enemies.add(new HurtBox(getPositionByTileIndex(26,42)));
        enemies.add(new HurtBox(getPositionByTileIndex(27,42)));
        enemies.add(new HurtBox(getPositionByTileIndex(28,42)));
        enemies.add(new HurtBox(getPositionByTileIndex(29,42)));
        enemies.add(new HurtBox(getPositionByTileIndex(30,42)));
        enemies.add(new HurtBox(getPositionByTileIndex(31,42)));
        enemies.add(new HurtBox(getPositionByTileIndex(33,42)));
        enemies.add(new HurtBox(getPositionByTileIndex(35,42)));
        enemies.add(new HurtBox(getPositionByTileIndex(37,42)));
        enemies.add(new HurtBox(getPositionByTileIndex(39,42)));
        enemies.add(new HurtBox(getPositionByTileIndex(41,42)));
        enemies.add(new HurtBox(getPositionByTileIndex(43,42)));
        enemies.add(new HurtBox(getPositionByTileIndex(45,42)));
        enemies.add(new HurtBox(getPositionByTileIndex(47,42)));
        enemies.add(new HurtBox(getPositionByTileIndex(49,42)));
        enemies.add(new BugEnemy(getPositionByTileIndex(25, 15), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(23, 15), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(20, 15), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(33, 29), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(35, 29), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(36, 29), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(10, 27), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(6, 27), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(5, 27), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(10, 19), Direction.LEFT));

        return enemies;
    }

    @Override
    public ArrayList<EnhancedMapTile> loadEnhancedMapTiles() {
        ArrayList<EnhancedMapTile> enhancedMapTiles = new ArrayList<>();

        enhancedMapTiles.add(new EndLevelBox(
                getPositionByTileIndex(47, 45)
        ));

        return enhancedMapTiles;
    }
}
