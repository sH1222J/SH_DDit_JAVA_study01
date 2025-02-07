package kr.or.ddit.HomeWork03;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork3 obj = new HomeWork3();
		obj.question1();
//		obj.question2();
	}

	public void question1() { // 증감연산자 사용
		/*
		 * question 변수에 랜덤한 숫자 0~49 숫자가 입력 되어 있다.
		 * 
		 * if 문 조건식을 완성하여 해당 숫자를 맞추는 프로그램을 완성하시오.
		 * 
		 * 1번 실행시 cnt 값이 1씩 증가 되어야됨
		 * 
		 */
		// 40
		int question = new Random().nextInt(50);
		int cnt = 0;
		while (true) {
			cnt++; // 루프마다 실행
			System.out.println("정수를 입력 하세요.");
			int ans = sc.nextInt();

			// 숫자가 클때
			if (cnt > question) {
				System.out.println("더 작은수를 입력하세요");
			}

			// 숫자가 작을때
			if (cnt < question) {
				System.out.println("더 큰수를 입력하세요");
			}

			// 숫자가 같을때
			if (cnt == question) {
				System.out.println("정답입니다.");
				break;
			}
		}
		System.out.println(cnt + " 번 시행되었습니다.");
	}

	public void question2() { //
		/*
		 * 논리 연산자 : && , || 년도를 입력 받아 윤년과 평년을 판별. ? 안을 완성하여 작성.
		 * 
		 * 4의 배수 윤년 : 1992 1996 2004 100의 배수 평년 : 1700 1800 1900
		 * ----------------------------------- 400의 배수 윤년 : 1600 2000
		 */

		System.out.println("년도 입력 : ");
		int year = sc.nextInt();

		boolean four = year % 4 == 0; // boolean 1byte
		boolean hour = year % 100 == 0;
		boolean fourHund = year % 400 == 0;

		/*
		 * sec04 - BineryOperator.java 참고 && - 거짓 / || - 참 / ! 부정
		 */
		if ((fourHund || four && !hund)) {
			System.out.println(year + " 년은 윤년입니다.");
		} else {
			System.out.println(year + " 년은 평년입니다.");
		}
	}

}
