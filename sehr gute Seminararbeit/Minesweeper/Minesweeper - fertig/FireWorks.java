import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Engine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FireWorks extends Actor
{
    float[] vX = new float[1000];  
    float[] vY = new float[1000];
    float[] particlesX = new float[1000];  
    float[] particlesY = new float[1000];
    int[] life = new int[1000];
    int trans = 100;
    int time = 0;
    int red;
    int time2 = 0;
    int green;
    int blue;
    public FireWorks(int r,int g, int b)
    {
        red =r;
        green =g;
        blue = b;
        setRotation(0);
        for(int i =0;i<1000;i++)
        {
            particlesX[i] = 0;
            particlesY[i] = 0;
            life[i]= 0;
        }
    }
    /**
     * Act - do whatever the Engine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //getImage().setColor(Color.red);
        if(Greenfoot.isKeyDown("up")&&trans<255)
            trans++;
        if(Greenfoot.isKeyDown("down")&&trans>0)
            trans--;
        getImage().clear();
        if(time<50)
        {
            for(int i = 0;i<20;i++)
            {
                float rand = (float)Math.toRadians(Greenfoot.getRandomNumber(360)+1);
                vX[time*20+i] = 4*(float)Math.sin(rand);
                vY[time*20+i] = 4*(float)Math.cos(rand);
            }
        }
        for(int i = 0; i<time*20;i++)
        {
            float upwards = life[i]*.0055f;
            vY[i] += upwards;
            particlesY[i] += (vY[i]);
            particlesX[i] += (vX[i]);
            life[i]++;
            int dist = (int)Math.round(Math.pow(Math.pow(particlesY[i],2)+Math.pow(particlesX[i],2),.5))+Greenfoot.getRandomNumber(30);
            getImage().setColor(new Color(red,green,blue));
            if(life[i]<85)
            getImage().fillOval((int)Math.round(particlesX[i])+400,(int)Math.round(particlesY[i])+300,2,2);
        }
        if(time<20)time++;
        else if(time2<90) time2++;
        if(Greenfoot.mouseClicked(this))
        {
            if(Greenfoot.getMouseInfo().getButton()==3)
            {
            Greenfoot.setWorld(new Startscreen());
        }
        }
    }    
}
