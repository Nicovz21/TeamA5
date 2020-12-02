package Enemies;

import Builders.FrameBuilder;
import Engine.ImageLoader;
import GameObject.Frame;
import GameObject.SpriteSheet;
import Level.Enemy;
import Level.Player;
import Utils.Direction;
import Utils.Point;

import java.util.HashMap;

// This class is for the damage box that goes over stationary kill tiles such as spikes, lava, and poison water
public class HurtBox extends Enemy {

    public HurtBox(Point location) {
        //location should be the same as position of harmful tile
        super(location.x, location.y, new SpriteSheet(ImageLoader.load("HurtBox.png"), 24, 24), "DEFAULT");
        this.initialize();
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void update(Player player) {
        super.update(player);
    }

    @Override
    public void onEndCollisionCheckX(boolean hasCollided, Direction direction) {}

    @Override
    public void onEndCollisionCheckY(boolean hasCollided, Direction direction) {}

    @Override
    public HashMap<String, Frame[]> getAnimations(SpriteSheet spriteSheet) {
        return new HashMap<String, Frame[]>() {{
            put("DEFAULT", new Frame[] {
                    new FrameBuilder(spriteSheet.getSprite(0, 0), 100)
                            .withScale(2)
                            .withBounds(0, 6, 16, 10)
                            .build(),
            });
        }};
    }
}
