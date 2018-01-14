import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bpmbuttons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bpmbuttons extends Actor
{
    /**
     * Act - do whatever the Bpmbuttons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public void bpmbutton(int delta){
        if(Greenfoot.mouseClicked(this)){
            Taktgeber.bpm=Taktgeber.bpm + delta;
        }
    }
}
