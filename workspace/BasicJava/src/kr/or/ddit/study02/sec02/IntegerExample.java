package kr.or.ddit.study02.sec02;

public class IntegerExample {
	public static void main(String[] args) {
//		정수형
//		1. byte 	: 1byte (-128 ~ 127)
//		2. short	: 2byte (-32768 ~ 32767)
//		3. int		: 4byte (-2^31 ~ 2^31-1);
//		4. long		: 8byte (-2^63 ~ 2^63-1);
		
		byte b1 = 127;
		System.out.println("b1="+b1);
//		byte b2 = 128; 범위초과 컴파일 에러
		
		
//		오버플로우 / 언더플로우
		b1++;
		System.out.println("b1="+b1); 
		
		short s1 = 100;
		System.out.println("s1="+s1);
		
		
		
		
		
	}

}
