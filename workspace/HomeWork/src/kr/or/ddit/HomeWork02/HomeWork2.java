package kr.or.ddit.HomeWork02; // 이거 잘확인하기

import java.util.Scanner;

public class HomeWork2 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork2 obj = new HomeWork2();
		obj.method1();
//		obj.mehtod2();
//		obj.mehtod3();
//		obj.mehtod4();
//		obj.mehtod5();
	}

	public void method1() {
		/*
		 * 스캐너를 통해서 문자(실수)를 입력 받고. 소수점 2째 짜리에서 버림 ex ) 12.23123 - > 12.23
		 */
//		Math.round(숫자)  -> 반올림
//		Math.ceil(숫자)     -> 올림
//		Math.floor(숫자)    -> 내림

		System.out.println("실수 를 입력해주세요.");
		String str = sc.nextLine();

		double num = Double.parseDouble(str);
//		double num = Double.valueOf(str);

		int num = (int) (num * 100);

		double result = i / 100;

		System.out.println(result);

	}

	public void mehtod2() {
		/*
		 * 스캐너를 통해서 대문자를 입력 받고 소문자로 변환 ex) A-> a
		 */
		System.out.println("대문자를 입력 해주세요.");
		String s = sc.nextLine();

		char ch = s.charAt(0);

		ch = (char) (ch - 32);

		System.out.println(ch);

	}

	public void mehtod3() {
		/*
		 * 스캐너를 통해서 소문자를 입력 받고 대문자로 변환 ex) f-> F
		 */
		System.out.println("소문자를 입력 해주세요.");
		String s = sc.nextLine();
		char ch1 = ch.charAt(0);
		int num = (int) ch1 - 32;

		char ch2 = (char) num;

		System.out.println("대문자 : " + ch2);

	}

	public void mehtod4() {
		/*
		 * 스캐너를 통해서 숫자 3자리를 입력 받고 각 자리수의 합을 구하시오 ex) 123 -> 1+2+3
		 */
		System.out.println("세자리 숫자를 입력해주세요.");
		String s = sc.nextLine();
		
//		char ch1 = s.charAt(0);
//		char ch2 = s.charAt(1);
//		char ch3 = s.charAt(2);
//		
//		int result = ch1'0'+ch2'0'+ch3'0';

		int s = Integer.parseInt(s);
		
		int i1=i/100;
		i = i1*100;
		
		int i1=i/10;
		i = i*i2*10;
		
		int i3=i;
		
		
		
		
	}

	public void mehtod5() {
		/*
		 * 스캐너를 통해서 문자(실수)를 입력 받고. 소수점 2째 짜리에서 반올림 ex ) 12.2623 - > 12.3
		 * 
		 * 12.2623 + 0.05
		 */

		String s = sc.nextLine();

		Double d = Double.parseDouble(s);

		d = d + 0.05;

		int i = (int) d * 10;
		double result = i / 10.0;

	}

}
