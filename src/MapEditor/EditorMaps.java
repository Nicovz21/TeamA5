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
            add("Map1A");
            add("Map2A");
            add("Map3A");
            add("Map4A");
            add("Map5A");
            add("Map6A");
            add("MapN1");
            add("MapN2");
            add("MapN3");
            add("MapN4");
            add("MapN5");
            add("MapN6");
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
            case "Map1A":
                return new Map1A();
            case "Map2A":
                return new Map2A();
            case "Map3A":
                return new Map3A();
            case "Map4A":
                return new Map4A();
            case "Map5A":
                return new Map5A();
            case "Map6A":
                return new Map6A();
            case "MapN1":
                return new MapN1();
            case "MapN2":
                return new MapN2();
            case "MapN3":
                return new MapN3();
            case "MapN4":
                return new MapN4();
            case "MapN5":
                return new MapN5();
            case "MapN6":
                return new MapN6();
            default:
                throw new RuntimeException("Unrecognized map name");
        }
    }
}
