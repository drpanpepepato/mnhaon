import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends Mover
{
    /**
     * Act - do whatever the Turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        moveRight();
        
        
       if ( touches (Truck.class)) {
        Greenfoot.playSound("game_turtle_splat.wav");
        Greenfoot.stop();
       
    }
}
    
}
