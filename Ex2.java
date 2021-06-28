package java0628;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//2.�̺�Ʈ ������ Ŭ������  �ܺ� ���� Ŭ������ ����

//������ü(����� ���ü): ���԰��谡 �ȴ�.
//������ü�� �ܺο��� ���Թ޵��� �����.
//������ �Ǵ� setter�� ���ؼ� ���Թ޴´�.
class MyActionListener implements ActionListener{
	
	private JTextArea ta;
	//private JButton btn
	//�����ڸ� ���ؼ� ������ü�� ta�� ���Թ���
	public MyActionListener(JTextArea ta) {
	//public MyActionListener(JTextArea ta, JButton btn)// ������btn�� ��� �޾ƾ� �ϱ� ������ ������
	super();
	this.ta = ta;
	//this.btn= btn

	
	}//public MyActionListener
	



	@Override
	public void actionPerformed(ActionEvent e) {
		String str = ta.getText();
		ta.setText(str+"��ư Ŭ����\n");
		
	JButton	button=(JButton)e.getSource();//�̺�Ʈ �ҽ� ��������
	
	if(button.getText().equals("Action")) {
		button.setText("�׼�");
	}else {
		button.setText("Action");
	}
	}//public void
	
	
}//myActionListener

public class Ex2 extends JFrame {
	
	private JButton btn= new JButton("Action");//btn �������
	private JTextArea ta = new JTextArea(7,20);
	
	public Ex2() {
		
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
	
	btn.addActionListener(new MyActionListener(ta));//~listener=>�������̽�,��ư���� �̺�Ʈ �ڵ鷯(ó��)�� ��ü�� ���
	
	setVisible(true);//â�� ���� ���̱�. ȭ�� ���ŵȴ�.
	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new Ex2();

	}//main

}
