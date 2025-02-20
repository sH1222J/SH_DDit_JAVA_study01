package kr.or.ddit.study06.sec04;

public class Method02 {
	public static void main(String[] args) {
		Method02 m2 = new Method02();
		// 숫자 10
		m2.Method2(10);

	}

	public void Method1(int a) {
		System.out.println("외부에서 준 파라미터 값 : " + a);

	}

	public void Method2(String str) {
		System.out.println("외부에서 준 파라미터 값 : " + str);

	}

	public void Method1(String str, String str2) {
		System.out.println("외부에서 준 파라미터 값 : " "+str+", ""+str2);
		
	}

}
