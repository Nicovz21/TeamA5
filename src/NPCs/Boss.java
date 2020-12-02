package NPCs;

import Builders.FrameBuilder;
import Engine.GraphicsHandler;
import Engine.ImageLoader;
import GameObject.Frame;
import GameObject.ImageEffect;
import GameObject.SpriteSheet;
import Level.Map;
import Level.NPC;
import Level.Player;
import SpriteFont.SpriteFont;
import Utils.Point;

import java.awt.*;
import java.util.HashMap;

//the silhouette of a mysterious figure awaiting you at the top of the tower... who could it be?
public class Boss extends NPC {

    public Boss(Point location, Map map) {
        super(location.x, location.y, new SpriteSheet(ImageLoader.load("Boss.png"), 24, 24), "DEFAULT", 3);
    }

    @Override
    protected SpriteFont createMessage() {
        return null;
    }

    public void update(Player player) {
        super.update(player);
    }

    @Override
    public HashMap<String, Frame[]> getAnimations(SpriteSheet spriteSheet) {
        return new HashMap<String, Frame[]>() {{
            put("DEFAULT", new Frame[]{
                    new FrameBuilder(spriteSheet.getSprite(0, 0), 0)
                            .withScale(3)
                            .withImageEffect(ImageEffect.FLIP_HORIZONTAL)
                            .build()
            });
        }};
    }
}