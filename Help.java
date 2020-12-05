import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Help extends StartMenuTexts
{
    private int textSize = 32;
    public void act() 
    {
        
        setLocation(75,textSize*2+textSize/2);
        setImage(new GreenfootImage("Help",textSize , Color.WHITE, new Color(0,0,0,0), Color.BLACK));
        
        if (Greenfoot.mouseClicked(this) && getWorld().getObjects(HelpIconText.class).size() == 0) {
            HelpIconText helpIconText = new HelpIconText();
            getWorld().addObject(helpIconText,350,175);
        }
    }    
}
