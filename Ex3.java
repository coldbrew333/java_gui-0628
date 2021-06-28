package java0628;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


//3.����Ŭ����(inner class)�� �ۼ��ϴ� ���
//	����Ŭ���� ���� :  �������Ŭ����(member(��ü�� �������) inner class), ��������Ŭ����(local inner class)->���๮�� �Ϻο��� ���� 


//class A{
	//int num =100;//�������


 //void method A() {//�޼ҵ�
	// int a = 10;//��������
	 //class E{//�������� Ŭ����
		 
	// }
// }
//class B{//��� ����Ŭ����
	//void methodB(){
	 	//num++;
	   //system.out.println(num)
	//}
	
	//}
//class C{//}//}






public class Ex3 extends JFrame {
	private JButton btn= new JButton("Action");//btn �������
	private JTextArea ta = new JTextArea(7,20);
	
	public Ex3(){
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
	
	btn.addActionListener(new MyActionListener2());//~listener=>�������̽�,��ư���� �̺�Ʈ �ڵ鷯(ó��)�� ��ü�� ���
	
	setVisible(true);//â�� ���� ���̱�. ȭ�� ���ŵȴ�.
		
		
	}//public Ex3
	
	//��� ����Ŭ������ �ܺ�Ŭ���� ����� �ڱ��ó�� �ٷ� ���� �����ϴ�.
	class MyActionListener2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String str = ta.getText();//�ܺ� Ŭ���� ta����
			ta.setText(str+"��ư Ŭ����\n");
			
		//JButton	button=(JButton)e.getSource();//�̺�Ʈ �ҽ� ��������
		
		if(btn.getText().equals("Action")) {
		btn.setText("�׼�");
		}else {
			btn.setText("Action");
		}
			
			
			
		}
		
	}// class MyActionListener2
	
	
	
	
	
	public static void main(String[] args) {
		new Ex3();
	}//main

}
