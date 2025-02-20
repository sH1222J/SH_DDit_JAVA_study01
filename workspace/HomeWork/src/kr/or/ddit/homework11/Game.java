package kr.or.ddit.homework11;

import java.util.Random;
import java.util.Scanner;

public class Game {
	Scanner sc = new Scanner(System.in);
	
	
// process 메서드를 호출하여 게임 스타트
	public static void main(String[] args) {
		Game obj = new Game();
		obj.process();
	}

//	내 카드 할당 후 컴카드 할당하여 게임 결과 출력
	public void process() {
		Deck deck = new Deck(); // 카드덱 초기화
//		deck.printCardList(); // shuffle 확인후 주석 처리
		deck.shuffle(); // 카드 섞음
//		deck.printCardList(); // shuffle 확인후 주석 처리
		
		
		// 내카드는 0 번째 카드
		Card myCard = deck.getCard(0);
		// 컴퓨터 카드는 랜덤 으로 가져올것.
		int ran= new Random().nextInt(51)+1;
		Card comCard=deck.getCard(ran);
		
		// 승패 출력
		// 내카드 숫자가 높다면 win
		// 같거나 낮다면 lose
		// ex) 내카드 : ◆5 컴카드 :♥10
		// lose
		System.out.println("내카드 : " + myCard + ", 상대 : " + comCard);
		if (myCard.num > comCard.num)			System.out.println("이겼다.");
		else									System.out.println("졌다.");
		
		
//		Card myCard = deck.getCard(0); // 내 카드 할당
//		Card comCard = deck.getCard((int) (Math.random() * 52)); // 컴에게 덱에서 랜덤카드 할당
//
//		System.out.println("내 카드 : " + myCard);
//		System.out.println("컴 카드 : " + comCard);
//
//		if (myCard.num > comCard.num) {
//			System.out.println("승리");
//
//		} else {
//			System.out.println("패배");
//		}




	}

}
