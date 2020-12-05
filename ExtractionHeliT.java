import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ExtractionHeliT extends Extraction
{
    public void act() 
    {
        gameStart();
    }
    public void gameStart()
    {
        if (getWorld().getObjects(Terrorist.class).size() == 0){   
            if (getX() != 50){
                move(1);
            } else if (getX() == 50){
                Terrorist terrorist = new Terrorist();
                getWorld().addObject(terrorist,50,310);
            }
        } else {
            setRotation(180);
            move(1);
            if(isAtEdge()){
                World world = getWorld();
                world.removeObject(this);
            }
        }
    }
}
