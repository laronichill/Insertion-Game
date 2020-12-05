import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.awt.Color;

public class Terrorist extends Players
{
    public static int gunReloadTime = 25;
    private int reload = 0;
    public static int money = 500;
    public static boolean HelipadTTouching = false;
    public static int movementSpeed = 2;
    
    public void act() 
    {
        EndRoundT();
        if (reload < gunReloadTime) {
            reload++;
        }
        if (Greenfoot.isKeyDown("up")){ move(movementSpeed);}
        if (Greenfoot.isKeyDown("down")){ move(-movementSpeed);}
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
            if (gunReloadTime >= 25) {
                Greenfoot.playSound("pistol.wav");
            } else if(gunReloadTime < 25) {
                Greenfoot.playSound("fal.wav");
            } else {
                Greenfoot.playSound("pistol.wav");
            }
        }  
    }
    public void EndRoundT(){
        Actor HelipadT = getOneIntersectingObject(heli.class);
        if (HelipadT != null){
            HelipadTTouching = true;
        } else{
            HelipadTTouching = false;
        }
                
    }
}
