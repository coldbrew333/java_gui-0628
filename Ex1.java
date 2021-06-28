package java0628;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//버튼이 클릭되었을때 발생한느 Action 이벤트 처리하는 예
//버튼 이름이 "Action"->"액션"->"Action" 토글 버튼 구현

//1)프레임(창=JFrame) 클래스가 리스너까지 구현
//2)

public class Ex1 extends JFrame implements ActionListener{//인터페이스는 여러개 구현가능

	private JButton btn= new JButton("Action");//btn 멤버변수
	private JTextArea ta = new JTextArea(7,20);
	
	public Ex1() {
		//화면 띄우기
		setTitle("이벤트 리스터 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250,200);
		setLocationByPlatform(true);
	
		Container c=getContentPane();
		c.setLayout(new FlowLayout());//가운데 정렬
		ta.setEditable(false);//편집못하게막음
	
		//JButton btn = new JButton("Action");
		c.add(btn);
		c.add(new JScrollPane(ta));//ta에 스크롤바 부착해서  ta를 컨텐트팬에 추가
	btn.addActionListener(this);//~listener=>인터페이스,버튼에게 이벤트 핸들러(처리)를 객체로 등록
	
	setVisible(true);//창을 눈에 보이기. 화면 갱신된다.
	
	
	
	
	}
	
	
	//콜백 (call-back)메소드 : 사용자가 직접 호출하는 메소드가 아닌, 시스템이 ,뒷단에서 호출된 시점에서 자동으로 호출하는 메소드
	@Override
	public void actionPerformed(ActionEvent e) {//직접호출이 아닌 버튼과 같은 시스템에서 사용
	//이벤트소스(여기서는 버튼)외의 컴포넌트 참조 가능 
		
	String str = ta.getText();
	ta.setText(str+"버튼클릭됨\n");
	
	//매개변수는 이벤트정보를 가진 이벤트객체를 전달받는다.
	//이벤트객체에는 이벤트와 관련된 다양한 정보를 가지고 있고 필요한 정보를 가져 올수 있다.
	//이벤트 소스(이벤트가 발생된 대상)객체의 참조를 가져올수 있다. getSource()메소드로 가져올수 있다.
	JButton button = (JButton)e.getSource();// 지역변수
	 
	if(btn.getText().equals("Action")) {
		btn.setText("액션");
	}else {
		btn.setText("Action");
	}
		
	}//public void~

	public static void main(String[] args) {

	new Ex1();//디폴트가 창이 보이지 않음
		
		
		
		
		
		
		
	}//main

}
