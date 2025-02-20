package kr.or.ddit.homework11;

public class Card {
	int num;
	String type;

	// 생성자
	// 1 = A    11 = J   12 = Q   13 = K
	public Card(int num, String type) {
		this.num = num;
		this.type = type;
	}

	// 메서드
	// 1은 에이스(A) 11은 잭(J) 12는 퀸(Q) 13은 킹(K)으로 변환된다.
	
	@Override
	public String toString() {
		// A 2345678910 jqk
		String n = num + "";
		if (num == 1)			n = "A";
		if (num == 11)			n = "J";
		if (num == 12)			n = "Q";
		if (num == 13)			n = "K";
		String result = type + n; // 무늬와 숫자를 결합

		return result;
	}

}
/*
 * 1. 랜덤 객체 생성 2. 배열의 끝에서부터 순회 3. 임의의 인덱스 선택 4. 현재 카드와 임의의 카드 교환
 * 
 */
