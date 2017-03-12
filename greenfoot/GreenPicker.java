import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class GreenPicker extends Picker
{
    /**
     * Act - do whatever the GreenPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }   
    
    public void pickGumBall(){ 
        super.pickAGumBall();
        getWorld().addObject(new GreenGumball(), 328, 514);        
        getWorld().addObject(super.myMessage, 680, 534);   
    }
}
