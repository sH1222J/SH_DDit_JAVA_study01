package kr.or.ddit.study07;

public class ExtendMain {
	public static void main(String[] args) {
		
		Child child = new Child();
		
		child.childStr = "abc";
		child.parentStr = "def";
		
		child.parentMethod();
		child.childMethod();
		
	}
}
