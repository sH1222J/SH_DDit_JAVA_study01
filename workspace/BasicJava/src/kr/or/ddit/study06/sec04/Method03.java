package kr.or.ddit.study06.sec04;

public class Method03 {
	public static void main(String[] args) {
		Method03 m3 = new Method03();
		int method2 = m3.method2();
		String method3 = m3.method3();

		System.out.println("Method2  리턴값 : " + method2);
		System.out.println("Method3  리턴값 : " + method3);
	}

	/*
	 * public void method1 (int a) 접근제한자 리턴타입 메소드 명 파라미터/매개변수
	 */

	public void method1() {
		int a=10;
		System.out.println("a");
		if(a<10) return;
		System.out.println("b");

	}

	public void method2() {
		System.out.println("method2");
		int a= 10;
		if(a<10) return 0;
		else return 10;

	}

	public void method3() {
		return "abc";

	}

}
