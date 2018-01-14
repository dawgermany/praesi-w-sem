import greenfoot.*;
import java.util.ArrayList;
import greenfoot.Greenfoot;
import greenfoot.Actor;
import java.util.*;
/**
 * Write a description of class Knopf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Knopf extends Actor
{
    private static final GreenfootImage flag = new GreenfootImage("flag.png");
    private static final GreenfootImage question = new GreenfootImage("question.png");
    private static final GreenfootImage normal = new GreenfootImage("Hidden.png");
    public int status;
    public void act() 
    {
        action2();
    }
    void action2()
    {
        if(status==0)
        {
            getImage().drawImage(normal,0,0);
        }
        Mineu();
        draw();
        action();
    }
    
    public Knopf()
    {
        status = 0;
    }

   void action()
    { 
        Welt welt = (Welt) getWorld();
        if(Greenfoot.mouseClicked(this))
        {
            if(Greenfoot.getMouseInfo().getButton() ==1)
            {
                if(status==0)
                {
                        
                        GreenfootSound Beep = new GreenfootSound("Press.wav");
                        //Beep.play();
                        andereent();
                }
                else if(status==1)
                {
                    changeMine();
                    GameOver();
                }
            }

            else if(Greenfoot.getMouseInfo().getButton() ==3 )
            {
                switch(status)
                {
                case 0: status=2; //Keine Mine ---> Flagge
                break;
                case 2: status=3; //Flagge und keine Mine ---> Fragezeichen
                break;
                case 1: status=4; //Mine ---> Flagge
                break;
                case 3: status=0; //Keine Mine und Fragezeichen ---> Backt to Normal
                break;
                case 4: status=5; // Mine und Flagge ---> Fragezeichen
                break;
                case 5: status=2; // Mine und Fragezeichen ---> Normal mit Mine
                break;
            }
            }
        }
    }
    public void changeMine()
    {
        Mine a = (Mine) getOneIntersectingObject(Mine.class);
        a.clicked();
    }

    void draw()
    {
        getImage().drawImage(normal,0,0);
        switch(status)
        {
            case 2: getImage().drawImage(flag,0,0);
            break;
            case 4: getImage().drawImage(flag,0,0);
            break;
            case 5: getImage().drawImage(question,0,0);
            break;
            case 3: getImage().drawImage(question,0,0);
            default:;
        }
    }
    int getStatus()
    {
        return status;
    }
    void GameOver()
    {
            
            Welt welt = (Welt) getWorld();
            welt.gameOver();
        
    }

    public void Mineu() //Mine unter Knopf
    {
        if(status!=4&&status!=5)
        {
        if(getWorld().getObjectsAt(getX(),getY(),Mine.class).size()>0)
        {
            status=1;
        }
    }
    }
    
    void andereent()
   {
       ArrayList<Knopf> knopf = new ArrayList<Knopf>(15);
       if (getOneIntersectingObject(Zahl.class)==null)
       {
           for (int dx = -1; dx <= 1; dx++)
                for (int dy = -1; dy <= 1; dy++)
           {
               Knopf k=(Knopf) getOneObjectAtOffset(dx,dy,Knopf.class);
               if(k!= null)
               {
                   knopf.add(k);
                }
            }
        }
        getWorld().removeObject(this);
        for (Knopf k : knopf)
            try
            {
                k.andereent();
            }
            catch (IllegalStateException e){}
    }
    
    
}




