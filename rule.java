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
		
		super("�C���W�h����");
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
		String Demo1="<�C���t��>";
		String Demo3="�����d�B�𨾥d�B�\�I�d�B����";
		String Demo2="<�C���y�{>";
		String Demo="���a�}�l�i��C���ɡA�⤤�|����i�P�A�O��i�����d�C���W�h�|���T�i�\�I�d�A���a�����O���\�I�d�P�W�һݪ������X�P�A�Ȩ����\�I�d�P�W�е������B�C�n�X�P�e�A���I���⤤�n�X���P�A�A�I�����W���\�I�d�A�H�����X�P���ʧ@"
		+ "�C���a�C�^�X�|�������@�i�����d�A���a�⤤���P�L�k�s�@�X�\�I��"
		+ "�h�i��ܨϥΧ����d�i����L���a�������C�Y�L�����d�A�h�i��������U�@�ӿ��i��C���C�̥���o6�������a�Y����ӡC";

		// String Demo="���a�}�l�i��C���ɡA�⤤�|�����i�P�A���O�O�T�i�����d�M��i�𨾥d�C���W�h�|���T�i�\�I�d�A���a�����O���\�I�d�P�W�һݪ������X�P�A�Ȩ����\�I�d�P�W�е������B�C�n�X�P�e�A���I���⤤�n�X���P�A�A�I�����W���\�I�d�A�H�����X�P���ʧ@"
		// + "�C���a�C�^�X�|�������@�i�����d�A���a�⤤���P�L�k�s�@�X�\�I��"
		// + "�h�i��ܨϥΧ����d�i����L���a�������C�Y�L�����d�A�h�i��������U�@�ӿ��i��C���C�̥���o8�������a�Y����ӡC";
		
		
		jTextArea1 = new JTextArea(Demo1,2,1);
		// jTextArea1.setBackground(Color.lightGray);
		jTextArea1.setOpaque(false);
		jTextArea1.setEditable(false);
		jTextArea1.setFont(new Font("�L�n������",Font.BOLD,32));
		box.add(jTextArea1);

		jTextArea3 = new JTextArea(Demo3,2,1);
		// jTextArea1.setBackground(Color.lightGray);
		jTextArea3.setOpaque(false);
		jTextArea3.setEditable(false);
		jTextArea3.setFont(new Font("�L�n������",Font.BOLD,32));
		box.add(jTextArea3);

		jTextArea2 = new JTextArea(Demo2,2,1);
		// jTextArea2.setBackground(Color.lightGray);
		jTextArea2.setOpaque(false);
		jTextArea2.setEditable(false);
		jTextArea2.setFont(new Font("�L�n������",Font.BOLD,32));
		box.add(jTextArea2);

		jTextArea = new JTextArea(Demo,15,15);
		// jTextArea.setBackground(Color.lightGray);
		jTextArea.setOpaque(false);
		jTextArea.setLineWrap(true);
		jTextArea.setEditable(false);
		jTextArea.setFont(new Font("�L�n������",Font.BOLD,32));
		box.add((jTextArea));


		add(box);
	 
	    //add(new JScrollPane(jTextArea));
	    
	   
	}
}
