import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Truck2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Truck2 extends Mover
{
    /**
     * Act - do whatever the Truck2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(!atTop()) {
            moveUp();
        }
        else{
            getWorld().removeObject(this);
        }
    }    
}
