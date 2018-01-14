import greenfoot.*;
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;
import java.util.*;

/**
 * Write a description of class MineCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlagCounter extends Counters
{
    private List FListe;
    int f;
    public void act() 
    {
        getf();
        setImage(new GreenfootImage ("Flaggen: " + f,28,Color.WHITE,Color.BLACK));
    }    

    public void getf()
    {
        FListe= getWorld().getObjects(Knopf.class);
        int n = FListe.size()-1;
        int j =0;
        for(int i =1 ;i<n;i++) //for-Schleife
        {
            Knopf knopf = (Knopf) FListe.get(i);

            if(knopf.getStatus()==2||knopf.getStatus()==4)
            {
                j=j+1;

            }
        }
        f=j;
    }
}
