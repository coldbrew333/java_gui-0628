package java0628;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java0628.Ex3.MyActionListener2;

// static Ex5Ŭ����
public class Ex5 extends JFrame {//�ܺο� �����ϴ°��� ����ƽ Ŭ���� �̴�. ���� ����ƽŬ������ ���� ����

	int a =10;
	static int b =20;
	
	static interface Movable{
		public static final int RED =1;
		public static final int BLUE=2;
	}
	
	
	//Ŭ��������(����ƽ) ����Ŭ������ �ܺ�Ŭ������ �����ϴ�. ��ġ�� ���ο� �����Ѵ�.
		static class MyActionListener5 implements ActionListener{//����ƽ�� ������� , ex5�� ���þ���

			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("a="+a);//�ܺ�Ŭ������ non-static����� ���Ұ���
				System.out.println("b="+b);//�ܺ�ũ�������� static ����� ��밡��
				
			}//public void actionPerformed
			
		}//static class
		
		
	
	
	
	
	private JButton btn= new JButton("Action");//btn �������
	private JTextArea ta = new JTextArea(7,20);
	
	public Ex5() {
		setTitle("�̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250,200);
		setLocationByPlatform(true);
	
		Container c=getContentPane();
		c.setLayout(new FlowLayout());//��� ����
		
		ta.setEditable(false);//�������ϰԸ���
		
		//JButton btn = new JButton("Action");
		c.add(btn);
		c.add(new JScrollPane(ta));//ta�� ��ũ�ѹ� �����ؼ�  ta�� ����Ʈ�ҿ� �߰�
	
	//btn.addActionListener();//~listener=>�������̽�,��ư���� �̺�Ʈ �ڵ鷯(ó��)�� ��ü�� ���
	
	setVisible(true);//â�� ���� ���̱�. ȭ�� ���ŵȴ�.
	}
	
	
	public static void main(String[] args) {
	new Ex5();
	
	
	
	
	}//main

}
