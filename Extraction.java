import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Extraction extends Actor
{
    double extractionTime = 400;
    public void act() 
    {   
        if (extractionTime != 0) {
            if (getWorld().getObjects(HeliCT.class).size() == 0 && ( getWorld().getObjects(CounterTerrorist.class).size() == 0 || getWorld().getObjects(Terrorist.class).size() == 0)){ 
                if (extractionTime > 0) {
                    extractionTime--;
                }
                setImage(new GreenfootImage("TIME LEFT TILL EXTRACTION: \n" + (double) extractionTime/100 + "",30 , Color.WHITE, Color.BLACK, Color.YELLOW));
            } 
        } else if (extractionTime <= 0) {
            if (getWorld().getObjects(CounterTerrorist.class).size() == 0){
                Terrorist.money += 500;
                if (Terrorist.HelipadTTouching){
                    Terrorist.money += 100;
                    Greenfoot.setWorld(new BuyMenu());
                } else{
                    Terrorist.money -= 250;
                    Greenfoot.setWorld(new BuyMenu());
                }
            } else if (getWorld().getObjects(Terrorist.class).size() == 0) {
                CounterTerrorist.money += 500;
                if (CounterTerrorist.HelipadCTTouching){
                    CounterTerrorist.money += 100;
                    Greenfoot.setWorld(new BuyMenu());
                } else{
                    CounterTerrorist.money -= 250;
                    Greenfoot.setWorld(new BuyMenu());
                }
            } else {
                Greenfoot.setWorld(new BuyMenu());
            }
        }
    }   
}
