package step6_01.classObject;

import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임 : 클래스 + 변수
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */


class Ex09_연습{
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	int answerCnt = 0;		
	
}


public class ClassEx09_연습 {

	public static void main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		Ex09_연습 e = new Ex09_연습();
		
		//셔플 로직
		int size = e.front.length;
		
		for (int i = 0; i <1000; i++) {
			int r = ran.nextInt(size);// 무작이의 랜덤값을 인덱스로 가정한다.
			int temp = e.front[0];
			e.front[0] = e.front[r];
			e.front[r] = temp;
		}
		
		while(true) {
			//front 배열
			for (int i = 0; i < size ; i++) {
				if(e.front[i] == 1)      System.out.print("○\t");
				else if(e.front[i] == 2) System.out.print("□\t");
				else if(e.front[i] == 3) System.out.print("△\t");
				else if(e.front[i] == 4) System.out.print("♤\t");
				else if(e.front[i] == 5) System.out.print("◇\t");
			}
			 System.out.println();
			 //back 배열
			 for (int i = 0; i < size; i++) {
				if(e.back[i] == 1)       System.out.print("○\t");
				else if(e.back[i] == 2) System.out.print("□\t");
				else if(e.back[i] == 3) System.out.print("△\t");
				else if(e.back[i] == 4) System.out.print("♤\t");
				else if(e.back[i] == 5) System.out.print("◇\t");
				else                     System.out.print("■\t");
			}
			 System.out.println();
			
			 System.out.print("인덱스1 입력 : ");
			 int idx1 = scan.nextInt();
			 
			 System.out.print("인덱스2 입력 : ");
			 int idx2 = scan.nextInt();
			 
			 //해당 데이터 나타내기
			 if(e.front[idx1] == e.front[idx2]) {//내가 입력한 인덱스 값이 front의 위치의 데이터가 같다면
				e.back[idx1] =  e.front[idx1];//front의 데이터를 back의 데이터에 저장
				e.back[idx2] =  e.front[idx2];
				e.answerCnt++;
			 }
			 
			 if(e.answerCnt >= 5) {
				 System.out.println("범위초과");
				 break;
			 }
			
		}
			scan.close();
	}

}
