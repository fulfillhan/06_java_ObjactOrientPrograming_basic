package step6_02.method;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

class Ex09 {

	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	
	//문제 1)
	void setRandomValuesinArray(int[] scores) {
		
		for (int i = 0; i < scores.length; i++) {
			scores[i] = ran.nextInt(100)+1;
		
			}
		System.out.println(Arrays.toString(scores));
	   }
		
	
	
	
	//문제 2)
	void printSumAndAverage(int[] scores) {
		int total = 0;
		double aver = 0;
		
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		aver = total / 5.0;
		System.out.print("총점("+ total+ ") ");
		System.out.println("평균("+ aver+ ")");
	}
	
	//문제 3)
	void printWinner(int[] scores) {
		int cnt = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 60 ) {
				cnt++;
			}
		}
		System.out.println(cnt + "명");
	}
	
	//문제 4)
	void printScore1(int[] scores) {
		//인덱스 입력받아 성적 출력
		System.out.print("인덱스 입력 : ");
		int idx = scan.nextInt();
		
		for (int i = 0; i < scores.length; i++) {
			if (i == idx) {
				System.out.println("성적 : "+scores[i]+ "점");
			}
		}
		System.out.println();
	}
	
	//문제 5)
	void printScore2(int[] scores) {
		//성적을 입력받아 인덱스 출력
		System.out.print("성적 입력 : ");
		int myScore = scan.nextInt();
		
		for (int i = 0; i < scores.length; i++) {
			if (myScore == scores[i]) {
				System.out.println("인덱스 : "+i);
			}
		}
		System.out.println();
	}
	
	
	
	//문제 6)
	void printScore3(int[] hakbuns, int[] scores) {
		// 학번을 입력받아 성적 출력하는 메서드 // 단, 없는학번 입력 시 예외처리
		System.out.print("학번 입력 : ");
		int myHak = scan.nextInt();
		boolean isFind = false;
		
		for (int i = 0; i < scores.length; i++) {
			if (myHak == hakbuns[i]) {
				System.out.println(scores[i]);
				isFind = true;
				
			}// 여기에 두게 되면 i값이 변하면서 myHak이랑 같지 않은 숫자들은 false 문이 반복적으로 생성.
		}if (isFind == false) {
			System.out.println("해당 학번은 없습니다.");
		}
		System.out.println();
	}
	
	//문제 7)
	void printNumberOne(int[] hakbuns, int[] scores) {
		int maxNum = 0;
		int maxidx = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if (maxNum < scores[i]) {
				maxNum = scores[i];
			    maxidx = i;
			}
		}
		System.out.println(hakbuns[maxidx]+ "번 ("+maxNum+")" );
		
		
	}
	
}


public class MethodEx09_연습 {
	
public static void main(String[] args) {
		
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores  = new int[5];
		
		
		// 문제1) scores배열에 1~100점 사이의 랜덤 정수를 5개 저장하는 메서드
		// 예 1) 87, 11, 92, 14, 47
		Ex09 e = new Ex09();
		e.setRandomValuesinArray(scores);
		

		// 문제2) 전교생의 총점과 평균 출력하는 메서드
		// 예 2) 총점(251) 평균(50.2)
		e.printSumAndAverage(scores);

		// 문제3) 성적이 60점 이상이면 합격이며 합격생 수를 출력하는 메서드
		// 예 3) 2명
		e.printWinner(scores);
		 

		// 문제4) 인덱스를 입력받아 성적 출력하는 메서드
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		e.printScore1(scores);

		// 문제5) 성적을 입력받아 인덱스 출력하는 메서드
		// 정답5) 성적 입력 : 11 인덱스 : 1
		e.printScore2(scores);

		// 문제6) 학번을 입력받아 성적 출력하는 메서드 // 단, 없는학번 입력 시 예외처리
	    // 단, 없는학번 입력 시 예외처리
		// 정답6) 학번 입력 : 1003 성적 : 45점
		e.printScore3(hakbuns, scores);

		// 문제7) 1등학생의 학번과 성적 출력하는 메서드
		// 정답7) 1004번(98점)
		
		e.printNumberOne(hakbuns, scores);
		

	}

}
