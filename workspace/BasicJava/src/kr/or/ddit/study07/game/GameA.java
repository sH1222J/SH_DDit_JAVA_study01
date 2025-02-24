package kr.or.ddit.study07.game;

import java.util.Random;

import kr.or.ddit.util.ScanUtil;

public class GameA extends Game {

	@Override
	public int playGame() {
		int ran = new Random().nextInt(50)+1;
		System.out.println("1.홀 2.짝");
		int sel = ScanUtil.select();
		System.out.println("숫자 : "+ran);
		if( (sel ==1 && ran%2==1) || (sel ==2 && ran%2==0)) {
			System.out.println("승리");
			return 4500;
		}else {
			System.out.println("패배");
			return 0;
		}
	}

	@Override
	public int payMoney() {
		return 2000;
	}


}
