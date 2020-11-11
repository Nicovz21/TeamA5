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
            add("Map6I");
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
            case "Map6I":
                return new Map6I();
            default:
                throw new RuntimeException("Unrecognized map name");
        }
    }
}
