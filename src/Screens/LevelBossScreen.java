package Screens;

import Engine.*;
import GameObject.ImageEffect;
import GameObject.Sprite;
import SpriteFont.SpriteFont;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.lang.reflect.GenericArrayType;
import java.nio.Buffer;

// This is the class for the level lose screen
public class LevelBossScreen extends Screen {
    //protected Sprite buffman;
    //protected boolean drawBoss;
    //protected boolean bossDrawn;
    //protected GraphicsHandler graphicsHandler;
    protected SpriteFont loseMessage;
    protected SpriteFont instructions;
    protected AttackHandler attackHandler = new AttackHandler();
    protected Attack2Handler attack2Handler = new Attack2Handler();
    protected Attack3Handler attack3Handler = new Attack3Handler();
    protected Attack4Handler attack4Handler = new Attack4Handler();
    protected Container con;
    protected JFrame window;
    protected JLabel healthLabel, titleLabel, attackLabel, bossAttackLabel, playerHealthLabel;
    private Font normalFont = new Font("Times New Roman", Font.PLAIN, 20);
    protected JPanel attackPanel, mainTextPanel, headerTextPanel;
    protected JButton attack1;
    protected JButton attack2;
    protected JButton attack3;
    protected JButton attack4;
    protected int randomValue;
    protected String[] bossAttacks= {"Git-Hub issues", "connectivity Problems", "Progress Report"};
    protected int health = 60;
    protected int playerHealth = 20;
    protected int playerDamage;
    protected int bossDamage;
    protected KeyLocker keyLocker = new KeyLocker();
    protected PlayLevelScreen playLevelScreen;

    public LevelBossScreen(PlayLevelScreen playLevelScreen) {
        this.playLevelScreen = playLevelScreen;
    }

    @Override
    public void initialize() {
        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane();
        loseMessage = new SpriteFont("Welcome to class!", 350, 270, "Comic Sans", 30, Color.white);
        instructions = new SpriteFont("Select an attack below by pressing the number next to it", 120, 300,"Comic Sans", 20, Color.white);
        //text for boss
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(150,150,500,200);
        mainTextPanel.setBackground(Color.blue);
        mainTextPanel.setLayout(new GridLayout(3, 1));

        //buffman = new Sprite(ImageLoader.load("markBuffman.png"),1, 1, 5,ImageEffect.NONE);
        //drawBoss = false;
        //bossDrawn = false;
        //text for player health
        headerTextPanel = new JPanel();
        headerTextPanel.setBounds(40,50,800,100);
        headerTextPanel.setBackground(Color.green);
        headerTextPanel.setLayout(new GridLayout(1, 4));

        //attack options
        attackPanel = new JPanel();
        attackPanel.setBounds(250, 350, 300, 200);
        attackPanel.setBackground(Color.red);
        attackPanel.setLayout(new GridLayout(4, 1));



        //attack 1 button
        attack1 = new JButton("Scratch");
        attack1.addActionListener(attackHandler);
        attackPanel.add(attack1);

        //attack 2 button
        attack2 = new JButton("Milk deprivation Aggression");
        attack2.addActionListener(attack2Handler);
        attackPanel.add(attack2);

        //attack 3 button
        attack3 = new JButton("eh at best punch");
        attack3.addActionListener(attack3Handler);
        attackPanel.add(attack3);

        //attack 4 button
        attack4 = new JButton("*Hisses at enemy");
        attack4.addActionListener(attack4Handler);
        attackPanel.add(attack4);

        //text for mainTextPanel
        titleLabel = new JLabel("Final Boss: Professor Hoffman");
        titleLabel.setFont(normalFont);
        titleLabel.setForeground(Color.black);
        mainTextPanel.add(titleLabel);



        healthLabel = new JLabel("Health: " + health);
        healthLabel.setFont(normalFont);
        healthLabel.setForeground(Color.black);
        mainTextPanel.add(healthLabel);

        attackLabel = new JLabel(" " );
        attackLabel.setFont(normalFont);
        attackLabel.setForeground(Color.black);
        mainTextPanel.add(attackLabel);

        bossAttackLabel = new JLabel(" " );
        bossAttackLabel.setFont(normalFont);
        bossAttackLabel.setForeground(Color.black);
        headerTextPanel.add(bossAttackLabel);

        playerHealthLabel = new JLabel("Player Health:" + playerHealth);
        playerHealthLabel.setFont(normalFont);
        playerHealthLabel.setForeground(Color.black);
        headerTextPanel.add(playerHealthLabel);



        con.add(attackPanel);
        con.add(mainTextPanel);
        con.add(headerTextPanel);
        keyLocker.lockKey(Key.SPACE);
        keyLocker.lockKey(Key.ESC);
    }

    @Override
    public void update() {
       /* if (drawBoss) {
            drawBoss(graphicsHandler);
            System.out.println("beans");
        }*/
        if (Keyboard.isKeyUp(Key.SPACE)) {
            keyLocker.unlockKey(Key.SPACE);
        }
        if (Keyboard.isKeyUp(Key.ESC)) {
            keyLocker.unlockKey(Key.ESC);
        }

        // if space is pressed, reset level. if escape is pressed, go back to main menu
        if (Keyboard.isKeyDown(Key.SPACE)) {
            //playLevelScreen.resetLevel();
        } else if (Keyboard.isKeyDown(Key.ESC)) {
            System.exit(1);
        }
    }

    public class AttackHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            randomValue = getRandomInteger(5, 1);
            if(randomValue == 1){
                bossAttackLabel.setText("Hoffman used Git-Hub Issues for 2 damage");
                playerHealth = playerHealth - 2;
                playerHealthLabel.setText("Player Health:" + playerHealth);

            }
            if(randomValue == 2){
                bossAttackLabel.setText("Hoffman used WiFi Problems for 3 damage");
                playerHealth = playerHealth - 3;
                playerHealthLabel.setText("Player Health:" + playerHealth);
            }
            if(randomValue == 3){
                bossAttackLabel.setText("Hoffman used Progress Report for 3 damage");
                playerHealth = playerHealth - 3;
                playerHealthLabel.setText("Player Health:" + playerHealth);
            }
            if(randomValue == 4){
                bossAttackLabel.setText("Hoffman used F for 2 damage");
                playerHealth = playerHealth - 2;
                playerHealthLabel.setText("Player Health:" + playerHealth);
            }
            if(playerHealth<=0){
                titleLabel.setText("Hoffman: 'You failed!'");
                healthLabel.setText("You Lose");
                playerHealthLabel.setText("Player Health: 0");
                bossAttackLabel.setText("Press ESC to exit");
                attackLabel.setText("");
                if(Keyboard.isKeyDown(Key.ESC)){
                    System.exit(0);
                }
            }
            if(playerHealth >=1) {
                playerDamage = 5;
                health = health - playerDamage;
                healthLabel.setText("Health: " + health);
                attackLabel.setText("You attacked for: " + playerDamage + "" + "damage");
            }
            if(health <= 0){
                titleLabel.setText("Hoffman: 'Fine, you get an A. Guess I better retire now, huh?'");
                healthLabel.setText("You Win!");
                playerHealthLabel.setText("Player Health: 0");
                bossAttackLabel.setText("Press ESC to exit");
                attackLabel.setText("");
            }
        }
    }
    public class Attack2Handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            randomValue = getRandomInteger(5, 1);
            if(randomValue == 1){
                bossAttackLabel.setText("Hoffman used Git-Hub Issues for 2 damage");
                playerHealth = playerHealth - 2;
                playerHealthLabel.setText("Player Health:" + playerHealth);

            }
            if(randomValue == 2){
                bossAttackLabel.setText("Hoffman used WiFi Problems for 3 damage");
                playerHealth = playerHealth - 3;
                playerHealthLabel.setText("Player Health:" + playerHealth);
            }
            if(randomValue == 3){
                bossAttackLabel.setText("Hoffman used Progress Report for 3 damage");
                playerHealth = playerHealth - 3;
                playerHealthLabel.setText("Player Health:" + playerHealth);
            }
            if(randomValue == 4){
                bossAttackLabel.setText("Hoffman used F for 2 damage");
                playerHealth = playerHealth - 2;
                playerHealthLabel.setText("Player Health:" + playerHealth);
            }
            if(playerHealth<=0){
                titleLabel.setText("Hoffman: 'You failed!'");
                healthLabel.setText("You Lose");
                playerHealthLabel.setText("Player Health: 0");
                bossAttackLabel.setText("Press ESC to exit");
                attackLabel.setText("");
                if(Keyboard.isKeyDown(Key.ESC)){
                    System.exit(0);
                }
            }
            if(playerHealth >=1) {
                playerDamage = 10;
                health = health - playerDamage;
                healthLabel.setText("Health: " + health);
                attackLabel.setText("You attacked for: " + playerDamage + "" + "damage");
            }
            if(health <= 0){
                titleLabel.setText("Hoffman: 'Fine, you get an A. Guess I better retire now, huh?'");
                healthLabel.setText("You Win!");
                playerHealthLabel.setText("Player Health: 0");
                bossAttackLabel.setText("Press ESC to exit");
                attackLabel.setText("");
            }
        }
    }
    public class Attack3Handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            randomValue = getRandomInteger(5, 1);
            if(randomValue == 1){
                bossAttackLabel.setText("Hoffman used Git-Hub Issues for 2 damage");
                playerHealth = playerHealth - 2;
                playerHealthLabel.setText("Player Health:" + playerHealth);

            }
            if(randomValue == 2){
                bossAttackLabel.setText("Hoffman used WiFi Problems for 3 damage");
                playerHealth = playerHealth - 3;
                playerHealthLabel.setText("Player Health:" + playerHealth);
            }
            if(randomValue == 3){
                bossAttackLabel.setText("Hoffman used Progress Report for 3 damage");
                playerHealth = playerHealth - 3;
                playerHealthLabel.setText("Player Health:" + playerHealth);
            }
            if(randomValue == 4){
                bossAttackLabel.setText("Hoffman used F for 2 damage");
                playerHealth = playerHealth - 2;
                playerHealthLabel.setText("Player Health:" + playerHealth);
            }
            if(playerHealth<=0){
                titleLabel.setText("Hoffman: 'You fail'");
                healthLabel.setText("You Lose");
                playerHealthLabel.setText("Player Health: 0");
                bossAttackLabel.setText("Press ESC to exit");
                attackLabel.setText("");
                if(Keyboard.isKeyDown(Key.ESC)){
                    System.exit(0);
                }
            }
            if(playerHealth >=1) {
                playerDamage = 3;
                health = health - playerDamage;
                healthLabel.setText("Health: " + health);
                attackLabel.setText("You attacked for: " + playerDamage + "" + "damage");
            }
            if(health <= 0){
                titleLabel.setText("Hoffman: 'You get an A'");
                healthLabel.setText("You Win!");
                playerHealthLabel.setText("Player Health: 0");
                bossAttackLabel.setText("Press ESC to exit");
                attackLabel.setText("");
            }
        }
    }
    public class Attack4Handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            randomValue = getRandomInteger(5, 1);
            if(randomValue == 1){
                bossAttackLabel.setText("Hoffman used Git-Hub Issues for 2 damage");
                playerHealth = playerHealth - 2;
                playerHealthLabel.setText("Player Health:" + playerHealth);

            }
            if(randomValue == 2){
                bossAttackLabel.setText("Hoffman used WiFi Problems for 3 damage");
                playerHealth = playerHealth - 3;
                playerHealthLabel.setText("Player Health:" + playerHealth);
            }
            if(randomValue == 3){
                bossAttackLabel.setText("Hoffman used Progress Report for 3 damage");
                playerHealth = playerHealth - 3;
                playerHealthLabel.setText("Player Health:" + playerHealth);
            }
            if(randomValue == 4){
                bossAttackLabel.setText("Hoffman used F for 2 damage");
                playerHealth = playerHealth - 2;
                playerHealthLabel.setText("Player Health:" + playerHealth);
            }
            if(playerHealth<=0){
                titleLabel.setText("Hoffman: 'You fail'");
                healthLabel.setText("You Lose");
                playerHealthLabel.setText("Player Health: 0");
                bossAttackLabel.setText("Press ESC to exit");
                attackLabel.setText("");
//                if(keyPressed(Key.ESC)){
//                    System.exit(0);
//                }
            }
            if(playerHealth >=1) {
                playerDamage = 2;
                health = health - playerDamage;
                healthLabel.setText("Health: " + health);
                attackLabel.setText("You attacked for: " + playerDamage + "" + "damage");
            }
            if(health <= 0){
                titleLabel.setText("Hoffman: 'You get an A'");
                healthLabel.setText("You Win!");
                playerHealthLabel.setText("Player Health: 0");
                bossAttackLabel.setText("Press ESC to exit");
                attackLabel.setText("");
            }
        }

    }

    //get random value for Hoffman Attacks
    public static int getRandomInteger(int maximum, int minimum){ return ((int) (Math.random()*(maximum - minimum))) + minimum; }

    public void draw(GraphicsHandler graphicsHandler) {
        graphicsHandler.drawFilledRectangle(0, 0, ScreenManager.getScreenWidth(), ScreenManager.getScreenHeight(), Color.black);
        loseMessage.draw(graphicsHandler);
        instructions.draw(graphicsHandler);
    }

    /*public void drawBoss(GraphicsHandler graphicsHandler) {
        buffman.draw(graphicsHandler);
        bossDrawn = true;
    }

    public void setDrawBoss(GraphicsHandler graphicsHandler) {
        drawBoss = true;
        this.graphicsHandler = graphicsHandler;
    }
    public boolean isBossDrawn() {
        return bossDrawn;
    }

     */ //failed buffman implementation
}
