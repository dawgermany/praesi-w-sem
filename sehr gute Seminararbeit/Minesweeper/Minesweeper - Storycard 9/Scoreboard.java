import greenfoot.*;
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;
/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard extends Actor
{
    /**
     * Act - do whatever the Scoreboard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            if(Greenfoot.getMouseInfo().getButton()==3)
            {
                Greenfoot.setWorld(new Startscreen());
            }
        }
    }    
    public static final float FONT_SIZE = 48.0f;
    public static final int WIDTH = 400;
    public static final int HEIGHT = 200;

    public Scoreboard(int score)
    {
        makeImage("Spiel beendet","Zeit : ", score);
    }

    public Scoreboard(int score, int lvl, int i){
        if(i==1){
            makeImage("Spiel gewonnen","Zeit : ", score);
        }
        else{
            makeImage("Spiel verloren","Zeit : ", score);
        }
        switch(lvl){
            case 1: getImage().scale(130,100);
            case 2: getImage().scale(250,170);
        }
    }

    private void makeImage(String title, String prefix, int score)
    {
        GreenfootImage image = new GreenfootImage(WIDTH, HEIGHT);

        image.setColor(new Color(255,255,255, 128));
        image.fillRect(0, 0, WIDTH, HEIGHT);
        image.setColor(new Color(0, 0, 0, 128));
        image.fillRect(5, 5, WIDTH-10, HEIGHT-10);
        Font font = image.getFont();
        font = font.deriveFont(FONT_SIZE);
        image.setFont(font);
        image.setColor(Color.WHITE);
        image.drawString(title, 60, 75);
        image.drawString(prefix + score, 60, 150);
        setImage(image);
    }

    public void reset()
    {
        if(Greenfoot.mouseClicked(this))
        {
            if(Greenfoot.getMouseInfo().getButton()==3)
            {
                Greenfoot.setWorld(new Startscreen());
            }
        }
    }
}
