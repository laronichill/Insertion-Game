import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends StartMenuTexts
{
    private int textSize = 32;
    public void act() 
    {
        setLocation(75,textSize);
        setImage(new GreenfootImage("Start Game",textSize , Color.WHITE, new Color(0,0,0,0), Color.BLACK));
        
        if (Greenfoot.mouseClicked(this)) {
            StartMenu.gameMusic.stop();
            Greenfoot.setWorld(new blyat1());
        }
    }
}
