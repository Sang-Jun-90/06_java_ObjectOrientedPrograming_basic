package step6_01.classObject;

//# 학생성적관리 프로그램[1단계] : 클래스 + 변수

class Ex03{
	int[] arr = {87, 100, 11, 72, 92};
}



public class ClassEx03_정답 {

	public static void main(String[] args) {
		
		Ex03 e = new Ex03();
		
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		
		int sum = 0;
		
		for (int i = 0; i < e.arr.length; i++) {
			sum += e.arr[i];
		}
		System.out.println(sum);
		System.out.println();
		
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		
		int sum4 = 0;
		
		for (int i = 0; i < e.arr.length; i++) {
			if (e.arr[i] % 4 == 0) sum4+=e.arr[i];
		}
		
		System.out.println(sum4);
		System.out.println();
		
		
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		
		int cnt = 0;
		
		for (int i = 0; i < e.arr.length; i++) {
			if (e.arr[i] % 4 == 0) cnt++;
		}
		System.out.println(cnt);
		System.out.println();
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3


		int cnt2 = 0;
		
		for (int i = 0; i < e.arr.length; i++) {
			if (e.arr[i] % 2 == 0) cnt2++;
		}
		System.out.println(cnt2);
		System.out.println();

	}

}
