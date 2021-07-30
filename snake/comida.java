import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class comida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class comida extends Actor
{
    /**
     * Act - do whatever the comida wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int contar = 0;
    
    public void act()
    {
        // Add your action code here.
        contar++;
        if(contar > 300)
        getWorld().removeObject(this);
        else if (isTouching(Snake.class))
        getWorld().removeObject(this);
    }
}
