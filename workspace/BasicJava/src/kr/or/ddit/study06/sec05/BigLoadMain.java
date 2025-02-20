package kr.or.ddit.study06.sec05;

public class BigLoadMain {
	public static void main(String[] args) {
		
		BigLoad bl = BigLoad.getInstance();
		BigLoad.getInstance();
		BigLoad.getInstance();
		BigLoad.getInstance();
		BigLoad.getInstance();
		BigLoad.getInstance();
		System.out.println("완료");
		
	}
}
