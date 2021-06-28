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

// static Ex5클래스
public class Ex5 extends JFrame {//외부에 선언하는것은 스태틱 클래스 이다. 따로 스태틱클래스를 쓰지 않음

	int a =10;
	static int b =20;
	
	static interface Movable{
		public static final int RED =1;
		public static final int BLUE=2;
	}
	
	
	//클래스단위(스태틱) 내부클래스는 외부클래스와 동일하다. 위치만 내부에 존재한다.
		static class MyActionListener5 implements ActionListener{//스태틱이 붙은경우 , ex5와 관련없음

			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("a="+a);//외부클래스의 non-static멤버는 사용불가능
				System.out.println("b="+b);//외부크리래스의 static 멤버반 사용가능
				
			}//public void actionPerformed
			
		}//static class
		
		
	
	
	
	
	private JButton btn= new JButton("Action");//btn 멤버변수
	private JTextArea ta = new JTextArea(7,20);
	
	public Ex5() {
		setTitle("이벤트 리스너 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250,200);
		setLocationByPlatform(true);
	
		Container c=getContentPane();
		c.setLayout(new FlowLayout());//가운데 정렬
		
		ta.setEditable(false);//편집못하게막음
		
		//JButton btn = new JButton("Action");
		c.add(btn);
		c.add(new JScrollPane(ta));//ta에 스크롤바 부착해서  ta를 컨텐트팬에 추가
	
	//btn.addActionListener();//~listener=>인터페이스,버튼에게 이벤트 핸들러(처리)를 객체로 등록
	
	setVisible(true);//창을 눈에 보이기. 화면 갱신된다.
	}
	
	
	public static void main(String[] args) {
	new Ex5();
	
	
	
	
	}//main

}
