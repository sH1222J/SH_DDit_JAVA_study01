package kr.or.ddit.study11;

import java.util.Date;

public class StringTest {
	public static void main(String[] args) {
		StringTest st = new StringTest();
		st.process();
	}
	
	public void process() {
		Date d1 = new Date();

		method2(10000000);
		
		Date d2 = new Date();
		long time = d2.getTime() - d1.getTime();
		System.out.println(time+"ms");
		
		
	}
	
	public void method2(int length) {
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<length; i++) {
			sb.append("a");
		}
	}
	
	
	public void method1(int length) {
		String str = "";
		for(int i=0; i<length; i++) {
			str+="a";
		}
		
	}
	
}
