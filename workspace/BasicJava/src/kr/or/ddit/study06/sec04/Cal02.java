package kr.or.ddit.study06.sec04;

public class Cal02 {
	// 파라미터는 int a, int b
	// 더하기 빼기 나누기 곱하기 메소드 만들고 리턴하기
	public static void main(String[] args) {
		Cal02 c2 = new Cal02();
		int add= c2.add(10,10);
		int sub= c2.sub(10,10);
		int div= c2.div(10,10);
		int mul= c2.mul(10,10);
		System.out.println(add);
		System.out.println(sub);
		System.out.println(div);
		System.out.println(mul);

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
