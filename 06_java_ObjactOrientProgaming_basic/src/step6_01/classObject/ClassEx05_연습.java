package step6_01.classObject;
//2023-11-24 연습
import java.util.Scanner;

/*
 * # 학생성적 관리 프로그램[3단계] : 클래스 + 변수
 * 1. 학번을 입력하면, 해당 학생의 성적이 출력된다.
 * 2. 단, 없는 학번 입력에 관한 예외상황을 반드시 처리해야 한다.
 * 3. 1등과 꼴등 학생의 정보를 확인할 수 있다.
 */


class Ex05_연습{
	
	String name = null;
	// 학번 배열 정의, 점수 정의
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};

}



public class ClassEx05_연습 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);

		Ex05_연습 mega = new Ex05_연습();// 클래스의 객체 생성
		mega.name = "메가IT 고등학교";
		
		while (true) {
			
			// 메뉴 출력
			System.out.println("=== " + mega.name + "===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");
			
			// 메뉴 선택
			System.out.print("메뉴 선택 : ");
			int choice = scan.nextInt();
			
			
			
			if(choice == 1) {
				
				int total = 0;
				for (int i = 0; i < mega.arScore.length; i++) {
					total += mega.arScore[i];
				}
				double aver = (double)total / mega.arScore.length;// double
				
				System.out.println("전교생 수 = " + mega.arScore.length);
				System.out.println("총점 = " + total + "점");
				System.out.println("평균 = " + aver + "점");
				
			}
			
			else if (choice == 2) {
				
				int firstScore = mega.arScore[0];
				int firstNum = 0;
				for (int i = 0; i < mega.arScore.length; i++) {
					if (firstScore < mega.arScore[i]) {
						firstScore = mega.arScore[i];
						firstNum = mega.arHakbun[i];
						}
					}
				System.out.println("=== 1등 ===");
				System.out.println("학번 : " + firstNum + "번");
				System.out.println("성적 : " + firstScore + "점");
			}
			
			else if (choice == 3) {
				
				int lastPlaceScore = mega.arScore[0];
				int lastPlaceIdx = 0;
				for (int i = 0; i < mega.arScore.length; i++) {
					if (lastPlaceScore > mega.arScore[i]) {
						lastPlaceScore = mega.arScore[i];
						lastPlaceIdx = i;
					}
				}
				System.out.println("=== 꼴등 ===");
				System.out.println("학번 : " + mega.arHakbun[lastPlaceIdx] + "번" );
				System.out.println("성적 : " + lastPlaceScore + "점");
			}
			//성적확인하기
			//학번을 입력하세요 : 1002
			//1002학번 학생의 성적은 38점 입니다.
			//학번을 입력하세요 : 1000
			//학번을 잘못 입력하였습니다.
			else if (choice == 4) {
				System.out.print("학번을 입력하세요 : ");
				int myHak = scan.nextInt();
				
				
		        //학번의 유효성 검사
				int check = -1;
				for (int i = 0; i < mega.arHakbun.length; i++) {
					if (myHak == mega.arHakbun[i]) {
						check = i;
					}
				}
				if (check == -1) {
					System.out.println("학번을 잘못 입력하였습니다.");
				}
				else  {
					System.out.println(myHak + "번의 학생의 성적은 "+ mega.arScore[check]+ "점 입니다." );
				}
				//if (check != -1) {
				//	System.out.println(myHak + "번의 학생의 성적은 "+ mega.arScore[check]+ "점 입니다." );
				//}
				//else {
				//	System.out.println("학번을 잘못 입력하였습니다.");
				//}
				}
			
			else if (choice == 5) {
				System.out.println("프로그램 종료");
				scan.close();
				break;
				}
			}

	}

}
