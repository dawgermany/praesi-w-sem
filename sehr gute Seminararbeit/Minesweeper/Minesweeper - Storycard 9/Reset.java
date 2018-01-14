import greenfoot.*;

/**
 * Write a description of class Reset here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reset extends Actor
{
    private static final GreenfootImage reset = new GreenfootImage("restart.jpg");
    public void act() 
    {
       getImage().scale(90,43);
       reset();
    }    
    
    void reset()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Welt(16,30,70));
        }
    }
}
