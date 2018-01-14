import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bpmindi extends Actor
{
    /**
     * Act - do whatever the test wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage img1=new GreenfootImage(""+20, 40,null,null);
    
    public void act() 
    {
        img1 = new GreenfootImage(""+Taktgeber.bpm, 40,null,null);
        setImage(img1);
    }    
}
