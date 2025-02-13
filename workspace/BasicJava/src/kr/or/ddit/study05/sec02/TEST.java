package kr.or.ddit.study05.sec02;

import java.util.Scanner;

public class TEST {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		TEST obj = new TEST();
		obj.process();

	}

	public void process() {
		method1();
	}
	public void method1() {
		System.out.println("Hello World");
	}
}