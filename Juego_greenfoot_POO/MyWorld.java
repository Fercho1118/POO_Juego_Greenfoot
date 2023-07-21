import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Juego de Greenfoot.
 * 
 * @Fernando Rueda - 23748
 * @Pablo Orellana - 20555
 * @Versión No.01 
 */
public class MyWorld extends World
{

    
    private superheroe heroe;
    private Puntuacion puntuacion;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(997, 662, 1);
        heroe = new superheroe();
        addObject(heroe, getWidth()/2, getHeight()-50);
        puntuacion = new Puntuacion();
        addObject(puntuacion, 50, 25);
    }
    
    public void act() {
        if (Greenfoot.getRandomNumber(100) < 1) {
            addObject(new meteorito(), Greenfoot.getRandomNumber(getWidth()-1), 0);
        }
    }
    
    public Puntuacion getPuntuacion()
    {
        return puntuacion;
    }

}
