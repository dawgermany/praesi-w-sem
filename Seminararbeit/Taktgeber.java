import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Taktgeber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Taktgeber extends Playbutton
{
    public static int NotePlaying=1;
    boolean isPlaying=true;
    //Variablen für den Abstand zwischen 2 Noten
    long Time=System.currentTimeMillis();
    public static int bpm=120;
    public static int Timestepms=60000/(bpm*2);

    /**
     * Act - do whatever the Taktgeber wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        Timestepms=60000/(bpm*2);
        PlayButton();
        isPlaying=isClicked;
        if(isPlaying){
            long Time  = System.currentTimeMillis();
            while(System.currentTimeMillis() < Time+Timestepms){
                Greenfoot.delay(1);
            }
            if(NotePlaying==16){
                NotePlaying=1;
            }
            else{
                NotePlaying++;
            }
            //System.out.println("NotePlaying="+NotePlaying);
        }

    }

}
