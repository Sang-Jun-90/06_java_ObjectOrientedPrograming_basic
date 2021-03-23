
package step6_02.method;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


class Ex09 {

	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	
	//문제 1)
	void setRandomValuesinArray(int [] scores) {
		
		for (int i = 0; i < scores.length; i++) {
			scores[i] = ran.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(scores));
		
	}
	
	//문제 2)
	void printSumAndAverage (int [] scores) {
		
		int sum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println(sum);
		System.out.println(sum / scores.length);
	}
	
	//문제 3)
	void printWinner (int [] scores) {
		
		int suc = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >=60) suc++;
		}
		
		System.out.println(suc);
		
	}
	
	//문제 4)
	void printScore1 (int [] scores) {
		
		System.out.print("인덱스입력 : ");
		int input = scan.nextInt();		
		
		for (int i = 0; i < scores.length; i++) {
			if (i == input) System.out.println(scores[i]);
		}
		
	}
	
	//문제 5)
	void printScore2 (int [] scores) {
		
		System.out.print("성적입력 : ");
		int input = scan.nextInt();		
		
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] == input) System.out.println(i);
		}
		
	}
	
	//문제 6)
	void printScore3(int [] hakbuns, int [] scores) {
		
		System.out.print("학번입력 : ");
		int input = scan.nextInt();		
		
		for (int i = 0; i < scores.length; i++) {
			if (hakbuns[i] == input) System.out.println(scores[i]);
		}
		
	}
	
	//문제 7)
	void printNumberOne (int [] hakbuns, int [] scores) {
		
		int maxStudent = 0;
		int maxScore = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if (maxScore < scores[i]) {
				maxScore = scores[i];
				maxStudent = hakbuns[i];
			}
		}
		
	}
	
}


public class MethodEx09_정답 {

	public static void main(String[] args) {
		
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores  = new int[5];
		
		Ex09 e = new Ex09();
		
		// 문제1) scores배열에 1~100점 사이의 랜덤 정수를 5개 저장하는 메서드
		// 예 1) 87, 11, 92, 14, 47

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
		e.printScore3(hakbuns,scores);

		// 문제7) 1등학생의 학번과 성적 출력하는 메서드
		// 정답7) 1004번(98점)
		e.printNumberOne(hakbuns,scores);

	}

}
