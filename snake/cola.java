import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cola extends Actor
{
    /**
     * Act - do whatever the cola wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int r, g, b, snake;
    int contar = 0;
    static int largorojo = 1;
    static int largoverde = 1;
    GreenfootSound SonidoPerdiste = new GreenfootSound("mixkit-little-piano-game-over-1944.wav");

   
    public cola(int r, int g, int b)
    {
        this.r =r;
        this.g = g;
        this.b = b;
        getImage().setColor(new Color(r,g,b));
        getImage().fillRect(0,0,40,40);
    }
    public void act()
    {
        // Add your action code here.
        contar++;
        
        if (contar >15 && isTouching(Snake.class))
            {
            
            getWorld().addObject(new Perdiste(), getWorld().getWidth()/2, getWorld().getHeight()/2);
            SonidoPerdiste.play();
            Greenfoot.stop();
            
        }
        
        if (snake == 0 && contar % largorojo == 0){
            getWorld().removeObject(this);
            largorojo++;
        }
        
        if (snake == 1 && contar % largoverde == 0){
            getWorld().removeObject(this);
            largoverde++;
        }
        
        
        
    }
}
