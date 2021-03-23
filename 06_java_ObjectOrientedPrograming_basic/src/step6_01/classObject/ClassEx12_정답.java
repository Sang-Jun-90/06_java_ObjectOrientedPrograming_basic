package step6_01.classObject;
/* 
 * # 틱택토
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]인덱스 입력 : 6
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]승리
 * 
 */

import java.util.Scanner;

/*
class Ex12{
	String[][] game = new String[3][3];
	
	int turn = 0;
	int win = 0;		
}
*/


public class ClassEx12_정답 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Ex12 e = new Ex12();
		
		while(true) {
			System.out.println("=============");
			for (int i = 0; i < 3; i++) {
				
				for (int j = 0; j < 3; j++) {
					if (e.game[i][j] == null) e.game[i][j] = " ";
					System.out.print("[" + e.game[i][j] + "]");
				}
				System.out.println();
			}
			int inputx = 0;
			int inputy = 0;
			if (e.turn == 0) {
				System.out.print("P1 턴 x 입력 : ");
				inputx = scan.nextInt();
				System.out.print("P1 턴 y 입력 : ");
				inputy = scan.nextInt();
				
				if(e.game[inputx][inputy]==" ") {
					e.game[inputx][inputy] = "X";
				}
				
				e.turn = 1;
			}
			else {
				System.out.print("P2 턴 x 입력 : ");
				inputx = scan.nextInt();
				System.out.print("P2 턴 y 입력 : ");
				inputy = scan.nextInt();
				
				if(e.game[inputx][inputy]==" ") {
					e.game[inputx][inputy] = "O";
				}
				
				e.turn = 0;
			}
			
			
			

		}
		
		
		
	}

}
