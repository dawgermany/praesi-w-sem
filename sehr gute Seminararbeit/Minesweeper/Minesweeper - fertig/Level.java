import greenfoot.*;

/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends Actor
{
     private static final GreenfootImage Easy = new GreenfootImage("lvleasy.png");
     private static final GreenfootImage Medium = new GreenfootImage("lvlmedium.png");
     private static final GreenfootImage Hard = new GreenfootImage("lvlhard.png");
     private static final GreenfootImage Normal = new GreenfootImage("lvlnormal.png");
     int status;
    public void act() 
    {
        draw();
        createlvl();
    }    
    
    public Level()
    {
        status = 1;
    }
    
    public Level(int Level)
    {
        status = Level;
    }
    
    void createlvl()
    {
        if(Greenfoot.mouseClicked(this))
        {
            switch(status)
            {
                case 1: Greenfoot.setWorld(new Welt(8,8,10));
                break;
                case 2: Greenfoot.setWorld(new Welt(16,16,40));
                break;
                case 3: Greenfoot.setWorld(new Welt(16,30,80));
                break;
            }
        }
    }
    
    
    void draw()
    {
        getImage().drawImage(Normal,0,0);
        switch(status)
        {
            case 1: getImage().drawImage(Easy,0,0);
            break;
            case 2: getImage().drawImage(Medium,0,0);
            break;
            case 3: getImage().drawImage(Hard,0,0);
            break;
        }
    }
}
