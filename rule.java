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
		
		super("�C���W�h����");
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		//setLayout(new BorderLayout());
		String Demo="���a�}�l�i��C���ɡA�⤤�|�����i�P�A���O�O�T�i�����d�M��i�𨾥d�C���W�h�|���T�i�\�I�d�A���a�����O���\�I�d�P�W�һݪ������X�P�A�Ȩ����\�I�d�P�W�е������B�C�n�X�P�e�A���I���⤤�n�X���P�A�A�I�����W���\�I�d�A�H�����X�P���ʧ@"
				+ "�C���a�C�^�X�|�������@�i�����d�A���a�⤤���P�L�k�s�@�X�\�I��"
				+ "�h�i��ܨϥΧ����d�i����L���a�������C�Y�L�����d�A�h�i��������U�@�ӿ��i��C���C�̥���o8�������a�Y����ӡC";
		
		JTextArea jTextArea = new JTextArea(Demo,15,15);
		jTextArea.setLineWrap(true);
		jTextArea.setEditable(false);
		jTextArea.setFont(new Font("�L�n������",Font.BOLD,32));
	 
	    add(new JScrollPane(jTextArea));
	    
	   
	}
}
