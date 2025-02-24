package kr.or.ddit.study07.phone;

public class IPhone extends SmartPhone{
	
	@Override
	public void tell() {
		super.tell();
	}
	
	public void appStroe() {
		System.out.println("앱스토어");
	}
	
	@Override
	public void camera() {
		// TODO Auto-generated method stub
		super.camera();
		motion();
	}
	
	private void motion() {
		System.out.println("모션 인식 추가");
	}
	
}
