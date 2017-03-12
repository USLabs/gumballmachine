import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Write a description of class RandomPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomPicker extends Picker
{
    /**
     * Act - do whatever the RandomPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }  
    
    public void pickAGumBall(){
        super.pickAGumBall();
        ArrayList<Gumball> allGumballs = new ArrayList<>();
        Random rand = new Random();
        getWorld().addObject(super.myMessage, 630, 150);
        allGumballs.add(new BlueGumball());
        allGumballs.add(new GreenGumball());
        allGumballs.add(new RedGumball());
        Gumball b = allGumballs.get(rand.nextInt(allGumballs.size()));
        getWorld().addObject(b, 330, 530);
    }
}