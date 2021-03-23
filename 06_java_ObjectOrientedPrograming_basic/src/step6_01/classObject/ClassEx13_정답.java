package step6_01.classObject;
/* 
 * # 1 to 50[3단계] : 1 to 18
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 front 배열에 저장하고,
 *    숫자 10~18은 back 배열에 저장한다.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
class Ex13{
	final int SIZE = 9;
	
	int[] front = new int[SIZE];
	int[] back  = new int[SIZE];
}
*/


public class ClassEx13_정답 {

	public static void main(String[] args) {

		Ex13 e = new Ex13();
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		for (int i = 0; i < e.SIZE; i++) {
			e.front[i] = i+1;
			e.back[i] = i+10;
		}

		int i = 0;
		
		while (i < 1000) {
			int ranNum = ran.nextInt(9);
			int ranNum2 = ran.nextInt(9);
			
			int temp1 = e.front[0];
			e.front[0] = e.front[ranNum];
			e.front[ranNum] = temp1;
			
			int temp2 = e.back[0];
			e.back[0] = e.back[ranNum2];
			e.back[ranNum2] = temp2;
			
			i++;
		}
		
		int num = 1;
		
		while (true) {
			
			if (num > 18) break;
			
			for (int j = 0; j < 9; j++) {
				System.out.print(" "+e.front[j] + " ");
				if((j+1)%3 == 0)System.out.println();
			}
			
			System.out.print("입력 : ");
			int input = scan.nextInt();
			
			if (num == e.front[input] && num < 10) {
				e.front[input] = e.back[input];
				num++;
			}
			else if (num == e.front[input]) {
				e.front[input] = 0;
				num++;
			}
			
		}
		
		
	}

}
