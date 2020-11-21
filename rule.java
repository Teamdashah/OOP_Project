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
		
		super("遊戲規則說明");
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
		String Demo1="<遊戲配件>";
		String Demo3="食材卡、攻防卡、餐點卡、錢幣";
		String Demo2="<遊戲流程>";
		String Demo="玩家開始進行遊戲時，手中會有兩張牌，是兩張食材卡。場上則會有三張餐點卡，玩家須分別依餐點卡牌上所需的食材出牌，賺取該餐點卡牌上標註的金額。要出牌前，先點擊手中要出的牌，再點擊場上的餐點卡，以完成出牌的動作"
		+ "。玩家每回合會先收取一張食材卡，當玩家手中的牌無法製作出餐點時"
		+ "則可選擇使用攻擊卡進行對其他玩家的攻擊。若無攻擊卡，則可直接輪到下一個選手進行遊戲。最先獲得6元的玩家即為獲勝。";

		// String Demo="玩家開始進行遊戲時，手中會有五張牌，分別是三張食材卡和兩張攻防卡。場上則會有三張餐點卡，玩家須分別依餐點卡牌上所需的食材出牌，賺取該餐點卡牌上標註的金額。要出牌前，先點擊手中要出的牌，再點擊場上的餐點卡，以完成出牌的動作"
		// + "。玩家每回合會先收取一張食材卡，當玩家手中的牌無法製作出餐點時"
		// + "則可選擇使用攻擊卡進行對其他玩家的攻擊。若無攻擊卡，則可直接輪到下一個選手進行遊戲。最先獲得8元的玩家即為獲勝。";
		
		
		jTextArea1 = new JTextArea(Demo1,2,1);
		// jTextArea1.setBackground(Color.lightGray);
		jTextArea1.setOpaque(false);
		jTextArea1.setEditable(false);
		jTextArea1.setFont(new Font("微軟正黑體",Font.BOLD,32));
		box.add(jTextArea1);

		jTextArea3 = new JTextArea(Demo3,2,1);
		// jTextArea1.setBackground(Color.lightGray);
		jTextArea3.setOpaque(false);
		jTextArea3.setEditable(false);
		jTextArea3.setFont(new Font("微軟正黑體",Font.BOLD,32));
		box.add(jTextArea3);

		jTextArea2 = new JTextArea(Demo2,2,1);
		// jTextArea2.setBackground(Color.lightGray);
		jTextArea2.setOpaque(false);
		jTextArea2.setEditable(false);
		jTextArea2.setFont(new Font("微軟正黑體",Font.BOLD,32));
		box.add(jTextArea2);

		jTextArea = new JTextArea(Demo,15,15);
		// jTextArea.setBackground(Color.lightGray);
		jTextArea.setOpaque(false);
		jTextArea.setLineWrap(true);
		jTextArea.setEditable(false);
		jTextArea.setFont(new Font("微軟正黑體",Font.BOLD,32));
		box.add((jTextArea));


		add(box);
	 
	    //add(new JScrollPane(jTextArea));
	    
	   
	}
}
