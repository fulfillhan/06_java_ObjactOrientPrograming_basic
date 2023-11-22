package step6_01.classObject;

	/*
	 * 
	 *   # 객체 지향 프로그래밍 ( Object Oriented Programming [OOP] )
	 *			  
	 *	  - 코드의 재사용성이 높다.
	 *	  - 코드의 확장성이 높다.
	 *	  - 코드의 관리가 용이하다.
	 *	  - 개발자간에 프로그램 방법에 통일과 일치성을 준다.
	 *	  - 신뢰성이 높은 프로그래밍을 가능하게 한다.
	 *		
	 * 
	 *   # 클래스(class)
	 *   
	 *     - 클래스(class)는 객체 지향 프로그래밍(OOP)에서 특정 객체를 생성하기 위해 변수와 메소드를 정의하는 일종의 틀이다. 
	 *     객체를 정의 하기 위한 상태(멤버변수)와 메서드(함수)로 구성된다. (위키백과)
	 *     
	 *      [ 형태 ]
	 * 		1) class   : 키워드
	 * 		2) Product : 클래스명 ( 첫글자를 대문자로 작성한다. ) 
	 * 		3) {}      : 클래스의 영역 
	 * 
	 * 
	 *   # 객체 (object)
	 * 
	 * 	  - 컴퓨터 과학에서 객체 또는 오브젝트(object)는 클래스에서 정의한 것을 토대로 메모리(실제 저장공간)에 할당된 것으로 
	 *      프로그램에서 사용되는 데이터 또는 식별자에 의해 참조되는 공간을 의미하며, 변수, 자료 구조, 함수 또는 메소드가 될 수 있다. 
	 *      프로그래밍 언어는 변수를 이용해 객체에 접근하므로 객체와 변수라는 용어는 종종 함께 사용된다. 
	 *      그러나 메모리가 할당되기 전까지 객체는 존재하지 않는다.(위키백과)
	 * 
	 * 		[형태]
	 * 
	 * 	    클래스명 변수명 = new 클래스명();
	 *   Ex)  Ex01     e    =  new Ex01();
	 *    	  Random ran    =  new Random();
	 * 
	 * */
	class Member { // 클래스의 이름은 대문자로 작성한다. 
		
		// 속성
		String id;		 // property(프로퍼티) , field(필드) , 멤버 , 멤버변수
		String password;
		String name;
		String email;
		String hp;
		String address;
		
		// 기능(step6_02에서 공부)
		
	}


	public class ClassEx01 {

		public static void main(String[] args) {

			Member member1 = new Member(); // new 클래스명(); 형태로 객체(object)를 생성한다.
			
			member1.id = "qwer1234";
			member1.password = "1111";
			member1.name = "익명";
			member1.email = "qwer1234@naver.com";
			member1.hp = "010-1111-1111";
			member1.address = "서울";
			
			
			System.out.println("member1객체");
			System.out.println("member1 : " + member1);
			System.out.println("member1 : "+ member1.id);
			System.out.println("member1.password : " + member1.password);
			System.out.println("member1.name : " + member1.name);
			System.out.println("member1.email : " + member1.email);
			System.out.println("member1.hp : " + member1.hp);
			System.out.println("member1.address : " + member1.address);
			System.out.println();
			
			
			Member member2 = new Member();// 여러번 쓸수 있다.
			member2.id = "abcd1234";
			member2.password = "2222";
			member2.name = "익명2";
			member2.email = "abcd1234@naver.com";
			member2.hp = "010-2222-2222";
			member2.address = "경기";
			
			System.out.println("member2객체");
			System.out.println("member2 : " + member2);
			System.out.println("member2.id : " + member2.id);
			System.out.println("member2.password : " + member2.password);
			System.out.println("member2.name : " + member2.name);
			System.out.println("member2.email : " + member2.email);
			System.out.println("member2.hp : " + member2.hp);
			System.out.println("member2.address : " + member2.address);
			System.out.println();
			
			
			
			
		}
		

	}
