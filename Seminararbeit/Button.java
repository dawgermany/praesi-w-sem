import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    //bool für Button()
    boolean isClicked=false;
    //angabe für stelle im Takt

   
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //Takt();

    }
    
    //do what buttons do and return your state
    public boolean Button(){
        if(Greenfoot.mouseClicked(this)){
            if(!isClicked){
                setImage("button-green.png");
                isClicked=true;

            }
            else{
                setImage("button-red.png");
                isClicked=false;

            }
        }
        return isClicked;

    }
}
