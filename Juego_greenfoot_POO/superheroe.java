import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class superheroe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class superheroe extends Actor
{
    private int speed = 10;
    private GreenfootSound pointSound;
    
    public superheroe()
    {
        pointSound = new GreenfootSound("points.mp3");
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("right")) {
            setLocation(getX() + speed, getY());
        }// Add your action code here.
        if(Greenfoot.isKeyDown("left")) {
            setLocation(getX() - speed, getY());
        }
        if(Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - speed);
        }
        if(Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + speed);
        }
        if(canSee(meteorito.class)) {
            eat(meteorito.class);
        }
    }
    
    public boolean canSee(Class clss) {
        Actor actor = getOneIntersectingObject(clss);
        return actor != null;
    }
    
    public void eat(Class clss) {
        Actor actor = getOneIntersectingObject(clss);
        if(actor != null) {
            getWorld().removeObject(actor);
            ((MyWorld)getWorld()).getPuntuacion().addPuntos(1);
            pointSound.play();
        }
    }
}
