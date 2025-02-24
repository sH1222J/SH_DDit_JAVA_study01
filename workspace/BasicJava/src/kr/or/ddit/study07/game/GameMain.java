package kr.or.ddit.study07.game;

import kr.or.ddit.util.ScanUtil;

public class GameMain {
	public static void main(String[] args) {
		GameMain gm = new GameMain();
		gm.process();
	}
	
	public void process() {
		int money = 10000;
		int cnt =0; 
		while(money<100000 && money>0) {
			// A 홀짝 게임       (지불 :2000 상금 : 4500) 
			// B 가위 바위 보     (지불 :3000 상금 : 10000) 
			// C 주사위 숫자 맞추기 (지불 :10000 상금 : 60000)
			cnt++;
			System.out.println("보유 금액 : "+money);
			System.out.println("1. 홀짝게임        (지불 :2000 상금 : 4500) ");
			System.out.println("2. 가위 바위 보     (지불 :3000 상금 : 10000)");
			System.out.println("3. 주사위 숫자 맞추기 (지불 :10000 상금 : 60000)");
			Game game = null;
			int sel = ScanUtil.select();
			if(sel == 1) game = new GameA();
			if(sel == 2) game = new GameB();
			if(sel == 3) game = new GameC();
			money -= game.payMoney();
			money += game.playGame();
		}
		if(money<0) System.out.println("파산하셨습니다.");
		else {
			System.out.println("달성 횟수 : "+cnt );
			System.out.println("보유 금액 : "+money);
		}
	}
	
}
