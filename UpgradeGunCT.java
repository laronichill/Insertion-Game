import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UpgradeGunCT here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UpgradeGunCT extends CTSide
{
    /**
     * Act - do whatever the UpgradeGunCT wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(75,100);
        setImage(new GreenfootImage("Increase \nReload Speed\n COST:" + (int) BuyMenuItemsAndTexts.upgradeToAR,24 , Color.CYAN, new Color(0,0,0,0), Color.BLACK));
        if (Greenfoot.mouseClicked(this) && CounterTerrorist.money >= 1000) {
            CounterTerrorist.gunReloadTime -= 5;
            CounterTerrorist.money -= 1000;
        }
    }    
}
