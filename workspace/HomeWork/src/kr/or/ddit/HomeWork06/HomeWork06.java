package kr.or.ddit.HomeWork06;
import java.util.Scanner;

public class HomeWork06 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork06 obj = new HomeWork06();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
		method3();
//		method4();
	}
	
	public void method1() {
		// 스캐너를 이용해서 구구단 한단만 출력하시오 .
		// ex ) 2
		// 2*1 =2
		// 2*2 =4
		// .
		// .
		// 2*9 = 18
		System.out.println("1~9단중 하나를 선택하세요.");
		int dan = sc.nextInt();
		for (int i = dan; i <= 9;) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			break;
		}

	}

	public void method2() {
		// 구구단
		// 2*1=2 3*1=3 4*1=4 .... 9*1=9
		// 2*2=2 3*2=3 4*2=4 .... 9*2=18
		// 2*3=2 3*3=3 4*3=4 .... 9*3=27
		//
		//
		// 2*9=2 3*9=3 4*9=4 .... 9*9=81
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + j * i + "   ");
			}
			System.out.println("\n");
		}
	}

	public void method3()  {
		// 스캐너를 이용해서 특정 단을 뺀 구구단을 출력하시오.
		// ex ) 3
		// 2*1=2   4*1=4 ....  9*1=9
		// 2*2=2   4*2=4 ....  9*2=18
		// 2*3=2   4*3=4 ....  9*3=27
		//
		//
		// 2*9=2   4*9=4 ....  9*9=81
		System.out.println("1~9단중 스킵할 단을 입력해주세요.");
		int skip = sc.nextInt();
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i == skip) {
					continue; // 입력한 단을 건너뜀
				}
				System.out.printf("%d * %d = %d\t", i, j, i * j);
			}
			System.out.println(); // 한단어 끝나면 줄바꿈
		}
	}
	
		// 스캐너를 이용해서 특정 단을 뺀 구구단을 출력하시오.
		// ex ) 3
		// 2*1=2 4*1=4 .... 9*1=9
		// 2*2=2 4*2=4 .... 9*2=18
		// 2*3=2 4*3=4 .... 9*3=27
		//
		//
		// 2*9=2 4*9=4 .... 9*9=81

	
	
	
	
	
	
	
	public void method4() {
		// 홀수를 입력하면 홀수의 합 
		// 짝수를 입력하면 짝수제곱의 합을 구하시오.
		// ex) 5 -> 1+3+5 
		//     6 -> 2*2 +4*4+6*6
		
		
		
	}
	
	
}
