package kr.or.ddit.study03.sec04;

import java.util.Scanner;

public class BineryOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BineryOperator obj = new BineryOperator();
		obj.process();

	}

	public void process() {
//		이항연산자 : 대부분의 연산자
//		산술연산자, 관계연산자, 논리연산자, 비트 연산자, 대입연산자
//		method1(); ★
//		method2(); ★
//		method3(); ★
//		method4(); ★
//		method5();
		method6();

	}

	public void method6() {
//		비트 연산자 중요하진않음 참고만
//		>>   나누기8
//		<<   곱하기8
//		금융권은 사용했으나 개발이 완료되어 굳이 건드릴일 없다. 
//		현시점에선 거의 불필요
		int a = 32;
		System.out.println(a>>3);
		System.out.println(a<<3);
	}

	public void method5() {

		int a = 45;
		int b = 24;

		System.out.println(a | b);
		System.out.println(a & b);

	}

	public void method4() {
//		논리 연산자.
//		&&   ||   !  
//		A && B A, B 중 하나라도 거짓이면 거짓
//		A || B A, B 중 하나라도 참이면 참
//		!는 부정

//		A	B	&&	||
//		0	0	0	0
//		1	0	0	1
//		0	1	0	1
//		1	1	1	1

		boolean a = true;
		boolean b = false;

		System.out.println(a && b);
		System.out.println(!(a && b));
		System.out.println(a || b);

		int num = 5;
//		int num = sc.nextInt();

		boolean result = 1 <= num && num < 10;

		System.out.println("num : " + num + "   결과 : " + result);

//		10보다 작거나 50보다 큰 경우 참
		boolean result2 = 10 > num || 50 < num;

	}

	public void method3() {
//		관계연산자
//		> < == >= <= !=             
//		!=는 부정을 뜻함
//		= 위치는 항상 뒤로

		int a = 10;
		int b = 17;

		if (a > b) {
			System.out.println("a가 b보다 크다");
		}
		if (a < b) {
			System.out.println("a가 b보다 작다");
		}
		if (a == b) {
			System.out.println("a가 b보다 같다");
		}
		if (a >= b) {
			System.out.println("a가 b보다 크거나 같다");
		}
		if (a <= b) {
			System.out.println("a가 b보다 작거나 같다");
		}
		if (a != b) {
			System.out.println("a가 b가 다르다");
		}

	}

	public void method2() {
//		대입연산자
//		= : '=' 오른쪽 값을 '=' 왼쪽에 저장 우선순위가 가장 늦다.
//		'=' 과 다른 연산자가 결합

		int a = 10;
		int b = 4;

		System.out.println("a=a+b => a += b => " + (a += b));
		System.out.println("a=a-b => a += b => " + (a -= b));
		System.out.println("a=a*b => a += b => " + (a *= b));
		System.out.println("a=a/b => a += b => " + (a /= b));
		System.out.println("a=a%b => a += b => " + (a %= b));
	}

	public void method1() {
		// 이항연산자
//		+ - / * %

		int a = 5;
		int b = 3;

		System.out.println("덧셈 : " + (a + b));
		System.out.println("뺄셈 : " + (a - b));
		System.out.println("곱셈 : " + (a / b));
		System.out.println("나눗셈 : " + (a * b));
		System.out.println("나머지 : " + (a % b));

	}

}
