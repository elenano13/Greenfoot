import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class contador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class contador extends Actor
{
    /**
     * Act - do whatever the contador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int puntuacion = 0;
    int Contador;
    GreenfootSound SonidoGanaste = new GreenfootSound("mixkit-winning-chimes-2015.wav");

    public contador()
    {
       
        setImage(new GreenfootImage("Puntuación: "+ puntuacion, 30, Color.GREEN, Color.BLUE));
    }
    public void act()
    {
        // Add your action code here.
        setImage(new GreenfootImage("Puntuación: "+ puntuacion, 30, Color.WHITE, Color.BLUE));
        Ganaste();
    }
    public void addPuntuacion()
    {
        puntuacion++;
    }
    public void Ganaste()
    {
        if (puntuacion == 5){
            getWorld().addObject(new Ganaste(), getWorld().getWidth()/2, getWorld().getHeight()/2);
            SonidoGanaste.play();
            Greenfoot.stop();
            
        }
            
    }
}
