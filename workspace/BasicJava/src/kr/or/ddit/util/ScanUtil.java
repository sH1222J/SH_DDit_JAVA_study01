package kr.or.ddit.util;

import java.util.Scanner;

public class ScanUtil {
	
	private static Scanner sc = new Scanner(System.in);
	
	
	public static String next(String message) {
		System.out.print(message);
		return next();
	}
	
	private static String next() {
		return sc.next();
	}
	
//	public static int nextInt(int message) {
//		System.out.print(message);
//		return nextInt();
//	}
	
	public static int nextInt(String message) {
		System.out.print(message);
		return nextInt();
	}
	
	private static int nextInt() {
		int num =0;
		while(true) {
			String str = sc.next();
			try {
				num = Integer.parseInt(str);
				break;
			} catch (Exception e) {
				System.out.println("정수만 입력하세요.");
			}
		}
		return num;
	}
	
	
	
}
