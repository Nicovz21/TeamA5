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

public class Map4A extends Map {
    public Map4A() {
        super("map_4A.txt", new CommonTileset(), new Point(1, 5));
    }

    @Override
    public ArrayList<Enemy> loadEnemies() {
        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(new HurtBox(getPositionByTileIndex(13,4)));
        enemies.add(new HurtBox(getPositionByTileIndex(6,17)));
        enemies.add(new HurtBox(getPositionByTileIndex(7,17)));
        enemies.add(new HurtBox(getPositionByTileIndex(6,23)));
        enemies.add(new HurtBox(getPositionByTileIndex(7,23)));
        enemies.add(new HurtBox(getPositionByTileIndex(8,23)));
        enemies.add(new HurtBox(getPositionByTileIndex(14,5)));
        enemies.add(new HurtBox(getPositionByTileIndex(15,5)));
        enemies.add(new HurtBox(getPositionByTileIndex(16,5)));
        enemies.add(new HurtBox(getPositionByTileIndex(19,5)));
        enemies.add(new HurtBox(getPositionByTileIndex(24,6)));
        enemies.add(new HurtBox(getPositionByTileIndex(25,6)));
        enemies.add(new HurtBox(getPositionByTileIndex(26,5)));
        enemies.add(new HurtBox(getPositionByTileIndex(27,5)));
        enemies.add(new HurtBox(getPositionByTileIndex(31,6)));
        enemies.add(new HurtBox(getPositionByTileIndex(32,6)));
        enemies.add(new HurtBox(getPositionByTileIndex(34,6)));
        enemies.add(new HurtBox(getPositionByTileIndex(36,6)));
        enemies.add(new HurtBox(getPositionByTileIndex(37,6)));
        enemies.add(new HurtBox(getPositionByTileIndex(38,6)));
        enemies.add(new HurtBox(getPositionByTileIndex(40,6)));
        enemies.add(new HurtBox(getPositionByTileIndex(41,6)));
        enemies.add(new HurtBox(getPositionByTileIndex(46,14)));
        enemies.add(new HurtBox(getPositionByTileIndex(47,14)));
        enemies.add(new HurtBox(getPositionByTileIndex(48,14)));
        enemies.add(new HurtBox(getPositionByTileIndex(46,17)));
        enemies.add(new HurtBox(getPositionByTileIndex(47,17)));
        enemies.add(new HurtBox(getPositionByTileIndex(48,17)));
        enemies.add(new BugEnemy(getPositionByTileIndex(21, 17), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(24, 15), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(33, 15), Direction.LEFT));
        enemies.add(new BugEnemy(getPositionByTileIndex(35, 12), Direction.LEFT));

        return enemies;
    }

    @Override
    public ArrayList<EnhancedMapTile> loadEnhancedMapTiles() {
        ArrayList<EnhancedMapTile> enhancedMapTiles = new ArrayList<>();


        enhancedMapTiles.add(new EndLevelBox(
                getPositionByTileIndex(48, 5)
        ));
        return enhancedMapTiles;
    }
}
