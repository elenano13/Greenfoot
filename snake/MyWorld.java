import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    Snake roja = new Snake(0,202,0,42);
    Snake verde = new Snake(1,21,119,40);
    contador rojoconta = new contador();
    contador verdeconta = new contador();
    int contar = 0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(650, 450, 1);
        addObject(roja, 450, 200);
        addObject(rojoconta, 450, 50);
        addObject(verde, 100, 200);
        addObject(verdeconta, 100,50); 
       
        
    }
    public void act()
    {
       contar++;
        if(contar > 100){
            addObject(new comida(), Greenfoot.getRandomNumber(getWidth() -1) , Greenfoot.getRandomNumber(getHeight() -1));
            contar = 0;
    }
    
}

        
    
}
