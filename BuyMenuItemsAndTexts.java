import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BuyMenuItemsAndTexts here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BuyMenuItemsAndTexts extends Actor
{
    static int upgradeToAR = 1000;
    public void act() 
    {
        setLocation(300,150);
        setImage(new GreenfootImage("Restart Game",24 , Color.RED, new Color(0,0,0,0), Color.BLACK));
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new blyat1());
        }
        
        
    }    
}
