package step6_02.method;

/*
 * 
 * # return
 *   
 * 	1) 값을 반환한다.
 *  2) 메서드를 종료한다.(로직 종료)
 *  3) 메서드에서의 return 값은 1개이다. 
 *  
 * */

class ReturnEx{
	
	
	void setScore1(int score1) {
		score1 = 100;
	}
	
	int setScore2(int score2) {
		score2 = 100;
		return score2;
	}
	
	int testReturn() {
		
		System.out.println("리턴전 명령어1");
		System.out.println("리턴전 명령어2");
		System.out.println("리턴전 명령어3");
		
		//return 1,2,3,4,5;// 리턴값은 복수가 불가능하므로 에러 발생.
		return 0;
		
		//리턴이 실행되는 수간 메소드 종료이므로 아래의 명령어에서 에러 발생.
		/*
		 * System.out.println("리턴전 명령어1"); 
		 * System.out.println("리턴전 명령어2");
		 * System.out.println("리턴전 명령어3");
		 */
		
	}
}


public class MethodEx03 {

	public static void main(String[] args) {
		
		ReturnEx object = new ReturnEx();
		
		int score1 = 87;
		System.out.println("메서드 호출전 데이타 : " + score1);  // 87
		
		object.setScore2(score1);
		System.out.println("메서드 호출후 데이타 : " + score1); //87
		
		System.out.println("\n===========\n");
		
		int score2 = 87;
		System.out.println("메서드 호출전 데이타 : " + score2);  // 87
		object.setScore2(score2);
		System.out.println("메서드 호출후 데이타 : " + score2);  // 87
		
		score2 = object.setScore2(score2);
		System.out.println("메서드 호출후 데이타 : " + score2); // 100

	}

}
