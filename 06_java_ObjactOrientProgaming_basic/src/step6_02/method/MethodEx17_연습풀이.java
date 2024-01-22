package step6_02.method;

import java.util.Scanner;

//# 틱택토[바둑느낌]

class TicTacToe_연습 {
	
	Scanner scan = new Scanner(System.in);
	
	String[][] game = new String[3][3];
	
	int turn = 0;       // 짝수이면 turn1 홀수이면 ture2
	int win = 0;        // 1[turn1승리]  2[turn2승리]
	
	void setGame() {
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[i].length; j++) {
				game[i][j] = " ";
			}
		}
		
	}
	
	
	// 게임 화면 출력
	void showGame() {
		System.out.println("== 틱택톡 ==");
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game[i].length; j++) {
				System.out.print("[" + game[i][j] + "]");
			}
			System.out.println();
		}
		System.out.println("==========");
	}
	
	
	// 인덱스 선택
	void choiceIdx() {
		
		//turn 1의 차례(짝수)
		if (turn % 2 == 0) {
			System.out.print("[1턴]행의 인덱스 입력: ");
			int xIdx = scan.nextInt();
			System.out.print("[1턴]열의 인덱스 입력 : ");
			int yIdx = scan.nextInt();
			
			if (game[xIdx][yIdx].equals(" ")) {
				game[xIdx][yIdx] = "O";
				turn++;
			} else System.out.println("다시 입력하세요!");
		}
	
		// turn 2의 차례(홀수)
		else if (turn % 2 == 1) {
			System.out.print("[2턴]행의 인덱스 입력: ");//열
			int xIdx = scan.nextInt();
			System.out.print("[2턴]열의 인덱스 입력 : ");//행
			int yIdx = scan.nextInt();
			
			if (game[xIdx][yIdx].equals(" ")) {
				game[xIdx][yIdx] = "x";
				turn++;
			}
			else System.out.println("다시 입력하세요!");
		}
	}
	
	void checkWidth() {
		// 게임의 가로 방향 체크 모든 조건들 확인이 필요하다.
		for (int i = 0; i < game.length; i++) {
			if (game[i][0].equals("O") && game[i][1].equals("O") && game[i][2].equals("O")) win = 1;//(turn=1 의 승리)
			if (game[i][0].equals("x") && game[i][1].equals("x") && game[i][2].equals("x")) win = 2;//(turn=2 의 승리)
		}
	}
	
	void checkHeight() {
		// 게임의 세로 방향 체크
		for (int i = 0; i < game.length; i++) {
			if (game[i][0].equals("O") && game[i][1].equals("O") && game[i][2].equals("O")) win = 1;
			if (game[i][0].equals("x") && game[i][1].equals("x") && game[i][2].equals("x")) win = 2;
		}
	}
	
	void checkCross() {
		if (game[0][0].equals("O") && game[1][1].equals("O") && game[2][2].equals("O")) win = 1;
		if (game[0][0].equals("x") && game[1][1].equals("x") && game[2][2].equals("x")) win = 2;
		if (game[0][2].equals("O") && game[1][1].equals("O") && game[2][0].equals("O")) win = 1;
		if (game[0][2].equals("x") && game[1][1].equals("x") && game[2][0].equals("x")) win = 2;
	}
	
	
	void run() {
		setGame();
		while (true) {
			showGame();
			choiceIdx();
			checkWidth();
			checkHeight();
			checkCross();
			if (win == 1) {
				System.out.println("turn1 승리!");
				break;
			} else if (win == 2) {
				System.out.println("turn2 승리!");
				break;
			}
		}
		scan.close();
	}
	
}


public class MethodEx17_연습풀이 {
	
	public static void main(String[] args) {
		TicTacToe_연습 t = new TicTacToe_연습();
		t.run();
		
	}
	
}
