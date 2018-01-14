import greenfoot.*;

/**
 * Write a description of class Rand2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rand2 extends Rand
{
    int leben;
    int death;
    private static final GreenfootImage Easy = new GreenfootImage("Hidden1 - Kopie.png");
    private static final GreenfootImage Medium = new GreenfootImage("Hidden1 - Kopie - Kopie.png");
    private static final GreenfootImage Hard = new GreenfootImage("Hidden1 - Kopie - Kopie (2).png");
    private static final GreenfootImage Logo = new GreenfootImage("Hidden1 - Kopie - Kopie (2) - Kopie.png");
    public void act() 
    {
        leben++;
        if(leben>=death)
        {
            getWorld().removeObject(this);
        }
    }    
    public Rand2()
    {
        death =20;
    }
    public Rand2(int i,int d)
    {
        death = d;
        if(i<4)
        {
            if(i==1)
            {
                getImage().drawImage(Easy,0,0);
            }
            if(i==2)
            {
                getImage().drawImage(Medium,0,0);
            }
            if(i==3)
            {
                getImage().drawImage(Hard,0,0);
            }
        }
        else
        {
            getImage().drawImage(Logo,0,0);
        }
    }
}
