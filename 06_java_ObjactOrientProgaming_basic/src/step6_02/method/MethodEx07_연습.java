package step6_02.method;

import javax.swing.tree.DefaultTreeCellEditor.EditorContainer;

class Ex07_연습 {

	void printEvenOrOdd(int x) {
		if (x % 2 == 0) {
			System.out.println("짝수");
		} else if (x % 2 == 1) {
			System.out.println("홀수");
		}
	}

	void getAvgBetweenValues(int x, int y) { //-> 여기서부터 하세요.
		/*
		 * int aver = 0; int total = 0; for (int i = x; i <= y; i++) { total += i; aver
		 * = total / i; } System.out.println(aver);
		 */

	}

	void printPrimeNums(int primeNumber) {

	}

}

public class MethodEx07_연습 {
	public static void main(String[] args) {

		Ex07_연습 e = new Ex07_연습();

		// 문제 1) num이 홀수인지 짝수인지 출력하는 메서드
		int num = 19;
		e.printEvenOrOdd(num);
		// 문제 2) x부터 y까지 합의 평균을 출력하는 메서드
		int x = 1;
		int y = 10;
		e.getAvgBetweenValues(x, y);
		// 문제3) 2부터 primeNumber까지의 소수를 전부 출력하는 메서드

	}
}
