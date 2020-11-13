package hw01;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class rule extends JFrame {
	public static final int WIDTH=800;
	public static final int HEIGHT=600;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			rule gui=new rule();
			gui.setVisible(true);
	}

	public rule()
	{
		
		super("遊戲規則說明");
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		//setLayout(new BorderLayout());
		String Demo="玩家開始進行遊戲時，手中會有五張牌，分別是三張食材卡和兩張攻防卡。場上則會有三張餐點卡，玩家須分別依餐點卡牌上所需的食材出牌，賺取該餐點卡牌上標註的金額。要出牌前，先點擊手中要出的牌，再點擊場上的餐點卡，以完成出牌的動作"
				+ "。玩家每回合會先收取一張食材卡，當玩家手中的牌無法製作出餐點時"
				+ "則可選擇使用攻擊卡進行對其他玩家的攻擊。若無攻擊卡，則可直接輪到下一個選手進行遊戲。最先獲得8元的玩家即為獲勝。";
		
		JTextArea jTextArea = new JTextArea(Demo,15,15);
		jTextArea.setLineWrap(true);
		jTextArea.setEditable(false);
		jTextArea.setFont(new Font("微軟正黑體",Font.BOLD,32));
	 
	    add(new JScrollPane(jTextArea));
	    
	   
	}
}
