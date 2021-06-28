package java0628;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;




public class Ex8 extends JFrame {

	private JTextField text1= new JTextField(7);
	private JTextField text2= new JTextField(5);
	private JTextField text3= new JTextField(7);
	private JLabel label = new JLabel("=");
	private JTextField result = new JTextField(10);
	private JButton btn= new JButton("계산");


class MyActionListener8 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		int num1 = Integer.parseInt(text1.getText());
		int num3 = Integer.parseInt(text3.getText());
		String string = text2.getText();
		
		if(string.equals("+")) {
			String to1=num1+num3+"";
			result.setText(to1);
		}else if(string.equals("-")) {
			String to2=num1-num3+"";
			result.setText(to2);
		}else if(string.equals("*")) {
			String to3 = num1*num3+"";
			result.setText(to3);
		}else {
			String to4 =num1/num3+"";
			result.setText(to4);
		}
	}
	
}
	
	
	public Ex8() {
		setTitle("사칙연산하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,200);
		setLocationByPlatform(true);
		
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
	
		
		
		c.add(text1);
		c.add(text2);
		c.add(text3);
		c.add(label);
		c.add(result);
		c.add(btn);
		
	btn.addActionListener(new MyActionListener8());
		//버튼 클릭하면 text1 과 text3의 입력값을 text2 연산해서 
		//결과를 result에 나타낸다
		
	setVisible(true);
		
	}//public Ex8
	
	
	
	

	
	

	
	
	public static void main(String[] args) {
		 new Ex8();

	}//main

}
