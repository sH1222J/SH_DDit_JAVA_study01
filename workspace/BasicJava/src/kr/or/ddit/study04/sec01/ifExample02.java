package kr.or.ddit.study04.sec01;

import java.util.Scanner;

public class ifExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ifExample02 obj = new ifExample02();
		obj.process();

	}

	public void process() {
//		method1();
//		method2();
		method3();
	}

	public void method3() {

		// 점수를 입력하고 학점을 출력하시오.
		// 끝자리가 0~2 -
		// 3~6 0
		// 7~9 +
		// 88 -> B+
		// 100 -> A+
		int score = sc.nextInt();
		String grade = "";

		if (score == 100)
			grade = "A+";
		else if (score >= 90) {
			grade = "a";
			if (score % 10 <= 2) {
				grade += "-";

			} else if (score % 10 <= 6) {
				grade += "0";

			} else {
				grade += "+";

			}
		}

	}

//
//	public void method2() {
//		int a = sc.nextInt();
//		int b = sc.nextInt();
////		a < b
////		a b  값 바꾸기
//		if (a < b) {
//			int temp = a;
//			a = b;
//			b = temp;
//
//	public void method1() {
//		// 숫자 a, b 중 큰 숫자를 출력하세요.
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//
//		if(a<b)
//		{
//			System.out.println(b);
//		}
//
//		else
//		{
//			System.out.println(a);
//		}
//	}
