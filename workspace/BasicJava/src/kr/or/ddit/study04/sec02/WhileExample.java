package kr.or.ddit.study04.sec02;

import java.util.Scanner;

public class WhileExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		WhileExample obj = new WhileExample();
		obj.process();

	}

	public void process() {
		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method1();
	}

	public void method5() {
//		숫자를 입력받고 값을 계속 누적.
//		100을 넘었다면 종료 하고 시행횟수를 출력
		int total = 0;

		while (true) {
			System.out.println("숫자:");
			int num = sc.nextInt();
			total += num;
//			if (total > 100)				break;
		}

	}

	public void method4() {
		String menu = "1. 아메리카노 \n" + "2. 딸기에이드 \n" + "3. 카페라떼 \n" + "4. 종료";
		String bill = "";
		int total = 0;
		while (true) {

		}

		while (true) {
			//
			System.out.println(menu);
			int sel = sc.nextInt();
		}
		System.out.println(bill);

	}

	public void method3() {
//		자리수의 합을 구하시오.

		int n = 123;

		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
	}

	public void method2() {
//		1~10까지의 합

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1~10까지의 합: " + sum);
	}

	public void method1() {
//		while (조건식)
			while (true) {
				System.out.println("동작중입니다.");
			}
//		for(;;)
//				System.out.println("동작중입니다.");
//	}

	}
}
