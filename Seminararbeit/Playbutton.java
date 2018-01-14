import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Playbutton extends Actor
{
    //bool für PlayButton()
    boolean isClicked=false;
    //angabe für stelle im Takt

   
    /**
     * Act - do whatever the PlayButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //Takt();

    }
    
    //do what buttons do and return your state
    public boolean PlayButton(){
        if(Greenfoot.mouseClicked(this)){
            if(!isClicked){
                setImage("icons8-Pause-104-2.png");
                isClicked=true;

            }
            else{
                setImage("icons8-Play-104-2.png");
                isClicked=false;

            }
        }
        return isClicked;

    }
}
