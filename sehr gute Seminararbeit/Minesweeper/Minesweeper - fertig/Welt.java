import greenfoot.*;
import greenfoot.Greenfoot;
import greenfoot.Actor;
import java.util.List;

/**
 * Write a description of class Welt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Welt extends World
{
    private TimeCounter T = new TimeCounter();
    private FlagCounter B = new FlagCounter();
    private Reset R = new Reset();
    public MineCounter TB = new MineCounter();
    public void act()
    {
        win(T.getTime());
    }

    public Welt()
    {    
        // 16x18 Feld mit 40Minen
        super(30,16,15); 
        addButton();
        addTimerCounter();
    }

    public Welt(int h,int w, int m)
    {
        super(w,h+2,15);

        addMine(m);
        addNum();
        addButton();
        if(w==30&&h==16)
        {
            addTimerCounter();
        }
        else if(w==16&&h==16)
        {
            addTimer(12,0);
            addMCounter(4,0);
        }
        else{
            addTimer();
        }
    }


    void addMine(int i)
    {
        for(int a =0; a<i;a++)
        {
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight()-2)+2;
            if (getObjectsAt(x,y,Mine.class).size() == 0){
                addObject(new Mine(), x, y);
            }
            else{
                a--;
            }
        }

    }

    void addButton()
    {
        for(int i =0;i<getWidth();i++)
        {
            for(int a=2;a<getHeight();a++)
            {
                addObject(new Knopf(),i,a);
            }
        }
    }

    void addNum()
    {
        for(int i =0;i<getWidth();i++)
        {
            for(int a=2;a<getHeight();a++)
            {
                if (getObjectsAt(i,a,Mine.class).size()==0)
                {
                    addObject(new Zahl(),i,a);
                }
            }
        }
    }

    public void gameOver()
    {
        GreenfootSound Exp = new GreenfootSound("Explosion.wav");
        //Exp.play();
        removeObjects(getObjects(Knopf.class));
        T.stop();
        if(getHeight()==18&&getWidth()==30)
        {
            addObject(new Scoreboard(T.getTime(),3,0), getWidth()/2, getHeight()/2);
            addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
            addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
            addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
            addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
            addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
            addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
            addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
            addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
        }
        if(getHeight()==18&&getWidth()==16)
        {
            addObject(new Scoreboard(T.getTime(),2,0),getWidth()/2-1,getHeight()/2);
            addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
            addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
            addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
            addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
            addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
            addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
        }
        if(getHeight()==10&&getWidth()==8)
        {
            addObject(new Scoreboard(T.getTime(),1,0),getWidth()/2-1,getHeight()/2);
            addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
            addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
            addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
        }
    }

    void addTimerCounter()
    {
        addObject(T,20,0);
        addObject(B,3,0);
        addObject(TB,12,0);
    }

    void addMCounter()//Minencounter
    {
        addObject(B,0,0);
    }

    void addMCounter(int x, int y)//Minencounter
    {
        addObject(B,x,y);
    }

    void addTimer()//Timer
    {
        addObject(T,getWidth()/2,0);
    }

    void addTimer(int x, int y)//Timer
    {
        addObject(T,x,y);
    }

    void addCounter()//Anzahl an Minen
    {
        addObject(TB,getWidth()/2,0);
    }

    public void win(int P)
    {
        if(getObjects(Knopf.class).size()== getObjects(Mine.class).size())
        {

            removeObjects(getObjects(Knopf.class));
            T.stop();
            if(getHeight()==18&&getWidth()==30)
            {
                addObject(new Scoreboard(P,3,1), getWidth()/2, getHeight()/2);
                addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
                addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
                addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
                addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
                addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
                addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
                addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
                addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
            }
            if(getHeight()==18&&getWidth()==16)
            {
                addObject(new Scoreboard(P,2,1),getWidth()/2,getHeight()/2);
                addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
                addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
                addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
                addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
                addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
                addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
            }
            if(getHeight()==10&&getWidth()==8)
            {
                addObject(new Scoreboard(P,1,1),getWidth()/2,getHeight()/2);
                addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
                addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
                addObject(new FireWorks(Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256),Greenfoot.getRandomNumber(256)),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
            }
        }
    }

    public int getM()
    {
        return getObjects(Mine.class).size();
    }
}
