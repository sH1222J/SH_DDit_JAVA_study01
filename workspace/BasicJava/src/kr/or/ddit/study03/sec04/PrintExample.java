package kr.or.ddit.study03.sec04;

public class PrintExample {
	public static void main(String[] args) {

//		System.out.print() -- 줄바꿈 기능 없음;
		System.out.print("대전시\t");
		System.out.print("중구\t");
		System.out.print("계룡로\n");

//		System.out.println() -- 줄바꿈 기능 있음;
		System.out.println("대전시");
		System.out.println("중구");
		System.out.println("계룡로");

//		System.out.printf("형식지정문자열", 변수 리스트);
		
		System.out.printf("숫자 : %d, %d 입니다.\n", 10, 20);
		System.out.printf("%8d\n", 1000);
		System.out.printf("%-8d\n", 1000);
		System.out.printf("%08d\n", 1000);

	}

}
