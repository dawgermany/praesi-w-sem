import greenfoot.*;
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;

/**
 * Write a description of class Counters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Counters extends Actor
{
    int b ;
    public void act() 
    {
        b = Mzählen()-2;
        setImage(new GreenfootImage ("Minen : " + b,28,Color.WHITE,Color.BLACK));
    }    
    
    int Mzählen()
    {
        Welt welt = (Welt) getWorld();
        int o = welt.getM();
        return o;
    }  
}
