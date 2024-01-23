package step6_01.classObject;
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

import java.util.Scanner;

class Ex10_연습2 {
	
	int[] menuPrices   = {    2500,       3800,     1500,  1000};
	String[] menuNames = {"치즈버거", "불고기버거", "감자튀김", "콜	라"};
	int[] orderCnt = new int[4];//주문한 횟수
	int totalPrice = 0;
	
}


public class ClassEx10_연습2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Ex10_연습2 e = new Ex10_연습2();
		
		boolean isInsufficient = false;// 층분한가요?
		
		// 메뉴 보여주기
		System.out.println("========== 맘스터치 ==========");
		for (int i = 0; i < e.menuNames.length; i++) {
			System.out.print((i+1)+e.menuNames[i]+"\t:"+e.menuPrices[i]+"원");
		}
		System.out.println();
		
		while(true) {
			
			System.out.print(">>> 1) 주문 2) 영수증 출력 : ");
			int choice = scanner.nextInt();
			
			if(choice == 1) {
				//주문
				System.out.print(">>> 메뉴번호 선택 : ");
				int menu = scanner.nextInt();
				
				e.orderCnt[menu-1]++;
				isInsufficient= false;
				
			}else if (choice == 2) {
				
				if(!isInsufficient) {
					for (int i = 0; i < e.orderCnt.length; i++) {
						e.totalPrice  += e.orderCnt[i]*e.menuPrices[i];
					}
				}
				System.out.println("----------------------");
				System.out.println("ITEM" + "	\t"+ "QTY" + "\t" + "AMT");
				
				for (int i = 0; i <e.orderCnt.length; i++) {
					System.out.println(e.menuNames[i]+ "\t"+ e.orderCnt[i]+"\t"+e.menuPrices[i]+"원");
				}
				System.out.println("----------------------");
				System.out.println("합계 금액 : "+ e.totalPrice);
				
				System.out.print(">>지불액 입력 : ");
				int money = scanner.nextInt();
				
				if(money >= e.totalPrice) {
					int change = money - e.totalPrice;
					
					System.out.println(">>받은 금액 : "+ money+"원");
					System.out.println("----------------------");
					System.out.println(">>잔돈 : "+ change+"원");
					scanner.close();
					break;
				}
				else {
					System.out.println("금액이 부족합니다.");
					isInsufficient = true;
				}
				
			}
		}

	}

}
