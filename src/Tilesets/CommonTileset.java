package Tilesets;

import Builders.FrameBuilder;
import Builders.MapTileBuilder;
import Engine.ImageLoader;
import GameObject.Frame;
import GameObject.ImageEffect;
import Level.TileType;
import Level.Tileset;

import java.util.ArrayList;

// This class represents a "common" tileset of standard tiles defined in the CommonTileset.png file
public class CommonTileset extends Tileset {

    public CommonTileset() {
        super(ImageLoader.load("CommonTileset.png"), 16, 16, 3);
    }

    @Override
    public ArrayList<MapTileBuilder> defineTiles() {
        ArrayList<MapTileBuilder> mapTiles = new ArrayList<>();

        // grass
        Frame grassFrame = new FrameBuilder(getSubImage(0, 0), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder grassTile = new MapTileBuilder(grassFrame)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(grassTile);

        // sky
        Frame skyFrame = new FrameBuilder(getSubImage(0, 1), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder skyTile = new MapTileBuilder(skyFrame);

        mapTiles.add(skyTile);

        // dirt
        Frame dirtFrame = new FrameBuilder(getSubImage(0, 2), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder dirtTile = new MapTileBuilder(dirtFrame)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(dirtTile);

        // sun
        Frame[] sunFrames = new Frame[] {
                new FrameBuilder(getSubImage(2, 0), 400)
                        .withScale(tileScale)
                        .build(),
                new FrameBuilder(getSubImage(2, 1), 400)
                        .withScale(tileScale)
                        .build()
        };

        MapTileBuilder sunTile = new MapTileBuilder(sunFrames);

        mapTiles.add(sunTile);

        // tree trunk with full hole
        Frame treeTrunkWithFullHoleFrame = new FrameBuilder(getSubImage(2, 2), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder treeTrunkWithFullHoleTile = new MapTileBuilder(treeTrunkWithFullHoleFrame)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(treeTrunkWithFullHoleTile);

        // left end branch
        Frame leftEndBranchFrame = new FrameBuilder(getSubImage(1, 5), 0)
                .withScale(tileScale)
                .withBounds(0, 6, 16, 4)
                .build();

        MapTileBuilder leftEndBranchTile = new MapTileBuilder(leftEndBranchFrame)
                .withTileType(TileType.JUMP_THROUGH_PLATFORM);

        mapTiles.add(leftEndBranchTile);

        // right end branch
        Frame rightEndBranchFrame = new FrameBuilder(getSubImage(1, 5), 0)
                .withScale(tileScale)
                .withBounds(0, 6, 16, 4)
                .withImageEffect(ImageEffect.FLIP_HORIZONTAL)
                .build();

        MapTileBuilder rightEndBranchTile = new MapTileBuilder(rightEndBranchFrame)
                .withTileType(TileType.JUMP_THROUGH_PLATFORM);

        mapTiles.add(rightEndBranchTile);

        // tree trunk
        Frame treeTrunkFrame = new FrameBuilder(getSubImage(1, 0), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder treeTrunkTile = new MapTileBuilder(treeTrunkFrame)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(treeTrunkTile);

        // tree top leaves
        Frame treeTopLeavesFrame = new FrameBuilder(getSubImage(1, 1), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder treeTopLeavesTile = new MapTileBuilder(treeTopLeavesFrame)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(treeTopLeavesTile);

        // yellow flower
        Frame[] yellowFlowerFrames = new Frame[] {
                new FrameBuilder(getSubImage(1, 2), 500)
                        .withScale(tileScale)
                        .build(),
                new FrameBuilder(getSubImage(1, 3), 500)
                        .withScale(tileScale)
                        .build(),
                new FrameBuilder(getSubImage(1, 2), 500)
                        .withScale(tileScale)
                        .build(),
                new FrameBuilder(getSubImage(1, 4), 500)
                        .withScale(tileScale)
                        .build()
        };

        MapTileBuilder yellowFlowerTile = new MapTileBuilder(yellowFlowerFrames);

        mapTiles.add(yellowFlowerTile);

        // purple flower
        Frame[] purpleFlowerFrames = new Frame[] {
                new FrameBuilder(getSubImage(0, 3), 500)
                        .withScale(tileScale)
                        .build(),
                new FrameBuilder(getSubImage(0, 4), 500)
                        .withScale(tileScale)
                        .build(),
                new FrameBuilder(getSubImage(0, 3), 500)
                        .withScale(tileScale)
                        .build(),
                new FrameBuilder(getSubImage(0, 5), 500)
                        .withScale(tileScale)
                        .build()
        };

        MapTileBuilder purpleFlowerTile = new MapTileBuilder(purpleFlowerFrames);

        mapTiles.add(purpleFlowerTile);

        // middle branch
        Frame middleBranchFrame = new FrameBuilder(getSubImage(2, 3), 0)
                .withScale(tileScale)
                .withBounds(0, 6, 16, 4)
                .build();

        MapTileBuilder middleBranchTile = new MapTileBuilder(middleBranchFrame)
                .withTileType(TileType.JUMP_THROUGH_PLATFORM);

        mapTiles.add(middleBranchTile);

        // tree trunk hole top
        Frame treeTrunkHoleTopFrame = new FrameBuilder(getSubImage(2, 4), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder treeTrunkHoleTopTile = new MapTileBuilder(treeTrunkHoleTopFrame)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(treeTrunkHoleTopTile);

        // tree trunk hole bottom
        Frame treeTrunkHoleBottomFrame = new FrameBuilder(getSubImage(2, 5), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder treeTrunkHoleBottomTile = new MapTileBuilder(treeTrunkHoleBottomFrame)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(treeTrunkHoleBottomTile);

        // top water
        Frame topWaterFrame = new FrameBuilder(getSubImage(3, 0), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder topWaterTile = new MapTileBuilder(topWaterFrame);

        mapTiles.add(topWaterTile);

        // water
        Frame waterFrame = new FrameBuilder(getSubImage(3, 1), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder waterTile = new MapTileBuilder(waterFrame)
                .withTileType(TileType.WATER);

        mapTiles.add(waterTile);

        // grey rock
        Frame greyRockFrame = new FrameBuilder(getSubImage(3, 2), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder greyRockTile = new MapTileBuilder(greyRockFrame)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(greyRockTile);

        // seaweed
        Frame[] seaweedFrames = new Frame[] {
                new FrameBuilder(getSubImage(3, 3), 700)
                        .withScale(tileScale)
                        .build(),
                new FrameBuilder(getSubImage(3, 4), 300)
                        .withScale(tileScale)
                        .build(),
                new FrameBuilder(getSubImage(3, 5), 700)
                        .withScale(tileScale)
                        .build(),
                new FrameBuilder(getSubImage(3, 4), 300)
                        .withScale(tileScale)
                        .build()
        };

        MapTileBuilder seaweedTile = new MapTileBuilder(seaweedFrames)
                .withTileType(TileType.WATER);

        mapTiles.add(seaweedTile);

        // forest background
        Frame forestBackgroundFrame = new FrameBuilder(getSubImage(4, 0), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder forestBackgroundTile = new MapTileBuilder(forestBackgroundFrame)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(forestBackgroundTile);

        // forest tree trunk
        Frame forestTrunkFrame = new FrameBuilder(getSubImage(4, 1), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder forestTrunkTile = new MapTileBuilder(forestTrunkFrame)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(forestTrunkTile);

        // forest tree leaves
        Frame forestLeavesFrame = new FrameBuilder(getSubImage(4, 2), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder forestLeavesTile = new MapTileBuilder(forestLeavesFrame)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(forestLeavesTile);

        // forest ground
        Frame forestGroundFrame = new FrameBuilder(getSubImage(4, 3), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder forestGroundTile = new MapTileBuilder(forestGroundFrame)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(forestGroundTile);

        // top poison water
        Frame topPoisonFrame = new FrameBuilder(getSubImage(4, 4), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder topPoisonTile = new MapTileBuilder(topPoisonFrame)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(topPoisonTile);

        // poison water
        Frame poisonFrame = new FrameBuilder(getSubImage(4, 5), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder poisonTile = new MapTileBuilder(poisonFrame)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(poisonTile);

        // forest middle branch
        Frame forestMidBranchFrame = new FrameBuilder(getSubImage(5, 0), 0)
                .withScale(tileScale)
                .withBounds(0,6,16,4)
                .build();

        MapTileBuilder forestMidBranchTile = new MapTileBuilder(forestMidBranchFrame)
                .withTileType(TileType.JUMP_THROUGH_PLATFORM);

        mapTiles.add(forestMidBranchTile);

        // left end branch
        Frame forestLeftBranchFrame = new FrameBuilder(getSubImage(5, 1), 0)
                .withScale(tileScale)
                .withBounds(0, 6, 16, 4)
                .build();

        MapTileBuilder forestLeftBranchTile = new MapTileBuilder(forestLeftBranchFrame)
                .withTileType(TileType.JUMP_THROUGH_PLATFORM);

        mapTiles.add(forestLeftBranchTile);

        // right end branch
        Frame forestRightBranchFrame = new FrameBuilder(getSubImage(5, 1), 0)
                .withScale(tileScale)
                .withBounds(0, 6, 16, 4)
                .withImageEffect(ImageEffect.FLIP_HORIZONTAL)
                .build();

        MapTileBuilder forestRightBranchTile = new MapTileBuilder(forestRightBranchFrame)
                .withTileType(TileType.JUMP_THROUGH_PLATFORM);

        mapTiles.add(forestRightBranchTile);

        // dirt cave background
        Frame dirtCaveBackgroundFrame = new FrameBuilder(getSubImage(5, 2), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder dirtCaveBackgroundTile = new MapTileBuilder(dirtCaveBackgroundFrame)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(dirtCaveBackgroundTile);

        // dirt ground spike
        Frame dirtGroundSpikeFrame = new FrameBuilder(getSubImage(5, 3), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder dirtGroundSpikeTile = new MapTileBuilder(dirtGroundSpikeFrame)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(dirtGroundSpikeTile);

        // dirt ceiling spike
        Frame dirtCeilingSpikeFrame = new FrameBuilder(getSubImage(5, 3), 0)
                .withScale(tileScale)
                .withImageEffect(ImageEffect.FLIP_VERTICAL)
                .build();

        MapTileBuilder dirtCeilingSpikeTile = new MapTileBuilder(dirtCeilingSpikeFrame)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(dirtCeilingSpikeTile);

        // cave top water
        Frame caveTopWaterFrame = new FrameBuilder(getSubImage(5, 4), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder caveTopWaterTile = new MapTileBuilder(caveTopWaterFrame)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(caveTopWaterTile);

        // cave water
        Frame caveWaterFrame = new FrameBuilder(getSubImage(5, 5), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder caveWaterTile = new MapTileBuilder(caveWaterFrame)
                .withTileType(TileType.WATER);

        mapTiles.add(caveWaterTile);

        // stone cave background
        Frame stoneCaveBackgroundFrame = new FrameBuilder(getSubImage(6, 0), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder stoneCaveBackgroundTile = new MapTileBuilder(stoneCaveBackgroundFrame)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(stoneCaveBackgroundTile);

        // lava top
        Frame lavaTopFrame = new FrameBuilder(getSubImage(6, 1), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder lavaTopTile = new MapTileBuilder(lavaTopFrame)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(lavaTopTile);

        // lava top
        Frame lavaFrame = new FrameBuilder(getSubImage(6, 2), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder lavaTile = new MapTileBuilder(lavaFrame)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(lavaTile);

        //stone ground spike
        Frame stoneGroundSpikeFrame = new FrameBuilder(getSubImage(6, 3), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder stoneGroundSpikeTile = new MapTileBuilder(stoneGroundSpikeFrame)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(stoneGroundSpikeTile);

        // stone ceiling spike
        Frame stoneCeilingSpikeFrame = new FrameBuilder(getSubImage(6, 3), 0)
                .withScale(tileScale)
                .withImageEffect(ImageEffect.FLIP_VERTICAL)
                .build();

        MapTileBuilder stoneCeilingSpikeTile = new MapTileBuilder(stoneCeilingSpikeFrame)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(stoneCeilingSpikeTile);

        //bricks
        Frame brickFrame = new FrameBuilder(getSubImage(6, 4), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder brickTile = new MapTileBuilder(brickFrame)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(brickTile);

        //final stage background
        Frame royalBackgroundFrame = new FrameBuilder(getSubImage(6, 5), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder royalBackgroundTile = new MapTileBuilder(royalBackgroundFrame)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(royalBackgroundTile);

        //gold ground spike
        Frame goldGroundSpikeFrame = new FrameBuilder(getSubImage(7, 0), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder goldGroundSpikeTile = new MapTileBuilder(goldGroundSpikeFrame)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(goldGroundSpikeTile);

        // gold ceiling spike
        Frame goldCeilingSpikeFrame = new FrameBuilder(getSubImage(7, 0), 0)
                .withScale(tileScale)
                .withImageEffect(ImageEffect.FLIP_VERTICAL)
                .build();

        MapTileBuilder goldCeilingSpikeTile = new MapTileBuilder(goldCeilingSpikeFrame)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(goldCeilingSpikeTile);

        // gold bricks
        Frame goldBrickFrame = new FrameBuilder(getSubImage(7, 1), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder goldBrickTile = new MapTileBuilder(goldBrickFrame)
                .withTileType(TileType.NOT_PASSABLE);

        mapTiles.add(goldBrickTile);

        //pillar
        Frame pillarFrame = new FrameBuilder(getSubImage(7, 2), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder pillarTile = new MapTileBuilder(pillarFrame)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(pillarTile);

        //bottom pillar
        Frame bottomPillarFrame = new FrameBuilder(getSubImage(7, 3), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder bottomPillarTile = new MapTileBuilder(bottomPillarFrame)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(bottomPillarTile);

        // top pillar
        Frame topPillarFrame = new FrameBuilder(getSubImage(7, 3), 0)
                .withScale(tileScale)
                .withImageEffect(ImageEffect.FLIP_VERTICAL)
                .build();

        MapTileBuilder topPillarTile = new MapTileBuilder(topPillarFrame)
                .withTileType(TileType.JUMP_THROUGH_PLATFORM);

        mapTiles.add(topPillarTile);

        //gold pillar
        Frame goldPillarFrame = new FrameBuilder(getSubImage(7, 4), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder goldPillarTile = new MapTileBuilder(goldPillarFrame)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(goldPillarTile);

        //bottom gold pillar
        Frame bottomGoldPillarFrame = new FrameBuilder(getSubImage(7, 5), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder bottomGoldPillarTile = new MapTileBuilder(bottomGoldPillarFrame)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(bottomGoldPillarTile);

        // top gold pillar
        Frame topGoldPillarFrame = new FrameBuilder(getSubImage(7, 5), 0)
                .withScale(tileScale)
                .withImageEffect(ImageEffect.FLIP_VERTICAL)
                .build();

        MapTileBuilder topGoldPillarTile = new MapTileBuilder(topGoldPillarFrame)
                .withTileType(TileType.JUMP_THROUGH_PLATFORM);

        mapTiles.add(topGoldPillarTile);

        //stars 1
        Frame starSky1Frame = new FrameBuilder(getSubImage(8, 0), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder starSky1Tile = new MapTileBuilder(starSky1Frame);

        mapTiles.add(starSky1Tile);

        //stars 2
        Frame starSky2Frame = new FrameBuilder(getSubImage(8, 0), 0)
                .withScale(tileScale)
                .withImageEffect(ImageEffect.FLIP_VERTICAL)
                .build();

        MapTileBuilder starSky2Tile = new MapTileBuilder(starSky2Frame);

        mapTiles.add(starSky2Tile);

        //stars 3
        Frame starSky3Frame = new FrameBuilder(getSubImage(8, 0), 0)
                .withScale(tileScale)
                .withImageEffect(ImageEffect.FLIP_HORIZONTAL)
                .build();

        MapTileBuilder starSky3Tile = new MapTileBuilder(starSky3Frame);

        mapTiles.add(starSky3Tile);

        //stars 4
        Frame starSky4Frame = new FrameBuilder(getSubImage(8, 0), 0)
                .withScale(tileScale)
                .withImageEffect(ImageEffect.FLIP_H_AND_V)
                .build();

        MapTileBuilder starSky4Tile = new MapTileBuilder(starSky4Frame);

        mapTiles.add(starSky4Tile);

        //stars 5
        Frame starSky5Frame = new FrameBuilder(getSubImage(8, 1), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder starSky5Tile = new MapTileBuilder(starSky5Frame);

        mapTiles.add(starSky5Tile);

        //stars 6
        Frame starSky6Frame = new FrameBuilder(getSubImage(8, 1), 0)
                .withScale(tileScale)
                .withImageEffect(ImageEffect.FLIP_VERTICAL)
                .build();

        MapTileBuilder starSky6Tile = new MapTileBuilder(starSky6Frame);

        mapTiles.add(starSky6Tile);

        //stars 7
        Frame starSky7Frame = new FrameBuilder(getSubImage(8, 1), 0)
                .withScale(tileScale)
                .withImageEffect(ImageEffect.FLIP_HORIZONTAL)
                .build();

        MapTileBuilder starSky7Tile = new MapTileBuilder(starSky7Frame);

        mapTiles.add(starSky7Tile);

        //stars 8
        Frame starSky8Frame = new FrameBuilder(getSubImage(8, 1), 0)
                .withScale(tileScale)
                .withImageEffect(ImageEffect.FLIP_H_AND_V)
                .build();

        MapTileBuilder starSky8Tile = new MapTileBuilder(starSky8Frame);

        mapTiles.add(starSky8Tile);

        //night top water
        Frame nightWaterTopFrame = new FrameBuilder(getSubImage(8, 2), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder nightWaterTopTile = new MapTileBuilder(nightWaterTopFrame);

        mapTiles.add(nightWaterTopTile);

        // night top lava
        Frame nightLavaTopFrame = new FrameBuilder(getSubImage(8, 3), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder nightLavaTopTile = new MapTileBuilder(nightLavaTopFrame);

        mapTiles.add(nightLavaTopTile);

        // night middle branch
        Frame nightMidBranchFrame = new FrameBuilder(getSubImage(8, 4), 0)
                .withScale(tileScale)
                .withBounds(0,6,16,4)
                .build();

        MapTileBuilder nightMidBranchTile = new MapTileBuilder(nightMidBranchFrame)
                .withTileType(TileType.JUMP_THROUGH_PLATFORM);

        mapTiles.add(nightMidBranchTile);

        // night left end branch
        Frame nightLeftBranchFrame = new FrameBuilder(getSubImage(8, 5), 0)
                .withScale(tileScale)
                .withBounds(0, 6, 16, 4)
                .build();

        MapTileBuilder nightLeftBranchTile = new MapTileBuilder(nightLeftBranchFrame)
                .withTileType(TileType.JUMP_THROUGH_PLATFORM);

        mapTiles.add(nightLeftBranchTile);

        // night right end branch
        Frame nightRightBranchFrame = new FrameBuilder(getSubImage(8, 5), 0)
                .withScale(tileScale)
                .withBounds(0, 6, 16, 4)
                .withImageEffect(ImageEffect.FLIP_HORIZONTAL)
                .build();

        MapTileBuilder nightRightBranchTile = new MapTileBuilder(nightRightBranchFrame)
                .withTileType(TileType.JUMP_THROUGH_PLATFORM);

        mapTiles.add(nightRightBranchTile);

        // moon
        Frame[] moonFrames = new Frame[] {
                new FrameBuilder(getSubImage(9, 0), 1000)
                        .withScale(tileScale)
                        .build(),
                new FrameBuilder(getSubImage(9, 1), 150)
                        .withScale(tileScale)
                        .build(),
                new FrameBuilder(getSubImage(9, 2), 500)
                        .withScale(tileScale)
                        .build(),
                new FrameBuilder(getSubImage(9, 1), 150)
                        .withScale(tileScale)
                        .build()
        };

        MapTileBuilder moonTile = new MapTileBuilder(moonFrames)
                .withTileType(TileType.PASSABLE);

        mapTiles.add(moonTile);

        // night sky
        Frame nightSkyFrame = new FrameBuilder(getSubImage(9, 3), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder nightSkyTile = new MapTileBuilder(nightSkyFrame);

        mapTiles.add(nightSkyTile);


        //buffers for the map editor; these let you scroll down far enough to see all the real tiles
        Frame bufferFrame1 = new FrameBuilder(getSubImage(0, 1), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder bufferTile1 = new MapTileBuilder(bufferFrame1);

        mapTiles.add(bufferTile1);

        Frame bufferFrame2 = new FrameBuilder(getSubImage(0, 1), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder bufferTile2 = new MapTileBuilder(bufferFrame2);

        mapTiles.add(bufferTile2);

        Frame bufferFrame3 = new FrameBuilder(getSubImage(0, 1), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder bufferTile3 = new MapTileBuilder(bufferFrame3);

        mapTiles.add(bufferTile3);

        Frame bufferFrame4 = new FrameBuilder(getSubImage(0, 1), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder bufferTile4 = new MapTileBuilder(bufferFrame4);

        mapTiles.add(bufferTile4);

        Frame bufferFrame5 = new FrameBuilder(getSubImage(0, 1), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder bufferTile5 = new MapTileBuilder(bufferFrame5);

        mapTiles.add(bufferTile5);

        Frame bufferFrame6 = new FrameBuilder(getSubImage(0, 1), 0)
                .withScale(tileScale)
                .build();

        MapTileBuilder bufferTile6 = new MapTileBuilder(bufferFrame6);

        mapTiles.add(bufferTile6);

        return mapTiles;
    }
}
