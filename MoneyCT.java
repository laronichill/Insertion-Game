import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MoneyCT here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoneyCT extends CTSide
{
    /**
     * Act - do whatever the MoneyCT wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(75,25);
        setImage(new GreenfootImage("Money:" + (int) CounterTerrorist.money,24 , Color.CYAN, new Color(0,0,0,0), Color.BLACK));
    }    
}
