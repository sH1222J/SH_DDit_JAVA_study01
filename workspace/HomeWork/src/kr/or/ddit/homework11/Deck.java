package kr.or.ddit.homework11;

import java.util.Random;

public class Deck {
	Card[] cardList; // 카드클래스에 카드를 담을 카드리스트라는 배열 선언한다.

//	카드덱 생성
//	이중for문 사용하여 52장의 카드생성후 카드리스트 배열에 저장
//	1~13까지 타입별로 반복
	Deck() {
		int cnt = 0;
		cardList = new Card[52];
		String[] types = { "♠", "◇", "♡", "♣" }; 
		for (String type : types) {
			for (int i = 1; i <= 13; i++) {
				Card card = new Card(i, type); // 카드 생성되는 과정
				cardList[cnt++] = card; // 카드리스트에 카드를 저장하는 과정(카드리스트배열의 인덱스를 관리)

			}
		}
	}
// 카드리스트배열에 저장된 카드 모두 출력
	public void printCardList() {
		for (int i = 0; i < cardList.length; i++) {
			System.out.println(cardList[i]);
		}
	}
	
//	출력된 카드를 섞기
//	랜덤 객체를 생성 후 for문을 사용해 배열의 임의의 위치를 서로 교환
	public void shuffle() {
		// 카드 섞기 //
		for (int i = 0; i < 10000; i++) {
//			int ran =(int)(Math.random()()*cardList.length);
			int ran = new Random().nextInt(cardList.length);
			cardList temp = cardList[0];
			cardList[0] = cardList[ran];
			cardList[ran] = temp;
		}
		
		
		
		
		
//		Random random = new Random();
//		for (int i = 0; i < cardList.length; i++) {
//			int randomIndex = random.nextInt(cardList.length);
//			Card temp = cardList[i];
//			cardList[i] = cardList[randomIndex];
//			cardList[randomIndex] = temp;
//		}

	}

	public Card getCard(int num) {
		return cardList[num];
	}

}
