package kr.or.ddit.study03.sec04;

import java.util.Scanner;

public class ScanExample {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ScanExample obj = new ScanExample();
		obj.process();

	}

	public void process() {
//		String str = sc.nextLine();

//		int i= Integer.parseInt(str);

		
		//println 한줄띄우기
//		System.out.println("숫자를 입력하세요.");
		System.out.print("숫자 : ");
//		int i= sc. nextInt();
//		System.out.println(i);

		double d = sc.nextDouble();

		System.out.println(d);
		
	}

}
