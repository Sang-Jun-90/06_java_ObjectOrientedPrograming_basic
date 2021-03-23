package step6_02.method;



/*
 * # 메서드 오버로딩(overloading) , 메서드 중복정의
 * 
 *  1) 매개변수의 개수와 2) 매개변수의 데이터 타입이 달라도
 *  같은 이름의 복수의 메서드를 가질 수 있는 기법 
 *  [ 메서드 오버라이딩과 헷갈림 주의 ]
 *  
 */

class MethodoverloadingEx {
	
	int add(int x , int y) {
		return x + y;
	}
	
	int add(int x, int y, int z) {
		return x + y + z;
	}
	
	double add(double x , double y) {
		return x + y;
	}
	
	int add(int[] arr) {
		int total =0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		return total;
	}
	
	

	
	
}

public class MethodEx18 {

	public static void main(String[] args) {

		
		MethodoverloadingEx obj = new MethodoverloadingEx();
		
		int[] arr = {1,2,3,4,5};
		
		int r1 = obj.add(3,7);
		int r2 = obj.add(3,6,10);
		double r3 = obj.add(3.14,61.7);
		int r4 = obj.add(arr);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		
		
	}

}