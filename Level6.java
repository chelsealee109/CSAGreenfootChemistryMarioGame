import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level6 extends World
{
    /**
     * Constructor for objects of class Level6.
     * 
     */
    public Level6()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        setBackground("level6start.png");
        showText(""+Levels.numLives,750/2+10,325);
    }
    public void act()
    {
        Greenfoot.delay(200);
        Level6Final l = new Level6Final();
        Greenfoot.setWorld(l);
    }
}
