package step6_02.method;

/*
 * 
 * # 메서드 오버로딩(overloading) , 메서드 중복정의
 * 
 *  1) 매개변수의 개수와 2) 매개변수의 데이터 타입이 달라도
 *  같은 이름으로 만들어진 여러개의 메서드를 사용할 수 있는 기법  [ 메서드 오버라이딩과 헷갈림 주의 ]
 *  
 */

class MethodOverloadingEx {

	int add(int x , int y) {
		return x + y;
	}
	
	int add(int x , int y , int z) {
		return x + y + z;
	}
	
	double add(double x , double y) {
		return x + y;
	}
	
	int add(int[] arr) {
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		return total;
	}
	
}


public class MethodEx19 {

	public static void main(String[] args) {
		
		MethodOverloadingEx object = new MethodOverloadingEx();
		
		System.out.println(object.add(12, 3));
		System.out.println(object.add(12, 3, 1));
		System.out.println(object.add(3.14 , 7.14));
		
		int[] arr = {1,2,3,4,5};
		System.out.println(object.add(arr));
		System.out.println();
		
		//메서드 오버로딩 예시
		System.out.println("글자");
		System.out.println(3);
		System.out.println(3.14);
		
		String testData = "글자데이터";
		testData.substring(1);
		testData.substring(1, 3);
		
		
		
	}

}
