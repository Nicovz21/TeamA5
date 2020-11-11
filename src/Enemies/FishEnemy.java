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

// This class is for the green dinosaur enemy that shoots fireballs
// It walks back and forth between two set points (startLocation and endLocation)
// Every so often (based on shootTimer) it will shoot a Fireball enemy
public class FishEnemy extends Enemy {

    // start and end location defines the two points that it walks between
    // is only made to walk along the x axis and has no air ground state logic, so make sure both points have the same Y value
    protected Point startLocation;
    protected Point endLocation;

    protected float movementSpeed = 1f;
    private Direction startFacingDirection;
    protected Direction facingDirection;
    protected AirGroundState airGroundState;

    // timer is used to determine when a fireball is to be shot out
    protected Stopwatch shootTimer = new Stopwatch();


    public FishEnemy(Point startLocation, Point endLocation, Direction facingDirection) {
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

        // if dinosaur is walking, determine which direction to walk in based on facing direction
        if (facingDirection == Direction.RIGHT) {
            currentAnimationName = "WALK_RIGHT";
            moveXHandleCollision(movementSpeed);
        } else {
            currentAnimationName = "WALK_LEFT";
            moveXHandleCollision(-movementSpeed);
        }

        // if dinosaur reaches the start or end location, it turns around
        // dinosaur may end up going a bit past the start or end location depending on movement speed
        // this calculates the difference and pushes the enemy back a bit so it ends up right on the start or end location
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
        // if dinosaur enemy collides with something on the x axis, it turns around and walks the other way
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
                    new FrameBuilder(spriteSheet.getSprite(0, 0), 150)
                            .withScale(3)
                            .withBounds(5, 8, 13, 7)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(0, 1), 150)
                            .withScale(3)
                            .withBounds(5, 8, 13, 7)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(0, 0), 150)
                            .withScale(3)
                            .withBounds(5, 8, 13, 7)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(0, 2), 150)
                            .withScale(3)
                            .withBounds(5, 8, 13, 7)
                            .build()
            });

            put("WALK_RIGHT", new Frame[]{
                    new FrameBuilder(spriteSheet.getSprite(0, 0), 150)
                            .withScale(3)
                            .withImageEffect(ImageEffect.FLIP_HORIZONTAL)
                            .withBounds(5, 8, 13, 7)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(0, 1), 150)
                            .withScale(3)
                            .withImageEffect(ImageEffect.FLIP_HORIZONTAL)
                            .withBounds(5, 8, 13, 7)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(0, 0), 150)
                            .withScale(3)
                            .withImageEffect(ImageEffect.FLIP_HORIZONTAL)
                            .withBounds(5, 8, 13, 7)
                            .build(),
                    new FrameBuilder(spriteSheet.getSprite(0, 2), 150)
                            .withScale(3)
                            .withImageEffect(ImageEffect.FLIP_HORIZONTAL)
                            .withBounds(5, 8, 13, 7)
                            .build()
            });
        }};
    }
}
