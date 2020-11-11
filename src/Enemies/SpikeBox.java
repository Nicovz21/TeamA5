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

public class SpikeBox extends Enemy {

    // start and end location defines the two points that it walks between
    // is only made to walk along the x axis and has no air ground state logic, so make sure both points have the same Y value
    protected Point startLocation;
    protected Point endLocation;

    protected float movementSpeed = 1f;
    private Direction startMotionDirection;
    protected Direction motionDirection;
    protected AirGroundState airGroundState;
    protected boolean isHorizontal;


    public SpikeBox(Point startLocation, Point endLocation, boolean isHorizontal) {
        super(startLocation.x, startLocation.y, new SpriteSheet(ImageLoader.load("SpikeBox.png"), 24, 24), "DEFAULT");
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.isHorizontal = isHorizontal;
        this.startMotionDirection = isHorizontal ? Direction.RIGHT: Direction.DOWN;
        this.initialize();
    }

    @Override
    public void initialize() {
        super.initialize();
        airGroundState = AirGroundState.GROUND;
    }

    @Override
    public void update(Player player) {
        float startBound = isHorizontal ? startLocation.x : startLocation.y;
        float endBound = isHorizontal ? endLocation.x : endLocation.y;

        super.update(player);

        if (motionDirection == Direction.DOWN) {
            moveYHandleCollision(movementSpeed);
        } else if (motionDirection == Direction.UP){
            moveYHandleCollision(-movementSpeed);
        } else if (motionDirection == Direction.RIGHT){
            moveXHandleCollision(movementSpeed);
        } else if (motionDirection == Direction.LEFT){
            moveXHandleCollision(-movementSpeed);
        }


        if (startMotionDirection == Direction.DOWN) {
            if (getY1() + getScaledHeight() >= endBound) {
                float difference = endBound - (getScaledY2());
                moveYHandleCollision(-difference);
                motionDirection = Direction.UP;
            } else if (getY1() <= startBound) {
                float difference = startBound - getY1();
                moveYHandleCollision(difference);
                motionDirection = Direction.DOWN;
            }
        } else {
            if (getX1() + getScaledWidth() >= endBound) {
                float difference = endBound - (getScaledX2());
                moveXHandleCollision(-difference);
                motionDirection = Direction.LEFT;
            } else if (getX1() <= startBound) {
                float difference = startBound - getX1();
                moveXHandleCollision(difference);
                motionDirection = Direction.RIGHT;
            }
        }

    }

    @Override
    public HashMap<String, Frame[]> getAnimations(SpriteSheet spriteSheet) {
        return new HashMap<String, Frame[]>() {{
            put("DEFAULT", new Frame[]{
                    new FrameBuilder(spriteSheet.getSprite(0, 0), 1000)
                            .withScale(3)
                            .withBounds(1,1,22,22)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(0, 1), 150)
                            .withScale(3)
                            .withBounds(1,1,22,22)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(0, 2), 300)
                            .withScale(3)
                            .withBounds(1,1,22,22)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(0, 1), 150)
                            .withScale(3)
                            .withBounds(1,1,22,22)
                            .build()
            });
        }};
    }
}
