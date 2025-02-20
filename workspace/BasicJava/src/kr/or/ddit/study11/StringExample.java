package kr.or.ddit.study11;


import java.util.Scanner;

public class StringExample {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		StringExample se = new StringExample();
//		se.method1();
//		se.method2();
//		se.method3();
//		se.method4();
		se.method5();
//		se.method6();
//		se.method7();
	}
	
	public void method7() {
		
		String str = "abcd.txt";
		
		if(str.startsWith("abcd")) {
			System.out.println("abcd로 시작합니다.");
		}
		
		if(str.endsWith("txt")) {
			System.out.println("txt로 끝납니다.");
		}
		
	}
	
	
	public void method6() {
		String str = " 집에 가다.\n\n ";
		System.out.println(str);
		System.out.println("================");
		str = str.trim();
		System.out.println(str);
		System.out.println("================");
	}
	
	public void method5() {
		
		
		String str = "a. b. c. d. e";
		
		String[] tokens = str.split("\\.");
		
		for(String token : tokens) {
			token = token.trim();
			System.out.println(token);
		}
		
	}
	
	
	public void method4() {
		String str = "apple";
		
		str = str.replace("a", "").replace("e", "");
		str = str.replace("e", "");
		str = str.replace("i", "");
		str = str.replace("o", "");
		str = str.replace("u", "");
		System.out.println(str);
		
		String str2 = "1234abcd";
		
		str2 = str2.replaceAll("\\d", "");
		
		System.out.println(str2);
	}
	
	

	public void method3() {
		
		System.out.println("yes/no");
		String yn = sc.next();
		// yes 입력시 -> 확인 되었습니다.
		// no       -> 종료 되었습니다.
		
		yn = yn.toLowerCase();
		
		if(yn.equalsIgnoreCase("yes")) {
			System.out.println("yes");
		}
		if(yn.equals("no")) {
			System.out.println("no");
		}
		
	}
	
	public void method2() {
		String str = "abcd test";
		
		str = str.toUpperCase();
		System.out.println(str);
		
		str = str.toLowerCase();
		System.out.println(str);
		
	}
	
	public void method1() {
		String str = "Abcd test";
		
		if(str.contains("abcd")) {
			System.out.println("abcd 가 포함됨");
		}
		
		
	}
	
	public boolean lowEquals(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		if(a.equals(b)) return true;
		else return false;
	}
	
}
