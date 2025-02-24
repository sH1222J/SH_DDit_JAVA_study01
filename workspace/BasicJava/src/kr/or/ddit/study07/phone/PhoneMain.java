package kr.or.ddit.study07.phone;

public class PhoneMain {
	public static void main(String[] args) {
		
		System.out.println("======폰=========");
		Phone p = new Phone();
		p.tell();
		System.out.println("=======스마트 폰========");
		SmartPhone sp = new SmartPhone();
		sp.tell();
		sp.camera();
		sp.touch();
		System.out.println("=======아이폰=======");
		IPhone ip = new IPhone();
		ip.tell();
		ip.camera();
		ip.touch();
		ip.appStroe();
		
	}
}
