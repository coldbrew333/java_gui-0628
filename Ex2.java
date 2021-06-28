package java0628;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//2.이벤트 리스너 클래스를  외부 독립 클래스로 구현

//의존객체(사용할 대상객체): 포함관계가 된다.
//읜존객체는 외부에서 주입받도록 만든다.
//생성자 또는 setter를 통해서 주입받는다.
class MyActionListener implements ActionListener{
	
	private JTextArea ta;
	//private JButton btn
	//생성자를 통해서 의존객체인 ta를 주입받음
	public MyActionListener(JTextArea ta) {
	//public MyActionListener(JTextArea ta, JButton btn)// 생성자btn을 계속 받아야 하기 때문에 불편함
	super();
	this.ta = ta;
	//this.btn= btn

	
	}//public MyActionListener
	



	@Override
	public void actionPerformed(ActionEvent e) {
		String str = ta.getText();
		ta.setText(str+"버튼 클릭됨\n");
		
	JButton	button=(JButton)e.getSource();//이벤트 소스 가져오기
	
	if(button.getText().equals("Action")) {
		button.setText("액션");
	}else {
		button.setText("Action");
	}
	}//public void
	
	
}//myActionListener

public class Ex2 extends JFrame {
	
	private JButton btn= new JButton("Action");//btn 멤버변수
	private JTextArea ta = new JTextArea(7,20);
	
	public Ex2() {
		
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
	
	btn.addActionListener(new MyActionListener(ta));//~listener=>인터페이스,버튼에게 이벤트 핸들러(처리)를 객체로 등록
	
	setVisible(true);//창을 눈에 보이기. 화면 갱신된다.
	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new Ex2();

	}//main

}
