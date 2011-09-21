import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mover extends Actor
{
    private static final int speed = 4;

    public void moveRight()
    {
        setLocation ( getX() + speed, getY() );
    }

    public void moveLeft()
    {
        setLocation ( getX() - speed, getY() );
    }

    public void moveUp()
    {
        setLocation ( getX(), getY() - speed );
    }

    public void moveDown()
    {
        setLocation ( getX(), getY() + speed );
    }
    
     public boolean touches(Class clss)
    {
        Actor actor = getOneIntersectingObject(clss);
        return actor != null;
    }
    public boolean atTop()
    {
        if(getY() == getWorld().getHeight()-750)
            return true;
        else
            return false;
    }
}
