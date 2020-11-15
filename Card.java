import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;

public class Card extends JLabel
{
    private int number;
    private boolean onclick;

    public Card(int number)
    {
        this.number=number;
        this.onclick = false;

        if(number==1)
        {
            Icon green=new ImageIcon("C:/Users/88698/Desktop/SDGing/picture/green.png");
		    setIcon(green);
		    setPreferredSize(new Dimension(100,180));
        }
        else if(number==2)
        {
            Icon yellow=new ImageIcon("C:/Users/88698/Desktop/SDGing/picture/yellow.png");
		    setIcon(yellow);
		    setPreferredSize(new Dimension(100,180));
        }
        else if(number==3)
        {
            Icon grey=new ImageIcon("C:/Users/88698/Desktop/SDGing/picture/grey.png");
		    setIcon(grey);
		    setPreferredSize(new Dimension(100,180));
        }
        else if(number==4)
        {
            Icon purple=new ImageIcon("C:/Users/88698/Desktop/SDGing/picture/purple.png");
		    setIcon(purple);
		    setPreferredSize(new Dimension(100,180));
        }
        else if(number==5)
        {
            Icon red=new ImageIcon("C:/Users/88698/Desktop/SDGing/picture/red.png");
		    setIcon(red);
		    setPreferredSize(new Dimension(100,180));
        }
        else if(number==6)
        {
            Icon blue=new ImageIcon("C:/Users/88698/Desktop/SDGing/picture/blue.png");
		    setIcon(blue);
		    setPreferredSize(new Dimension(100,180));
        }
    }

    public int getNumber(){
        return this.number;
    }
    public boolean getonclick(){
        return this.onclick;
    }
    public void setonclick(boolean onclick){
        this.onclick = onclick;
    }
}
