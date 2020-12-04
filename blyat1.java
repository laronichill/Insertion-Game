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
        heli heliCT = new heli();
        addObject(heliCT,550,50);
        heli heliT = new heli();
        addObject(heliT,50,310);
        CounterTerrorist counterTerrorist = new CounterTerrorist();
        addObject(counterTerrorist,550,50);
        Terrorist terrorist = new Terrorist();
        addObject(terrorist,50,310);
        Players player = new Players();
        addObject(player,0,0);
    }

        public void act()
    {
        super.act();
        
    }
}
