package kr.or.ddit.homework02;

import java.util.Scanner;

public class HomeWork2 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork2 obj = new HomeWork2();
//		obj.method1();
//		obj.mehtod2();
//		obj.mehtod3();
//		obj.mehtod4();
		obj.mehtod5();
	}
	
	public void method1() {
		/*
		 *  스캐너를 통해서 문자(실수)를 입력 받고.
		 *  소수점 2째 짜리에서 버림  
		 *  ex ) 12.23123 - > 12.23
		 */
		System.out.println("실수 를 입력해주세요.");
		String str = sc.nextLine();
		
	}
	
	public void mehtod2() {
		/*
		 *  스캐너를 통해서 대문자를 입력 받고 소문자로 변환 
		 *  ex) A-> a  
		 */
		System.out.println("대문자를 입력 해주세요.");
		String s = sc.nextLine();
		
	}
	public void mehtod3() {
		/*
		 *  스캐너를 통해서 소문자를 입력 받고 대문자로 변환 
		 *  ex) f-> F  
		 */
		System.out.println("소문자를 입력 해주세요.");
		String s = sc.nextLine();
	}
	
	public void mehtod4() {
		/*
		 *  스캐너를 통해서 숫자 3자리를 입력 받고 각 자리수의 합을 구하시오
		 *  ex) 123 -> 1+2+3
		 */
		System.out.println("세자리 숫자를 입력해주세요.");
		String s = sc.nextLine();
		
	}
	
	public void mehtod5() {
		/*
		 *  스캐너를 통해서 문자(실수)를 입력 받고.
		 *  소수점 2째 짜리에서 반올림  
		 *  ex ) 12.2623 - > 12.3
		 */
		String s = sc.nextLine();
	}
	
	
}
