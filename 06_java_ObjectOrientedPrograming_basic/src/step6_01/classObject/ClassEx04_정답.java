package step6_01.classObject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
class Ex04 {

	int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
	int[] scores  = new int[5];
	
}
*/


public class ClassEx04_정답 {

	public static void main(String[] args) {
		
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		
		Random ran = new Random();
		Ex04 e = new Ex04();
		
		
		for (int i = 0; i < e.scores.length; i++) {
			e.scores[i] = ran.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(e.scores));
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		
		int sum = 0;
		
		for (int i = 0; i < e.scores.length; i++) {
			sum += e.scores[i];
		}
		System.out.println(sum);
		System.out.println(sum/e.scores.length);
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		
		int suc = 0;
		
		for (int i = 0; i < e.scores.length; i++) {
			if (e.scores[i] >=60) suc++;
		}
		System.out.println(suc);
		
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1	성적 : 11점
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int idx = scan.nextInt();
		for (int i = 0; i < e.scores.length; i++) {
			if (i == idx) System.out.println("e.scores[i");
		}
		
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11		인덱스 : 1
		
		int score = scan.nextInt();
		
		for (int i = 0; i < e.scores.length; i++) {
			if (e.scores[i] == score) System.out.println(i);
		}
		
		
		
		
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003	성적 : 45점
		
		System.out.println("입력 : ");
		int hb = scan.nextInt();		
		
		for (int i = 0; i < e.scores.length; i++) {
			if (e.hakbuns[i] == hb) System.out.println(e.scores[i]);
		}
		
		
		
		// 문제7) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예   7)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		
		// 문제8) 1등학생의 학번과 성적 출력
		// 정답8) 1004번(98점)

	}

}
