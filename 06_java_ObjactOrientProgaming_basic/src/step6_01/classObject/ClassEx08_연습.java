package step6_01.classObject;
// array_basic 14번 예제 다시 풀고 오기
/*
 * # 숫자이동[3단계] : 클래스 + 변수
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 * 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
 * 예)
 *  0 0 0 0 0 0 0 2
 *  왼쪽(1) 오른쪽(2) : 2
 *
 *  2 0 0 0 0 0 0 0
 */


import java.util.Scanner;

class Ex0801 {
	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
}

public class ClassEx08_연습 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Ex0801 ex = new Ex0801();
		int playerIdx = 0;
		
		//초기 플레이어의 위치 선정
		for (int i = 0; i < ex.game.length; i++) {
			if (ex.game[i] == 2) {
				playerIdx = i;
			}
		}
		while (true) {
			int[] gameList = ex.game;
			for (int i = 0; i < gameList.length; i++) {
				System.out.print(gameList[i] + " ");
			}
			System.out.println();
			
			System.out.print("[1] 왼쪽, [2] 오른쪽 입력 : ");
			int move = scan.nextInt();

//			5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
//			->플레이어의 인덱스 값이 좌우 끝을 넘어서 playerIdx=-1/playerIdx= gameList.length 일 경우의 조건으로
			
			if (move == 1) {
				//격파 가능 조건: playerIdx =0아니고, 플레이어의 앞 위치에서의 값이 1일 경우
				if (playerIdx != 0 && gameList[playerIdx - 1] == 1) {
					System.out.print("격파[3] 입력 : ");
					int pucnh = scan.nextInt();
					if (pucnh != 3) {
						System.out.println("격파 실패!");
						continue;
					}
				}
				//왼쪽으로 이동
				gameList[playerIdx] = 0;
				playerIdx--;
				
				if (playerIdx == -1) {//만약에 플레이어의 인덱스가 -1이라면
					playerIdx = gameList.length - 1;//플레이어의 인덱스는 배열의 끝으로 이동한다.
				}
				gameList[playerIdx] = 2;
				
			} else if (move == 2) {
				if (playerIdx != gameList.length - 1 && gameList[playerIdx + 1] == 1) {
					System.out.print("격파[3] 입력 : ");
					int punch = scan.nextInt();
					if (punch != 3) {
						System.out.println("격파 실패!");
						continue;
					}
				}
				//오른쪽으로 이동
				gameList[playerIdx] = 0;
				playerIdx++;
				if (playerIdx == gameList.length) {// 만약에 플레이어의 인덱스가 배열을끝을 넘어간다면
					playerIdx = 0;//플레이어의 인덱스는 원점으로 돌아간다.
				}
				gameList[playerIdx] = 2;
				
			}
			
			
		}
		
		
	}
	
}
