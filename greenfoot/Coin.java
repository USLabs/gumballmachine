import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List; 

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Coin extends Actor
{

    public void act() 
    {
        int mouseX, mouseY ;
        
        if(Greenfoot.mouseDragged(this)) {          
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();  
            setLocation(mouseX, mouseY);  
            
            insertCoin(mouseX,mouseY);
            getWorldOfType(GumballWorld.class).insertedCoin = this;
        } 
    }  
    
    private void insertCoin(int mouseX, int mouseY){
         if(mouseX>350){
             World w = getWorld();
             List<Message> messageActors = getWorld().getObjects(Message.class);
             w.removeObjects(messageActors);
             List<Gumball> gumballs = getWorld().getObjects(Gumball.class);
             w.removeObjects(gumballs);
             Message msg = new Message();
             msg.setText("Have Coin!");
             w.addObject(msg, 359, 268);
             w.removeObject(this);
             w.removeObject(msg);
            }
    }
}
