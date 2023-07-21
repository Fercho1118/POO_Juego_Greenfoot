import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class meteorito here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class meteorito extends Actor
{
    public void act()
    {
        setLocation(getX(), getY()+3);
        
        if (getY() + getImage().getHeight() / 2 >= getWorld().getHeight())
        {
            ((MyWorld)getWorld()).reducirVida();
            getWorld().removeObject(this);
        }
    }
}
