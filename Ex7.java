package java0628;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//�̺�Ʈ �޼ҵ� ���Ǹ� ���� ������ �������̽���
//�߻�޼ҵ� ������ 2���̻� ���� ���
//�����Ǵ� AdapterŬ������ �������ش�.
	class MyMouseListener implements MouseListener{//���ٽ��� �߻�޼��尡 ����ǰ� �޼ҵ尡 1���ϰ�� ����
		
		
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println("��ư�� �����ٰ� ������(Ŭ����)");
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			System.out.println("���콺 ��ư�� ������");
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			
			System.out.println("������ ���콺 ��ư�� ������");
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		
		System.out.println("���콺 �����Ͱ� ��ư ���� ������ ��");
		
		JButton btn=(JButton)e.getSource();
		btn.setBackground(Color.RED);
		
		}

		@Override
		public void mouseExited(MouseEvent e) {
			System.out.println("���콺 �����Ͱ� ��ư ���������� ����");
		
			JButton btn=(JButton)e.getSource();
			btn.setBackground(Color.GREEN);
			
		}
		
	}




public class Ex7 extends JFrame{

	public Ex7() {
		setTitle("��ư�� ���콺 �̺�Ʈ ������ �ޱ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		setLocationByPlatform(true);
		
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
	
		//���� ����Ŭ�������� �����ϴ� ���������� final����� �ڵ� �����ϵȴ�.
		final JButton btn = new JButton("MouseEvent �׽�Ʈ ��ư");//��������
		
		c.add(btn);
		
		//btn.addMouseListener(new MyMouseListener());//���콺 ������ �ޱ�
		
		//�͸��� ���� ���� Ŭ������ ��ü ������ ����
		btn.addMouseListener(new MouseAdapter() {//MouseAdapter()->Ŭ����

			@Override
			public void mouseEntered(MouseEvent e) {
				
				btn.setBackground(Color.RED);
			}

			@Override
			public void mouseExited(MouseEvent e) {
		
				btn.setBackground(Color.GREEN);
			}
		
		
			
		});//����Ŭ������ �����ϰ� ������� ������� �ʰ� ������ü�� btn�� ����ǳ�.
		
		
	setVisible(true);
	
	}

	
	
	public static void main(String[] args) {
		new Ex7();

	}//main

}
