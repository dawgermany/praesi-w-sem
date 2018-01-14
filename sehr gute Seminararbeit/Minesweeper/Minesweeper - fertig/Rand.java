import greenfoot.*;

/**
 * Write a description of class Rand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rand extends Actor
{

    int h2=1;
    int h3=1;
    int w2=1;
    int w3=1;
    int h222;
    int h333;
    int w222;
    int w333;
    int d;
    private static final GreenfootImage Easy = new GreenfootImage("Hidden1 - Kopie.png");
    private static final GreenfootImage Medium = new GreenfootImage("Hidden1 - Kopie - Kopie.png");
    private static final GreenfootImage Hard = new GreenfootImage("Hidden1 - Kopie - Kopie (2).png");
    private static final GreenfootImage Logo = new GreenfootImage("Hidden1 - Kopie - Kopie (2) - Kopie.png");
    public int status;
    public Rand()
    {
    }
    public Rand(int i,int h22,int h33, int w22 , int w33,int dd)
    {
        h222=h22;
        h333=h33;
        w222=w22;
        w333=w33;
        d=dd;
        if(i<4)
        {
            if(i==1)
            {
                getImage().drawImage(Easy,0,0);
                status=1;
            }
            if(i==2)
            {
                getImage().drawImage(Medium,0,0);
                status=2;
            }
            if(i==3)
            {
                getImage().drawImage(Hard,0,0);
                status=3;
            }
        }
        else
        {
            getImage().drawImage(Logo,0,0);
            status=4;
        }
    }

    public void act() 
    {
        linksunten(d);
        if(w2>=w222)
        {
            linkshoch(d);
            if(h2>=h222)
            {
                rechtsoben(d);
                if(w3 >=w333)
                {
                    rechtsunten(d);
                    if(h3>=h333)
                    {
                        h2=1;
                        h3=1;
                        w2=1;
                        w3=1;
                    }
                }
            }
        }
    }    

    public void linksunten(int d)
    {
        if(w2<w222)
        {
            getWorld().addObject(new Rand2(status,d),getX(),getY());
            setLocation(getX()-5,getY());
            w2++;
        }
    }

    public void linkshoch(int d)
    {
        if(h2<h222)
        {
            getWorld().addObject(new Rand2(status,d) , getX(),getY());
            setLocation(getX(),getY()-5);
            h2++;
        }
    }

    public void rechtsoben(int d)
    {
        if(w3<w333)
        {
            getWorld().addObject(new Rand2(status,d),getX(),getY());
            setLocation(getX()+5,getY());
            w3++;
        }
    }

    public void rechtsunten(int d)
    {
        if(h3<h333)
        {
            getWorld().addObject(new Rand2(status,d) , getX(),getY());
            setLocation(getX(),getY()+5);
            h3++;
        }
    }
}
