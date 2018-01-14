import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snares here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snares extends Button
{
    //boolean snaresPlaying=true;

    /**
     * Act - do whatever the Snares wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        /*Button();
        snare=isClicked;
        if(snare){
        //Greenfoot.playSound("808 Snare.mp3");

        }*/
    }

    //falls true spiele snare
    public void snare(boolean snarebool){

        if(snarebool){
            Greenfoot.playSound("808 Snare.mp3");
        }

    }
}
