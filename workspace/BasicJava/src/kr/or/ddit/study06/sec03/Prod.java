package kr.or.ddit.study06.sec03;


public class Prod {
//	상품번호, 이름, 가격, 타입
//	생성자 만들것
//	필드 생성후  ProdMain 만들고
//	Prod 객체 생성 및 값 입력
	
	int prodNo;
	String name;
	int price;
	String type;
	
	/**
	 * 알트 쉬프트 j
	 * @param prodNo : 상품번호
	 * @param name : 이름
	 * @param price : 가격
	 * @param type : 타입
	 */
	public Prod(int prodNo, int name, int price, int type) {
		this.prodNo=prodNo;
		this.name=name;
		this.price=price;
		this.type=type;
	}

	@Override
	public String toString() {
		return "Prod [prodNo=" + prodNo + ", name=" + name + ", price=" + price + ", type=" + type + "]";
	}
	
	

}
