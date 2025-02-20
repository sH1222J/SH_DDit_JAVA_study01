package kr.or.ddit.study06.sec04;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Cal03 {
//	더하기 빼기 나누기 곱하기 메소드 만들고
//	입력하는 연산자에 따라 다른 메소드를 호출 하시오.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Cal03 obj = new Cal03();
		System.out.println("a : ");
		int a = sc.nextInt();

		System.out.println("연산자 : ");
		int op = sc.next();

		System.out.println("b : ");
		int b = sc.nextInt();

		int Result = 0;
		if (op.equals("+"))			Result = cal03.add(a, b);
		if (op.equals("-"))			Result = cal03.sub(a, b);
		if (op.equals("/"))			Result = cal03.div(a, b);
		if (op.equals("*"))			Result = cal03.mul(a, b);

	}

	public int add(int a, int b) {
		return a+b
	}

	public int sub(int a, int b) {
		return a-b
	}

	public int div(int a, int b) {
		return a/b
	}

	public int amul(int a, int b) {
		return a*b
	}

}
