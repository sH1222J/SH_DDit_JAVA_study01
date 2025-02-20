package kr.or.ddit.study06.sec05;

public class StaticExmaple02Main {
	public static void main(String[] args) {
		StaticExample02 se1 = new StaticExample02();
		StaticExample02 se2 = new StaticExample02(); 
		
		se1.method1();
		// a = 6
		se1.method2(se1);
		// 
		
		se1.method3();
		
		se2.method3();
		
		se1.method1();
		
		se1.method4();
		
	}
}
