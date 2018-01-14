import greenfoot.*;
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Zahl here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zahl extends Actor
{
    int zahl;
    public void act() 
    {
        doppel();
        checkMines();
    }    

    void checkMines()
    {
        int num = 0;
        for (int dx = -1; dx <= 1; dx++){
            for (int dy = -1; dy <= 1; dy++){
                if (getOneObjectAtOffset(dx, dy, Mine.class) != null){
                    num++;
                }
            }
        }
        if (num == 0){
            getWorld().removeObject(this);
        }
        else{
            setImage(new greenfoot.GreenfootImage(num + ".png"));
        }
        zahl=num;
    }

    public void doppel()
    {
        Welt welt = (Welt) getWorld();
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(Greenfoot.mouseClicked(this))
        {
            List<Knopf> knpf= getNeighbours(1,true,Knopf.class);
            if (mouse.getClickCount() == 2&&flagsn()==getZahl())
            {
                for(Knopf k:knpf)
                {
                    if(k.getStatus()==2)
                    {
                        welt.gameOver();
                    }
                    else if(k.getStatus()==0)
                    {
                        try
                        {
                            k.andereent();
                        }
                        catch (IllegalStateException e){}
                    }

                }
            }
        }
    }

    public int flagsn()
    {
        int i =0;
        List<Knopf> knpf= getNeighbours(1,true,Knopf.class);
        for(Knopf k:knpf)
        {
            if(k.getStatus()==2||k.getStatus()==4)
            {
                i++;
            }
        }
        return i;
    }

    public int getZahl()
    {
        return zahl;
    }
}
