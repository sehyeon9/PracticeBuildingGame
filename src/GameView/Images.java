package GameView;

import java.awt.image.BufferedImage;

public class Images {

    private BufferedImage player;
    private BufferedImage boss;
    private BufferedImage wall01;
    private BufferedImage wall02;
    private BufferedImage blackWall;
    private BufferedImage keyButton;
    private BufferedImage laserFaceDown;
    private BufferedImage laserFaceUp;
    private BufferedImage marbleSwitch;
    private BufferedImage marbleSwitchSpace;
    private BufferedImage treasureChest;
    private BufferedImage floor;
    private BufferedImage wall03;
    private BufferedImage wall04;
    private BufferedImage bird;
    private BufferedImage statue;
    private BufferedImage portal;
    private BufferedImage leftHeart;
    private BufferedImage rightHeart;
    private BufferedImage jar;
    private BufferedImage silverSquareWall;
    private BufferedImage silverSquare;
    private BufferedImage voidSpace;

    /** this one for the most part should be add-ons, todo
     * HP Recovery amount:
     * red potion - one half heart
     * orange potion - one full heart
     * white potion - full recovery
     */
    private BufferedImage redPotion;
    private BufferedImage orangePotion;
    private BufferedImage whitePotion;

    /** TBD there is no Mana functionality as of yet so this is todo from scratch
     * MP Recovery amount:
     * blue potion - 25
     * blue elixir - half of total
     * power elixir - full recovery
     */
    private BufferedImage bluePotion;
    private BufferedImage manaElixir;
    private BufferedImage powerElixir;

    /** todo from scratch
     * Weapon Damage output:
     * sabre - 30
     * soul singer - 65
     * royal katana - 88 (8 is a lucky number in Japan meaning prosperity)
     */
    private BufferedImage sabre;
    private BufferedImage soulSinger;
    private BufferedImage royalKatana;

    /** if we want armor, we need to change current implementation of health todo
     * Armor Damage reduction:
     * dragon robe - 20
     * bloody mail - 50
     * ancient battle suit - 80
     * genesis - 120
     */
    private BufferedImage dragonRobe;
    private BufferedImage bloodySuit;
    private BufferedImage ancientBattleMail;
    private BufferedImage genesis;

    /**
     * 
     */
    public Images() {
        player = ImageLoader.loadImage("./img/mario.png");
        boss = ImageLoader.loadImage("./img/boss.png");
        wall01 = ImageLoader.loadImage("./img/wall01.png");
        wall02 = ImageLoader.loadImage("./img/wall02.png");
        blackWall = ImageLoader.loadImage("./img/blackwall.png");
        keyButton = ImageLoader.loadImage("./img/keybutton.png");
        laserFaceDown = ImageLoader.loadImage("./img/laserfacedown.png");
        laserFaceUp = ImageLoader.loadImage("./img/laserfaceup.png");
        marbleSwitch = ImageLoader.loadImage("./img/marbleswitch.png");
        marbleSwitchSpace = ImageLoader.loadImage("./img/marbleswitchspace.png");
        treasureChest = ImageLoader.loadImage("./img/treasurechest.png");
        floor = ImageLoader.loadImage("./img/floor.png");
        wall03 = ImageLoader.loadImage("./img/wall03.png");
        wall04 = ImageLoader.loadImage("./img/wall04.png");
        bird = ImageLoader.loadImage("./img/bird.png");
        statue = ImageLoader.loadImage("./img/statue.png");
        portal = ImageLoader.loadImage("./img/portal1.png");
        leftHeart = ImageLoader.loadImage("./img/heartLeft.png");
        rightHeart = ImageLoader.loadImage("./img/heartRight.png");
        jar = ImageLoader.loadImage("./img/jar.png");
        silverSquareWall = ImageLoader.loadImage("./img/silversquarewall.png");
        silverSquare = ImageLoader.loadImage("./img/silversquarepressed.png");
        voidSpace = ImageLoader.loadImage("./img/voidspace.png");
        
        redPotion = ImageLoader.loadImage("./img/Item/Potion/Health/redpotion.png");
        orangePotion = ImageLoader.loadImage("./img/Item/Potion/Health/orangepotion.png");
        whitePotion = ImageLoader.loadImage("./img/Item/Potion/Health/whitepotion.png");
        
        bluePotion = ImageLoader.loadImage("./img/Item/Potion/Mana/bluepotion.png");
        manaElixir = ImageLoader.loadImage("./img/Item/Potion/Mana/manaelixir.png");
        powerElixir = ImageLoader.loadImage("./img/Item/Potion/Mana/powerelixir.png");
        
        sabre = ImageLoader.loadImage("./img/Item/Weapon/sabre.png");
        soulSinger = ImageLoader.loadImage("./img/Item/Weapon/soulsinger.png");
        royalKatana = ImageLoader.loadImage("./img/Item/Weapon/royalkatana.png");
        
        dragonRobe = ImageLoader.loadImage("./img/Item/Armor/dragonrobe.png");
        bloodySuit = ImageLoader.loadImage("./img/Item/Armor/bloodysuit.png");
        ancientBattleMail = ImageLoader.loadImage("./img/Item/Armor/ancientbattlemail.png");
        genesis = ImageLoader.loadImage("./img/Item/Armor/genesis.png");
    }

    public BufferedImage getWall01() {
        return wall01;
    }

    //this should be the corner walls (but currently is not)
    public BufferedImage getWall02() {
        return wall02;
    }

    public BufferedImage getBlackWall() {
        return blackWall;
    }

    public BufferedImage getKeyButton() {
        return keyButton;
    }

    public BufferedImage getLaserFaceDown() {
        return laserFaceDown;
    }

    public BufferedImage getLaserFaceUp() {
        return laserFaceUp;
    }

    public BufferedImage getMarbleSwitch() {
        return marbleSwitch;
    }

    public BufferedImage getMarbleSwitchSpace() {
        return marbleSwitchSpace;
    }

    public BufferedImage getTreasureChest() {
        return treasureChest;
    }
    
    public BufferedImage getFloor() {
        return floor;
    }
    
    public BufferedImage getWall03() {
        return wall03;
    }
    
    public BufferedImage getWall04() {
        return wall04;
    }
    
    public BufferedImage getBird() {
        return bird;
    }
    
    public BufferedImage getStatue() {
        return statue;
    }
    
    public BufferedImage getPortal() {
        return portal;
    }
    
    public BufferedImage getLeftHeart() {
        return leftHeart;
    }
    
    public BufferedImage getRightHeart() {
        return rightHeart;
    }
    
    public BufferedImage getJar() {
        return jar;
    }
    
    public BufferedImage getSilverSquareWall() {
        return silverSquareWall;
    }
    
    public BufferedImage getSilverSquare() {
        return silverSquare;
    }
    
    public BufferedImage getVoidSpace() {
        return voidSpace;
    }

    public BufferedImage getPlayer() {
        return player;
    }
    
    public BufferedImage getRedPotion() {
        return redPotion;
    }
    
    public BufferedImage getOrangePotion() {
        return orangePotion;
    }
    
    public BufferedImage getWhitePotion() {
        return whitePotion;
    }
    
    public BufferedImage getBluePotion() {
        return bluePotion;
    }
    
    public BufferedImage getManaElixir() {
        return manaElixir;
    }
    
    public BufferedImage getPowerElixir() {
        return powerElixir;
    }
    
    public BufferedImage getSabre() {
        return sabre;
    }
    
    public BufferedImage getSoulSinger() {
        return soulSinger;
    }
    
    public BufferedImage getRoyalKatana() {
        return royalKatana;
    }
    
    public BufferedImage getDragonRobe() {
        return dragonRobe;
    }
    
    public BufferedImage getBloodySuit() {
        return bloodySuit;
    }
    
    public BufferedImage getAncientBattleMail() {
        return ancientBattleMail;
    }
    
    public BufferedImage getGenesis() {
        return genesis;
    }
    
    public BufferedImage getBoss() {
        return boss;
    }
    
}
