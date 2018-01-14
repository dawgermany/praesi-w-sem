import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snare5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snare5 extends Snares
{
    boolean playOnce=true;
    /**
     * Act - do whatever the Snare5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        Button();
        if((Taktgeber.NotePlaying==5)&&(playOnce)){
            snare(isClicked);
            playOnce=false;
        }
        if(Taktgeber.NotePlaying!=5){
            playOnce=true;
        }
        
    }    
}
