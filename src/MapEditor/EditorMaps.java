package MapEditor;

import Level.Map;
import Maps.*;

import java.util.ArrayList;

public class EditorMaps {
    public static ArrayList<String> getMapNames() {
        return new ArrayList<String>() {{
            add("TestMap");
            add("TitleScreen");
            add("Map1I");
            add("Map2I");
            add("Map3I");
            add("Map4I");
            add("Map5I");
            add("Map6I");
            add("MapS1");
            add("MapS2");
            add("MapS3");
            add("MapS4");
            add("MapS5");
            add("MapS6");
        }};
    }

    public static Map getMapByName(String mapName) {
        switch(mapName) {
            case "TestMap":
                return new TestMap();
            case "TitleScreen":
                return new TitleScreenMap();
            case "Map1I":
                return new Map1I();
            case "Map2I":
                return new Map2I();
            case "Map3I":
                return new Map3I();
            case "Map4I":
                return new Map4I();
            case "Map5I":
                return new Map5I();
            case "Map6I":
                return new Map6I();
            case "MapS1":
                return new MapS1();
            case "MapS2":
                return new MapS2();
            case "MapS3":
                return new MapS3();
            case "MapS4":
                return new MapS4();
            case "MapS5":
                return new MapS5();
            case "MapS6":
                return new MapS6();
            default:
                throw new RuntimeException("Unrecognized map name");
        }
    }
}
