package step6_01.classObject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임 : 클래스 + 변수
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */

/*
class Ex09{
	
	int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
	int[] back = new int[10];
	int answerCnt = 0;		
	
}
*/

public class ClassEx09_정답 {

	public static void main(String[] args) {		
		
		Scanner scan = new Scanner(System.in);
		Random ran =new Random();
		
		Ex09 e = new Ex09();
		
		int i =0;
		
		while (i < 1000) {
			
			int ranNum = ran.nextInt(10);
			
			int temp = e.front[0];
			e.front[0] = e.front[ranNum];
			e.front[ranNum] = temp;
			
			i++;
		}

		int cnt = 0;
		
		while(cnt < e.front.length % 2) {
			
			System.out.println(Arrays.toString(e.front));
			System.out.println();
			System.out.print("선택 1  : ");
			int input1 = scan.nextInt();		
			System.out.print("선택 2  : ");
			int input2 = scan.nextInt();		
			
			if (e.front[input1] == e.front[input2]) {
				
				e.back[input1] = 1;
				e.back[input2] = 1;
				e.front[input1] = 0;
				e.front[input2] = 0;
				cnt++;
				
			}
			else System.out.println("땡 ");
			
			if (cnt < e.front.length % 2) System.out.println("성공 ");
			
		}
		
		
		
		
		
		
	}

}
