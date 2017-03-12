import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Picker extends Alien
{
    Message myMessage = new Message();
    
    public void pickAGumBall(){
    myMessage.setText("I am going to pick!");
    Coin myCoin = getWorldOfType(GumballWorld.class).insertedCoin;    
        if(myCoin==null){
        getWorldOfType(GumballWorld.class).addObject(myMessage, 664, 138);
        myMessage.setText("No Coin. Insert one!");
    }
    
   //AT the End, remove coin instance from machine
    getWorldOfType(GumballWorld.class).insertedCoin = null;
}
    
    /**
     * Act - do whatever the Picker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
}
