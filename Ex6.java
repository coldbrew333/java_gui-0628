package java0628;

public class Ex6 {

	public static void main(String[] args) {
		System.out.println(Ex5.b);
		System.out.println(Ex5.Movable.RED);
		
		//정적 내부 클래스(static Ex5 클래스)는 외부클래스 이름, 내부클래스 이름 타입으로 사용한다.
		Ex5.MyActionListener5 l=new Ex5.MyActionListener5();//ex5안에 있는 스태틱클래스 MY~5를 생성하겠다 선언
		
		
	
	}//main

}
