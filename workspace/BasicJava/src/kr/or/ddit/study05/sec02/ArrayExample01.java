package kr.or.ddit.study05.sec02;

import java.util.Scanner;

public class ArrayExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample01 obj = new ArrayExample01();
		obj.process();

	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
		method5();
//		method4();
//		method4();

	}

	public void method5() {
//		80 90 87 65 82 값을 배열에 넣고 출력
//		int[] arr = new int[5];
//		arr[0] = 80;
//		arr[1] = 90;

		// arr[0] = 80;
//		arr[1] = 90;
//		arr[2] = 87;
//		arr[3] = 65;
//		arr[4] = 82;
		int[] arr = { 80, 90, 87, 65, 82 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
//배열 값중 최대값 구하기
		int max = Integer.MIN_VALUE;
		int min = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)		max = arr[i];
			if (arr[i] < min)		min = arr[i];
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

	public void method4() {
//		int 배열을 만들고 90 80 77 값을 입력하시오.
		int[] arr = new int[3];
//		a=90
		arr[0] = 90;
		arr[1] = 80;
		arr[2] = 77;

//		배열의 길이 -> arr.length

		// 출력해보기
		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
		}
		// 종합 구하기
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("총합 : " + sum);
	}

	public void method3() {
//		배열 선언 방법
//		int a
		int[] arr = new int[5];
		int[] arr2 = new int[5];

//		int a=10;
		int[] arr3 = { 1, 2, 3, 4, 5 };

	}

	public void method2() {
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 12;
		arr[2] = 14;
		arr[3] = 18;
		arr[4] = 22;
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += arr[i];
		}
	}

	public void method1() {
		int a1=10;
		int a2=12;
		int a3=14;
		int a4=18;
		int a5=22;
		
		int sum= a1+a2+a3+a4+a5;
	}
