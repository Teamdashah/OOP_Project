 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
  public class storeFrame extends JFrame implements ActionListener{
  	  public static final int WIDTH =500; 
  	  public static final int HEIGHT = 400;
  	  public JPanel attackCardPanel;//上方放置攻擊卡的panel
  	  public JPanel defenseCardPanel;//下方放置防禦卡的panel
  	  public JButton attackCard_1;
  	  public JButton attackCard_2;
  	  public JButton attackCard_3;
  	  public JButton attackCard_4;
  	  public JButton attackCard_5;
  	  public JButton attackCard_6;
  	  public static void main(String[] args){
  	  	  storeFrame gui =new storeFrame();
  	  	  gui.setVisible(true);
  	  }
  	  public storeFrame(){
  	  	  super("Store");
  	  	  setSize(WIDTH,HEIGHT);
  	  	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  	  	  setLayout(new GridLayout(2, 1));//把整個JFrame切成兩個panel
  	  	  
  	  	  //****upContentPanel--attackCard****//
  	  	  JPanel upContentPanel= new JPanel();//上面的panel
  	  	  upContentPanel.setLayout(new BorderLayout());
  	  	  attackCardPanel = new JPanel();//擺放卡片的panel
  	  	  attackCardPanel.setBackground(new Color(100,100,150));
  	  	  ImageIcon attack_icon_1 = new ImageIcon("Store/attack1.jpg");
  	  	  ImageIcon attack_icon_2 = new ImageIcon("Store/attack2.jpg");
  	  	  ImageIcon attack_icon_3 = new ImageIcon("Store/attack3.jpg");
  	  	  ImageIcon attack_icon_4 = new ImageIcon("Store/attack4.jpg");
  	  	  ImageIcon attack_icon_5 = new ImageIcon("Store/attack5.jpg");
  	  	  ImageIcon attack_icon_6 = new ImageIcon("Store/attack6.jpg");
  	  	  attackCard_1 = new JButton(attack_icon_1);
  	  	  attackCard_1.addActionListener(new ActionListener(){ 
  	  	  	  public void actionPerformed(ActionEvent e) {
  	  	  	  	  window_attackCard_1 window_1 = new window_attackCard_1();
  	  	  	  }
  	  	  }
  	  	  );
  	
  	  	 /* Image icontemp_1 = icon_1.getImage().getScaledInstance(attackCard_1.getWidth(0),
				attackCard_1.getHeight(0), icon_1.getImage().SCALE_DEFAULT);
		  icon_1 = new ImageIcon(icontemp_1);*/
  
  	  	  //JButton attackCard_1 = new JButton();
  	  	  //attackCard_1.setPreferredSize(new Dimension(icon_1.getIconWidth(), icon_1.getIconHeight()));
  	  	  attackCard_2 = new JButton(attack_icon_2);
  	  	  attackCard_3 = new JButton(attack_icon_3);
  	  	  attackCard_4 = new JButton(attack_icon_4);
  	  	  attackCard_5 = new JButton(attack_icon_5);
  	  	  attackCard_6 = new JButton(attack_icon_6);
  	  	  attackCardPanel.setLayout(new GridLayout(1,6,10,5));//切成1,6(後面兩個數字為component之間水平跟垂直的距離GridLayout(int rows, int cols, int hgap, int vgap))
  	  	  attackCardPanel.setBorder(BorderFactory.createEmptyBorder(20,30,20,30));//上左下右(component跟container的距離)
  	  	  attackCardPanel.add(attackCard_1);
  	  	  attackCardPanel.add(attackCard_2);
  	  	  attackCardPanel.add(attackCard_3);
  	  	  attackCardPanel.add(attackCard_4);
  	  	  attackCardPanel.add(attackCard_5);
  	  	  attackCardPanel.add(attackCard_6);
  	  	  upContentPanel.add(attackCardPanel,BorderLayout.CENTER);//將attackCardPanel加到upContentPanel內，並設在中心
  	  	  JPanel upEmptyPanel_1= new JPanel();//為了製造attackCardPanel右邊空隙而建的panel(EAST),讓upContentPanel呈現出來
  	  	  JPanel upEmptyPanel_2= new JPanel();//為了製造attackCardPanel左邊空隙而建的panel(WEST),讓upContentPanel呈現出來
  	  	  upContentPanel.add(upEmptyPanel_1,BorderLayout.EAST);
  	  	  upContentPanel.add(upEmptyPanel_2,BorderLayout.WEST);
  	  	  add(upContentPanel);//將upContentPanel加到JFrame中
  	  	  
  	  	   //****downContentPanel--defenseCard****//
  	  	   JPanel downContentPanel= new JPanel();//下面的panel
  	  	  downContentPanel.setLayout(new BorderLayout());
  	  	  defenseCardPanel= new JPanel();//擺放卡片的panel
  	  	  defenseCardPanel.setBackground(new Color(100,100,150));
  	  	  ImageIcon defense_icon_1 = new ImageIcon("Store/defense1.jpg");
  	  	  ImageIcon defense_icon_2 = new ImageIcon("Store/defense2.jpg");
  	  	  ImageIcon defense_icon_3 = new ImageIcon("Store/defense3.jpg");
  	  	  ImageIcon defense_icon_4 = new ImageIcon("Store/defense4.jpg");
  	  	  JButton defenseCard_1 = new JButton(defense_icon_1);
  	  	  JButton defenseCard_2 = new JButton(defense_icon_2);
  	  	  JButton defenseCard_3 = new JButton(defense_icon_3);
  	  	  JButton defenseCard_4 = new JButton(defense_icon_4);
  	  	  defenseCardPanel.setLayout(new GridLayout(1,4,10,5));//切成1,6(後面兩個數字為component之間水平跟垂直的距離GridLayout(int rows, int cols, int hgap, int vgap))
  	  	  defenseCardPanel.setBorder(BorderFactory.createEmptyBorder(20,30,20,30));//上左下右(component跟container的距離)
  	  	  defenseCardPanel.add(defenseCard_1);
  	  	  defenseCardPanel.add(defenseCard_2);
  	  	  defenseCardPanel.add(defenseCard_3);
  	  	  defenseCardPanel.add(defenseCard_4);
  	  	  downContentPanel.add(defenseCardPanel,BorderLayout.CENTER);//將defenseCardPanel加到downContentPanel內，並設在中心
  	  	  JPanel downEmptyPanel_1= new JPanel();//為了製造defenseCardPanel右邊空隙而建的panel(EAST)
  	  	 // JPanel downEmptyPanel_1_1= new JPanel();
  	  	  JPanel downEmptyPanel_2= new JPanel();//為了製造defenseCardPanel左邊空隙而建的panel(WEST)
  	  	 // JPanel downEmptyPanel_2_1= new JPanel();
  	  	  downContentPanel.add(downEmptyPanel_1,BorderLayout.EAST);
  	  	  //downContentPanel.add(downEmptyPanel_1_1,BorderLayout.EAST);
  	  	  downContentPanel.add(downEmptyPanel_2,BorderLayout.WEST);
  	  	  //downContentPanel.add(downEmptyPanel_2_1,BorderLayout.WEST);
  	  	  add(downContentPanel);//將downContentPanel加到JFrame中
  	  }
  	  public void actionPerformed(ActionEvent e){
  	  	  
  	  }
  }
  	  