import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
public class blyat1 extends maps
{
    
        /**
         * Constructor for objects of class blyat1.
         * 
         */
    public blyat1()
    {    
            // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
            prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        heli helipadCT = new heli();
        addObject(helipadCT,550,50);
        heli helipadT = new heli();
        addObject(helipadT,50,310);
        Players player = new Players();
        addObject(player, 300, 180);
        HeliCT heliCT = new HeliCT();
        addObject(heliCT,600,50);
        HeliT heliT = new HeliT();
        addObject(heliT,0,310);
        Insertion insertion = new Insertion();
        addObject(insertion,300,180);
        Extraction extraction = new Extraction();
        addObject(extraction,300,180);
    }

    public void act()
    {
        super.act();
        
    }
}
