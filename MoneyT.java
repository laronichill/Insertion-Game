import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MoneyT here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoneyT extends TSide
{
    /**
     * Act - do whatever the MoneyT wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getWorld().getWidth() - 75,25);
        setImage(new GreenfootImage("Money:" + (int) Terrorist.money,24 , Color.YELLOW, new Color(0,0,0,0), Color.BLACK));
    }    
}
