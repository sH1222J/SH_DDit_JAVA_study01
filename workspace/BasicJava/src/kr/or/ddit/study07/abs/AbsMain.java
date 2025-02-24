package kr.or.ddit.study07.abs;

public class AbsMain {
	public static void main(String[] args) {
		
		
//		AbstractChild2 c2 = new AbstractChild2();
//		c2.wheel();
//		c2.engine();
		
		AbstractChild c1 = new AbstractChild() {
			@Override
			public void wheel() {
				
			}
		};
		
	}
}
