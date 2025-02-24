package kr.or.ddit.study07.game;

import java.util.Random;

import kr.or.ddit.util.ScanUtil;

public class GameC extends Game {
	@Override
	public int playGame() {
		System.out.println("주사위 숫자 선택(1~6)");
		int ran = new Random().nextInt(6)+1;
		int sel = ScanUtil.select();
		System.out.println("주사위 : "+ran);
		if(ran == sel) return 60000;
		return 0;
	}

	@Override
	public int payMoney() {
		// TODO Auto-generated method stub
		return 10000;
	}

}
