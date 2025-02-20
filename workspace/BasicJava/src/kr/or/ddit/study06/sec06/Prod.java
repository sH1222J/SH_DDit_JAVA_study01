package kr.or.ddit.study06.sec06;

public class Prod {
	// 상품번호, 이름, 가격, 타입
	// 필드 생성후 ProdMain 만들고 
	// Prod 객체 생성 및 값 출력 
	
	private int prodNo;
	private String name;
	private int price;
	private String type;
	
	
	public int getProdNo() {
		return prodNo;
	}
	
	public void setProdNo(int prodNo) {
		this.prodNo = prodNo;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

	@Override
	public String toString() {
		return "Prod [prodNo=" + prodNo + ", type=" + type + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
