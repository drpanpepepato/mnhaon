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
        
        if (Greenfoot.isKeyDown("left") )
        {
            moveLeft();
        }
        if (Greenfoot.isKeyDown("right") )
        {
            moveRight();
        }
        if (Greenfoot.isKeyDown("up") )
        {
            moveUp();
        }
        if (Greenfoot.isKeyDown("down") )
        {
            moveDown();
        }
        
       if ( touches(Truck.class) || touches(Truck2.class)) 
       {
        Greenfoot.playSound("game_turtle_splat.wav");
        this.setLocation(0,350);
    }
}
    
}
