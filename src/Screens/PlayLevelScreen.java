package Screens;

import Engine.GraphicsHandler;
import Engine.Screen;
import Engine.AudioPlayer;
import Game.GameState;
import Game.ScreenCoordinator;
import Level.LevelState;
import Level.Map;
import Level.Player;
import Level.PlayerListener;
import Maps.*;
import Players.Cat;
import Utils.Stopwatch;

import java.io.IOException;

// This class is for when the platformer game is actually being played
public class PlayLevelScreen extends Screen implements PlayerListener {
    protected ScreenCoordinator screenCoordinator;
    protected Map map;
    protected Player player;
    protected PlayLevelScreenState playLevelScreenState;
    protected Stopwatch screenTimer = new Stopwatch();
    protected LevelClearedScreen levelClearedScreen;
    protected LevelLoseScreen levelLoseScreen;
    protected LevelBossScreen levelBossScreen;
    protected AudioPlayer audioPlayer;

    protected String currentLevel;

    public PlayLevelScreen(ScreenCoordinator screenCoordinator) {
        this.screenCoordinator = screenCoordinator;
    }

    public void initialize() {
        // define/setup map
        this.map = new Map1A();
        this.currentLevel = "1-1";
        //start music
        try {
            audioPlayer = new AudioPlayer("Stage1_Grasslands.wav", true);
        } catch (Exception e) {
            e.printStackTrace();
        }

        map.reset();

        // setup player
        this.player = new Cat(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y, map);
        this.player.setMap(map);
        this.player.addListener(this);
        this.player.setLocation(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y);
        this.playLevelScreenState = PlayLevelScreenState.RUNNING;
    }

    public void update() {
        // based on screen state, perform specific actions
        switch (playLevelScreenState) {
            // if level is "running" update player and map to keep game logic for the platformer level going
            case RUNNING:
                //stop player from moving too far left
                if(player.getX()< map.getStartBoundX()) {
                    player.setX(map.getStartBoundX());
                }
                //stop player from moving too far right
                if(player.getX()> map.getEndBoundX()-60) {
                    player.setX(map.getEndBoundX()-60);
                }
                player.update();
                map.update(player);

                if (map instanceof FinalMap) {
                    if (((FinalMap) map).battleInitiated()) {
                        playLevelScreenState = PlayLevelScreenState.BOSS_INITIATE;
                    }
                }
                break;
            // if level has been completed, bring up level cleared screen
            case LEVEL_COMPLETED:
                levelClearedScreen = new LevelClearedScreen();
                levelClearedScreen.initialize();
                screenTimer.setWaitTime(2500);
                playLevelScreenState = PlayLevelScreenState.LEVEL_WIN_MESSAGE;
                break;
            // if level cleared screen is up and the timer is up for how long it should stay out, go back to main menu
            case LEVEL_WIN_MESSAGE:
                if (screenTimer.isTimeUp()) {
                    levelClearedScreen = null;
                    switch (currentLevel) {
                        case "1-1":
                            this.map = new Map1I();
                            this.currentLevel = "1-2";
                            this.player = new Cat(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y, map);
                            this.player.addListener(this);
                            this.player.setMap(map);
                            this.player.setLocation(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y);
                            this.player.setLevelState(LevelState.RUNNING);
                            this.playLevelScreenState=PlayLevelScreenState.RUNNING;
                            break;
                        case "1-2":
                            this.map = new MapS1();
                            this.currentLevel = "1-3";
                            this.player = new Cat(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y, map);
                            this.player.addListener(this);
                            this.player.setMap(map);
                            this.player.setLocation(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y);
                            this.player.setLevelState(LevelState.RUNNING);
                            this.playLevelScreenState=PlayLevelScreenState.RUNNING;
                            break;
                        case "1-3":
                            this.map = new MapN1();
                            this.currentLevel = "1-4";
                            this.player = new Cat(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y, map);
                            this.player.addListener(this);
                            this.player.setMap(map);
                            this.player.setLocation(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y);
                            this.player.setLevelState(LevelState.RUNNING);
                            this.playLevelScreenState=PlayLevelScreenState.RUNNING;
                            break;
                        case "1-4":
                            this.map = new Map2A();
                            this.currentLevel = "2-1";
                            this.player = new Cat(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y, map);
                            this.player.addListener(this);
                            this.player.setMap(map);
                            this.player.setLocation(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y);
                            this.player.setLevelState(LevelState.RUNNING);
                            this.playLevelScreenState=PlayLevelScreenState.RUNNING;
                            try {
                                audioPlayer.stop();
                                audioPlayer = new AudioPlayer("Stage2_Woodlands.wav", true);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            break;
                        case "2-1":
                            this.map = new MapN2();
                            this.currentLevel = "2-2";
                            this.player = new Cat(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y, map);
                            this.player.addListener(this);
                            this.player.setMap(map);
                            this.player.setLocation(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y);
                            this.player.setLevelState(LevelState.RUNNING);
                            this.playLevelScreenState=PlayLevelScreenState.RUNNING;
                            break;
                        case "2-2":
                            this.map = new Map2I();
                            this.currentLevel = "2-3";
                            this.player = new Cat(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y, map);
                            this.player.addListener(this);
                            this.player.setMap(map);
                            this.player.setLocation(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y);
                            this.player.setLevelState(LevelState.RUNNING);
                            this.playLevelScreenState=PlayLevelScreenState.RUNNING;
                            break;
                        case "2-3":
                            this.map = new MapS2();
                            this.currentLevel = "2-4";
                            this.player = new Cat(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y, map);
                            this.player.addListener(this);
                            this.player.setMap(map);
                            this.player.setLocation(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y);
                            this.player.setLevelState(LevelState.RUNNING);
                            this.playLevelScreenState=PlayLevelScreenState.RUNNING;
                            break;
                        case "2-4":
                            this.map = new Map3I();
                            this.currentLevel = "3-1";
                            this.player = new Cat(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y, map);
                            this.player.addListener(this);
                            this.player.setMap(map);
                            this.player.setLocation(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y);
                            this.player.setLevelState(LevelState.RUNNING);
                            this.playLevelScreenState=PlayLevelScreenState.RUNNING;
                            try {
                                audioPlayer.stop();
                                audioPlayer = new AudioPlayer("Stage3_Coastlands.wav", true);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            break;
                        case "3-1":
                            this.map = new MapS3();
                            this.currentLevel = "3-2";
                            this.player = new Cat(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y, map);
                            this.player.addListener(this);
                            this.player.setMap(map);
                            this.player.setLocation(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y);
                            this.player.setLevelState(LevelState.RUNNING);
                            this.playLevelScreenState=PlayLevelScreenState.RUNNING;
                            break;
                        case "3-2":
                            this.map = new Map3A();
                            this.currentLevel = "3-3";
                            this.player = new Cat(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y, map);
                            this.player.addListener(this);
                            this.player.setMap(map);
                            this.player.setLocation(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y);
                            this.player.setLevelState(LevelState.RUNNING);
                            this.playLevelScreenState=PlayLevelScreenState.RUNNING;
                            break;
                        case "3-3":
                            this.map = new MapN3();
                            this.currentLevel = "3-4";
                            this.player = new Cat(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y, map);
                            this.player.addListener(this);
                            this.player.setMap(map);
                            this.player.setLocation(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y);
                            this.player.setLevelState(LevelState.RUNNING);
                            this.playLevelScreenState=PlayLevelScreenState.RUNNING;
                            break;
                        case "3-4":
                            this.map = new MapN4();
                            this.currentLevel = "4-1";
                            this.player = new Cat(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y, map);
                            this.player.addListener(this);
                            this.player.setMap(map);
                            this.player.setLocation(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y);
                            this.player.setLevelState(LevelState.RUNNING);
                            this.playLevelScreenState=PlayLevelScreenState.RUNNING;
                            try {
                                audioPlayer.stop();
                                audioPlayer = new AudioPlayer("Stage5_Stonelands.wav", true);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            break;
                        case "4-1":
                            this.map = new Map4A();
                            this.currentLevel = "4-2";
                            this.player = new Cat(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y, map);
                            this.player.addListener(this);
                            this.player.setMap(map);
                            this.player.setLocation(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y);
                            this.player.setLevelState(LevelState.RUNNING);
                            this.playLevelScreenState=PlayLevelScreenState.RUNNING;
                            break;
                        case "4-2":
                            this.map = new Map4I();
                            this.currentLevel = "4-3";
                            this.player = new Cat(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y, map);
                            this.player.addListener(this);
                            this.player.setMap(map);
                            this.player.setLocation(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y);
                            this.player.setLevelState(LevelState.RUNNING);
                            this.playLevelScreenState=PlayLevelScreenState.RUNNING;
                            break;
                        case "4-3":
                            this.map = new MapS4();
                            this.currentLevel = "4-4";
                            this.player = new Cat(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y, map);
                            this.player.addListener(this);
                            this.player.setMap(map);
                            this.player.setLocation(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y);
                            this.player.setLevelState(LevelState.RUNNING);
                            this.playLevelScreenState=PlayLevelScreenState.RUNNING;
                            break;
                        case "4-4":
                            this.map = new MapN5();
                            this.currentLevel = "5-1";
                            this.player = new Cat(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y, map);
                            this.player.addListener(this);
                            this.player.setMap(map);
                            this.player.setLocation(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y);
                            this.player.setLevelState(LevelState.RUNNING);
                            this.playLevelScreenState=PlayLevelScreenState.RUNNING;
                            break;
                        case "5-1":
                            this.map = new Map5I();
                            this.currentLevel = "5-2";
                            this.player = new Cat(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y, map);
                            this.player.addListener(this);
                            this.player.setMap(map);
                            this.player.setLocation(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y);
                            this.player.setLevelState(LevelState.RUNNING);
                            this.playLevelScreenState=PlayLevelScreenState.RUNNING;
                            break;
                        case "5-2":
                            this.map = new MapS5();
                            this.currentLevel = "5-3";
                            this.player = new Cat(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y, map);
                            this.player.addListener(this);
                            this.player.setMap(map);
                            this.player.setLocation(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y);
                            this.player.setLevelState(LevelState.RUNNING);
                            this.playLevelScreenState=PlayLevelScreenState.RUNNING;
                            break;
                        case "5-3":
                            this.map = new Map5A();
                            this.currentLevel = "5-4";
                            this.player = new Cat(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y, map);
                            this.player.addListener(this);
                            this.player.setMap(map);
                            this.player.setLocation(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y);
                            this.player.setLevelState(LevelState.RUNNING);
                            this.playLevelScreenState=PlayLevelScreenState.RUNNING;
                            break;
                        case "5-4":
                            this.map = new MapS6();
                            this.currentLevel = "6-1";
                            this.player = new Cat(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y, map);
                            this.player.addListener(this);
                            this.player.setMap(map);
                            this.player.setLocation(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y);
                            this.player.setLevelState(LevelState.RUNNING);
                            this.playLevelScreenState=PlayLevelScreenState.RUNNING;
                            try {
                                audioPlayer.stop();
                                audioPlayer = new AudioPlayer("Stage6_Castle.wav", true);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            break;
                        case "6-1":
                            this.map = new Map6A();
                            this.currentLevel = "6-2";
                            this.player = new Cat(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y, map);
                            this.player.addListener(this);
                            this.player.setMap(map);
                            this.player.setLocation(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y);
                            this.player.setLevelState(LevelState.RUNNING);
                            this.playLevelScreenState=PlayLevelScreenState.RUNNING;
                            break;
                        case "6-2":
                            this.map = new MapN6();
                            this.currentLevel = "6-3";
                            this.player = new Cat(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y, map);
                            this.player.addListener(this);
                            this.player.setMap(map);
                            this.player.setLocation(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y);
                            this.player.setLevelState(LevelState.RUNNING);
                            this.playLevelScreenState=PlayLevelScreenState.RUNNING;
                            break;
                        case "6-3":
                            this.map = new Map6I();
                            this.currentLevel = "6-4";
                            this.player = new Cat(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y, map);
                            this.player.addListener(this);
                            this.player.setMap(map);
                            this.player.setLocation(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y);
                            this.player.setLevelState(LevelState.RUNNING);
                            this.playLevelScreenState=PlayLevelScreenState.RUNNING;
                            break;
                        case "6-4":
                            try {
                                audioPlayer.stop();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            this.map = new FinalMap();
                            this.currentLevel = "final";
                            this.player = new Cat(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y, map);
                            this.player.addListener(this);
                            this.player.setMap(map);
                            this.player.setLocation(map.getPlayerStartPosition().x, map.getPlayerStartPosition().y);
                            this.player.setLevelState(LevelState.RUNNING);
                            this.playLevelScreenState=PlayLevelScreenState.RUNNING;
                            break;
                        case "final":
                            /*Currently the player is stuck in the boss screen at the end forever because it's
                            not integrated into the rest of the game engine and main panel like other screen*/
                            //go to end screen
                            //goBackToMenu(); ?
                            break;
                    }

                }
                break;
            // if player died in level, bring up level lost screen
            case PLAYER_DEAD:
                try{
                    audioPlayer.stop();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                levelLoseScreen = new LevelLoseScreen(this);
                levelLoseScreen.initialize();
                playLevelScreenState = PlayLevelScreenState.LEVEL_LOSE_MESSAGE;
                break;
            // wait on level lose screen to make a decision (either resets level or sends player back to main menu)
            case LEVEL_LOSE_MESSAGE:
                levelLoseScreen.update();
                break;
            case BOSS_INITIATE:
                levelBossScreen = new LevelBossScreen(this);
                levelBossScreen.initialize();
                playLevelScreenState = PlayLevelScreenState.BOSS_BATTLE;
                try {
                    audioPlayer.stop();
                    audioPlayer = new AudioPlayer("finale_versusBuffman.wav", true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case BOSS_BATTLE:
                levelBossScreen.update();
        }
    }

    public void draw(GraphicsHandler graphicsHandler) {
        // based on screen state, draw appropriate graphics
        switch (playLevelScreenState) {
            case RUNNING:
            case LEVEL_COMPLETED:
            case PLAYER_DEAD:
                map.draw(graphicsHandler);
                player.draw(graphicsHandler);
                break;
            case LEVEL_WIN_MESSAGE:
                levelClearedScreen.draw(graphicsHandler);
                break;
            case LEVEL_LOSE_MESSAGE:
                levelLoseScreen.draw(graphicsHandler);
                break;
            /*case BOSS_BATTLE:
                try{
                    if (!levelBossScreen.isBossDrawn()) levelBossScreen.setDrawBoss(graphicsHandler);
                } catch (NullPointerException e) {
                    System.out.println("beans");
                }
                break;*/ //failed attempt at buffman.png implementation
            default:
                break;
        }
    }

    public PlayLevelScreenState getPlayLevelScreenState() {
        return playLevelScreenState;
    }

    @Override
    public void onLevelCompleted() {
        playLevelScreenState = PlayLevelScreenState.LEVEL_COMPLETED;
    }

    @Override
    public void onDeath() {
        playLevelScreenState = PlayLevelScreenState.PLAYER_DEAD;
    }

    public void resetLevel() {
        initialize();
    }

    public void goBackToMenu() {
        screenCoordinator.setGameState(GameState.MENU);
    }

    // This enum represents the different states this screen can be in
    private enum PlayLevelScreenState {
        RUNNING, LEVEL_COMPLETED, PLAYER_DEAD, LEVEL_WIN_MESSAGE, LEVEL_LOSE_MESSAGE, BOSS_INITIATE, BOSS_BATTLE
    }
}
