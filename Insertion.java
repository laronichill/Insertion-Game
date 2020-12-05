import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
* Write a description of class Insertion here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class Insertion extends Actor
{
    public void act()
    {
        if (getWorld().getObjects(CounterTerrorist.class).size() == 0 && 
        getWorld().getObjects(Terrorist.class).size() == 0 &&
        getWorld().getObjects(HeliT.class).size() != 0 && getWorld().getObjects(HeliCT.class).size() != 0 ){
            setImage(new GreenfootImage("INSERTION IMMINENT",30 , Color.GRAY, new Color(0,125,10), Color.BLACK));
        } else {
            removeInsertion();
        }
    }
    public void removeInsertion()
    {
        World world = getWorld();
        world.removeObject(this);
    }
}
