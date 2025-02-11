package kr.or.ddit.study04.sec02;

import java.util.Scanner;

public class ForExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ForExample02 obj = new ForExample02();
		obj.process();

	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method6();
		method7();
//		method1();
//		method1();
	}

	public void method7() {
		A: for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(i + ", " + j + "\t");
				if (j == 7) {
					break A;
				}
				System.out.println();
			}
		}
	}

	public void method6() {
		for (int i = 1; i <= 10; i++) {
			boolean chk = false;
			for (int j = 1; j <= 10; j++) {
				System.out.print(i + ", " + j + "\t");
				if (i == 7) {
					chk = true;
					break;
				}
			}
			System.out.println();
			if (chk)
				break;

		}
	}

	public void method5() {
//		입력한 단까지만 출력
		int end = sc.nextInt();
		for (int dan = 2; dan < 9; i++) {
			// 1
			System.out.printf("%d*%d=%d\n", dan, i, dan * i);
		}
		// 2
		if (end == dan)
			break;
	}

	public void method4() {
//		1~10까지 출력
//		입력한 숫자까지만 출력
		int end = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			if (i <= end)
				System.out.println(i);
			if (i == end)
				break;

		}

	}

	public void method3() {
//		구구단 출력
//		입력한 단은 출력x
		System.out.println("2~9 입력 : ");
		int next = sc.nextInt();
		for (int dan = 2; dan <= 9; dan++) {
			if (dan == next)
				continue;
		}
		for (int i = 1; i <= 9; i++) {
//			System.out.println(dan + "*" + i + "=" + dan * i);
			System.out.printf("%d*%d=%d\n", dan, i, dan * i);
		}
	}

//		int next = sc.nextInt();
//		for (int i = 2; i <= 9; i++) {
//			System.out.println(i + "단");
//			for (int j = 1; j <= 9; j++) {
//				if (i == next)
//					continue;
//				System.out.println(i + "*" + j + "=" + i * j);
//			}
//		}
//	}

	public void method2() {
//		1~10까지 출력
//		next 랑 같은 값일 경우 넘길것.
		int next = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
//			if(i!==next) System.out.println(i);
			if (i == next)
				continue;
			System.out.println(i);

		}
	}

	public void method1() {
//		구구단 출력하기
//		2단
//		2*1=2
//		2*2
//		
//		9단
//		9*1=
//		
//		9*9; // i*j
		for (int i = 2; i <= 9; i++) { // 2단부터 시작
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}
	}
}
