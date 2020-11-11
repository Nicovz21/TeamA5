package Enemies;

import Builders.FrameBuilder;
import Engine.ImageLoader;
import GameObject.Frame;
import GameObject.ImageEffect;
import GameObject.SpriteSheet;
import Level.Enemy;
import Level.Player;
import Utils.AirGroundState;
import Utils.Direction;
import Utils.Point;

import java.util.HashMap;

public class BrownSpider extends Enemy {

    // start and end location defines the two points that it walks between
    // is only made to walk along the x axis and has no air ground state logic, so make sure both points have the same Y value
    protected Point startLocation;
    protected Point endLocation;

    protected float movementSpeed = 1f;
    private Direction startMotionDirection;
    protected Direction motionDirection;
    protected AirGroundState airGroundState;


    public BrownSpider(Point startLocation, Point endLocation) {
        super(startLocation.x, startLocation.y, new SpriteSheet(ImageLoader.load("Spider.png"), 24, 24), "CLIMB_DOWN");
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.startMotionDirection = Direction.DOWN;
        this.initialize();
    }

    @Override
    public void initialize() {
        super.initialize();
        airGroundState = AirGroundState.GROUND;
    }

    @Override
    public void update(Player player) {
        float startBound = startLocation.y;
        float endBound = endLocation.y;

        super.update(player);

        if (motionDirection == Direction.DOWN) {
            currentAnimationName = "CLIMB_DOWN";
            moveYHandleCollision(movementSpeed);
        } else {
            currentAnimationName = "CLIMB_UP";
            moveYHandleCollision(-movementSpeed);
        }


        if (getY1() + getScaledWidth() >= endBound) {
            float difference = endBound - (getScaledY2());
            moveYHandleCollision(-difference);
            motionDirection = Direction.UP;
        } else if (getY1() <= startBound) {
            float difference = startBound - getY1();
            moveYHandleCollision(difference);
            motionDirection = Direction.DOWN;
        }
    }

    @Override
    public HashMap<String, Frame[]> getAnimations(SpriteSheet spriteSheet) {
        return new HashMap<String, Frame[]>() {{
            put("CLIMB_DOWN", new Frame[]{
                    new FrameBuilder(spriteSheet.getSprite(0, 0), 150)
                            .withScale(3)
                            .withBounds(6,2,11,15)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(0, 1), 150)
                            .withScale(3)
                            .withBounds(6,2,11,15)
                            .build()
            });

            put("CLIMB_UP", new Frame[]{
                    new FrameBuilder(spriteSheet.getSprite(0, 0), 150)
                            .withScale(3)
                            .withImageEffect(ImageEffect.FLIP_VERTICAL)
                            .withBounds(6,2,11,15)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(0, 1), 150)
                            .withScale(3)
                            .withImageEffect(ImageEffect.FLIP_VERTICAL)
                            .withBounds(6,2,11,15)
                            .build()
            });
        }};
    }
}
