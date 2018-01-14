import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    //x-coordinates for the instrument/indicator lines
    int x1=190;
    int xgap=60;
    int x2=x1+xgap;
    int x3=x2+xgap;
    int x4=x3+xgap;
    int x5=x4+xgap;
    int x6=x5+xgap;
    int x7=x6+xgap;
    int x8=x7+xgap;
    int x9=x8+xgap;
    int x10=x9+xgap;
    int x11=x10+xgap;
    int x12=x11+xgap;
    int x13=x12+xgap;
    int x14=x13+xgap;
    int x15=x14+xgap;
    int x16=x15+xgap;
    //y-coordinates for the instrument/indicator lines
    int y1=200;
    int ygap=75;
    int y2=y1+ygap;
    int y3=y2+ygap;
    int y4=y3+ygap;
    int y5=y4+ygap;
    public MyWorld()
    {    
        // Create a new world with 1280x720 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        //add kicks
        addObject(new Kick1(),x1, y1);
        addObject(new Kick2(),x2, y1);
        addObject(new Kick3(),x3, y1);
        addObject(new Kick4(),x4, y1);
        addObject(new Kick5(),x5, y1);
        addObject(new Kick6(),x6, y1);
        addObject(new Kick7(),x7, y1);
        addObject(new Kick8(),x8, y1);
        addObject(new Kick9(),x9, y1);
        addObject(new Kick10(),x10, y1);
        addObject(new Kick11(),x11, y1);
        addObject(new Kick12(),x12, y1);
        addObject(new Kick13(),x13, y1);
        addObject(new Kick14(),x14, y1);
        addObject(new Kick15(),x15, y1);
        addObject(new Kick16(),x16, y1);
        //add snares
        addObject(new Snare1(),x1, y2);
        addObject(new Snare2(),x2, y2);
        addObject(new Snare3(),x3, y2);
        addObject(new Snare4(),x4, y2);
        addObject(new Snare5(),x5, y2);
        addObject(new Snare6(),x6, y2);
        addObject(new Snare7(),x7, y2);
        addObject(new Snare8(),x8, y2);
        addObject(new Snare9(),x9, y2);
        addObject(new Snare10(),x10, y2);
        addObject(new Snare11(),x11, y2);
        addObject(new Snare12(),x12, y2);
        addObject(new Snare13(),x13, y2);
        addObject(new Snare14(),x14, y2);
        addObject(new Snare15(),x15, y2);
        addObject(new Snare16(),x16, y2);
        //add hats
        addObject(new Hat1(),x1, y3);
        addObject(new Hat2(),x2, y3);
        addObject(new Hat3(),x3, y3);
        addObject(new Hat4(),x4, y3);
        addObject(new Hat5(),x5, y3);
        addObject(new Hat6(),x6, y3);
        addObject(new Hat7(),x7, y3);
        addObject(new Hat8(),x8, y3);
        addObject(new Hat9(),x9, y3);
        addObject(new Hat10(),x10, y3);
        addObject(new Hat11(),x11, y3);
        addObject(new Hat12(),x12, y3);
        addObject(new Hat13(),x13, y3);
        addObject(new Hat14(),x14, y3);
        addObject(new Hat15(),x15, y3);
        addObject(new Hat16(),x16, y3);
        //add claps
        addObject(new Clap1(),x1,y4);
        addObject(new Clap2(),x2,y4);
        addObject(new Clap3(),x3,y4);
        addObject(new Clap4(),x4,y4);
        addObject(new Clap5(),x5,y4);
        addObject(new Clap6(),x6,y4);
        addObject(new Clap7(),x7,y4);
        addObject(new Clap8(),x8,y4);
        addObject(new Clap9(),x9,y4);
        addObject(new Clap10(),x10,y4);
        addObject(new Clap11(),x11,y4);
        addObject(new Clap12(),x12,y4);
        addObject(new Clap13(),x13,y4);
        addObject(new Clap14(),x14,y4);
        addObject(new Clap15(),x15,y4);
        addObject(new Clap16(),x16,y4);
        //add Indikatorzeile
        addObject(new Indi1(),x1, y5);
        addObject(new Indi2(),x2, y5);
        addObject(new Indi3(),x3, y5);
        addObject(new Indi4(),x4, y5);
        addObject(new Indi5(),x5, y5);
        addObject(new Indi6(),x6, y5);
        addObject(new Indi7(),x7, y5);
        addObject(new Indi8(),x8, y5);
        addObject(new Indi9(),x9, y5);
        addObject(new Indi10(),x10,y5);
        addObject(new Indi11(),x11, y5);
        addObject(new Indi12(),x12, y5);
        addObject(new Indi13(),x13, y5);
        addObject(new Indi14(),x14, y5);
        addObject(new Indi15(),x15, y5);
        addObject(new Indi16(),x16, y5);
        //add Taktgeber
        addObject(new Taktgeber(), 640, 100);
        System.out.println("BPM ="+Taktgeber.bpm);
        System.out.println("Time between two 1/8 notes ="+Taktgeber.Timestepms+" ms");
        //add bpmcontrols
        addObject(new Bpmindi(),640,30);
        addObject(new Minus10(),640-140,30);
        addObject(new Minus1(),640-80,30);
        addObject(new Plus1(),640+80,30);
        addObject(new Plus10(),640+140,30);
        

    }
}
