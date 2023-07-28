import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;
/**
 * Juego de Greenfoot.
 * 
 * @Fernando Rueda - 23748
 * @Pablo Orellana - 20555
 * @Versión No.01 
 */
public class MyWorld extends World
{
    private static final int NUMERO_VIDAS = 3;
    
    private superheroe heroe;
    private Puntuacion puntuacion;
    private List<Vida> vidas;
    private GreenfootSound backgroundMusic;
    private GreenfootSound loseLifeSound; 
    private GreenfootSound gameOverSound;
    private GreenfootSound victorySound;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(997, 662, 1);
        heroe = new superheroe();
        addObject(heroe, getWidth()/2, getHeight()-50);
        puntuacion = new Puntuacion();
        addObject(puntuacion, 50, 25);
        
        vidas = new ArrayList<Vida>();
        for (int i = 0; i < NUMERO_VIDAS; i++)
        {
            Vida vida = new Vida();
            vidas.add(vida);
            addObject(vida, 550 + 1 * 20, 25);
        }
        loseLifeSound = new GreenfootSound("perder_vida.mp3");
        gameOverSound = new GreenfootSound("perder_juego.mp3");
        victorySound = new GreenfootSound("victory.mp3");
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
    
    public void reducirVida()
    {
        if (!vidas.isEmpty())
        {
            Vida vida = vidas.remove(vidas.size() -1);
            removeObject(vida);
            
            if (vidas.isEmpty())
            {
                gameOverSound.play();
                gameOverSound.setVolume(50);
                showText("GAME OVER", getWidth()/2, getHeight()/2);
                Greenfoot.stop();
            }
            else
            {
                loseLifeSound.play();
            }
        }
    }
    
    public void started()
    {
        backgroundMusic = new GreenfootSound("fondo.mp3");
        backgroundMusic.setVolume(50);
        backgroundMusic.playLoop();
    }
    
    public void stopped()
    {
        backgroundMusic.stop();
    }

    public void mensajevictoria()
    {
      showText("¡VICTORIA!", getWidth()/2, getHeight()/2);
      victorySound.play();
    }
}
