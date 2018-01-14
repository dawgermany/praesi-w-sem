import greenfoot.*;
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;
/**
 * Write a description of class MineCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MineCounter extends Counters
{
    int b ;
    public void act() 
    {
        b = Mzählen();
        setImage(new GreenfootImage ("Minen : " + b,28,Color.WHITE,Color.BLACK));
    }    
    
    int Mzählen()
    {
        Welt welt = (Welt) getWorld();
        int o = welt.getM();
        return o;
    }    
}
