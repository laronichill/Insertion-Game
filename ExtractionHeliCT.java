import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ExtractionHeliCT extends Extraction
{
    
    public void act() 
    {
        gameStart();
    }
    public void gameStart()
    {
        if (getWorld().getObjects(CounterTerrorist.class).size() == 0){   
            if (getX() != 550){
                move(-1);
            } else if (getX() == 550){
                CounterTerrorist counterTerrorist = new CounterTerrorist();
                getWorld().addObject(counterTerrorist,550,50);
                counterTerrorist.setRotation(180);
            }
        } else {
            setRotation(180);
            move(-1);
            if(isAtEdge()){
                World world = getWorld();
                world.removeObject(this);
            }
        }
    }
}
