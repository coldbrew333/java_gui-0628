package java0628;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//��ư�� Ŭ���Ǿ����� �߻��Ѵ� Action �̺�Ʈ ó���ϴ� ��
//��ư �̸��� "Action"->"�׼�"->"Action" ��� ��ư ����

//1)������(â=JFrame) Ŭ������ �����ʱ��� ����
//2)

public class Ex1 extends JFrame implements ActionListener{//�������̽��� ������ ��������

	private JButton btn= new JButton("Action");//btn �������
	private JTextArea ta = new JTextArea(7,20);
	
	public Ex1() {
		//ȭ�� ����
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
	btn.addActionListener(this);//~listener=>�������̽�,��ư���� �̺�Ʈ �ڵ鷯(ó��)�� ��ü�� ���
	
	setVisible(true);//â�� ���� ���̱�. ȭ�� ���ŵȴ�.
	
	
	
	
	}
	
	
	//�ݹ� (call-back)�޼ҵ� : ����ڰ� ���� ȣ���ϴ� �޼ҵ尡 �ƴ�, �ý����� ,�޴ܿ��� ȣ��� �������� �ڵ����� ȣ���ϴ� �޼ҵ�
	@Override
	public void actionPerformed(ActionEvent e) {//����ȣ���� �ƴ� ��ư�� ���� �ý��ۿ��� ���
	//�̺�Ʈ�ҽ�(���⼭�� ��ư)���� ������Ʈ ���� ���� 
		
	String str = ta.getText();
	ta.setText(str+"��ưŬ����\n");
	
	//�Ű������� �̺�Ʈ������ ���� �̺�Ʈ��ü�� ���޹޴´�.
	//�̺�Ʈ��ü���� �̺�Ʈ�� ���õ� �پ��� ������ ������ �ְ� �ʿ��� ������ ���� �ü� �ִ�.
	//�̺�Ʈ �ҽ�(�̺�Ʈ�� �߻��� ���)��ü�� ������ �����ü� �ִ�. getSource()�޼ҵ�� �����ü� �ִ�.
	JButton button = (JButton)e.getSource();// ��������
	 
	if(btn.getText().equals("Action")) {
		btn.setText("�׼�");
	}else {
		btn.setText("Action");
	}
		
	}//public void~

	public static void main(String[] args) {

	new Ex1();//����Ʈ�� â�� ������ ����
		
		
		
		
		
		
		
	}//main

}
