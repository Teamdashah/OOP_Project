import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.border.Border;
import java.util.HashMap;

public class gamepage extends JFrame{

	public JPanel tableCardPanel;
	public JPanel handCardPanel;
	public Card bluecard;
	public Card greycard;
	public JTextField textField;
	private static HashMap table;
	private boolean draw;
	public static final int PAUSE1 = 1500;
	public static final int PAUSE2 = 5000;
	JLabel playeronemotion ;
	JLabel playertwomotion ;
	JLabel playerthreemotion ;
	
	public gamepage() 
	{	
		table = new HashMap();
        table.put(1,"green");
        table.put(2,"yellow");
        table.put(3,"grey");
        table.put(4,"purple");
        table.put(5,"red");
        table.put(6,"blue");

		initialize();
	}

    private class computerturn extends Thread {
	
		@Override
        public void run() {
			
			playeronemotion.setText("Drawing card");
			playeronemotion.setForeground(Color.WHITE);
			playeronemotion.setFont(new Font("Calibri",Font.BOLD,20));
			add(playeronemotion);
			doNothing(PAUSE1);
			playeronemotion.setText("I am playing now");
			doNothing(PAUSE2);
			playeronemotion.setText("End my round");
			doNothing(PAUSE1);
			playeronemotion.setText("");
			playertwomotion.setText("Drawing card");
			playertwomotion.setForeground(Color.WHITE);
			playertwomotion.setFont(new Font("Calibri",Font.BOLD,20));
			add(playertwomotion);
			doNothing(PAUSE1);
			playertwomotion.setText("I am playing now");
			doNothing(PAUSE2);
			playertwomotion.setText("End my round");
			doNothing(PAUSE1);
			playertwomotion.setText("");
			playerthreemotion.setText("Drawing card");
			playerthreemotion.setForeground(Color.WHITE);
			playerthreemotion.setFont(new Font("Calibri",Font.BOLD,20));
			add(playerthreemotion);
			doNothing(PAUSE1);
			playerthreemotion.setText("I am playing now");
			doNothing(PAUSE2);
			playerthreemotion.setText("End my round");
			doNothing(PAUSE1);
			playerthreemotion.setText("");
			draw = true;
		}
	}

	private class tipsWindow extends JFrame implements ActionListener
	{
		public tipsWindow()
		{
			super("Drawing card point");
			setSize(500, 400);
			getContentPane().setBackground(Color.lightGray);
			setLayout(new BorderLayout());
			JLabel tipsLabel = new JLabel("The card has been drawn!");
			tipsLabel.setFont(new Font("Calibri",Font.BOLD,32));
			add(tipsLabel, BorderLayout.CENTER);
			JPanel buttonPanel = new JPanel();
			buttonPanel.setBackground(Color.lightGray);
			buttonPanel.setLayout(new FlowLayout());
			JButton tipsButton = new JButton("OK");
			tipsButton.setFont(new Font("Calibri",Font.BOLD,20));
			tipsButton.addActionListener(this);
			buttonPanel.add(tipsButton);
			add(buttonPanel, BorderLayout.SOUTH);
		}
		public void actionPerformed(ActionEvent e)
		{
		String actionCommand = e.getActionCommand();
		if (actionCommand.equals("OK"))
		dispose(); 
		}

	}
	private class exitWindow extends JFrame implements ActionListener
	{
		public exitWindow()
		{
			super("Exit point");
			setSize(500, 400);
			getContentPane().setBackground(Color.lightGray);
			setLayout(new BorderLayout());
			JLabel exitLabel = new JLabel("Are you sure you want to end"
			+" your round?");
			exitLabel.setFont(new Font("Calibri",Font.BOLD,20));
			add(exitLabel, BorderLayout.CENTER);
			JPanel exitPanel = new JPanel();
			exitPanel.setBackground(Color.lightGray);
			exitPanel.setLayout(new FlowLayout());
			JButton yesButton = new JButton("Yes");
			yesButton.setFont(new Font("Calibri",Font.BOLD,20));
			yesButton.addActionListener(this);
			exitPanel.add(yesButton);
			JButton noButton = new JButton("No");
			noButton.setFont(new Font("Calibri",Font.BOLD,20));
			noButton.addActionListener(this);
			exitPanel.add(noButton);
			add(exitPanel, BorderLayout.SOUTH);
		}	
		public void actionPerformed(ActionEvent e)
		{
		String actionCommand = e.getActionCommand();
		if (actionCommand.equals("Yes"))
		{
			computerturn computerturn = new computerturn();
			computerturn.start();
			dispose();
		}
		else if (actionCommand.equals("No"))
		dispose(); 
		}
	}

	private void initialize() {
		
		this.setBounds(10, 10, 1200, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		ImageIcon background = new ImageIcon("picture/background.png");
		JLabel label = new JLabel(background);
		label.setBounds(0, 0, this.getWidth(), this.getHeight());
		JPanel imagePanel = (JPanel) this.getContentPane();
		imagePanel.setOpaque(false);
		this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
		
		JLabel playerOne = new JLabel();
		Icon icon1=new ImageIcon("picture/001.png");
		playerOne.setIcon(icon1);
		playerOne.setBounds(525, 10, 150, 150);
		this.getContentPane().add(playerOne);

		playertwomotion = new JLabel();
		playertwomotion.setOpaque(false);
		playertwomotion.setBounds(680, 25, 300, 100);
		this.getContentPane().add(playertwomotion);
		
		JLabel playerTwo = new JLabel();
		Icon icon2=new ImageIcon("picture/002.png");
		playerTwo.setIcon(icon2);
		playerTwo.setBounds(675, 603, 150, 150);
		this.getContentPane().add(playerTwo);
		
		JLabel playerThree = new JLabel();
		Icon icon3=new ImageIcon("picture/003.png");
		playerThree.setIcon(icon3);
		playerThree.setBounds(10, 325, 150, 150);
		this.getContentPane().add(playerThree);

		playerthreemotion = new JLabel();
		playerthreemotion.setOpaque(false);
		playerthreemotion.setBounds(10, 230, 300, 100);
		this.getContentPane().add(playerthreemotion);
		
		JLabel playerFour = new JLabel();
		Icon icon4=new ImageIcon("picture/004.png");
		playerFour.setIcon(icon4);
		playerFour.setBounds(1026, 325, 150, 150);
		this.getContentPane().add(playerFour);

		playeronemotion = new JLabel();
		playeronemotion.setOpaque(false);
		playeronemotion.setBounds(1000, 230, 300, 100);
		this.getContentPane().add(playeronemotion);
		
		tableCardPanel = new JPanel();
		tableCardPanel.setBounds(170, 214, 846, 337);
		this.getContentPane().add(tableCardPanel);
		tableCardPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		tableCardPanel.setOpaque(false);
		
		Icon button=new ImageIcon("picture/button.png");
  		JButton drawCard = new JButton(button);
		drawCard.setBorderPainted(false);
		drawCard.setContentAreaFilled(false); 
		drawCard.setOpaque(false);
		draw = true ;
		drawCard.setPreferredSize(new Dimension(200,330));
		drawCard.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				Random random = new Random();
				int s = random.nextInt(6)%(6-1+1) + 1;
				Card randomcard = new Card(s);
				randomcard.addMouseListener(new MouseAdapter(){
					//@Override
					public void mouseClicked(MouseEvent e)
					{
						super.mouseClicked(e);
		
						if(randomcard.getonclick()==true)
						{
							randomcard.setonclick(false);
							// Border whiteline = BorderFactory.createLineBorder(Color.white);
							randomcard.setBorder(null);
							//System.out.println(randomcard.getNumber());
						}
						else if(randomcard.getonclick()==false)
						{
							randomcard.setonclick(true);
							Border whiteline = BorderFactory.createLineBorder(Color.white);
							randomcard.setBorder(whiteline);
							//System.out.println(randomcard.getNumber());
						}
						
					}
				});
				if(draw == true)
				{
				handCardPanel.add(randomcard);
				handCardPanel.revalidate();
				draw = false;
				}
				else
				{
					tipsWindow tips = new tipsWindow();
					tips.setVisible(true);
				}
				
			}

		});
		tableCardPanel.add(drawCard);
		
		foodCard foodCardOne = new foodCard(3,6,1);
		foodCardOne.setPreferredSize(new Dimension(200,330));
		foodCardOne.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				
				if(bluecard.getonclick()==true && greycard.getonclick()==true)
				{

					Icon beefsoup = new ImageIcon("picture/beefsoup.png");
					foodCardOne.setIcon(beefsoup);
					textField.setText(Integer.toString(Integer.valueOf(textField.getText())+foodCardOne.getDollars()));
					handCardPanel.remove(bluecard);
					handCardPanel.remove(greycard);
					handCardPanel.repaint();
				}
			}

		});
		tableCardPanel.add(foodCardOne);
		
		Icon chicken=new ImageIcon("picture/chicken.png");
		JButton foodCardTwo = new JButton(chicken);
		foodCardTwo.setPreferredSize(new Dimension(200,330));
		tableCardPanel.add(foodCardTwo);
		
		Icon HotPot=new ImageIcon("picture/HotPot.png");
		JButton foodCardThree = new JButton(HotPot);
		foodCardThree.setPreferredSize(new Dimension(200,330));
		tableCardPanel.add(foodCardThree);
		
		handCardPanel = new JPanel();
		handCardPanel.setBounds(10, 564, 671, 199);
		this.getContentPane().add(handCardPanel);
		handCardPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		handCardPanel.setOpaque(false);
		
		bluecard = new Card(6);
		bluecard.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e)
			{
				super.mouseClicked(e);

				if(bluecard.getonclick()==true)
				{
					bluecard.setonclick(false);
        			bluecard.setBorder(null);
				}
				else if(bluecard.getonclick()==false)
				{
					bluecard.setonclick(true);
        			Border whiteline = BorderFactory.createLineBorder(Color.white);
					bluecard.setBorder(whiteline);
				}
				
			}
		});
		handCardPanel.add(bluecard);
		
		greycard = new Card(3);
		greycard.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e)
			{
				super.mouseClicked(e);
				if(greycard.getonclick()==true)
				{
					greycard.setonclick(false);
        			greycard.setBorder(null);
				}
				else if(greycard.getonclick()==false)
				{
					greycard.setonclick(true);
        			Border whiteline = BorderFactory.createLineBorder(Color.white);
        			greycard.setBorder(whiteline);
				}
			}
		});
		handCardPanel.add(greycard);
						
		Icon store = new ImageIcon("picture/store.png");
		JButton storeButton = new JButton(store);
		storeButton.setBounds(20, 20, 150, 150);
		storeButton.setBorderPainted(false);
		storeButton.setContentAreaFilled(false);	
		storeButton.setOpaque(false);	          //Button設置為透明
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
		moneyPanel.setOpaque(false);
		
		JLabel moneyLabel = new JLabel("moneyLabel");
		Icon money=new ImageIcon("picture/money.png");
		moneyLabel.setIcon(money);
		moneyLabel.setPreferredSize(new Dimension(60,100));
		moneyPanel.add(moneyLabel);
		
		textField = new JTextField("0");
		textField.setEditable(false);
		textField.setPreferredSize(new Dimension(450,100));
		textField.setFont(new Font(Font.DIALOG_INPUT,Font.BOLD,80));
		moneyPanel.add(textField);
		textField.setColumns(2);
		
		JButton endButton = new JButton("next player");
		endButton.setBounds(1026, 603, 120, 120);
		endButton.setBackground(Color.YELLOW);
		this.getContentPane().add(endButton);
		endButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				exitWindow exit = new exitWindow();
				exit.setVisible(true);		
			}
		});
	}
	public void doNothing(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.out.println("Unexpected interruption");
            System.exit(0);
        }
        //repaint();
    }
}
