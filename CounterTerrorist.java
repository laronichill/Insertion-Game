import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class CounterTerrorist extends Players
{
    public static int gunReloadTime = 25;
    private int reload = 0;
    public static int money = 500;
    public static boolean HelipadCTTouching = false;
    public static int movementSpeed = 2;
    
    public void act() 
    {
        EndRoundCT();
        if (reload < gunReloadTime) {
            reload++;
        }
        if (Greenfoot.isKeyDown("w")){ move(movementSpeed);}
        if (Greenfoot.isKeyDown("s")){ move(-movementSpeed);}
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
            if (gunReloadTime >= 25) {
                Greenfoot.playSound("pistol.wav");
            } else if(gunReloadTime < 25) {
                Greenfoot.playSound("fal.wav");
            } else {
                Greenfoot.playSound("pistol.wav");
            }
        }
    }
    public void EndRoundCT(){
        Actor HelipadT = getOneIntersectingObject(helipadCT.class);
        if (HelipadT != null){
            HelipadCTTouching = true;
        } else{
            HelipadCTTouching = false;
        }
                
    }
}
