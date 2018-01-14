import greenfoot.*;
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;
import java.util.*;

/**
 * Write a description of class TimeCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TimeCounter extends Counters
{
    int i;
    int x;
    private boolean active = true;
    public void act() 
    {
        if(active == false)
        {
        }
        else{

            x++;
            zählen();
            setImage(new GreenfootImage ("Zeit : " + i,28,Color.WHITE,Color.BLACK));
        }
    }    

    public TimeCounter()
    {
        i=0;
        x=0;
    }

    public void lvlez()
    {
        setImage(new GreenfootImage ("T"+ i,28,Color.WHITE,Color.BLACK));
    }

    public void zählen()
    {
        if(active==true)
        {
            if(x>30)
            {
                i=i+1;
                x=0;
            }
        }
    }

    public int getTime()
    {
        return i;
    }

    public void stop()
    {
        active =false;
    } 
}
