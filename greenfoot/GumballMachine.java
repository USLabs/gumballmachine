import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GumballMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GumballMachine extends Actor
{
    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 350, 400) ; 
    }

    public void act() 
    {
        if(Greenfoot.mouseClicked(this) && getWorldOfType(GumballWorld.class).insertedCoin!=null){           
            Coin coin = getWorldOfType(GumballWorld.class).insertedCoin;
                turnCrank(coin);
        }
        else {
            if (Greenfoot.mouseClicked(this) && getWorldOfType(GumballWorld.class).insertedCoin==null){
                Message msg = new Message();
                msg.setText("Insert a coin");
                getWorld().addObject(msg, 362, 277);
            }
        }
    }

    private void turnCrank(Coin insertedCoin){
       boolean isValid = ((Inspector)getWorld().getObjects(Inspector.class).get(0)).checkCoin();
       if(isValid){
            Picker p = ((Inspector)getWorld().getObjects(Inspector.class).get(0)).pickPicker();
            if(p !=null){
               p.pickAGumBall(); 
            }
        }
    }
}
