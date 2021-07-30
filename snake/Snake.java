import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Actor
{
    /**
     * Act - do whatever the Snake1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int r, g, b, snake;
    int velocidad = 2;
    int contar = 0;
    GreenfootSound SonidoComida = new GreenfootSound("mixkit-arcade-game-jump-coin-216.wav");
    public Snake(int snake, int r, int g, int b)
    {
        setRotation(270);
       this.r = r;
       this.g = g;
       this.b = b;
       this.snake = snake;
       getImage().setColor(new Color(r,g,b));
       getImage().fillRect(0,0,40,40);
    }
    public void act()
    {
        // Add your action code here.
        contar++;
        getWorld().addObject(new cola(r, g, b), getX(), getY());
        move(velocidad);
        mover();
        comer();
        
            
    }
    public void mover()
    {
       if(this.snake == 0){
            if(Greenfoot.isKeyDown("right"))
                setRotation(0);
            if(Greenfoot.isKeyDown("up"))
                setRotation(270);
            if(Greenfoot.isKeyDown("down"))
                setRotation(90);
            if(Greenfoot.isKeyDown("left"))
                setRotation(180);
        }
        if(this.snake == 1){
            if(Greenfoot.isKeyDown("d"))
                setRotation(0);
            if(Greenfoot.isKeyDown("a"))
                setRotation(180);
            if(Greenfoot.isKeyDown("w"))
                setRotation(270);
            if(Greenfoot.isKeyDown("s"))
                setRotation(90);
        } 
    }
    public void comer()
    {
        if(isTouching(comida.class) && snake == 0)
        {
            SonidoComida.play();
            MyWorld myWorld = (MyWorld) getWorld();
            myWorld.rojoconta.addPuntuacion();
        
        }
        if(isTouching(comida.class) && snake == 1)
        {
            SonidoComida.play();
            MyWorld myWorld = (MyWorld) getWorld();
            myWorld.verdeconta.addPuntuacion();
        
        }
    }

}
