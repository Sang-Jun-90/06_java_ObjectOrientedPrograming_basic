package step6_02.method;

import java.util.Arrays;
import java.util.Scanner;

class Ex05{

	int test1() {
		
		int a= 0;
		
		for (int i = 1; i < 6; i++) {
			a+=i;
		}
		
		return a;
	}
	
	void test2() {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("입력 : ");
			int input = scan.nextInt();
			arr[i] = input;
		}
		scan.close();
		System.out.println(Arrays.toString(arr));
	}
	
}


public class MethodEx05_정답 {

	public static void main(String[] args) {

		
		Ex05 e = new Ex05();
					
		// 문제 1) 1부터 5까지의 합을 출력하는 메서드
		int a = e.test1();
		System.out.println(a);
		
		// 문제 2) 정수 3개를 배열에 입력받아 최대값을 출력하는 메서드
		e.test2();
		


	}

}
