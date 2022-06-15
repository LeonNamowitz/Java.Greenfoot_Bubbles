import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A bit of empty space for bubbles to float in.
 * 
 * @author Michael Kölling
 * @version 1.0
 */
public class Space extends World
{
    /**
     * Create Space. Make it black.
     */
    public Space()
    {
        super(900, 600, 1);
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        setup();
    }

    private void setup()
    {
        // for (int i = 0; i < 21; i++)    {
        //     addObject(new Bubble(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));

        // }

        for (int i = 0; i < 10; i++)    {
            addObject(new Bubble((Greenfoot.getRandomNumber(40) + 10), (Greenfoot.getRandomNumber(360))), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));

        }
    }
}
