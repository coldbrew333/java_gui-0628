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

public class Ex4 extends JFrame {
	private JButton btn= new JButton("Action");//btn �������
	private JTextArea ta = new JTextArea(7,20);
	
	public Ex4(){//������(�޼ҵ�)
		setupView();//ȭ���� ����
		
//�̸��� �ִ� �������� Ŭ����. �����帧 �߿� Ŭ���� �ε��� �Ͼ��.  
		class MyActionListener3 implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				String str = ta.getText();//�ܺ� Ŭ���� ta����
				ta.setText(str+"��ư Ŭ����\n");

				if(btn.getText().equals("Action")) {
				btn.setText("�׼�");
				}else {
					btn.setText("Action");
				}
				
			}
			
		}//class MyActionListener3->���๮
		//btn.addActionListener(new MyActionListener3());
		
	
		//�͸���(�̸��� ����)���� ���� Ŭ����.
		ActionListener l = new ActionListener() {//��ü ���� ���ʿ� ������
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = ta.getText();//�ܺ� Ŭ���� ta����
				ta.setText(str+"��ư Ŭ����\n");

				if(btn.getText().equals("Action")) {
				btn.setText("�׼�");
				}else {
					btn.setText("Action");
				}
				
				
			}
		};//�����ݷ��� �ִ°��� ���Թ�(���Կ�����)�̱� ������ �ִ°��̴�.
 //btn.addActionListener(l);
		
	
	
		//�͸��� ����Ŭ������ ��ü�����ؼ� �ش�Ÿ���� �Ű������� �����ϱ�
		/*
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String str = ta.getText();//�ܺ� Ŭ���� ta����
				ta.setText(str+"��ư Ŭ����\n");

				if(btn.getText().equals("Action")) {
				btn.setText("�׼�");
				}else {
					btn.setText("Action");
				}
				
			}
			
		});
		*/
		//���ٽ� :() -> {}�� �Լ����Ǹ� �����ϴ� ǥ�����
		// 	�������̽��� �߻�޼ҵ� 1���� ������ ��츸 ���ٽ��� ��� �����ϴ�.
		
		//btn.addActionListener(event->System.out.println("��ư Ŭ����"));//�Ű������� �������� (), �Ű������� 1���̻��϶� ���ٽĿ���()��������
																	//���๮ 1���϶� �߰�ȣ �������� ; �� ����� �Ѵ�.
		btn.addActionListener(event->{	String str = ta.getText();//�ܺ� Ŭ���� ta����
		ta.setText(str+"��ư Ŭ����\n");

		if(btn.getText().equals("Action")) {
		btn.setText("�׼�");
		}else {
			btn.setText("Action");
		}});
	setVisible(true);//â�� ���� ���̱�. ȭ�� ���ŵȴ�.
		
	}//������
	
	private void setupView() {//ȭ�� ��� ����
		setTitle("�̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250,200);
		setLocationByPlatform(true);
	
		Container c=getContentPane();//��������
		c.setLayout(new FlowLayout());//��� ����
		
		ta.setEditable(false);//�������ϰԸ���
		
		//JButton btn = new JButton("Action");
		c.add(btn);
		c.add(new JScrollPane(ta));//ta�� ��ũ�ѹ� �����ؼ�  ta�� ����Ʈ�ҿ� �߰�
		
	}//public void setupView
	
	
	public static void main(String[] args) {
		new Ex4();

	}//main

}
