package step6_02.method;

//다양한 변수의 종류

class VariableEx{
	 int a;//인스턴스변수(객체에서 사용하는 변수) 큰  범위
	 static int b;// 클래스 변수(클래스에서 사용하는 변수)
	 
	 
	 void testMethd(int c) {// 매개변수(메서드를 전달된느 데이터를 받을 때 사용 하는 변수
		 int d;//// 지역 변수(메서드 내부에서 사용하는 변수)
	 }
}

// this : 객체(오브젝트, 인스턴스) 자신
class Zealot{
	
	int shield = 60;
	int hp = 100;
	
	void printStatus() {
		//this는 생략이 가능하고 기본적으로 생략되어 있다.
		System.out.println("this : "+ this);
		System.out.println("shield : "+ this.shield);// 너무 당연해서 this가 생략되어 있다.
		System.out.println("hp : "+ this.hp);
		System.out.println();
	}
	
}

public class MethodEx04 {
	
	public static void main(String[] args) {// z1일때는 this는 z1 의미
		Zealot z1 = new Zealot();// 객체 생성
		System.out.println("z1 : "+ z1);
		z1.shield = 50;
		z1.printStatus();
//		z1 : step6_02.method.Zealot@2f92e0f4
//		this : step6_02.method.Zealot@2f92e0f4
//		shield : 50
//		hp : 100
		
		
		Zealot z2 = new Zealot();// 객체 생성
		System.out.println("z2 : "+ z2);//주소
		z2.shield = 0;
		z2.hp = 0;
		z2.printStatus();
//		z2 : step6_02.method.Zealot@681a9515
//		this : step6_02.method.Zealot@681a9515
//		shield : 0
//		hp : 0
		
		
		Zealot z3 = new Zealot();// 객체 생성
		System.out.println("z3 : "+ z3);
		z3.printStatus();
//		z3 : step6_02.method.Zealot@3af49f1c
//		this : step6_02.method.Zealot@3af49f1c
//		shield : 60
//		hp : 100
		
	}

}
