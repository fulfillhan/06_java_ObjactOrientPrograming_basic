package step6_02.method;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임 : 클래스 + 메서드
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */

class Game {

	Scanner scan = new Scanner(System.in);
	Random ran = new Random();

	int[] front = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
	int[] back = new int[10];

	int correctCnt = 0;// 맞춘 횟수
	int size = front.length;

	void shuffle() {
		for (int i = 0; i < 1000; i++) {
			int r = ran.nextInt(size);
			int temp = front[0];
			front[0] = front[r];
			front[r] = temp;
		}

	}

	void printCard() {
		System.out.println(Arrays.toString(front));
		System.out.println(Arrays.toString(back));

	}

	void choiceCard() {
		System.out.print("카드 선택1 [1~10] : ");// 내가 선택한 숫자 = 인덱스값
		int idx01 = scan.nextInt()-1;
		

		System.out.print("카드 선택2 [1~10] : ");
		int idx02 = scan.nextInt()-1;
		

		if (front[idx01] == front[idx02]) {
			back[idx01] = front[idx01];
			back[idx02] = front[idx02];
			correctCnt++;
		}
	}
	
	
	
	void run() {
		shuffle();

		while (true) {
			printCard();

			if (correctCnt >= 5) {
				System.out.println("게임 종료");
				break;
			}
			choiceCard();
			

		}
		scan.close();
	}
	
}

public class MethodEx16_연습풀이 {

	public static void main(String[] args) {
		Game game = new Game();
		
		game.run();
		
	

	}

}
