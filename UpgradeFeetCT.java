import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UpgradeFeet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UpgradeFeetCT extends CTSide
{
    /**
     * Act - do whatever the UpgradeFeet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(75,200);
        setImage(new GreenfootImage("Gym Training\n" + (char) 35 + "LegWorkout\nCOST:" + (int) BuyMenuItemsAndTexts.upgradeToAR,24 , Color.CYAN, new Color(0,0,0,0), Color.BLACK));
        if (Greenfoot.mouseClicked(this) && CounterTerrorist.money >= 1000) {
            CounterTerrorist.movementSpeed += 1;
            CounterTerrorist.money -= 1000;
        }
    }    
}
