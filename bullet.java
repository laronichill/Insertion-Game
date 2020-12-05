import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class bullet extends Players
{
    int pistolBulletType = 0;
    
    GreenfootImage deadBody = new GreenfootImage(32,32);
    public void act() 
    {
        move(5);
        bulletHit();
        if(isAtEdge()){
            World world = getWorld();
            world.removeObject(this);
        }
        
    }
    public void bulletHit()
    {
        Actor CounterTerrorist = getOneIntersectingObject(CounterTerrorist.class);
        if (CounterTerrorist != null && pistolBulletType == 0) {
            World world = getWorld();
            deadBody splatter = new deadBody();
            getWorld().addObject(splatter, CounterTerrorist.getX(), CounterTerrorist.getY());
            world.removeObject(CounterTerrorist);
            deathSound();
        }
        Actor Terrorist = getOneIntersectingObject(Terrorist.class);
        if (Terrorist != null && pistolBulletType == 1) {
            World world = getWorld();
            deadBody splatter = new deadBody();
            getWorld().addObject(splatter, Terrorist.getX(), Terrorist.getY());
            world.removeObject(Terrorist);
            deathSound();
        }
    }
    public void deathSound()
    {
        if (Greenfoot.getRandomNumber(4) >=1)
        {
            Greenfoot.playSound("dead0.wav");
        } else {
            Greenfoot.playSound("dead1.wav");
        }
    }
}
