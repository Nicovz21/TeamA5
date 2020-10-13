package Screens;

import Engine.*;
import Game.GameState;
import Game.ScreenCoordinator;
import Level.Map;
import Maps.TitleScreenMap;
import SpriteFont.SpriteFont;

import java.awt.*;

// This class is for the credits screen
public class InstructionsScreen extends Screen {
    protected ScreenCoordinator screenCoordinator;
    protected Map background;
    protected KeyLocker keyLocker = new KeyLocker();
    protected SpriteFont creditsLabel;
    protected SpriteFont controlsLabel;
    protected SpriteFont objectiveLabel;
    protected SpriteFont returnInstructionsLabel;

    public InstructionsScreen(ScreenCoordinator screenCoordinator) {
        this.screenCoordinator = screenCoordinator;
    }

    @Override
    public void initialize() {
        // setup graphics on screen (background map, spritefont text)
        background = new TitleScreenMap();
        background.setAdjustCamera(false);
        creditsLabel = new SpriteFont("Instructions", 15, 35, "Times New Roman", 30, Color.white);
        controlsLabel = new SpriteFont("Controls:   W- Jump   A/D- Left/Right   D- Crouch", 130, 140, "Times New Roman", 20, Color.white);
        objectiveLabel = new SpriteFont("Avoid the enemies and reach the gold block at the end of the level!", 60, 220, "Times New Roman",20, Color.white);
        returnInstructionsLabel = new SpriteFont("Press Space to return to the menu", 20, 560, "Times New Roman", 30, Color.white);
        keyLocker.lockKey(Key.SPACE);
    }

    public void update() {
        background.update(null);

        if (Keyboard.isKeyUp(Key.SPACE)) {
            keyLocker.unlockKey(Key.SPACE);
        }

        // if space is pressed, go back to main menu
        if (!keyLocker.isKeyLocked(Key.SPACE) && Keyboard.isKeyDown(Key.SPACE)) {
            screenCoordinator.setGameState(GameState.MENU);
        }
    }

    public void draw(GraphicsHandler graphicsHandler) {
        background.draw(graphicsHandler);
        creditsLabel.draw(graphicsHandler);
        controlsLabel.draw(graphicsHandler);
        objectiveLabel.drawWithParsedNewLines(graphicsHandler);
        returnInstructionsLabel.draw(graphicsHandler);
    }
}