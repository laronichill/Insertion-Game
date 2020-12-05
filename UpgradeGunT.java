import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CopyOfUpgradeGunT here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UpgradeGunT extends TSide
{
    /**
     * Act - do whatever the CopyOfUpgradeGunT wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getWorld().getWidth() - 75,100);
        setImage(new GreenfootImage("Increase \nReload Speed\n COST:" + (int) BuyMenuItemsAndTexts.upgradeToAR,24 , Color.YELLOW, new Color(0,0,0,0), Color.BLACK));
        if (Greenfoot.mouseClicked(this) && Terrorist.money >= 1000) {
            Terrorist.gunReloadTime -= 5;
            Terrorist.money -= 1000;
        }
    }    
}
