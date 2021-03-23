package step6_01.classObject;
/*
 * # 숫자이동[3단계] : 클래스 + 변수
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 * 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
 * 예) 
 *  0 0 0 0 0 0 0 2 
 *  왼쪽(1) 오른쪽(2) : 2
 *  
 *  2 0 0 0 0 0 0 0 
 */

import java.util.Scanner;

/*
class Ex08{
	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
}
*/


public class ClassEx08_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Ex08 e = new Ex08();
		
		int playerLocation =4;
		
		while (true) {
			
			for (int i = 0; i < e.game.length; i++) {
				if (e.game[i] == 0) System.out.print("[ ]");
				else if (e.game[i] == 1) System.out.print("||");
				else if (e.game[i] == 2) System.out.print("옷");
			}
			System.out.println();
			System.out.print("선택(좌-1,우-2) : ");
			int choice = scan.nextInt();
			
			if (choice == 1) {
				if (playerLocation == 0) continue;
				if (e.game[playerLocation-1] == 1) {
					
					System.out.print("벽깨기 ?");
					int wall = scan.nextInt();
							
					if (wall == 3) {
						e.game[playerLocation] = 0;
						e.game[playerLocation-1] = 2;
						playerLocation--;
						continue;
					}
					else continue;
					
					
				}
				e.game[playerLocation] = 0;
				e.game[playerLocation-1] = 2;
				playerLocation--;
				
				
			}
			else if (choice ==2) {
				if (playerLocation == 8) continue;
				
				if (e.game[playerLocation+1] == 1) {
					System.out.print("벽깨기 ?");
					int wall = scan.nextInt();
					
					if (wall == 3) {
						e.game[playerLocation] = 0;
						e.game[playerLocation+1] = 2;
						playerLocation++;
						continue;
					}
					else continue;
					
				}
				
				e.game[playerLocation] = 0;
				e.game[playerLocation+1] = 2;
				playerLocation++;
			}
			
			
		}
		
		
		
		
	}

}
