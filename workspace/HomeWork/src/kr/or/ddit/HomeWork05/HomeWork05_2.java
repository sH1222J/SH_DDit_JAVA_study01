package kr.or.ddit.HomeWork05;

import java.util.Scanner;

public class HomeWork05_2 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork05 obj = new HomeWork05();
		obj.process();
	}

	public void process() {
//		method0();
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
		method7();
	}

	public void method0() {
		// 과제풀기전 예제
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print("*");
			}
			System.out.println("");

		}

	}

	public void method1() { // 수업때 연습으로 풀음
//		   row = 4 
//		       *
//		       **
//		       ***
//		       ****

//		for (int i = 0; i < 5; i++) {
//			for (int star = 0; star <= i; star++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}

		int row = sc.nextInt();

		for (int line = 0; line < row; line++) {
			for (int star = 0; star < line; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void method2() {
//		   row = 4 
//		 *         *
//		 *        **
//		 *       ***
//		 *      ****
//		 
		System.out.print("피라미드 만들 별의 갯수 입력 : ");
		int row = sc.nextInt();

//		for (int line = 0; line < row; line++) {
//			for(int space=0;space<()) {
//				for(int space=0;space())
//			}
//		}
		
		
		
		
//			for (int space = 1; space < row - line; space++) {
//				System.out.print(" ");
//			}
//			for (int star = 0; star <= line; star++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}

	public void method3() {
		System.out.print("피라미드 만들 별의 갯수 입력 : ");
		int row = sc.nextInt();

	}

//		   row = 4 
//		 *      ****
//		 *       ***
//		 *        **
//		 *         *
//		System.out.print("피라미드 만들 별의 갯수 입력 : ");
//		int row = sc.nextInt();
//		for (int line = 0; line < row; line++) {
//			for (int space = 0; space < line; space++) {
//				System.out.print(" ");
//			}
//			for (int star = 0; star < row - line; star++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}

	public void method4() {
		System.out.print("피라미드 만들 별의 갯수 입력 : ");
		int row = sc.nextInt();

		int row = sc.nextInt();

		for (int line = 0; line < row; line++)
			;

	}
//		   row = 4 
//		 *      ****
//		 *      ***
//		 *      **
//		 *      *
//		 
//		System.out.print("피라미드 만들 별의 갯수 입력 : ");
//		int row = sc.nextInt();
//		for (int line = 0; line < row; line++) {
//			for (int star = 0; star < line; star++) {
//				System.out.print(" ");
//			}
//			for (int star = 0; star < row - line; star++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}

	public void method5() {
		System.out.print("피라미드 만들 별의 갯수 입력 : ");
		int row = sc.nextInt();
		for(int line=0;line<row;line++) {
			for(int space=0;space<(row-1)-line;space++) {
				System.out.print(" ");
			}
			for(int space=0;space<line*2+1;space++) {
				System.out.print("*");
		}
			System.out.println();
	}
//		   row = 4 
//		 *      *
//		 *     ***
//		 *    *****
//		 *   *******

//		System.out.print("피라미드 만들 별의 갯수 입력 : ");
//		int row = sc.nextInt();
//		for (int line = 0; line < row; line++) {
//			for (int space = 0; space < row - line; space++) {
//				System.out.print(" ");
//			}
//			for (int star = 0; star < 2 * line + 1; star++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}

	public void method6() {
//		   row = 4 
//		 *   *******
//		 *    *****
//		 *     ***
//		 *      *

		System.out.print("피라미드 만들 별의 갯수 입력 : ");
		int row = sc.nextInt();
		for (int line = 0; line < row; line++) {
			for (int space = 0; space < line; space++) {
				System.out.print(" ");
			}
			for (int star = 0; star < 2 * (row - line) - 1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void method7() {
		System.out.print("피라미드 만들 별의 갯수 입력 : ");
		int row = sc.nextInt();
		
		for(int star=0;star<row;line++) {
			for(int i=0;i<row;i++) {
				if(i==0 ||i==row-1) {
					System.out.println("*");
				}
				
			}
		}
	}

//		 *    row = 4 
//		 *    ****
//		 *    *  *
//		 *    *  *
//		 *    ****

//		System.out.print("피라미드 만들 별의 갯수 입력 : ");
//		int row = sc.nextInt();
//
//		for (int line = 1; line <= row; line++) {
//			for (int star = 1; star <= row; star++) {
//				// 첫 번째 줄, 마지막 줄, 첫 번째 열, 마지막 열에 별 출력
//				if (line == 1 || line == row || star == 1 || star == row) {
//					System.out.print("*");
//				} else {
//					System.out.print(" "); // 내부는 공백
//				}
//			}
//			System.out.println(); // 줄바꿈
//		}
//	}
//}
