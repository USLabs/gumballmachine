import greenfoot.*;
//import java.awt.Color;

public class Message extends Actor 
{
    private String messageText;

    private void updateMessage()
    {
        setImage(new GreenfootImage(this.messageText, 30, Color.BLACK, Color.RED));
    }
    
    public void setText(String strText){  
      this.messageText = strText;
      updateMessage();
    } 
}
