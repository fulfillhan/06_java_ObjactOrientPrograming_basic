package step6_02.method;

import java.util.Arrays;

class Ex10_연습 {
	int test1(int[] arr) { 
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				cnt++;
			}
		}
		return cnt; 
	}
	// 문제 2) 4의 배수의 개수만큼의 새로운 배열을 만들고, 4의 배수를 저장후 배열을 리턴해주는 메서드
	int[] test2(int[] arr) {
		
		int cnt = test1(arr);
		int[] temp = new int[cnt];// 3개의 자리의 새로운 배열
		
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) { //if 문에 맞는 숫자들을 temp[] 배열에 넣을거니깐,,, 
				temp[j]=arr[i];
				j++;
			}
		}
		
		return  temp;
		}
		
}

public class MethodEx10_연습 {
	
	public static void main(String[] args) {
		 Ex10_연습 e = new Ex10_연습();
		 
		int[] arr = {87, 12, 21, 56, 100};
		
		
		 // 문제 1) 4의 배수의 개수를 리턴해주는 메서드 
		 int cnt = e.test1(arr);
		 System.out.println("cnt = "+ cnt);
		 
		 //문제 2) 4의 배수의 개수만큼의 새로운 배열을 만들고, 4의 배수를 저장후 배열을 리턴해주는 메서드
		 //e.test2(arr); System.out.println(Arrays.toString(temp));
		 int[] temp = e.test2(arr);
		 System.out.println(Arrays.toString(temp));
		 
	}

}
