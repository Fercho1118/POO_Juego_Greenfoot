import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Puntuacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puntuacion extends Actor
{
    private int puntos = 0;
    private GreenfootImage imagen;
    
    public Puntuacion()
    {
        imagen = new GreenfootImage(100, 30);
        setImage(imagen);
        update();// Add your action code here.
    }
    
    public void addPuntos(int puntos)
    {
        this.puntos += puntos;
        update();
    }
    
    public void update()
    {
        imagen.clear();
        imagen.setColor(Color.WHITE);
        imagen.setFont(new Font("Arial", 20));
        imagen.drawString("Puntos: " + puntos, 5, imagen.getHeight()/2 + 5);
        setImage(imagen);
    }
}
