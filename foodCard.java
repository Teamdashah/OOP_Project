import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;

public class foodCard extends JButton
{
    private int dollars;

    public foodCard(int firstCard,int secondCard,int dollars)
    {
        this.dollars = dollars;
        if(firstCard==3&&secondCard==6)
        {
            Icon takoyaki=new ImageIcon("./picture/takoyaki.png");
            setIcon(takoyaki);
        }
    }
    
    /*public void foodCard(int firstCard,int secondCard,int thirdCard)
    {

    }

    public void foodCard(int firstCard,int secondCard,int thirdCard,int fourthCard)
    {

    }*/

    public int getDollars()
    {
        return this.dollars;
    }
}
