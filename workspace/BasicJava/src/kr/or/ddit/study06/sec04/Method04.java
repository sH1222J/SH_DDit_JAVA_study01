package kr.or.ddit.study06.sec04;

public class Method04 {
	
	int a; 
	
	public void method1() {
		System.out.println("a : "+a);
	}
	
	public void method2() {
		System.out.println("method2");
		method1();
	}
	
	public void method3(Method04 m) {
		m.method1();
	}
	
	
}
