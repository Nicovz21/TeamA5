package Maps;

import Enemies.*;
import Engine.ImageLoader;
import EnhancedMapTiles.*;
import GameObject.Rectangle;
import Level.*;
import NPCs.*;
import Tilesets.CommonTileset;
import Utils.Direction;
import Utils.Point;

import java.util.ArrayList;

public class FinalMap extends Map {

    private Boss boss;

    public FinalMap() {
        super("final_map.txt", new CommonTileset(), new Point(4, 38));
    }

    @Override
    public ArrayList<Enemy> loadEnemies() {
        ArrayList<Enemy> enemies = new ArrayList<>();

        enemies.add(new HurtBox(getPositionByTileIndex(0,39)));
        enemies.add(new HurtBox(getPositionByTileIndex(16,39)));

        return enemies;
    }

    @Override
    public ArrayList<NPC> loadNPCs() {
        ArrayList<NPC> npcs = new ArrayList<>();
        boss = new Boss(getPositionByTileIndex(11, 8).subtract(new Point(0, 20)), this);
        npcs.add(boss);

        return npcs;
    }

    public boolean battleInitiated() {
        return boss.getTalkedTo();
    }
}
