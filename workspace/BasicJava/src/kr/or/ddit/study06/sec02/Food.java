package kr.or.ddit.study06.sec02;

public class Food {
//	이름 가격 설명
//	2개 생성 및 출력
	String name;
	int price;
	String explanation;

	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + ", explanation=" + explanation + "]";
	}

}