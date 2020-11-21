import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color.*;
import javax.swing.Box;

public class rule extends JFrame {
	public static final int WIDTH=1000;
	public static final int HEIGHT=750;
	private final JTextArea jTextArea1;
	private final JTextArea jTextArea2;
	private final JTextArea jTextArea3;
	private final JTextArea jTextArea;

	public rule()
	{
		
		super("rule");
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// this.getContentPane().setBackground(Color.blue);
		ImageIcon background = new ImageIcon("picture/ginseng.png");
		JLabel label = new JLabel(background);
		label.setBounds(0, 0, this.getWidth(), this.getHeight());
		JPanel imagePanel = (JPanel) this.getContentPane();
		imagePanel.setOpaque(false);
		this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
		// setLayout(new BorderLayout());
		Box box = Box.createVerticalBox();
		String Demo1="<Game component>";
		String Demo3="Ingredients card, offensive and defensive card, meal card, coin";
		String Demo2="<Game flow>";
		String Demo="When the player starts the game, there will be two cards in his hand, which are two ingredient cards. There will be three meal cards on the field. Players must draw cards based on the ingredients required on the meal card to earn the amount marked on the meal card. Before playing a card, first click on the card you want to play, and then click the meal card on the field to complete the action of playing the card"
		+ ".Players will first collect an ingredient card every round, when the card in the player’s hand cannot be used to make a meal"
		+ "You can choose to use attack cards to attack other players. If there is no attack card, the next player can directly play the game. The first player to get $6 wins.";
		
		
		jTextArea1 = new JTextArea(Demo1,2,1);
		// jTextArea1.setBackground(Color.lightGray);
		jTextArea1.setOpaque(false);
		jTextArea1.setEditable(false);
		jTextArea1.setFont(new Font("Calibri",Font.BOLD,28));
		box.add(jTextArea1);

		jTextArea3 = new JTextArea(Demo3,2,1);
		// jTextArea1.setBackground(Color.lightGray);
		jTextArea3.setOpaque(false);
		jTextArea3.setLineWrap(true);
		jTextArea3.setEditable(false);
		jTextArea3.setFont(new Font("Calibri",Font.BOLD,28));
		box.add(jTextArea3);

		jTextArea2 = new JTextArea(Demo2,2,1);
		// jTextArea2.setBackground(Color.lightGray);
		jTextArea2.setOpaque(false);
		jTextArea2.setEditable(false);
		jTextArea2.setFont(new Font("Calibri",Font.BOLD,28));
		box.add(jTextArea2);

		jTextArea = new JTextArea(Demo,15,15);
		// jTextArea.setBackground(Color.lightGray);
		jTextArea.setOpaque(false);
		jTextArea.setLineWrap(true);
		jTextArea.setEditable(false);
		jTextArea.setFont(new Font("Calibri",Font.BOLD,28));
		box.add((jTextArea));


		add(box);
	 
	    //add(new JScrollPane(jTextArea));
	    
	   
	}
}
