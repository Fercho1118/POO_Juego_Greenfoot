import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @Fernando Rueda - 23748
 * @Pablo Orellana - 20555
 * @Versión No.01 
 */
public class MyWorld extends World
{

    
    private superheroe heroe; 
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(997, 662, 1);
        heroe = new superheroe();
        addObject(heroe, getWidth()/2, getHeight()-50);
    }
    
    public void act() {
        if (Greenfoot.getRandomNumber(100) < 1) {
            addObject(new meteorito(), Greenfoot.getRandomNumber(getWidth()-1), 0);
        }
    }
}
