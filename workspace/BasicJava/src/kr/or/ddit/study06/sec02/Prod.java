package kr.or.ddit.study06.sec02;

public class Prod {
/*
 * 	상품번호, 이름, 가격, 타입
 *	필드 생성후 ProdMain 만들고
 *	Prod 객체 생성 및 값 출력
 */
int pardNo;
String name;
int price;
String type;

		this.pardNo = pardNo;
	}

	@Override
public String toString() {
	return "Prod [pardNo=" + pardNo + ", name=" + name + ", price=" + price + ", type=" + type + "]";
}
// [Alt] + [Shift] + [S] / [O] : 생성자 자동완성

}
