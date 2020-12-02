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
import Utils.Stopwatch;

import java.util.HashMap;


public class BigFish extends Enemy {

    // start and end location defines the two points that it swims between
    // is only made to swim along the x axis and has no air ground state logic, so make sure both points have the same Y value
    protected Point startLocation;
    protected Point endLocation;

    protected float movementSpeed = 0.5f;
    private Direction startFacingDirection;
    protected Direction facingDirection;
    protected AirGroundState airGroundState;

        public BigFish(Point startLocation, Point endLocation, Direction facingDirection) {
        super(startLocation.x, startLocation.y, new SpriteSheet(ImageLoader.load("FishEnemy.png"), 24, 24), "WALK_RIGHT");
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.startFacingDirection = facingDirection;
        this.initialize();
    }

    @Override
    public void initialize() {
        super.initialize();
        facingDirection = startFacingDirection;
        if (facingDirection == Direction.RIGHT) {
            currentAnimationName = "WALK_RIGHT";
        } else if (facingDirection == Direction.LEFT) {
            currentAnimationName = "WALK_LEFT";
        }
        airGroundState = AirGroundState.GROUND;

    }

    @Override
    public void update(Player player) {
        float startBound = startLocation.x;
        float endBound = endLocation.x;

        super.update(player);

        if (facingDirection == Direction.RIGHT) {
            currentAnimationName = "WALK_RIGHT";
            moveXHandleCollision(movementSpeed);
        } else {
            currentAnimationName = "WALK_LEFT";
            moveXHandleCollision(-movementSpeed);
        }

        if (getX1() + getScaledWidth() >= endBound) {
            float difference = endBound - (getScaledX2());
            moveXHandleCollision(-difference);
            facingDirection = Direction.LEFT;
        } else if (getX1() <= startBound) {
            float difference = startBound - getX1();
            moveXHandleCollision(difference);
            facingDirection = Direction.RIGHT;
        }
    }

    @Override
    public void onEndCollisionCheckX(boolean hasCollided, Direction direction) {
        if (hasCollided) {
            if (direction == Direction.RIGHT) {
                facingDirection = Direction.LEFT;
                currentAnimationName = "WALK_LEFT";
            } else {
                facingDirection = Direction.RIGHT;
                currentAnimationName = "WALK_RIGHT";
            }
        }
    }

    @Override
    public HashMap<String, Frame[]> getAnimations(SpriteSheet spriteSheet) {
        return new HashMap<String, Frame[]>() {{
            put("WALK_LEFT", new Frame[]{
                    new FrameBuilder(spriteSheet.getSprite(2, 0), 200)
                            .withScale(3)
                            .withBounds(1, 4, 19, 16)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(2, 1), 200)
                            .withScale(3)
                            .withBounds(1, 4, 19, 16)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(2, 0), 200)
                            .withScale(3)
                            .withBounds(1, 4, 19, 16)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(2, 2), 200)
                            .withScale(3)
                            .withBounds(1, 4, 19, 16)
                            .build()
            });

            put("WALK_RIGHT", new Frame[]{
                    new FrameBuilder(spriteSheet.getSprite(2, 0), 200)
                            .withScale(3)
                            .withImageEffect(ImageEffect.FLIP_HORIZONTAL)
                            .withBounds(1, 4, 19, 16)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(2, 1), 200)
                            .withScale(3)
                            .withImageEffect(ImageEffect.FLIP_HORIZONTAL)
                            .withBounds(1, 4, 19, 16)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(2, 0), 200)
                            .withScale(3)
                            .withImageEffect(ImageEffect.FLIP_HORIZONTAL)
                            .withBounds(1, 4, 19, 16)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(2, 2), 200)
                            .withScale(3)
                            .withImageEffect(ImageEffect.FLIP_HORIZONTAL)
                            .withBounds(1, 4, 19, 16)
                            .build()
            });
        }};
    }
}
