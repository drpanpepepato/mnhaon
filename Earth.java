import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Earth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Earth extends World
{

    /**
     * Constructor for objects of class Earth.
     * 
     */
    public Earth()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 750, 1); 
        addObject(new Turtle(), 0,350);
        addObject(new Truck(), 175,750);
        addObject(new Truck(), 375,750);
        addObject(new Truck(), 575,750);
        
        //Greenfoot.playSound("mnhaon.mp3");
    }
}
