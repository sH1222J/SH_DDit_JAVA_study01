package kr.or.ddit.study03.sec03;

import java.util.Scanner;

public class CastExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		CastExample02 obj = new CastExample02();
		obj.process();

	}

	public void process() {
//		method1();
		method2();
//		method3();
//		method4();
//		method5();
//		method6();

	}

	public void method6() {
//		20 ~30까지 랜덤 만들기.
//		0~10 --- 11개
//		1~10 --- 10개
//		0~10  +20 --- 20~30

		int ran = (int) (Math.random() * 11) + 20;
		System.out.println(ran);

	}

	public void method5() {
//		Math.random()*10 -> 0~9.9999
//		(int) (Math.random()*10) -> 0~9

//		1~10
		int ran = (int) (Math.random() * 10) + 1;
		System.out.println(ran);

	}

	public void method4() {
		System.out.println("국어점수를 입력하세요.");
		String korStr = sc.nextLine();

		System.out.println("영어점수를 입력하세요.");
		String engStr = sc.nextLine();

		System.out.println("수학점수를 입력하세요.");
		String mathStr = sc.nextLine();

//		국영수 점수를 입력 받고 각 점수를 출력하고.
//		총점, 평균을 출력하시오.
		int kor = Integer.parseInt(korStr);
		int eng = Integer.valueOf(engStr);
		int math = Integer.parseInt(mathStr);
		System.out.println("국어 : " + kor + ", 영어 : " + eng + ", 수학 : " + math);

		int sum = kor + eng + math;
//		int total = sum / 3;
		double total = sum / 3.0;

		System.out.println("총점 : " + sum + "평균 : " + total);

	}

	public void method3() {

		System.out.println("문자를 입력하세요.");
		String str = sc.nextLine();

		System.out.println("입력 받은 문자열 : " + str);

	}

	public void method2() {
		String str1 = "20";

		// byte short int long float double char boolean

		// String -> byte
		byte bte = Byte.parseByte(str1);

		short sh = Short.valueOf(str1);

	}

	public void method1() {

		int a = 20;
		int b = 25;

		string year = a + b + "";
		System.out.println(year);
		
		String str1 = String.valueOf(a);
		String str2 = ""+a+b

	}

}
