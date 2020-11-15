import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class gamepage extends JFrame{

	public JPanel tableCardPanel;
	public JPanel handCardPanel;

	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gamepage window = new gamepage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public gamepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.setBounds(10, 10, 1200, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		
		JLabel playerOne = new JLabel();
		Icon icon1=new ImageIcon("C:/Users/88698/Desktop/SDGing/picture/001.png");
		playerOne.setIcon(icon1);
		playerOne.setBounds(525, 10, 150, 150);
		this.getContentPane().add(playerOne);
		
		JLabel playerTwo = new JLabel();
		Icon icon2=new ImageIcon("C:/Users/88698/Desktop/SDGing/picture/002.png");
		playerTwo.setIcon(icon2);
		playerTwo.setBounds(675, 603, 150, 150);
		this.getContentPane().add(playerTwo);
		
		JLabel playerThree = new JLabel();
		Icon icon3=new ImageIcon("C:/Users/88698/Desktop/SDGing/picture/003.png");
		playerThree.setIcon(icon3);
		playerThree.setBounds(10, 325, 150, 150);
		this.getContentPane().add(playerThree);
		
		JLabel playerFour = new JLabel();
		Icon icon4=new ImageIcon("C:/Users/88698/Desktop/SDGing/picture/004.png");
		playerFour.setIcon(icon4);
		playerFour.setBounds(1026, 325, 150, 150);
		this.getContentPane().add(playerFour);
		
		tableCardPanel = new JPanel();
		tableCardPanel.setBounds(170, 214, 846, 337);
		this.getContentPane().add(tableCardPanel);
		tableCardPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JButton drawCard = new JButton("Draw Card");
		drawCard.setPreferredSize(new Dimension(200,330));
		drawCard.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				Random random = new Random();
				int s = random.nextInt(6)%(6-1+1) + 1;
				Card randomcard = new Card(s);
				handCardPanel.add(randomcard);
				handCardPanel.revalidate();
			}

		});
		tableCardPanel.add(drawCard);
		
		Icon takoyaki=new ImageIcon("C:/Users/88698/Desktop/SDGing/picture/takoyaki.png");
		JButton foodCardOne = new JButton(takoyaki);
		foodCardOne.setPreferredSize(new Dimension(200,330));
		tableCardPanel.add(foodCardOne);
		
		JButton foodCardTwo = new JButton("foodCardTwo可以嗎");
		foodCardTwo.setPreferredSize(new Dimension(200,330));
		tableCardPanel.add(foodCardTwo);
		
		JButton foodCardThree = new JButton("foodCardThree");
		foodCardThree.setPreferredSize(new Dimension(200,330));
		tableCardPanel.add(foodCardThree);
		
		handCardPanel = new JPanel();
		handCardPanel.setBounds(10, 564, 671, 199);
		this.getContentPane().add(handCardPanel);
		handCardPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		Card greencard = new Card(1);
		handCardPanel.add(greencard);
		
		Card yellowcard = new Card(2);
		handCardPanel.add(yellowcard);
		
		//Card greycard = new Card(3);
		//handCardPanel.add(greycard);
				
		Icon store = new ImageIcon("C:/Users/88698/Desktop/SDGing/picture/store.png");
		JButton storeButton = new JButton(store);
		storeButton.setBounds(20, 20, 150, 150);	
		storeButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				storeFrame sf = new storeFrame();
				sf.setVisible(true);
			}
		});
		this.getContentPane().add(storeButton);

		JPanel moneyPanel = new JPanel();
		moneyPanel.setBounds(826, 604, 179, 122);
		this.getContentPane().add(moneyPanel);
		moneyPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel moneyLabel = new JLabel("moneyLabel");
		Icon money=new ImageIcon("C:/Users/88698/Desktop/SDGing/picture/money.png");
		moneyLabel.setIcon(money);
		moneyLabel.setPreferredSize(new Dimension(60,100));
		moneyPanel.add(moneyLabel);
		
		JTextField textField = new JTextField("8");
		textField.setEditable(false);
		textField.setPreferredSize(new Dimension(450,100));
		textField.setFont(new Font(Font.DIALOG_INPUT,Font.BOLD,80));
		moneyPanel.add(textField);
		textField.setColumns(2);
		
		JButton endButton = new JButton("endButton");
		endButton.setBounds(1026, 603, 120, 120);
		this.getContentPane().add(endButton);
	}
}
