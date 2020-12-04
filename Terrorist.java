import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class Terrorist extends Players
{
    private int gunReloadTime = 25;
    private int reload = 0;
    public void act() 
    {
        if (reload < gunReloadTime) {
            reload++;
        }
        if (Greenfoot.isKeyDown("up")){ move(2);}
        if (Greenfoot.isKeyDown("down")){ move(-2);}
        if (Greenfoot.isKeyDown("left")){ turn(-5);}
        if (Greenfoot.isKeyDown("right")){ turn(5);}
        if (Greenfoot.isKeyDown("enter")){ 
            Shootpistol();
        }
    }
    private void Shootpistol() 
    {
        if (reload >= gunReloadTime){
            bullet pistolbullet = new bullet();
            getWorld().addObject(pistolbullet, getX(), getY());
            pistolbullet.pistolBulletType = 0;
            pistolbullet.setRotation(getRotation());
            reload = 0;
            Greenfoot.playSound("pistol.wav");
        }  
    }
}
