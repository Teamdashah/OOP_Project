import javax.swing.JFrame;
//import hw01.rule;
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
        //setResizable(false);
        setTitle("SDGinseng");
        setLayout(new BorderLayout());
      
        startPage panel = new startPage();
        
        JButton startButton = new JButton("gg");
        JButton introButton = new JButton("ff");
        panel.setLayout(null);

        startButton.setBounds(660, 690, 270, 110);
        startButton.setOpaque(false);
        //startButton.setContentAreaFilled(false);
        startButton.addActionListener(this);

        introButton.setBounds(1080, 690, 270, 110);
        introButton.setOpaque(false);
        //introButton.setContentAreaFilled(false);
        introButton.addActionListener(this);
        panel.add(startButton);
        panel.add(introButton);

        add(panel);
    }
    class startPage extends JPanel
    {
        ImageIcon sdgin = new ImageIcon("./picture/coverpage.jpg");
        Image sdg = sdgin.getImage();

        public startPage()
        {}
        public void paint(Graphics g)
        {
            g.drawImage(sdg,500,0,null);
        }
    }

    public void actionPerformed(ActionEvent e)
    {
        String actionCommand = e.getActionCommand();
        if(actionCommand.equals("gg"))
        {
            rule rrr = new rule();
            rrr.setVisible(true);
        }
        else if(actionCommand.equals("ff"))
        {
            gamepage gp = new gamepage();
            gp.setVisible(true);
            dispose();
        }
    }
     
}