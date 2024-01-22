package step6_01.classObject;

import java.util.Scanner;

/*
 * # 영수증 출력하기 : 클래스 + 변수

 * 1. 햄버거 주문을 받아 영수증을 출력한다.
 * 2. 출력내용은 각 메뉴의 주문 수량과 총 금액 및 잔돈을 표시한다.
 * 
 * 	맘스터치
 *----------------------
 *ITEM	QTY	AMT
 *치즈버거	1	2500
 *불고기버거	1	3800
 *감자튀김	1	1500
 *콜      라	1	1000
 *----------------------
 *합계금액		8800
 *받은금액		10000
 *----------------------
 *잔       돈		1200
 */


class Ex10_연습 {
	
	int[] menuPrices   = {    2500,       3800,     1500,  1000};
	String[] menuNames = {"치즈버거", "불고기버거", "감자튀김", "콜	라"};
	int[] orderQty = new int[4];//주문된 횟수를 기록하는 배열
	int totalPrice = 0;
	
}

public class ClassEx10_연습 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Ex10_연습 e = new Ex10_연습();// 객체 생성
		
		boolean isInsufficient = false;//지불 금액이 부족한지 여부(불충분한가)
		
		//맘스터치 메뉴 보여주기
		System.out.println("========== 맘스터치 ==========");
		for (int i = 0; i < e.menuNames.length; i++) {
			System.out.println((i + 1) + "." + e.menuNames[i] + " : " + e.menuPrices[i] + "원");
		}
		
		while (true) {
			//하단의 내용들은 반복될것
			System.out.print(">>> 1) 주문 2) 영수증 출력 : ");
			int choice = scanner.nextInt();
			
			if (choice == 1) {
				//주문하기
				System.out.print(">>> 메뉴번호 선택 :  ");
				int menu = scanner.nextInt();
				// 주문하면 해당 인덱스의 요소가 증가
				menu--;
				e.orderQty[menu] = e.orderQty[menu]+1;//주문한 만큼 증가한 수량
				isInsufficient = false;
			} else if (choice == 2) {
				// 주문된 메뉴의 totalPrice 계산
				if (!isInsufficient) {// false일때 즉, 지불 부족이 아닐때
					for (int i = 0; i < e.orderQty.length; i++) {
						e.totalPrice += e.orderQty[i] * e.menuPrices[i];
					}
				}
				System.out.println("----------------------");
				System.out.println("ITEM" + "  \t" + "QTY" + "\t" + "AMT");
				
				for (int i = 0; i < e.orderQty.length; i++) {
					System.out.println(e.menuNames[i] + "\t" + e.orderQty[i] + "\t" + e.menuPrices[i]);
				}
				System.out.println("----------------------");
				System.out.println(">>합계 금액 : " + e.totalPrice + "원");
				System.out.println();
				System.out.print(">>지불액 입력 : ");
				int myMoney = scanner.nextInt();
				
				if (myMoney > e.totalPrice) {// 내가 지불한 금액이 총금액보다 크다면
					int change = myMoney - e.totalPrice;// 잔돈
					
					System.out.println(">>받은 금액 : " + myMoney + "원");
					System.out.println("----------------------");
					System.out.println(">>잔돈 : " + change);
					break;
					
				} else {
					isInsufficient = true;// 불충분한것
					System.out.println("입금액 부족/ 확인하세요!");
				}
			}
		}
		scanner.close();
	}
}
