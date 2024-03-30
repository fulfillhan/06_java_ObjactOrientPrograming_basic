package step6_01.classObject;
/*
 * # ATM[4단계] : 전체 기능구현

 * 1. 회원가입
 * . id와 pw를 입력받아 가입
 * . 가입 시 돈 1000원 부여
 * . id 중복체크
 * 2. 회원탈퇴
 * . 로그인시에만 이용가능
 * 3. 로그인
 * . id와 pw를 입력받아 로그인
 * . 로그아웃 상태에서만 이용가능
 * 4. 로그아웃
 * . 로그인시에만 이용가능
 * 5. 입금
 * . 로그인시에만 이용가능
 * 6. 이체
 * . 로그인시에만 이용가능
 * 7. 잔액조회
 * . 로그인시에만 이용가능
 */

import java.security.Identity;
import java.util.Iterator;
import java.util.Scanner;


class Ex11 {

	//크기만 정해진 상태
	String[] arAcc = new String[5]; 
	String[] arPw  = new String[5];
	int[] arMoney  = new int[5];
	
	int accCnt = 0;// 계좌의 요소의 갯수
	int identifier = -1;
	
}


public class ClassEx11_연습 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Ex11 ex11 = new Ex11();
		
		for (int i = 0; i < ex11.arAcc.length; i++) {
			ex11.arAcc[i]="";
			ex11.arPw[i]="";
		}
		
		while (true) {
			
			System.out.println("-------------------------");
			System.out.println("계좌번호\t비밀번호\t계좌잔액");
			System.out.println("-------------------------");
		for (int i = 0; i < ex11.accCnt; i++) {
			System.out.println(ex11.arAcc[i]+"\t"+ex11.arPw[i]+"\t"+ex11.arMoney[i]);
		}
		System.out.println("-------------------------");
		System.out.print("상태 : ");
		if(ex11.identifier == -1)  System.out.println("로그아웃");
		else                       System.out.println(ex11.arAcc[ex11.identifier]+"님 로그인");
		System.out.println("-------------------------");
			System.out.println("[Mega Bank]");
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]입금하기");
			System.out.println("[6]이체하기");
			System.out.println("[7]잔액조회");
			System.out.println("[0]종료하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			int size = ex11.arAcc.length;
			if (sel == 1) {
				// 회원가입
				
				System.out.print("[가입]계좌 번호를 입력하세요 : ");
				String insertAcc = scan.next();
				
				int dupleCheck = 1; // 중복되지 않을때
				
				for (int i = 0; i < size; i++) {
					if(ex11.arAcc[i].equals(insertAcc)) {
						dupleCheck = -1;// 중복될때
					}
				}
				if(dupleCheck == -1) {
					System.out.println("중복되는 계좌번호 입니다!");
					break;
				}
				
				System.out.print("[가입]비밀번호를 입력하세요 : ");
				String inssertPw = scan.next();
				System.out.print("[가입]금액을 입력하세요 : ");
			    int insertMoney = scan.nextInt();
			    
			    //입력받은 정보를 배열에 넣기
			    ex11.arAcc[ex11.accCnt] = insertAcc;
			    ex11.arPw[ex11.accCnt] = inssertPw;
			    ex11.arMoney[ex11.accCnt] = insertMoney;
			    
			    ex11.accCnt++;
			    //ex11.identifier = 1;
			    System.out.println("[메세지]가입을 축하합니다.");
				
			}
			else if (sel == 2) {
				//회원탈퇴
				if(ex11.identifier == -1) {
					System.out.println("[메세지]로그인 후 이용가능합니다.");
				}
				
				for (int i = ex11.identifier; i < size-1; i++) {
					 ex11.arAcc[i]= ex11.arAcc[i+1];
					 //여기서부터 업데이트
				}
				
			}
			else if (sel == 3) {
				// 로그인 하기
				if(ex11.identifier == -1) {
					System.out.print("[가입]계좌 번호를 입력하세요 : ");
					String myAcc = scan.next();
					System.out.print("[가입]계좌 번호를 입력하세요 : ");
					String myPw = scan.next();
					
					for (int i = 0; i < size; i++) {
						if(ex11.arAcc[i].equals(myAcc) && ex11.arPw.equals(myPw)) {
							ex11.identifier = i;
						}
					}
					if(ex11.identifier == -1) {
						System.out.println("[메시지] 아이디와 비번을 확인해주세요!");
					}
				}
				else {
					//로그인이 안된 경우
					System.out.println("[메시지] 현재"+ ex11.arAcc+"님 이용중...");
					System.out.println("로그인 후 이용해주세요!");
				}
			}
			else if (sel == 4) {
				//로그아웃
				if(ex11.identifier == -1) {
					System.out.println("로그인 후 이용해주세요!");
					continue;
				}
				ex11.identifier = -1;
				System.out.println("[메시지] 로그아웃 되었습니다!");
			}
			else if (sel == 5) {
				// 입금하기
				if(ex11.identifier == -1) {
					System.out.println("로그인 후 이용해주세요!");
					continue;
				}
				System.out.println("[입금]할 금액을 입력하세요!");
				int money = scan.nextInt();
				
				ex11.arMoney[ex11.identifier] = money;
				System.out.println("[메시지]입금을 완료했습니다!");
				
			}
			else if (sel == 6) {
				//이체하기
				
				if(ex11.identifier == -1) {
					System.out.println("[메시지] 로그인 후 이용가능합니다!");
					continue;
				}
				
				System.out.print("[이체] 이체할 계좌번호를 입력하세요 : ");
				String acc = scan.next();
				
			
				//상대방의 계좌 확인하기
				int check = -1;
				for (int i = 0; i < size ; i++) {
					if(ex11.arAcc[i].equals(acc)) {
						check=i;
					}
				}
				if(check == -1) {
					System.out.println("계좌번호를 확인하세요!");
				}
				
				
				System.out.print("[메시지]이체 금액을 입력하세요!");
				int transferMoney = scan.nextInt();
				
				if(ex11.arMoney[ex11.identifier] >= transferMoney) {
					ex11.arMoney[ex11.identifier] -= transferMoney;
					ex11.arMoney[check] += transferMoney;
					System.out.println("[메시지] 계좌이체가 완료되었습니다!");
				}
				else {
					System.out.println("[메시지]  계좌잔액이 부족합니다.");
				}
				
				
			}
			else if (sel == 7) {
				//잔액 조회하기
				if(ex11.identifier ==-1) {
					System.out.println("로그인 후 이용가능합니다.");
					continue;
				}
				System.out.println(ex11.arAcc[ex11.identifier]+"님 계좌 잔액은 "+ ex11.arMoney[ex11.identifier]+"원 입니다.");
				
			}
			else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		scan.close();
		
	}

}
