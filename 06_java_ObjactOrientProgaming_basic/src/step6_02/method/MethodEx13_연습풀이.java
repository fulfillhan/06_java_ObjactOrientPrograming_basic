package step6_02.method;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

/*
 * # OMR카드 : 클래스 + 메서드
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표 = {O, X, O, X, X}
 * 성적   = 40점
 */

class scoreMng_연습 {
	Random ran = new Random();
	

	int[] answer = {1, 4, 3, 2, 5};// 정답지
	int[] studentAns = new int[5];// 5개 자리의 배열 선언, 학생답안
	
	int answerCnt = 0;//정답을 맞춘 갯수
	int score = 0;
	
    
	//1.답안 완성
	void writeAnswer() {
		for (int i = 0; i < studentAns.length; i++) {
			studentAns[i] = ran.nextInt(5)+1;//랜덤숫자 지정
		}
	}
	
	//2.정답 출력
	void printAnswer() {
		
		// 정답지 출력	
	 System.out.println("omr : "+ Arrays.toString(answer));
	 
		// 학생 답 출력
	 System.out.println("studentNum : "+ Arrays.toString(studentAns));

	 
	}
	
	//3.정답 비교
	void checkAnswer(){
		int asnwerCnt = 0;//정답 맞춘 횟수
		
		System.out.print("정오표 : [");
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] == studentAns[i]) {
				System.out.print("O ");//정답
				answerCnt++;//정답 맞춘 횟수 증가
				
			}
			else if (answer[i] != studentAns[i]) {
				System.out.print("x ");
				//answernt--;
			}
			
		}
		System.out.print("]");
		System.out.println();
		
		score = answerCnt * 20;
		System.out.println("점수 출력 : "+ score+ "점");
	}
	
	//4.실행
	void run() {
		writeAnswer();
		printAnswer();
		checkAnswer();
		
	}
}

public class MethodEx13_연습풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scoreMng_연습 sm1 = new scoreMng_연습();
		sm1.run();
	

	}

}
