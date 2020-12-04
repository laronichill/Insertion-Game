import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class CounterTerrorist extends Players
{
    private int gunReloadTime = 25;
    private int reload = 0;
    public void act() 
    {
        if (reload < gunReloadTime) {
            reload++;
        }
        if (Greenfoot.isKeyDown("w")){ move(2);}
        if (Greenfoot.isKeyDown("s")){ move(-2);}
        if (Greenfoot.isKeyDown("a")){ turn(-5);}
        if (Greenfoot.isKeyDown("d")){ turn(5);}
        if (Greenfoot.isKeyDown("space")){ 
            Shootpistol();
        }
    }
    private void Shootpistol() 
    {
        if (reload >= gunReloadTime){
            bullet pistolbullet = new bullet();
            getWorld().addObject(pistolbullet, getX(), getY());
            pistolbullet.pistolBulletType = 1;
            pistolbullet.setRotation(getRotation());
            reload = 0;
            Greenfoot.playSound("pistol.wav");
        }
    }
}
