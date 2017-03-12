import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Inspector extends Alien
{
    /**
     * Act - do whatever the Inspector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
  
    }    
    
    public boolean checkCoin(){
        Coin myCoin = getWorldOfType(GumballWorld.class).insertedCoin;
        int mX = getX(), mY = getY() + 25;Message message = new Message();boolean isValid=false;
        if(myCoin instanceof Quarter){
           if((Quarter)myCoin instanceof FakeQuarter ){
                getWorld().addObject(message, mX, mY);
                message.setText("Fake Quarter detected !");                 
            }
        else
            isValid = true;
        }
        else 
        {
            if(myCoin instanceof Penny){
                getWorld().addObject(message, mX, mY);
                message.setText("You have inserted penny. Need more");             
            }
        }
        return isValid;
    }
    
    public Picker pickPicker(){
        ArrayList<Picker> pickerList = new ArrayList<>();
        Random rand = new Random();
        RandomPicker rPicker =((RandomPicker)getWorld().getObjects(RandomPicker.class).get(0));
        GreenPicker gPicker =((GreenPicker)getWorld().getObjects(GreenPicker.class).get(0));
        pickerList.add(rPicker);
        pickerList.add(gPicker);        
        return pickerList.get(rand.nextInt(pickerList.size()));
    }
}