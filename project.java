import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class project extends JFrame implements ActionListener
{
    public static final int WIDTH = 650;
    public static final int HEIGHT = 650;

    public static void main(String[] args)
    {
        project gui = new project();
        gui.setVisible(true);
    }
    public project()
    {
        setSize(WIDTH,HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("SDGinseng");
        setLayout(new BorderLayout());
      
        startPage panel = new startPage();
        
        JButton startButton = new JButton("gg");
        JButton introButton = new JButton("ff");
        panel.setLayout(null);

        startButton.setBounds(100, 435, 175, 70);
        startButton.setOpaque(false);
        //startButton.setContentAreaFilled(false);
        startButton.addActionListener(this);

        introButton.setBounds(370, 435, 175, 70);
        introButton.setOpaque(false);
        //introButton.setContentAreaFilled(false);
        introButton.addActionListener(this);
        panel.add(startButton);
        panel.add(introButton);

        add(panel);
    }
    class startPage extends JPanel
    {
        ImageIcon sdgin = new ImageIcon("coverpage.jpg");
        Image sdg = sdgin.getImage();

        public startPage()
        {}
        public void paint(Graphics g)
        {
            g.drawImage(sdg,0,0,null);
        }
    }

    public class window extends JFrame
    {
        public window()
        {
            setSize(100,100);
            setLayout(new BorderLayout());
            JLabel textlabel = new JLabel("fuck");
            add(textlabel,BorderLayout.CENTER);
        }
    }
    public void actionPerformed(ActionEvent e)
    {
        String actionCommand = e.getActionCommand();
        if(actionCommand.equals("gg"))
        {
            window wd = new window();
            wd.setVisible(true);
        }
        else if(actionCommand.equals("ff"))
        {
            window wd = new window();
            wd.setVisible(true);
        }
    }
     
}