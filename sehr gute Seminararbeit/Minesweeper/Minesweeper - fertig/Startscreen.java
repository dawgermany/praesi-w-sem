import greenfoot.*;

/**
 * Write a description of class Startscreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Startscreen extends World
{
    /**
     * Constructor for objects of class Startscreen.
     * 
     */
    public Startscreen()
    {    
        super(600, 400, 1); 
        addObject(new Schrift(),getWidth()/2,85);
        addObject(new Level(1),103,277);
        addObject(new Level(2),303,277);
        addObject(new Level(3),503,277);
        addObject(new Text("von Lixian Lao und Alexander Wiedemann"),200,385);
        addObject(new Text("Rechtsklick auf das Scoreboard, um nochmal zu spielen :)"),295,345);
        addObject(new Text("Das Ziel des Spiels ist es, alle Knöpfe zu drücken"),295,180);
        addObject(new Text("hinter denen sich keine Minen verbergen!"),295,210);
        addObject(new Rand(2,19,19,24,24,20),360,323);
        addObject(new Rand(3,19,19,24,24,20),554,323);
        addObject(new Rand(1,19,19,24,24,20),154,323);
        addObject(new Rand(4,34,34,105,105,270),561,166);
    }
    
    
}
