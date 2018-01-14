import greenfoot.*;
import java.awt.*;
/**
 * Write a description of class Mine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mine extends Actor
{
    private static final GreenfootImage Red = new GreenfootImage("Mine - Kopie.png");
    public void act() 
    {
        getImage().scale(19,19);
        
    }    
        
    public void clicked()
    {
        setImage(Red);
    }
}
