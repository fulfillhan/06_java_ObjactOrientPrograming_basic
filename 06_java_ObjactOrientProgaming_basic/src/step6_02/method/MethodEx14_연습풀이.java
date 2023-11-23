package step6_02.method;

import java.util.Scanner;

/*
 * # 영화관 좌석예매 : 클래스 + 메서드
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * seat = 0 0 0 0 0 0 0
 * 
 * 좌석선택 : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 이미 예매가 완료된 자리입니다.
 * ----------------------
 * 매출액 : 24000원
 */
class TheaterEx {
	Scanner scan = new Scanner(System.in);
	
	int[] seats = new int[10];// 10자리의 좌석 배열 선언
	int bookCnt = 0;
	int money = 0;
	
	//1.메뉴를 보여주는 기능
	void showMenuEx() {
		
		System.out.println("== 메뉴 선택 ==");
		System.out.println("1. 예매하기");
		System.out.println("2. 종료하기");
		
	}
	
	//2.예매 가능 좌석 보여주기 기능
	void showSeat() {
		
		for (int i = 0; i < seats.length; i++) {
			if (seats[i] == 0) {
				System.out.print("[X] "); 
			}
			else if (seats[i] == 1) {
				System.out.print("[O] ");
			}
		}
		System.out.println();
	 }
	
	//3. 좌석 현황 출력하기 기능
	void checkSeatsEx() {
		
		//좌석 보여주기 메서드 호출
		showSeat();
		
		System.out.print("좌석 번호를 입력하세요 [1 ~ 10] : ");
		int myIdx = scan.nextInt() - 1;
		
		if (seats[myIdx] == 0) {
			seats[myIdx] = 1;
			bookCnt++;
			System.out.println("예매가 완료되었습니다.");
		}else {
			System.out.println("이미 예매가 완료되었습니다.");
		}
	}
		
	//4.매출값 보여주기
	void showSalesEx() {
		money = bookCnt * 12000;
		System.out.println("총 금액 : "+ money+ "원");
	}
	
	// 실행하기
	void run() {
		
		while (true) {
			// 메뉴 출력
			showMenuEx();
			System.out.print("메뉴 선택 : ");
			int choiceMenu =  scan.nextInt();
			
			if (choiceMenu == 1) {
				checkSeatsEx();
			}else if (choiceMenu == 2) {
				showSalesEx();
				System.out.println();
				System.out.println("== 프로그램 종료 ==");
				break;
			}
			
		}
	}
}
	

public class MethodEx14_연습풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TheaterEx cgv = new TheaterEx();
		cgv.run();

	}

}
