import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class Players extends Actor
{

public void act() 
{
    blyat1 world = (blyat1) getWorld();
    List<CounterTerrorist> CounterTerrorist = world.getObjects(CounterTerrorist.class);
    List<Terrorist> Terrorist = world.getObjects(Terrorist.class);
    
    if (!CounterTerrorist.isEmpty()) {
        if (CounterTerrorist.get(0).getX() < 80 && CounterTerrorist.get(0).getY() < 180)
        {
        
        }
    }

    if (!Terrorist.isEmpty()) {
        if (Terrorist.get(0).getX() > 520 && Terrorist.get(0).getY() > 180)
        {
        
        }
    }
}    
}
