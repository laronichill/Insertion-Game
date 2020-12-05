import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UpgradeFeet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UpgradeFeetT extends TSide
{
    /**
     * Act - do whatever the UpgradeFeet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getWorld().getWidth() - 75,200);
        setImage(new GreenfootImage("Gym Training\n" + (char) 35 + "LegWorkout\nCOST:" + (int) BuyMenuItemsAndTexts.upgradeToAR,24 , Color.YELLOW, new Color(0,0,0,0), Color.BLACK));
        if (Greenfoot.mouseClicked(this) && Terrorist.money >= 1000) {
            Terrorist.movementSpeed += 1;
            Terrorist.money -= 1000;
        }
    }    
}
