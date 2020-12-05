import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartMenu extends maps
{
    public static GreenfootSound gameMusic;
    public StartMenu()
    {    
        CounterTerrorist.money = 500;
        Terrorist.money = 500;
        gameMusic =  new  GreenfootSound("mw2_menu.wav");
        
        prepare();
    }
    public void started(){
        gameMusic.playLoop();
    }
    public void stopped(){
        gameMusic.stop();
    }
    private void prepare()
    {
        
        Help help = new Help();
        addObject(help,300,150);
        Start start = new Start();
        addObject(start,300,150);
        StartMenuTexts startMenuTexts = new StartMenuTexts();
        addObject(startMenuTexts,300,150);
    }
    public void act()
    {
        super.act();
        
    }
}
